package tn.esprit.projetapprentissagespringboot.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class InMemoryStudentService implements StudentService {

    //Injection de dépendance
    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    @Override
    public Student findStudentByEmail(String email) {
        return dao.findStudentByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public boolean deleteStudent(String email) {
        return dao.deleteStudent(email);
    }
}

