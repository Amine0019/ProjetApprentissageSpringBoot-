package tn.esprit.projetapprentissagespringboot.Student;

import java.util.List;

public class DbStudentService implements StudentService{

    private final StudentRepository repository;

    public DbStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student s) {
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return repository.save(s);
    }

    @Override
    public boolean deleteStudent(String email) {
        return repository.deleteStudentByEmail(email);
    }
}
