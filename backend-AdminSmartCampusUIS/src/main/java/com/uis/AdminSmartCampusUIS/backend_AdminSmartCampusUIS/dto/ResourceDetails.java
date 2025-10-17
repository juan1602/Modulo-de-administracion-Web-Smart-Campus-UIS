package com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.dto;

import com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.entity.Resource;
import com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.entity.ResourceType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResourceDetails {

    private long id;
    private long global_id;
    private String name;
    private String description;
    private ResourceType resource_type;


    public void setEntity(Resource resource){
        id = resource.getId();
        global_id = resource.getGlobal_id();
        name = resource.getName();
        description = resource.getDescription();
        resource_type = resource.getResource_type();
    }    
}
