package com.adc.tpp.service;

import com.adc.tpp.enums.Genre;
import com.adc.tpp.models.Student;
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
