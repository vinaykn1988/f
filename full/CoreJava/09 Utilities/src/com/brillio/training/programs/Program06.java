package com.brillio.training.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.brillio.training.util.KeyboardUtil;

public class Program06 {

	public static void main(String[] args) {
		
		Date dt = new Date();
		
		System.out.println("Date is"+ dt);
		
		String msg = "Enter date in DD/MM/YY";
		String strDate = KeyboardUtil.getString(msg);
		
		System.out.println("You entered: "+ strDate);
		
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		sdf.setLenient(false);
		
		try {
			dt = sdf.parse(strDate);  // convert String to Date
			
			sdf = new SimpleDateFormat("EEEE MMMM d, YYYY");
			
		//	System.out.println(sdf.format(dt));
			System.out.println(dt);
		} catch (ParseException e) {
			System.out.println("You must have entered an invalid date");
		}
		
	}
}
