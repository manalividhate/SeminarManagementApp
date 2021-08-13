package com.techdenovo.app.seminarmanagementapp.controller;

import com.techdenovo.app.seminarmanagementapp.model.Participant;
import com.techdenovo.app.seminarmanagementapp.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/participant")
public class ParticipantController {
    @Autowired
    ParticipantService participantService;

    @PostMapping("/add")
    public Participant addParticipant(@RequestBody Participant participant) {
        if (participant != null)
            participantService.saveParticipant(participant);
        return participant;
    }
    @GetMapping("/participant/{id}")
    public Participant showUpdateForm(@PathVariable("id") long id, Model model) {
        Participant participant = participantService.getParticipant(id);
        model.addAttribute("participant", participant);
        return participant;
    }

    @PostMapping("/update/{id}")
    public Participant updateParticipant(@PathVariable("id") long id, @RequestBody Participant participant) {
        participant.setId(id);
        if (participant != null)
            participantService.updateParticipant(participant);
        return participant;
    }
    @GetMapping("/delete/{id}")
    public String deleteParticipant(@PathVariable("id") long id, Model model) {
        Participant participant=participantService.getParticipant(id);
        if(participant!=null){
            participantService.deleteParticipant(id);
        }
        return "delete participant";
    }
    @GetMapping("/list")
    public List<Participant> showParticipantList(Model model ) {
        List<Participant>participants =participantService.getParticipants();
        return participants;
    }

}
