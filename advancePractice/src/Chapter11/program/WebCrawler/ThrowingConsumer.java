package Chapter11.program.WebCrawler;

import java.util.function.Consumer;

public interface ThrowingConsumer <T, E extends Exception> {
	
	void accpet(T t) throws E;
	
	static <T, E extends Exception> Consumer<T>
		unchecked(ThrowingConsumer<T, E> consumer){
		
		return(t) -> {
			try {
				consumer.accpet(t);
			}catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}
}
