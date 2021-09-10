package com.muf.mp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.muf.mp.model.ListBuktiPotongModel;

public interface BuktiPajakRepository extends MongoRepository<ListBuktiPotongModel, String> {
	//Optional<Student> findStudentByFirstName(String firstName);
}
