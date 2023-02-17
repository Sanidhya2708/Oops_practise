package com.edu;

public class Airtel implements SIM {

	@Override
	public String sendSMS(String msg, long mobilenumber) {
		
		return "Airtel : Your SMS send Successfully";
	}

	@Override
	public String dialCall(long mobilenumber) {
		return "Airtel : The number you are dialing is busy , please dial after some time";
	}

}
