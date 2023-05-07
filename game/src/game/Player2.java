package game;

public class Player2 extends Player{
	Player2(){
		super();
	}
	Player2(String name,int mobile_no,float score){
		super(name,mobile_no,score);
	}
	@Override
	float play() {
		return score;
	}
}


