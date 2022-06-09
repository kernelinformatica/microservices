/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Geocountry;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class GeoCountryDTO {
    public Integer idCountry;
    public String name;
    public String iso;
    public Integer code;
    public String geoLocAltitude;
    public String geoLocLongitude;
    public GeoCountryDTO geoCountry;
    public SisStatusDTO sisStatus; 

    
    
    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getGeoLocAltitude() {
        return geoLocAltitude;
    }

    public void setGeoLocAltitude(String geoLocAltitude) {
        this.geoLocAltitude = geoLocAltitude;
    }

    public String getGeoLocLongitude() {
        return geoLocLongitude;
    }

    public void setGeoLocLongitude(String geoLocLongitude) {
        this.geoLocLongitude = geoLocLongitude;
    }

    public GeoCountryDTO getGeoCountry() {
        return geoCountry;
    }

    public void setGeoCountry(GeoCountryDTO geoCountry) {
        this.geoCountry = geoCountry;
    }

    public SisStatusDTO getSisStatus() {
        return sisStatus;
    }

    public void setSisStatus(SisStatusDTO sisStatus) {
        this.sisStatus = sisStatus;
    }
  
    

}
