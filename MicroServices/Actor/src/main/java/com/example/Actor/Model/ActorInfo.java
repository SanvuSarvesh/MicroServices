package com.example.Actor.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.LazyBSONList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "actor")
public class ActorInfo {
    private String _id;
    private String name;
    private int age;
    private String nationality;
    List<Movies> moviesList = new ArrayList<>();
}
