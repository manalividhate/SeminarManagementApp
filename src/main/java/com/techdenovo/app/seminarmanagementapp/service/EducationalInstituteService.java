package com.techdenovo.app.seminarmanagementapp.service;
import com.techdenovo.app.seminarmanagementapp.model.EducationalInstitute;
import com.techdenovo.app.seminarmanagementapp.repository.EducationalInstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationalInstituteService {
    @Autowired
    EducationalInstituteRepository educationalInstituteRepository;

    public EducationalInstitute saveEducationalInstitute(EducationalInstitute educationalInstitute){
        if(educationalInstitute!=null){
            educationalInstituteRepository.save(educationalInstitute);
        }
        return educationalInstitute;
    }
    public List<EducationalInstitute> getEducationalInstitutes(){
        List<EducationalInstitute> educationalInstitutes = educationalInstituteRepository.findAll();
        return educationalInstitutes;
    }
    public void deleteEducationalInstitute(long id){
        EducationalInstitute existingEducationalInstitute= educationalInstituteRepository.findById(id).orElse(null);
        if (existingEducationalInstitute!=null){
            educationalInstituteRepository.deleteById(existingEducationalInstitute.getId());
        }
    }
}
