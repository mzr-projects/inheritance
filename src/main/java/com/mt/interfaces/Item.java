package com.mt.interfaces;

public class Item implements SellableAndTransferable {

	private String name;
	private int count;

	public Item(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void sell() {
		System.out.println("I'm selling : " + this.name);
	}

	@Override
	public void transfer() {
		System.out.println("I'm transferring : " + this.name);
	}
}
