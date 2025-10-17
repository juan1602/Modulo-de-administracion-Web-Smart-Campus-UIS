package com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.dto;


import com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.entity.Application;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApplicationForm {

    //@NotNull(message = "Name can't be null.")
    //@NotEmpty(message = "Name can't be empty.")
    private String name;

    public Application getEntity(){
        Application app = new Application();
        setEntity(app);
        return app;
    }

    public void setEntity(Application app){
        app.setName(name);
    }


    
}
