package com.doctorapp.client;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialization;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService = new DoctorServiceImpl();
        //enum constant
        Specialization specialization = Specialization.GYNAEC;
        String speciality  = specialization.getSpeciality();

        String special = Specialization.GYNAEC.getSpeciality();
        Doctor doctor = new Doctor("Kavitha", speciality,1800,8,10);
        doctorService.addDoctor(doctor);
    }
}
