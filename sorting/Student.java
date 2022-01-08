package sorting;

public class Student implements Comparable<Student>{
	private String firstName;
	private String lastName;
	private int mark;

	public Student(String firsName, String lastName, int mark) {
		this.firstName=firsName;
		this.lastName=lastName;
		this.mark=mark;
	}

	@Override
	public String toString() {
		return "Student Details: " + firstName + " " + lastName + " " + mark ;
	}

	@Override
	public int compareTo(Student stud2) {
		// TODO Auto-generated method stub
		if(lastName.compareTo(stud2.getLastName()) < 0)
			return -1;
		if(lastName.compareTo(stud2.getLastName()) == 0)
			return 0;
		return 1;
	}
	
	public int compateTo(Student stud2) {
		if((Integer.valueOf(mark).compareTo(Integer.valueOf(stud2.getMark())) < 0 ))
			return -1;
		if((Integer.valueOf(mark).compareTo(Integer.valueOf(stud2.getMark())) == 0 ))
			return 0;
		return 1;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}


}
