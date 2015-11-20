package com.test;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class GenerateOOM {
	
	private final static SecureRandom random = new SecureRandom();
	
	private static class MyObject {
		private List<String> list = new ArrayList<>();
		public MyObject() {
			for (int i=0; i<1_000; i++) {
				list.add(new BigInteger(128, random).toString(512));
			}
		}
	}
	
	private final static List<MyObject> myObjectList = new ArrayList<>();
	
	public static String generate() {
		for (int i=0; i<500; i++) {
			myObjectList.add(new MyObject());
		}
		
		long heapSize = Runtime.getRuntime().totalMemory() / (1024*1024); 
		long heapMaxSize = Runtime.getRuntime().maxMemory() / (1024*1024);
		long heapFreeSize = Runtime.getRuntime().freeMemory() / (1024*1024); 
		return "nb MyObject in list:"+myObjectList.size()+"<br/>"
			 + " heapSize="+heapSize+"mo<br/>"
			 + " heapMaxSize="+heapMaxSize+"mo<br/>"
			 + " heapFreeSize="+heapFreeSize+"mo<br/>";
	}
}
