package com.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY = "INSERT INTO DOCTOR(doctorName,speciality,fees,ratings,experience) VALUES(?,?,?,?,?)";
    public static final String UPDATEQUERY = "UPDATE DOCTOR SET EXPERIENCE=? WHERE doctorId=?";
    public static final String DELETEQUERY ="DELETE FROM DOCTOR WHERE doctorId=?";
    public static final String FINDALLQUERY = "SELECT * FROM DOCTOR";
    public static final String FINDBYSPECIALITY = "SELECT * FROM DOCTOR WHERE speciality = ?";
    public static final String FINDBYSPECANDEXP ="SELECT * FROM DOCTOR WHERE speciality = ? AND experience >= ?";
    public static final String FINDBYSPECANDRATINGS = "SELECT * FROM DOCTOR WHERE speciality = ? AND ratings >= ?";
    public static final String FINDBYSPECANDFEES = "SELECT * FROM DOCTOR WHERE speciality = ? AND fees <= ?";
    public static final String FINDBYSPECANDNAME = "SELECT * FROM DOCTOR WHERE speciality = ? AND doctorName like ?";
    public static final String FINDBYID = "SELECT * FROM DOCTOR WHERE doctorId = ?";
}
