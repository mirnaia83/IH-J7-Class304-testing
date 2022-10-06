package com.ironhack.courses.repositories;

import com.ironhack.courses.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
