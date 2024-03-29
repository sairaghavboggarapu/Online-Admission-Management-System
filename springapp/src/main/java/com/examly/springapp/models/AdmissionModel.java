package com.examly.springapp.models;

import javax.persistence.Table;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Admission")
public class AdmissionModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer courseId;
    private Integer studentIdNumber;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String phoneNumber1;
    private String phoneNumber2;
    private String emailId;
    private Date studentDOB;
   

    private String houseNumber;
    private String streetName;
    private String areaName;
    private String state;
    private Integer pincode;
    private String nationality;
    private Integer sslc;
    private Integer hsc;
    private Integer diploma;
    private String status;
    private String reason;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getStudentIdNumber() {
        return studentIdNumber;
    }

    public void setStudentIdNumber(Integer studentIdNumber) {
        this.studentIdNumber = studentIdNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getSslc() {
        return sslc;
    }

    public void setSslc(Integer sslc) {
        this.sslc = sslc;
    }

    public Integer getHsc() {
        return hsc;
    }

    public void setHsc(Integer hsc) {
        this.hsc = hsc;
    }

    public Integer getDiploma() {
        return diploma;
    }

    public void setDiploma(Integer diploma) {
        this.diploma = diploma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    
    public AdmissionModel(Integer id, Integer courseId, Integer studentIdNumber, String firstName, String lastName,
            String fatherName, String motherName, String phoneNumber1, String phoneNumber2, String emailId,
            Date studentDOB, String houseNumber, String streetName, String areaName, String state, Integer pincode,
            String nationality, Integer sslc, Integer hsc, Integer diploma, String status, String reason) {
        this.id = id;
        this.courseId = courseId;
        this.studentIdNumber = studentIdNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.emailId = emailId;
        this.studentDOB = studentDOB;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.areaName = areaName;
        this.state = state;
        this.pincode = pincode;
        this.nationality = nationality;
        this.sslc = sslc;
        this.hsc = hsc;
        this.diploma = diploma;
        this.status = status;
        this.reason = reason;
    }

    public AdmissionModel() {
    }


    

}