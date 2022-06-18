package com.app.stop.repository;

import com.app.stop.db.Stop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StopRepository extends MongoRepository<Stop,String> {

    Optional<Stop> findById(String id);
}
