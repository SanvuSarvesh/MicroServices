package com.example.Actor.Repository;

import com.example.Actor.Model.ActorInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActorRepository extends MongoRepository<ActorInfo,String> {
    ActorInfo findByName(String actorName);
}
