package Chapter09.program.Paralelism.Transection;

import java.math.BigDecimal;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		List<Transection> transectionList =FakeTransactionGenerator.generate(1000_000);
		calculateTime(()-> processInSequential(transectionList), "Sequential calculation: ", 10);
		calculateTime(()-> processInParallel(transectionList), "parallel Calculation: ", 10);
	}
	
	public static BigDecimal processInParallel(List<Transection> transections) {
		
		return transections.parallelStream()
				.filter(Transection::isCredit)
				.map(Transection::getAmount)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	public static BigDecimal processInSequential(List<Transection> transections) {
		return transections.stream()
				.filter(Transection::isCredit)
				.map(Transection::getAmount)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	public static void calculateTime(Supplier<BigDecimal> supplier, String name, int iteration) {
		
		System.out.println("\nStarting: "+name);
		LongSummaryStatistics statistics= IntStream.range(0, iteration)
				.mapToLong(value->{
					long start= System.nanoTime();
					supplier.get();
					
					long duration= (System.nanoTime()-start);
					long msecs= duration/1000_000;
					
					System.out.println("Iteration: "+ value +", execution time: "+ msecs);
					return msecs;
				}).summaryStatistics();
		
		System.out.println("\nTime to complete in "+name+ " is: \n");
		System.out.println("Average: "+ statistics.getAverage()+" msecs");
		System.out.println("Maximum: "+ statistics.getMax()+" msecs");
		System.out.println("minimum: "+ statistics.getMin()+" msecs");
		
	}
}
