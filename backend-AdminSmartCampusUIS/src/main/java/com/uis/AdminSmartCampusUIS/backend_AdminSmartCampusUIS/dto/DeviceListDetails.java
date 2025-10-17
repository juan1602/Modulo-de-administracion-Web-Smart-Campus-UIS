package com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.dto;

import com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.entity.Device;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeviceListDetails {
    
    private long id;
    private String name;

    public void setEntity(Device device){
        id = device.getId();
        name = device.getName();
    }

}
