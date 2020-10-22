package Chapter01.program.findInteger;

import java.util.Arrays;
import java.util.List;

public class findIntegerDemo {
	
	static void findInteger(List<Integer> integers, int num) {
		if(integers.contains(num)) {
			System.out.println(num+" Found");
		}else {
			System.out.println(num+" Not found");
		}
	}
	
	
	public static void main(String[] args) {
		List<Integer> ints= Arrays.asList(1,5,1,7,8,4,9);
		
		findInteger(ints,8);
	}
}
