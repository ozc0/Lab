import java.util.ArrayList;

public class StudentSearch {

	// checks whether a student exists or not by id
    public boolean studentExists(ArrayList<Student> students, String id) throws Exception {
        if (students.isEmpty()) {
            throw new Exception("Students list should not be empty!");
        }
        for (Student student: students)
            if (student.getId().equals(id))
                return true;

        return false;
    }

    // finds given student and returns it as an object
	public Student findOne(ArrayList<Student> students, String name) throws Exception {
	   for (Student student: students)
	       if (student.getName().equals(name))
	           return student;

	   throw new Exception("There is no student with the given name!");
	}

	// finds all students with the given name and returns it as an ArrayList of Students
	public ArrayList<Student> findAll(ArrayList<Student> students, String name) throws Exception {
	   ArrayList<Student> result = new ArrayList<Student>();
	   for (Student student: students)
	       if (student.getName().equals(name)) {
	           result.add(student);
	       }

	   if (result.isEmpty()) {
	       throw new Exception("There is no student with the given name!");
	   }
	   return result;
	}

}
