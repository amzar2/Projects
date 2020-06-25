package com.electronics;

public class ElectronicsRunner {

	public static void main(String[] args) {
		Electronics lg = new Electronics();
		Electronics sony = new Electronics();

		sony.start();
		lg.start();

		sony.setChannels(150);
		lg.setChannels(200);

	}

}
