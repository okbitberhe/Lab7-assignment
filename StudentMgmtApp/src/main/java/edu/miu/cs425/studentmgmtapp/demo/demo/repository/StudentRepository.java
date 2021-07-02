package edu.miu.cs425.studentmgmtapp.demo.demo.repository;


import edu.miu.cs425.studentmgmtapp.demo.demo.model.ClassRoom;
import edu.miu.cs425.studentmgmtapp.demo.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
}
