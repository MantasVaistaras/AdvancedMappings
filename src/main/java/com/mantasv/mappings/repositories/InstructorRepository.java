package com.mantasv.mappings.repositories;

import com.mantasv.mappings.models.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Integer> {
}
