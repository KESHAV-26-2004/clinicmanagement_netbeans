-- ======================================
-- Clinic Management System Database
-- ======================================

CREATE DATABASE IF NOT EXISTS clinic_management;
USE clinic_management;

-- ======================================
-- Table: patients
-- ======================================

CREATE TABLE patients (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    age INT,
    gender VARCHAR(10),
    phone_no VARCHAR(15),
    disease VARCHAR(255),
    visit_date DATE,
    visit_time TIME
);

-- ======================================
-- Table: appointments
-- ======================================

CREATE TABLE appointments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    phone_no VARCHAR(15),
    appointment_date DATE,
    day VARCHAR(20),
    description TEXT,
    request_status VARCHAR(50)
);

-- ======================================
-- Table: users (login system)
-- ======================================

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL
);