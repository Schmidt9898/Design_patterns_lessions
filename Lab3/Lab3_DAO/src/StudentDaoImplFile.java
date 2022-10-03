import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplFile extends StudentDao {

	List<Student> students = new ArrayList<Student>();

	public StudentDaoImplFile()
	{
		this.addStudent(new Student(0, "asd"));
	}


	@Override
	List<Student> getAllStudents() {
		return students;
	}

	@Override
	void updateStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deleteStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void addStudent(Student s) {
		students.add(s);
		
	}

}
