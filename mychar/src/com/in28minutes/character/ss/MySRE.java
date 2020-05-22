package com.in28minutes.character.ss;

public class MySRE {
	
	private String string;

	public MySRE(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	// Check if SRE and S are both empty
	public boolean empty(String string, String string2) {
		if ( string.isEmpty() == true && string2.isEmpty() == true ) {
			return true;
		}
		return false;
	}
	
	//Does SRE contains special characters (*,(,),|)?
	public String noSpecialChar(String string) {
		for (int i = 0; i<= string.length()-1; i++) {
			if(string.charAt(i) == '*' || string.charAt(i) == '(' ||
					string.charAt(i) == ')' || string.charAt(i) == '|') {
				return "SRE has special characters";
			}
		}
		return "SRE has no special characters";
	}
	
	//If not, are they equal?
	
	// to solve: true generated when sre and s have the same lenght but not the same content
	public boolean equal(String string, String string2) {
		
		// are sre and s of equal length? 
		if (string.length() == string2.length()) {
			for (int i = 0; i< string.length(); i++) {
				if(string.charAt(i) == string2.charAt(i)) {
					return true;
				}
			}
		}
		return false;
	}
	
	//If not, are they equal? test second structure
		public boolean equals(String string, String string2) {
			
			for (int i = 0; i<= string.length()-1; i++) {
				if (string.length() != string2.length()) {
					return false;
					} else if (string.charAt(i) == string2.charAt(i)) {
						return true;
					}
			}
			return false;
		}


	public boolean isChar(String string, String string2) {
		
		for (int i = 0; i<= string.length()-1; i++) {
			// if string at i equal string2 at i and string at i+1 is a character too, then true
			if((string.charAt(i) >= 'a' && string.charAt(i) <= 'z') && 
					string.charAt(i+1) >= 'a' && string.charAt(i+1) <= 'z') {
				if(string.charAt(i) == string2.charAt(i)) {
					return true;
				}
			// if string at i+1	 = *
				
			} else if ((string.charAt(i) >= 97 && string.charAt(i) <= 122) && 
					string.charAt(i+1) == '*') {
				if(string2.charAt(i) = null || (string2.charAt(i) >= 97 && string2.charAt(i) <= 122)) {
				}
			}
		}
			
				
	}

	
}
