package com.techdenovo.app.seminarmanagementapp.repository;

import com.techdenovo.app.seminarmanagementapp.model.EducationalInstitute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationalInstituteRepository extends JpaRepository<EducationalInstitute,Long > {
}
