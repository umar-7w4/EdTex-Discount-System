package com.edtex.customervisit;

import java.util.Scanner;

import com.edtex.discount.Discount;

public class CustomerVisit {
	
	public static void main(String args[]) {
		
		Discount discount = new Discount();
		
		System.out.println("Welcome to EdTex Discount System!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id : ");
		int customerId = sc.nextInt();
		
		System.out.println("Enter Customer Name : ");
		String customerName = sc.next();
		
		System.out.println("Enter Customer Need (Service/Product) : ");
		String customerNeed = sc.next();
		
		System.out.println("Enter Customer Membership (Platinum/Diamond/None) : ");
		String membership = sc.next();
		
		if(customerNeed.equals("Service")) {
			System.out.println("Thank You for Visting us "+customerName+" Total bill amount is : ");
			System.out.println(discount.serviceDiscount(membership)+"/-");
		}
		else if(customerNeed.equals("Product")) {
			System.out.println("Your Total bill amount is : ");
			System.out.println(discount.productDiscount()+"/-");
		}
		else {
			System.out.println("Invalid Details");
		}
		
	}

}
