package tn.esprit.projetapprentissagespringboot.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {

    Student save(Student s);
    // méthode pour afficher la liste de tous les étudiants
    public List<Student> findAllStudents();
    Student findStudentByEmail(String email);
    Student update(Student s);
    boolean deleteStudent(String email);

}
