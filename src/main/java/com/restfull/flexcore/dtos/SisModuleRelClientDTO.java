/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.SisModuleRelClient;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class SisModuleRelClientDTO {
    public Integer idModuleRelClient;
    public String domain;
    public String geoLocAltitude;
    public String geoLocLongitude;
    public GeoCountryDTO geoCountry;
    public ClientsDTO clients;
    public ModuleDTO idModule;
    public SisStatusDTO sisStatus; 
    
    
  
    

}
