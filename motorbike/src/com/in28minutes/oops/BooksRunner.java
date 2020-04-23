package com.in28minutes.oops;

public class BooksRunner {

	public static void main(String[] args) {
		Books ArtOfComputerProgramming = new Books(1001);
		Books EffectiveJava = new Books(1500);
		Books CleanCode = new Books(1000);
		
		System.out.println(ArtOfComputerProgramming.getNbrOfCopies());
		System.out.println(EffectiveJava.getNbrOfCopies());
		System.out.println(CleanCode.getNbrOfCopies());
		
		ArtOfComputerProgramming.buy();
		EffectiveJava.buy();
		CleanCode.buy();
		
		ArtOfComputerProgramming.setNbrOfCopies(2);
		EffectiveJava.setNbrOfCopies(100);
		CleanCode.setNbrOfCopies(20);
		
		ArtOfComputerProgramming.incrNbrCopies(1);
		EffectiveJava.incrNbrCopies(2);
		CleanCode.incrNbrCopies(3);
		
		ArtOfComputerProgramming.decrNbrCopies(2);
		EffectiveJava.decrNbrCopies(10);
		CleanCode.decrNbrCopies(5);
		
		System.out.println(ArtOfComputerProgramming.getNbrOfCopies());
		System.out.println(EffectiveJava.getNbrOfCopies());
		System.out.println(CleanCode.getNbrOfCopies());
		

	}

}
