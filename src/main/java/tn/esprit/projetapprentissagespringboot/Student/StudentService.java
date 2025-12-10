package tn.esprit.projetapprentissagespringboot.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    // méthode pour afficher la liste de tous les étudiants
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Mohamed Amine",
                        "Larbi",
                        LocalDate.now(),
                        "MohamedAmine.Larbi@gmail.com",
                        22
                ),

                new Student(
                        "Amine",
                        "Gharbi",
                        LocalDate.now(),
                        "Amine.Gharbi@gmail.com",
                        24
                )
        );
    }
}
