package game;

public class Player1 extends Player{
	Player1(){
		super();
	}
	Player1(String name,int mobile_no,float score){
		super(name,mobile_no,score); //calling parameterized constructor of parent class
	}
	@Override
	float play() {
		return score;
	}
}

