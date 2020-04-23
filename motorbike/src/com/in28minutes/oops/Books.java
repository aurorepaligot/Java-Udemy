package com.in28minutes.oops;

public class Books {
	//nbr of copies
	private int nbrOfCopies;
	
	public Books(int nbrOfCopies){
		this.nbrOfCopies = nbrOfCopies;
	}

	public int getNbrOfCopies() {
		return nbrOfCopies;
	}

	public void setNbrOfCopies(int nbrOfCopies) {
		if(nbrOfCopies > 0)
		this.nbrOfCopies = nbrOfCopies;
	}
	
	public void incrNbrCopies(int howmany) {
		//this.nbrOfCopies = this.nbrOfCopies + howmany;
		setNbrOfCopies(this.nbrOfCopies + howmany);	
	}
	
	public void decrNbrCopies(int howmany) {
		//this.nbrOfCopies = this.nbrOfCopies + howmany;
		setNbrOfCopies(this.nbrOfCopies - howmany);	
	}

	void buy() {
		System.out.println("Book bought");
	}
}
