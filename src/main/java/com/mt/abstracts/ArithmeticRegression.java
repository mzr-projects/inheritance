package com.mt.abstracts;

public class ArithmeticRegression extends AbstractRegression {

	protected long increment;

	public ArithmeticRegression() {
		this(1, 0);
	}

	public ArithmeticRegression(long stepSize, long start) {
		increment = stepSize;
	}

	public ArithmeticRegression(long stepSize) {
		this(stepSize, 0);
	}

	@Override
	protected void advance() {
		current += increment;
	}
}
