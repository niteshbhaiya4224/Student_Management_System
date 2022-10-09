package com.niteshcodes.sms.student_management_system.repositry;
import org.springframework.data.jpa.repository.JpaRepository;
import com.niteshcodes.sms.student_management_system.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

    
}