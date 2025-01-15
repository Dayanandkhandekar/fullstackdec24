package com.sushantdemo;

public class SingleInheritanceAss {
	public static void main(String[] args) {
		Product p=new Product(101, " Chips", 5, 10000);
		NewProduct p1=new NewProduct( 102, " Banana Chips", 5, 5000, 10);
		System.out.println(p);
		System.out.println(p1);
	}

}
class Product{
	int productId;
	String productName;
	int productPrice;
	double totalProductSale;
	public Product(int productId, String productName, int productPrice, double totalProductSale) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.totalProductSale = totalProductSale;
	}
	@Override
	public String toString() {
		return "Product [productId= " + productId + ", productName= " + productName + ", productPrice= " + productPrice
				+ ", totalProductSale= " + totalProductSale + "]";
	}

}
class NewProduct extends Product{
	int AddCost;

	public NewProduct(int productId, String productName, int productPrice, double totalProductSale, int addCost) {
		super(productId, productName, productPrice, totalProductSale);
		AddCost = addCost;
	}

	@Override
	public String toString() {
		return "NewProduct [AddCost= " + AddCost + ", productId= " + productId + ", productName= " + productName
				+ ", productPrice= " + productPrice + ", totalProductSale= " + totalProductSale + "]";
	}

	
	
	
}