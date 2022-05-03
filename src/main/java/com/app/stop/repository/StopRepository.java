package com.app.stop.repository;

import com.app.stop.db.Stop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StopRepository extends JpaRepository<Stop,String> {

    Optional<Stop> findById(String id);
}
