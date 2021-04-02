package com.edtex.discount;

public class Discount {
	
	public double serviceDiscount(String membership) {
		if (membership.equals("Platinum")) {
			return 2000-((2000*14)/100);
		}
		else if (membership.equals("Diamond")) {
			return 2000-((2000*7)/100);
		}
		else {
			return 2000;
		}
	}
	
	public double productDiscount() {
		return 1000-((1000*14)/100);
	}
	
}
