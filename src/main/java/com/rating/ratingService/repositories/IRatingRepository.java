package com.rating.ratingService.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rating.ratingService.entities.Rating;

@Repository
public interface IRatingRepository extends MongoRepository<Rating,String>{
    
    //custom method finders
    List<Rating>findByUserEmail(String userEmail);
    List<Rating>findByHotelName(String hotelName);
}
