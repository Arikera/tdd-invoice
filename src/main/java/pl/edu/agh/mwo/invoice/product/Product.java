package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {
		if(name==null) {
			throw new IllegalArgumentException("Name cannot be null");                                                                                                                                                        
		}
		this.name = name;
		this.price = price;
		this.taxPercent = tax;
	}

	public String getName() {
		return this.name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public BigDecimal getPriceWithTax() {
		/*
		 * BigDecimal price = this.price; BigDecimal taxPercent = this.taxPercent;
		 * BigDecimal pricewithtax= price.add(price.multiply(taxPercent));
		 *return pricewithtax;
		 */
		return this.price.add(this.price.multiply(this.taxPercent));
	}
}
