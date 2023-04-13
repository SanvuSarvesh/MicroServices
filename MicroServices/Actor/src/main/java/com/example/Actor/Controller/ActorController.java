package com.example.Actor.Controller;

import com.example.Actor.Model.ActorInfo;
import com.example.Actor.Model.Movies;
import com.example.Actor.Service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;
    private WebClient webClient = WebClient.create("Http://localhost:8081");
    Movies movies = new Movies("H001","Indian","Hindi",
            "Patriotic",8.9);

    @PostMapping("/add")
    public ActorInfo addActor(@RequestBody ActorInfo actorInfo){
        Movies movies1 = webClient
                .post()
                .uri("/movie/add")
                .syncBody(movies)
                .retrieve()
                .bodyToMono(Movies.class)
                .block();
        ActorInfo actorInfo1 = actorService.addActor(actorInfo);
        actorInfo1.getMoviesList().add(movies1);
        return actorInfo1;
    }

    @GetMapping("/getAll")
    public List<ActorInfo> getAllActors(){
        return actorService.getAllActor();
    }

    @GetMapping("/getOne{name}")
    public ActorInfo getActorInfo(@PathVariable("name") String actorName){
        return actorService.getActorByName(actorName);
    }
}
