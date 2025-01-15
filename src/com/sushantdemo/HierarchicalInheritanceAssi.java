package com.sushantdemo;

public class HierarchicalInheritanceAssi {
	public static void main(String[] args) {
		
	
	wholesaler w=new wholesaler("S24 Ultra","Samsung",110000);
	Retailer1 r1=new Retailer1("S24 Ultra","Samsung",110000,10.0f);
	Retailer2 r2=new Retailer2("S24 Ultra","Samsung",110000,12.5f);
	Retailer3 r3=new Retailer3("S24 Ultra","Samsung",110000,15f);
	Retailer4 r4=new Retailer4("S24 Ultra","Samsung",110000,13.5f);
	Retailer5 r5=new Retailer5("S24 Ultra","Samsung",110000,21f);
	
	System.out.println(w);
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(r5);
	}
}
class wholesaler{
	String mobileName;
	String mobileCompany;
	int mobilePrice;
	public wholesaler(String mobileName, String mobileCompany, int mobilePrice) {
		super();
		this.mobileName = mobileName;
		this.mobileCompany = mobileCompany;
		this.mobilePrice = mobilePrice;
	}
	@Override
	public String toString() {
		return "wholesaler [mobileName=" + mobileName + ", mobileCompany=" + mobileCompany + ", mobilePrice="
				+ mobilePrice + "]";
	}
	
}
class Retailer1 extends wholesaler{
     float profitR1;

	public Retailer1(String mobileName, String mobileCompany, int mobilePrice, float profitR1) {
		super(mobileName, mobileCompany, mobilePrice);
		this.profitR1 = profitR1;
	}

	@Override
	public String toString() {
		return "Retailer1 [profitR1=" + profitR1 + ", mobileName=" + mobileName + ", mobileCompany=" + mobileCompany
				+ ", mobilePrice=" + mobilePrice + "]";
	}
	
}
class Retailer2 extends wholesaler{
	 float profitR2;

	public Retailer2(String mobileName, String mobileCompany, int mobilePrice, float profitR2) {
		super(mobileName, mobileCompany, mobilePrice);
		this.profitR2 = profitR2;
	}

	@Override
	public String toString() {
		return "Retailer2 [profitR2=" + profitR2 + ", mobileName=" + mobileName + ", mobileCompany=" + mobileCompany
				+ ", mobilePrice=" + mobilePrice + "]";
	}
	 
}
class Retailer3 extends wholesaler{
	 float profitR3;

	public Retailer3(String mobileName, String mobileCompany, int mobilePrice, float profitR3) {
		super(mobileName, mobileCompany, mobilePrice);
		this.profitR3 = profitR3;
	}

	@Override
	public String toString() {
		return "Retailer3 [profitR3=" + profitR3 + ", mobileName=" + mobileName + ", mobileCompany=" + mobileCompany
				+ ", mobilePrice=" + mobilePrice + "]";
	}
	 
}
class Retailer4 extends wholesaler{
	 float profitR4;

	public Retailer4(String mobileName, String mobileCompany, int mobilePrice, float profitR4) {
		super(mobileName, mobileCompany, mobilePrice);
		this.profitR4 = profitR4;
	}

	@Override
	public String toString() {
		return "Retailer4 [profitR4=" + profitR4 + ", mobileName=" + mobileName + ", mobileCompany=" + mobileCompany
				+ ", mobilePrice=" + mobilePrice + "]";
	}	
	 
}
class Retailer5 extends wholesaler{
	 float profitR5;

	public Retailer5(String mobileName, String mobileCompany, int mobilePrice, float profitR5) {
		super(mobileName, mobileCompany, mobilePrice);
		this.profitR5 = profitR5;
	}

	@Override
	public String toString() {
		return "Retailer5 [profitR5=" + profitR5 + ", mobileName=" + mobileName + ", mobileCompany=" + mobileCompany
				+ ", mobilePrice=" + mobilePrice + "]";
	}
	 
}