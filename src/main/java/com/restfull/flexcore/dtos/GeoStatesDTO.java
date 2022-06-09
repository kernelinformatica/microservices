/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.GeoStates;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class GeoStatesDTO {
    public Integer idStates;
    public String name;
    public String iso;
    public Integer postalCode;
    public String geoLocAltitude;
    public String geoLocLongitude;
    public GeoCitysDTO citys;
    public GeoStatesDTO geoStates;
    public GeoCountryDTO geoCountry;
    public SisStatusDTO sisStatus; 
  
    

}
