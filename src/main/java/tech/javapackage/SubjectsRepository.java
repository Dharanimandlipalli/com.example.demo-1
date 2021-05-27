package tech.javapackage;

import javax.security.auth.Subject;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectsRepository extends MongoRepository<Subject , Integer>{

}
