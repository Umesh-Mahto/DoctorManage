package com.geekster.HospitalManagementSystem.Repository;

import com.geekster.HospitalManagementSystem.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface IPatientRepo extends JpaRepository<Patient,Integer> {
    @Modifying
    @Query(value = "update patient set patient_Name =:patientName , patient_Email =:patientEmail , patient_Phone_Number =:patientPhoneNumber where patient_id =:patientId",nativeQuery = true)
    void updatePatientById(Integer patientId, String patientName, String patientEmail, String patientPhoneNumber);
}
