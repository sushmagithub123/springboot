//Target class
package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

public class Flipkart 
{
	//HAS-A Property
	@Autowired
	private Courier courier;
	
	public Flipkart()
	{
		System.out.println("Flipkart::0-param constructor");
		}
	public String shopping(String items[],double prices[])
	{
		System.out.println("Flipkart.shopping()");
		//cal bill amount
		double billAmt=0.0;
		for(double p:prices)
		{
			billAmt+=p;
		}
		//generated order id
		int oid=new Random().nextInt(100000);
		//use courier
		String msg=courier.deliver(oid);
		return  Arrays.toString(items)+"are purched having bill amount"+billAmt+"-->"+msg;
	}
	}
