package tn.esprit.projetapprentissagespringboot.Student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {

    private final List<Student> STUDENTS = new ArrayList<Student>();


    public Student save(Student s) {
        STUDENTS.add(s);
        return s;
    }


    public List<Student> findAllStudents() {
        return STUDENTS;
    }


    public Student findStudentByEmail(String email) {
        return STUDENTS.stream().filter(s -> s.getEmail().equals(email)).findFirst().orElse(null);
    }


    public Student update(Student s) {

        if (s == null || s.getEmail() == null) {
            return null;
        }

        for (int i = 0; i < STUDENTS.size(); i++) {
            Student current = STUDENTS.get(i);

            if (current.getEmail() != null &&
                    current.getEmail().equals(s.getEmail())) {

                STUDENTS.set(i, s);
                return s;
            }
        }
        return null;
    }



    public boolean deleteStudent(String email) {

        if (email == null) {
            return false;
        }

        return STUDENTS.removeIf(s ->
                s.getEmail() != null &&
                        s.getEmail().equals(email)
        );
    }

}
