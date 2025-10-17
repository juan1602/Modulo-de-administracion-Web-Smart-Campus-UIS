package com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.entity.Property;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PropertyForm {

    @NotNull(message = "Name doesn't be null.")
    @NotEmpty(message = "Name not empty.")
    private String name;

    @NotNull(message = "Name doesn't be null.")
    @NotEmpty(message = "Name not empty.")
    private String value;

    public Property getEntity(){
        Property property = new Property();
        setEntity(property);
        return property;
    }

    public void setEntity(Property property){
        property.setName(name);
        property.setValue(value);
    }

}
