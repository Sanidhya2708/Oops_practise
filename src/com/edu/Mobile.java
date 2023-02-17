package com.edu;

import java.lang.reflect.Constructor;

public class Mobile {
	
	SIM sim ;
	
	
	public void insertSIM(String simName)throws Exception
	{
		
		Class<?> simclass = Class.forName((String)simName);
		Constructor<?> cons  = simclass.getDeclaredConstructor();
		cons.setAccessible(true);
		
		
		//creating a instance of the class
		Object simobject = cons.newInstance();
		
		if(simobject instanceof SIM) {
			sim = (SIM)simobject;
		}
		else {
			System.out.println("Invalid SIM");
		}
	}
	
	public String sendSMS(String msg,long mobilenumber) {
		return sim.sendSMS(msg,mobilenumber);
	}
	public String dialCall(long mobilenumber) {
		return sim.dialCall(mobilenumber);
	}

}
