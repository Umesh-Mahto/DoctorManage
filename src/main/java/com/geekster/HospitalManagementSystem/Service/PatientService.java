package com.geekster.HospitalManagementSystem.Service;

import com.geekster.HospitalManagementSystem.Model.Doctor;
import com.geekster.HospitalManagementSystem.Model.Patient;
import com.geekster.HospitalManagementSystem.Repository.IDoctorRepo;
import com.geekster.HospitalManagementSystem.Repository.IPatientRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    IPatientRepo iPatientRepository;
    @Autowired
    IDoctorRepo doctorRepo;
    public String addPatient(Patient patientObj) {
        Integer doctorId = patientObj.getDoctor().getDoctorId();
        Doctor doctorObject = doctorRepo.getReferenceById(doctorId);
        patientObj.setDoctor(doctorObject);
        iPatientRepository.save(patientObj);
        return "Patient added successfully!!";
    }


    public String deletePatientById(Integer id) {
        iPatientRepository.deleteById(id);
        return "Patient deleted successfully!!";
    }
    @Transactional
    public String updatePatientById(Patient patientObj) {
        iPatientRepository.updatePatientById(patientObj.getPatientId(),patientObj.getPatientName(),patientObj.getPatientEmail(),patientObj.getPatientPhoneNumber());
        return "Patient deleted successfully!!";
    }

    public List<Patient> getPatient() {
        return iPatientRepository.findAll();
    }
}
