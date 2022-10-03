import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplMemory extends StudentDao{

	List<Student> students = new ArrayList<Student>();


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
