package Chapter11.program.WebCrawler;

import java.util.function.Function;

@FunctionalInterface
public interface ThrowingFunction <T, R, E extends Exception>{
	R apply(T t) throws E;
	
	static <T, R, E extends Exception> Function<T, R>
			unchecked(ThrowingFunction<T, R, E> f){
		return t ->{
			try {
				return f.apply(t);
			}catch(Exception e) {
				throw new RuntimeException(e);
			}
		};
	}
}
