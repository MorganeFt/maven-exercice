package io.github.MorganeFt.MyMavenExercise;

public class TripletOfDice {

	private int die1;
	private int die2;
	private int die3;
	private int face;

	TripletOfDice(int face) {
		this.face = face;
		this.die1 = 0;
		this.die2 = 0;
		this.die3 = 0;
	}
	
	/**
	 * Roll all the dice
	 */
	public void rollAllDice() {
		die1 = (int)(Math.random()*face) + 1;
		die2 = (int)(Math.random()*face) + 1;
		die3 = (int)(Math.random()*face) + 1;
	}
	
	/**
	 * Roll one die
	 * @param dieNumber must be 1, 2 or 3
	 */
	public void rollOneDie(int dieNumber) {
		if (dieNumber == 1) {
			die1 = (int)(Math.random()*face) + 1;
		}
		if (dieNumber == 2) {
			die2 = (int)(Math.random()*face) + 1;
		}
		else {
			die3 = (int)(Math.random()*face) + 1;
		}
	}

	/**
	 * Return the value of the die.
	 * You must use rollOneDie or rollAllDice before print this result.
	 * @return the value on the first die as an integer
	 */
	public int getFirstDie() {
		return die1;
	}
	
	/**
	 * Return the value of the die.
	 * You must use rollOneDie or rollAllDice before print this result.
	 * @return the value on the second die as an integer
	 */
	public int getSecondDie() {
		return die2;
	}
	
	/**
	 * Return the value of the die.
	 * You must use rollOneDie or rollAllDice before print this result.
	 * @return the value on the third die as an integer
	 */
	public int getThirdDie() {
		return die3;
	}
	
	/**
	 * Return a the value of the dice.
	 * You must use rollOneDie or rollAllDice before print this result.
	 * @return a string with the value of the dice
	 */
	public String toString() {
		return("The die number 1 is a : " + getFirstDie() + "\nThe die number 2 is a : " + getSecondDie() + "\nThe die number 3 is a : " + getThirdDie());
	}

}