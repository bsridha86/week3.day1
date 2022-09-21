package overloading;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s = new Students();
		
		s.getStudentInfo(31071);
		s.getStudentInfo(31071, "Bala");
		s.getStudentInfo("bala@test.com", 917670967);
		
	}

	public void getStudentInfo(int id){
		System.out.println("The student ID is :" + id);
		
	}
	
	public void getStudentInfo(int id, String name){
		System.out.println("The student ID is :" + id + " and Student name is: " + name );
	}
	
	public void getStudentInfo(String email, long PhoneNo){
		
		System.out.println("The student email is :" + email + " and Student phone no. is: " + PhoneNo );
		
	}
	
}

