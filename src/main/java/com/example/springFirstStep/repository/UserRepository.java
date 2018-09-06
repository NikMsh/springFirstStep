package com.example.springFirstStep.repository;

import com.example.springFirstStep.domain.User;
import org.springframework.data.repository.CrudRepository;

import javax.jws.soap.SOAPBinding;
import javax.validation.constraints.Max;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer>{
    List<User> findByName(String name);
}
