package employee;

//the attributes of this class is roomno, roomtype, roomarea and 
//ACmachine. In this class the member functions are setdata and displaydata.


class room{
//	private static int count; 
//	public room() {
//		count = count +1;
//	}
//	
	int room_no;
	String room_type;
	double room_area;
	boolean ac_machine;
	
	void set_data(int room_no, String room_type, double room_area,boolean ac_machine){
		this.room_no = room_no;
		this.room_type = room_type;
		this.room_area = room_area;
		this.ac_machine = ac_machine;
	}
	void display_data(){
		System.out.println(room_no + " "+ room_type+ " "+room_area + " " + ac_machine);	
	}
}

public class room_details {

	public static void main(String[] args) {
		room r = new room();
		r.set_data(1,"bed",6500.65,true);
		r.display_data();
		
		room r1 = new room();
		r1.set_data(1,"guest",500.65,false);
		r1.display_data();
		
//		System.out.println(room.count);

	}

}
