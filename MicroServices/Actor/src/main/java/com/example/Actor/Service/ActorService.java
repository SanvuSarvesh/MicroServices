package com.example.Actor.Service;

import com.example.Actor.Model.ActorInfo;
import com.example.Actor.Repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ActorService {
    @Autowired
    private ActorRepository actorRepository;
    public ActorInfo addActor(ActorInfo actorInfo){
       ActorInfo actorInfo1 = actorRepository.save(actorInfo);
        return actorInfo1;
        //return new ResponseEntity<>("New Actor added.", HttpStatus.CREATED);
    }
    public List<ActorInfo> getAllActor(){
        List<ActorInfo> actorInfoList = actorRepository.findAll();
        return actorInfoList;

    }
    public ActorInfo getActorByName(String actorName){
        ActorInfo actorInfo = actorRepository.findByName(actorName);
        return actorInfo;
    }
}
