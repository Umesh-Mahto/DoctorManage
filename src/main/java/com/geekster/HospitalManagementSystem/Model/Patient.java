package com.geekster.HospitalManagementSystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient_table")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    @NotNull
    @NotEmpty
    @Size(min = 3)
    @Column(name = "patient_name")
    private String patientName;
    @NotNull
    @Size(max = 20)
    @Column(name = "patient_city")
    private String patientCity;
    @Email
    @Column(name = "patient_email")
    private String patientEmail;
    @NotNull
    @NotEmpty
    @Size(min = 10,max = 10)
    @Column(name = "patient_phoneNumber")
    private String patientPhoneNumber;
    @Column(name = "symptom")
    private String symptom;
    @OneToOne
    @JoinColumn(name = "doctor_doctor_Id",nullable = false)
    private Doctor doctor;

}
