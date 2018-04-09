package com.example.pihlakasspring.track;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends CrudRepository<Track, Long>{
    @Override
    List<Track> findAll();
}
