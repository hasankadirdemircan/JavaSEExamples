package com.hkdemircan;

class InternetDownloader {
	void downloadFromInternet() {
		//http
	}
}

class Parser {
	void parseData() {
		//Jsoup
	}
}

class DummyDao {
	void storeIntoDatabase() {
		//Jdbc
	}
}

class DownloadAndStore {
	void doEverything() {
		new InternetDownloader().downloadFromInternet();
		new Parser().parseData();
		new DummyDao().storeIntoDatabase();
	}
}
public class GoodCohesion {

}
