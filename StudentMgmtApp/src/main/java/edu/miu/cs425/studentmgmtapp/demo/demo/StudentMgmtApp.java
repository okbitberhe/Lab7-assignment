package edu.miu.cs425.studentmgmtapp.demo.demo;


import edu.miu.cs425.studentmgmtapp.demo.demo.model.ClassRoom;
import edu.miu.cs425.studentmgmtapp.demo.demo.model.Transcript;
import edu.miu.cs425.studentmgmtapp.demo.demo.repository.ClassRoomRepository;
import edu.miu.cs425.studentmgmtapp.demo.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ClassRoomRepository classroomRepository;

    @Override
    public void run(String... args) throws Exception {

        ClassRoom classroom = new ClassRoom("McLaughlin building", "M105");

        Transcript transcript = new Transcript("BS Computer Science");
        Transcript transcript2 = new Transcript("MSc Computer Science");

        ClassRoom.Student s1 = new ClassRoom.Student("000-61-0001", "Anna", "Lynn", "Smith",
                3.45, LocalDate.of(2019, 5, 24), transcript);
        ClassRoom.Student s2 = new ClassRoom.Student("000-61-0002", "Mnna", "Tina", "Tom",
                3.90, LocalDate.of(2019, 5, 24), transcript2);
        List<ClassRoom.Student> students = Arrays.asList(s1, s2);

//        Student newStudent=saveStudent(s1);// saving student with out the classroom
        classroom.setStudents(students);
        classroom.addStudent(students);//to add the classroom id to each students
        ClassRoom newClassRoom = saveClassRoom(classroom);//save classroom will also save each students and there transcripts
        System.out.println(newClassRoom.getStudents());
//        System.out.println(newStudent);

    }
}