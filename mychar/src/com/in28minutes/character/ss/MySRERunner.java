package com.in28minutes.character.ss;


public class MySRERunner {

	public static void main(String[] args) {
		MySRE mySRE = new MySRE("a");
		
		//Check if SRE and S are both empty
		System.out.println("Empty : " + mySRE.empty("a", ""));
		
	
		//Does SRE contains special characters (*,(,),|)?
		System.out.println("Spcial characters : " + mySRE.noSpecialChar("ab*cd"));
		
	//Add code: if SRE does not have special characters, check if they are similar
		
		System.out.println("Identity : " + mySRE.equal("abcg", "abcd"));
		
		// test variant
		System.out.println("Identitys : " + mySRE.equals("abcll", "abcj"));
		
	//Add code: IF SRE has special characters, follow bellow : 
		
		mySRE.isChar("abcii*", "abc");
		
		
	}

	
}
	
