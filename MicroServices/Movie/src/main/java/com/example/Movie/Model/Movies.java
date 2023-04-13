package com.example.Movie.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "movies")
public class Movies {
    private String _id;
    private String movieName;
    private String movieLanguage;
    private String movieType;
    private double ratings;
}
