package com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RedisMessage {

    private String type;
    private String queue;
    private String content;
   
}
