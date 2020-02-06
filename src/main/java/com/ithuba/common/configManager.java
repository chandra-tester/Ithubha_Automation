package com.ithuba.common;//read config.properties file here

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class configManager {

	public static void main(String[] args) {
		readpropertiesFile();
	}

	public static void readpropertiesFile() {
		Properties prop = new Properties();// object of class properties class
		try {
			InputStream input = new FileInputStream("/D:/my projects/Automation testing ithuba/config.properties");// object
																													// of
																													// class
																													// input
																													// stream
			prop.load(input);// load properties file

			System.out.println("Url : " + prop.getProperty("Url"));
			System.out.println("browserName : " + prop.getProperty("browserName"));
			System.out.println("userName : " + prop.getProperty("userName"));
			System.out.println("password : " + prop.getProperty("password"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
