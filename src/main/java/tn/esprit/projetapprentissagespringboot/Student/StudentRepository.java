package tn.esprit.projetapprentissagespringboot.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findStudentByEmail(String email);
    boolean deleteStudentByEmail(String email);
}
