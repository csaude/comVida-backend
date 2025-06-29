package mz.org.csaude.comvida.backend.entity;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import mz.org.csaude.comvida.backend.base.BaseEntity;

import java.util.Date;

@Entity
@Getter
@Setter
@Serdeable.Deserializable
@Table(name = "cohort_members")
public class CohortMember extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "cohort_id")
    private Cohort cohort;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "source_type_id")
    private CohortMemberSource cohortMemberSource;

    private String originId;

    @Temporal(TemporalType.DATE)
    private Date inclusionDate;

    @Temporal(TemporalType.DATE)
    private Date exclusionDate;
}
