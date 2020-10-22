package Chapter09.program.Paralelism.Transection;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FakeTransactionGenerator {
	
	public static List<Transection> generate(int size){
		
		Random random= new Random();
		
		return IntStream.range(0, size).mapToObj(value->{
			String uuid= UUID.randomUUID().toString();
			boolean isCredit= random.nextBoolean();
			BigDecimal amount= getRandomAmount(BigDecimal.TEN, BigDecimal.valueOf(1000_000));
			
			return new Transection(uuid, isCredit, amount);
		}).collect(Collectors.toList());
	}
	
	private static BigDecimal getRandomAmount(BigDecimal min, BigDecimal max) {
		BigDecimal randomBigDecimal= min.add(new BigDecimal(Math.random()).multiply(max.subtract(min)));
		
		return randomBigDecimal.setScale(2, RoundingMode.UP);
	}
	
	List<Transection> transectionList = FakeTransactionGenerator.generate(1_000_000);
	
	BigDecimal totalCreditTransection= transectionList.stream()
			.filter(Transection::isCredit)
			.peek(transection -> System.out.println("Thread: "
					+ Thread.currentThread().getName()))
			.map(Transection::getAmount)
			.reduce(BigDecimal.ZERO, BigDecimal::add);
	
	/*BigDecimal totalCreditTransection= transectionList
			.parallelStream()
			.filter(Transection::isCredit)
			.peek(transection -> System.out.println("Thread: "
					+Thread.currentThread().getName()))
			.map(Transection::getAmount)
			.reduce(BigDecimal.ZERO, BigDecimal::add);*/
	
	public static void calculateTime(Supplier<BigDecimal>supplier, String name, int iteration) {
		System.out.println("starting: "+name);
		
		LongSummaryStatistics statistics= IntStream
				.range(0, iteration)
				.mapToLong(value -> {
					long start = System.nanoTime();
					supplier.get();
					long duration= (System.nanoTime()-start);
					long msecs= duration / 1000_000;
					
					System.out.println("iteration: "+value
							+", execution time: "+msecs);
					return msecs;
				}).summaryStatistics();
		
		System.out.println("Time to complete in "+ name + " is: "
				+ statistics.getAverage()+" msecs");
		System.out.println("maximum: "+ statistics.getMax());
		System.out.println("minimum: "+ statistics.getMin());
	}
}
