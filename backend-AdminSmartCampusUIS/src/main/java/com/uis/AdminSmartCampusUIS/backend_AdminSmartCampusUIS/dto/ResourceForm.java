package com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.entity.Resource;
import com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.entity.ResourceType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResourceForm {


    @NotNull(message = "Name can't be null.")
    @NotEmpty(message = "Name can't be empty.")
    private String name;

    private String description;

    @NotNull(message = "Type can't be null.")
    @NotEmpty(message = "Type can't empty.")
    @Enumerated(EnumType.STRING)
    private String resource_type;

    public Resource getEntity(){
        Resource resource = new Resource();
        setEntity(resource);
        return resource;
    }

    public void setEntity(Resource resource){
        resource.setName(name);
        resource.setDescription(description);
        resource.setResource_type(ResourceType.valueOf(resource_type));
    }    
}
