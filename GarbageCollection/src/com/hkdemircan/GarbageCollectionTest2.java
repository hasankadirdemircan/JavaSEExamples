package com.hkdemircan;

import java.util.Date;

public class GarbageCollectionTest2 {


	public static void main(String[] args) {
		Date dateLocal = getDate();
		//
		// Buradan itibaren bellekte sb c�p hukmune gececektir.
		//fakat date objesini hale dateLocal gosterdigi icin bellekteki date alani c�p degildir.
		//
	}
	
	public static Date getDate() {
		Date date = new Date();
		StringBuffer sb = new StringBuffer("test");
		
		return date;
	}
}
