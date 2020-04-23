package com.in28minutes.character;

public class MyChar {
	
	private char character;

	public MyChar(char character) {
		this.character = character;
	}

	public char getCharacter() {
		return character;
	}


	public void setCharacter(char character) {
		this.character = character;
	}

	public boolean isVowel() {
		if(character == 'a'||character == 'e' ||character =='i'
				|| character == 'o'|| character =='u')
			return true;
		
		return false;
	}

	public boolean isNumber() {
		if(character >=  48 && character <= 57)
			return true;
		return false;
	}

	public boolean isAlphabet() {
		if(character >=  97 && character <= 122)
			return true;
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && ! isVowel() )
			return true;
		return false;
	}

	public static void printLowerCaseAplphabets() {
		//for( char character = 97; character <= 122; character++)
		for( char character = 'a'; character <= 'z'; character++)
			System.out.println(character);
		
	}

	public static void printUpperCaseAplphabets() {
		for( char character = 'A'; character <= 'B'; character++)
			System.out.println(character);
		
	}

	



	

}
