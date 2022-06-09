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
public class ClientsDTO {
    public Integer idClient;
    public String name;
    public String description;
    public String adress;
    public BigInteger  phoneNumber;
    public String email;
    public String web;
    public ClientsSubCategoriesDTO clientsSubCategories;
    public CompanysDTO company;
    public GeoCitysDTO geoCity;
    public SisModuleRelClientDTO sisModuleRelClient;
    public UsersGroupDTO usersGroup;
    
}
