package com.example.Actor.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
    private String _id;
    private String movieName;
    private String movieLanguage;
    private String movieType;
    private double ratings;
}
