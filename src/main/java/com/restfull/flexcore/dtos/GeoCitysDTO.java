/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Geocitys;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class GeoCitysDTO {
    public Integer idCity;
    public String name;
    public String iso;
    public Integer postalCode;
    public String geoLocAltitude;
    public String geoLocLongitude;
    public ClientsDTO clients;
    public GeoStatesDTO geoStates;
    public SisStatusDTO sisStatus; 
    public UsersDetailsDTO userDetail;
    

}
