package com.techdenovo.app.seminarmanagementapp.repository;

import com.techdenovo.app.seminarmanagementapp.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant,Long > {
}
