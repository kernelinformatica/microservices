/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Companys;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class CompanysDTO {
    public Integer idCompany;
    public String name;
    public String description;
    public String adress;
    public Long  cuit;
    public String email;
    public String web;
    public ClientsDTO clients;
    public GeoCitysDTO geoCitys;
    public SisStatusDTO status; 
}
