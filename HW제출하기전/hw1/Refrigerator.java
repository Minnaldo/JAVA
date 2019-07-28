package com.ssafy.java.hw1;

public class Refrigerator extends Product{
	private int guarntee;

	public int getGuarntee() {
		return guarntee;
	}

	public void setGuarntee(int guarntee) {
		this.guarntee = guarntee;
	}

	public Refrigerator(String productNum, String name, int price, int quantity, int guarntee) {
		super(productNum, name, price, quantity);
		this.guarntee = guarntee;
	}

	public Refrigerator() {
	}

	@Override
	public String toString() {
		return "Refrigerator [guarntee=" + guarntee + ", ProductNum=" + getProductNum() + ", Name="
				+ getName() + ", Price=" + getPrice() + ", Quantity=" + getQuantity() + "]";
	}
	
	
}
