package com.techdenovo.app.seminarmanagementapp.service;

import com.techdenovo.app.seminarmanagementapp.model.Participant;
import com.techdenovo.app.seminarmanagementapp.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {
    @Autowired
    ParticipantRepository participantRepository;

    public Participant saveParticipant(Participant participant){
        if(participant!=null){
            participantRepository.save(participant);
        }
        return participant;
    }
    public Participant getParticipant(long id){
        Participant existingParticipant = participantRepository.findById(id).orElse(null);
        return existingParticipant;
    }
    public Participant updateParticipant(Participant participant){
        Participant existingParticipant= participantRepository.findById(participant.getId()).orElse(null);
        if(existingParticipant!= null){
            existingParticipant.setFirstName(participant.getFirstName());
            existingParticipant.setLastName(participant.getLastName());
            existingParticipant.setMobNumber(participant.getMobNumber());
            existingParticipant.setEmail(participant.getEmail());
            existingParticipant.setQualification(participant.getQualification());
            participantRepository.save(existingParticipant);
        }
        return existingParticipant;
    }
    public void deleteParticipant(long id){
        Participant existingParticipant= participantRepository.findById(id).orElse(null);
        if (existingParticipant!=null){
            participantRepository.deleteById(existingParticipant.getId());
        }
    }
    public List<Participant> getParticipants(){
        List<Participant> participants = participantRepository.findAll();
        return participants;
    }

}
