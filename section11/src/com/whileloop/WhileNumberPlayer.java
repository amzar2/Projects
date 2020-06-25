package com.whileloop;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
	
	this.limit=limit;
	
	}
// limit = 30 
	public void printSquareuptolimit() {
		
		int i =1;
		while(i*i< limit) {
			System.out.println(i*i + "");
			i++;
	}
		System.out.println();
	}
// limit = 30 
	public void printCubesUptoLimit() {
		
		int i = 1;
		
		while (i * i * i <limit) {
	
		System.out.println(i * i* i + "");
		i++;
		
		}


        System.out.println();


	}





}
