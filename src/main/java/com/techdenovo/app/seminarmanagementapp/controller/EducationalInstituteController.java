package com.techdenovo.app.seminarmanagementapp.controller;
import com.techdenovo.app.seminarmanagementapp.model.EducationalInstitute;
import com.techdenovo.app.seminarmanagementapp.service.EducationalInstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/{id}")
    public EducationalInstitute showUpdateForm(@PathVariable("id") long id, Model model) {
        EducationalInstitute educationalInstitute = educationalInstituteService.getEducationalInstitute(id);
        model.addAttribute("educationalInstitute", educationalInstitute);
        return educationalInstitute;
    }
    @PostMapping("/update/{id}")
    public EducationalInstitute updateEducationalInstitute(@PathVariable("id") long id, @RequestBody EducationalInstitute educationalInstitute) {
        educationalInstitute.setId(id);
        if (educationalInstitute != null)
            educationalInstituteService.updateEducationalInstitute(educationalInstitute);
        return educationalInstitute;
    }
    @GetMapping("/delete/{id}")
    public String deleteEducationalInstitute(@PathVariable("id") long id, Model model) {
        EducationalInstitute educationalInstitute=educationalInstituteService.getEducationalInstitute(id);
        if(educationalInstitute!=null){
            educationalInstituteService.deleteEducationalInstitute(id);
        }
        return "delete Educational Institute";
    }
    @GetMapping("/list")
    public List<EducationalInstitute> showEducationalInstituteList(Model model ) {
        List<EducationalInstitute>educationalInstitutes =educationalInstituteService.getEducationalInstitutes();
        return educationalInstitutes;
    }
}
