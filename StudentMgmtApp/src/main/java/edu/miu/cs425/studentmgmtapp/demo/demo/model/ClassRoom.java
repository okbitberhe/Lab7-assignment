package edu.miu.cs425.studentmgmtapp.demo.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long classroomId;
    private String buildingName;
    private String roomNumber;

    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL)
    private List<Student> students;

    public ClassRoom() {
    }

    public ClassRoom(String buildingName, String roomNumber) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public ClassRoom(long classroomId, String buildingName, String roomNumber) {
        super();
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(List<Student> students) {
        this.students = students;
        for (Student s:students)
            s.setClassroom(this);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "buildingName='" + buildingName + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }

}
