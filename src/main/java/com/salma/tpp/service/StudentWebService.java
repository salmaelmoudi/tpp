package com.salma.tpp.service;

import com.salma.tpp.enums.Genre;
import com.salma.tpp.models.Student;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName="EtudiantService")
public class StudentWebService {
    @WebMethod(operationName="ListEtudiant")
    public List<Student> getStudent(){
        return List.of(
                new Student(1, "Salma", "El Moudi", Genre.FEMME),
                new Student(2, "Zineb", "Chadery", Genre.HOMME),
                new Student(3, "Max", "Versatppen", Genre.HOMME)
        );
    }
}
