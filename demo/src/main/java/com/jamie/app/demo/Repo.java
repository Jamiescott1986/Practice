package com.jamie.app.demo;

import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<Vehicle, Integer> {
}
