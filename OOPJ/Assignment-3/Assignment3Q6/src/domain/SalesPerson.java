package domain;

import java.util.Arrays;

public class SalesPerson {

	private String name;
	private int id;
	private double[] salesfigure;

	public SalesPerson() {
		this("", 0, 15);
	}

	public SalesPerson(String name, int id, int capacity) {
		super();
		this.name = name;
		this.id = id;
		this.salesfigure = new double[capacity];
	}

	public double[] getSalesfigure() {
		return salesfigure;
	}

	public void setSalesfigure(double[] salesfigure) {
		this.salesfigure = salesfigure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double calculateTotalFigs() {
		double sum = 0;
		for (int i = 0; i < this.salesfigure.length; i++) {
			sum += this.salesfigure[i];
		}

		return sum;
	}

	@Override
	public String toString() {
		return "SalesPerson [name=" + name + ", id=" + id + ", salesfigure=" + Arrays.toString(salesfigure) + "]";
	}

}
