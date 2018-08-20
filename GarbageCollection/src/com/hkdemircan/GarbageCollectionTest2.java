package com.hkdemircan;

import java.util.Date;

public class GarbageCollectionTest2 {


	public static void main(String[] args) {
		Date dateLocal = getDate();
		//
		// Buradan itibaren bellekte sb cöp hukmune gececektir.
		//fakat date objesini hale dateLocal gosterdigi icin bellekteki date alani cöp degildir.
		//
	}
	
	public static Date getDate() {
		Date date = new Date();
		StringBuffer sb = new StringBuffer("test");
		
		return date;
	}
}
