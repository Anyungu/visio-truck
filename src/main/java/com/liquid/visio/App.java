package com.liquid.visio;

public class App {

	public static void main(String[] args) throws Exception {

		String message = args[0];

		VisioTruck vs = new VisioTruck(message);
		vs.toString();

	}
}