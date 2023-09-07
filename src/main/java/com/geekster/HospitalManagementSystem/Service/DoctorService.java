package com.geekster.HospitalManagementSystem.Service;

import com.geekster.HospitalManagementSystem.Model.Doctor;
import com.geekster.HospitalManagementSystem.Repository.IDoctorRepo;
import jakarta.transaction.Transactional;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DoctorService {
   @Autowired
   IDoctorRepo doctorRepo;
    public String saveDoctor(Doctor doctorObj) {
        doctorRepo.save(doctorObj);
        return "Doctor added successfully!!";
    }

    public List<Doctor> getDoctorAll() {
        return doctorRepo.findAll();
    }
    @Transactional
    public String deleteDoctorById(Integer id) {
        doctorRepo.deleteDoctor(id);
        return "Doctor deleted successfully!!";
    }
    @Transactional
    public String updateDoctorById(Doctor doctorObj) {
        doctorRepo.updateDoctor(doctorObj.getDoctorId(),doctorObj.getDoctorName(),doctorObj.getEmail(),doctorObj.getPhoneNumber());
        return "Doctor Updated successfully!!";
    }
}
