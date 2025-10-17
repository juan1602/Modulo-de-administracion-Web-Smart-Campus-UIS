package com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.entity.ServiceModel;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServiceForm {

    @NotNull(message = "Name can't be null.")
    @NotEmpty(message = "Name can't be empty.")
    private String name;

    public ServiceModel getEntity(){
        ServiceModel service_model = new ServiceModel();
        setEntity(service_model);
        return service_model;
    }

    public void setEntity(ServiceModel service_model){
        service_model.setName(name);
    }
    
}
