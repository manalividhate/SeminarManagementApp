package com.techdenovo.app.seminarmanagementapp.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String mobNumber;
    private String email;
    private String qualification;
    @ManyToOne
    @JoinColumn(name = "INSTITUTE_ID", referencedColumnName = "id", nullable = false)
    private EducationalInstitute educationalInstitute;
}
