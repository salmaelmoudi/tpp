package com.salma.tpp.models;

import com.salma.tpp.enums.Genre;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlType(name="eleve")
public class Student {
    private int id;
    private String nom;
    private String prenom;
    private Genre genre;
}
