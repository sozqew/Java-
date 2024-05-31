package practice01;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		//System.out.println("Student이퀄즈 " + obj);
		if(obj instanceof Student) {	// ClassCastException 방지
			Student student = (Student) obj;	//강제형변환(casting)
			if(this.studentNum == student.studentNum); 
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//return studentNum.hashCode();
		return Integer.parseInt(studentNum);
	}
}
