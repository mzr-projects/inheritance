package com.mt.abstracts;

public abstract class AbstractRegression {

	protected long current;

	public AbstractRegression() {
		this(0);
	}

	public AbstractRegression(int start) {
		current = start;
	}

	public void printRegression(int n) {
		System.out.println(nextVal());
		for (int i = 0; i < n; i++) {
			System.out.println(" " + nextVal());
		}
		System.out.println();
	}

	public long nextVal() {
		long answer = current;
		advance();
		return answer;
	}

	protected abstract void advance();
}
