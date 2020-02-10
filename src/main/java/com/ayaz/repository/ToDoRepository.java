package com.ayaz.repository;

import com.ayaz.domain.ToDo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoRepository extends ReactiveMongoRepository<ToDo,String> {

}
