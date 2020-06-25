package com.electronics;

public class Electronics {

	private int channels;

	void setChannels(int channels) {
		this.channels = channels;
	}

	int getchannels() {
		return this.channels;
	}

	void start() {
		System.out.println("Electronic started");
	}
}
