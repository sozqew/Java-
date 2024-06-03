package practice1;

public class Student {
	public int studentNum;		// 학생 번호
	public String name;	// 학생 이름
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum+name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {	// ClassCastException 방지
			Student student = (Student) obj;	//강제형변환(casting)
			
			return student.studentNum == this.studentNum;
		}
		
		return false;
	}
}
