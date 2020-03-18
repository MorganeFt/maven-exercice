package io.github.MorganeFt.MyMavenExercise;

public class DiceUser {

	public static void main(String[] args) {
		rollOnce();
	}
	
	static void rollOnce() {
		TripletOfDice myDice = new TripletOfDice(6);
		myDice.rollAllDice();
		
		System.out.println(myDice);
	}

}
