package com.techdenovo.app.seminarmanagementapp.controller;
import com.techdenovo.app.seminarmanagementapp.model.EducationalInstitute;
import com.techdenovo.app.seminarmanagementapp.service.EducationalInstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/institute")
public class EducationalInstituteController {
    @Autowired
    EducationalInstituteService educationalInstituteService;

    @PostMapping("/add")
    public EducationalInstitute addEducationalInstitute(@RequestBody EducationalInstitute educationalInstitute) {
        if (educationalInstitute != null)
            educationalInstituteService.saveEducationalInstitute(educationalInstitute);
        return educationalInstitute;
    }
}
