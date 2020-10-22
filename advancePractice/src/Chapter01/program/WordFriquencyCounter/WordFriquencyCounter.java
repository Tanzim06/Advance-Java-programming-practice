package Chapter01.program.WordFriquencyCounter;

import java.security.Identity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class WordFriquencyCounter {
	
	/*static Map<String, Long> countFrequency(List<String> words){
		Map<String, Long> frequencyMap= new HashMap<String, Long>();
		for(String word : words) {
			frequencyMap.merge(word, 1L, (oldValue, value)->oldValue + value);
		}
		return frequencyMap;
	}*/
	
		
		static Map<String, Long> countFrequency(List<String> words){
			return words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		}

	public static void main(String[] args) {
		List<String> words= Arrays.asList("Hello", "World",
				                          "Bangladesh", "Dhaka",
				                          "Hello", "Java",
				                          "Lambda");
		Map<String, Long> wordFerquency= countFrequency(words);
		System.out.println(wordFerquency);

	}

}
