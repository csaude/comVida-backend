package mz.org.csaude.comvida.backend.base;

import io.micronaut.core.annotation.Creator;
import lombok.AllArgsConstructor;
import lombok.Data;
import mz.org.csaude.comvida.backend.api.RestAPIResponse;
import mz.org.csaude.comvida.backend.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class BaseEntityDTO implements Serializable, RestAPIResponse {

    private Long id;

    private String uuid;

    private String lifeCycleStatus;

    private String syncStatus;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;

    private String updatedBy;

    @Creator
    public BaseEntityDTO() {
    }

    public BaseEntityDTO(BaseEntity baseEntity) {
        this.setId(baseEntity.getId());
        this.setUuid(baseEntity.getUuid());
        if(baseEntity.getLifeCycleStatus() != null) this.setLifeCycleStatus(baseEntity.getLifeCycleStatus().toString());
        this.setCreatedAt(baseEntity.getCreatedAt());
        this.setUpdatedAt(baseEntity.getUpdatedAt());
        this.setCreatedBy(baseEntity.getCreatedBy());
        this.setUpdatedBy(baseEntity.getUpdatedBy());
    }
}
