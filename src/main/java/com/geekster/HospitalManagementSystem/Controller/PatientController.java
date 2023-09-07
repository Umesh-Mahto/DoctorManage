package com.geekster.HospitalManagementSystem.Controller;

import com.geekster.HospitalManagementSystem.Model.Patient;
import com.geekster.HospitalManagementSystem.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
     PatientService patientService;

    @PostMapping("/addPatient")
    public String addPatient(@RequestBody Patient patientObj){
        return patientService.addPatient(patientObj);
    }

    @GetMapping("/getPatient")
    public List<Patient> getPatient(){
        return patientService.getPatient();
    }
    @DeleteMapping("/deletePatientById/{id}")
    public String deletePatientById(@PathVariable Integer id){
        return patientService.deletePatientById(id);
    }
    @PutMapping("/updatePatientById")
    public String updatePatientById(@RequestBody Patient patientObj){
        return patientService.updatePatientById(patientObj);
    }
}
