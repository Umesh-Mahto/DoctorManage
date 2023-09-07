package com.geekster.HospitalManagementSystem.Model;

import com.geekster.HospitalManagementSystem.Enum.DoctorCity;
import com.geekster.HospitalManagementSystem.Enum.Speciality;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctor_table")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer doctorId;
    @Column(name = "doctor_name")
    private String doctorName;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "doctor_city")
    private DoctorCity doctorCity;
    @Email
    @Column(name = "email")
    private String email;
    @NotNull
    @NotEmpty
    @Size(min = 10,max = 10)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "speciality")
    private Speciality speciality;
}
