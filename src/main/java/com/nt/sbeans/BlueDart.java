package com.nt.sbeans;

public final class BlueDart implements Courier
{
	BlueDart()
	{
		System.out.println("BlueDart::0-param constructor");
	}

	@Override
	public String deliver(int oid)
	{
		return oid+"order id order is assigned to BlueDart For Delivery";
	}

}
