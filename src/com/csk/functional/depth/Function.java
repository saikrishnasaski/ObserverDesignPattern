package com.csk.functional.depth;

public interface Function<T, R> {

	R apply(T t);

	/**
	 * Function returns compose function. In this context it takes Square as Input and returns Double as Output.
	 * @param fun1
	 * @return
	 */
	default <V> Function<V, R> compose(Function<V, T> fun1) {
		
		return v -> apply(fun1.apply(v));
		
	}
}
