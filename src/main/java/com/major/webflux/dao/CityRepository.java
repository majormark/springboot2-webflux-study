package com.major.webflux.dao;

import com.major.webflux.domain.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CityRepository extends ReactiveMongoRepository<City, Long> {

    Mono<City> findByCityName(String cityName);
}
