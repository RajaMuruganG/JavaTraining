package com.training.question2;

public class Customer {

	public static void main(String[] args) {

		PaymentOptions paymentOption = new PaymentOptions();
		paymentOption.pay(10000);
		paymentOption.pay(1111222233, 123, 20200);
		paymentOption.pay("testing@bankname", 30000);
		paymentOption.pay("HDFC", "user123", 50000);
	}
}
