package com.edu;
import java.io.*;
public class MobileUser {

	public static void main(String[] args)throws Exception {
		Mobile micromax = new Mobile();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Insert Sim");
		String simname = br.readLine();
		 micromax.insertSIM(simname);
		
		System.out.println();
		
		System.out.println("Type 1 and press <Enter> Key to send SMS");
		System.out.println("Type 2 and press <Enter> Key to Make Call");
		
		System.out.print("Enter option");
		String option = br.readLine();
		String resp;
		
		if(option.contains("1")) {
			System.out.println("Type message and press <Enter> Key :");
			String msg = br.readLine();
			
			System.out.println("Type mobile number and press <Enter> key :");
			String mobilenumber = br.readLine();
			
			resp = micromax.sendSMS(msg, Long.parseLong(mobilenumber));
			System.out.println(resp);
		}
		
		else if(option.contains("2")) {
			System.out.println("Type mobile number and press <Enter> key :");
			String mobilenumber = br.readLine();
			
			resp = micromax.dialCall(Long.parseLong(mobilenumber));
			System.out.println(resp);
		}
		else {
			System.out.println("Invalid option");
		}
		

	}

}
