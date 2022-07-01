package com.tns.client;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;
import com.tns.application.*;

public class Client {
public static void main(String[] args) {
//	a. Assign instance of GSShopFactory to ShopFactory reference
		ShopFactory shopObj = new GSShopFactory();

//	b. Instantiate GSPrimeAcc and refer it through reference PrimeAcc
		PrimeAcc primeAccObj = new GSPrimeAcc(2019, "prime_account_name", 1122f, true);


//	c. Instantiate GSNormalAcc and refer it through reference NormalAcc
		NormalAcc normalAccObj = new GSNormalAcc(2000, "normal_account_name", 2244f, NormalAcc.getDeliveryCharges());

//	d. Invoke bookProduct() method
		primeAccObj.bookProduct(1234f);
		normalAccObj.bookProduct(1234f);

//	e. Invoke toString() method
		primeAccObj.toString();
		normalAccObj.toString();
	}
}

