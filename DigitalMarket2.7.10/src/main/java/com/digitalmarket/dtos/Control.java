package com.digitalmarket.dtos;

import com.digitalmarket.dtos.AppCodeDTO;

/**
 *
 * @author Dario Quiroga
 */
public class Control {
    private AppCodeDTO code;
    private String description;
    private String details;
    private String version;

    public AppCodeDTO getCode() {
        return code;
    }

    public void setCode(AppCodeDTO code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    

  
}
