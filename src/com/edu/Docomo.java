package com.edu;

public class Docomo implements SIM {

	@Override
	public String sendSMS(String msg, long mobilenumber) {
		return "Docomo : your SMS send successfully !";
	}

	@Override
	public String dialCall(long mobilenumber) {
		
		return "Docomo : The number you are dialing is switched off , please dial after some time";
	}

}
