package edu.miu.cs425.studentmgmtapp.demo.demo.repository;

import edu.miu.cs425.studentmgmtapp.demo.demo.model.ClassRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClassRoomRepository extends CrudRepository<ClassRoom, Long> {



}
