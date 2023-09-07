package com.geekster.HospitalManagementSystem.Controller;

import com.geekster.HospitalManagementSystem.Model.Doctor;
import com.geekster.HospitalManagementSystem.Service.DoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")

public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @PostMapping("/addDoctor")
    public String addDoctor(@org.springframework.web.bind.annotation.RequestBody Doctor doctorObj){

        return doctorService.saveDoctor(doctorObj);
    }
    @GetMapping("/getDoctorAll")
    public List<Doctor> getDoctorAll(){
        return doctorService.getDoctorAll();
    }
    @DeleteMapping("/deleteDoctorById/{id}")
    public String deleteDoctorById(@PathVariable Integer id){
        return doctorService.deleteDoctorById(id);
    }
    @PutMapping("/updateDoctorById")
    public String updateDoctorById(@RequestBody Doctor doctorObj)
    {
        return doctorService.updateDoctorById(doctorObj);
    }
}
