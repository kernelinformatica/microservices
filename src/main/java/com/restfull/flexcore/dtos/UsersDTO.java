/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Users;

import java.io.ObjectInputFilter.Status;
import java.util.Date;


/**
 *
 * @author Dario
 */

public class UsersDTO {
 
    
    public Integer idUser;
    public String name;
    public String lastName;
    public String user;
    public String passwords;
    public String loginQrPath;
    public String mail;
    public Date created;
    public Date modify;
    public Boolean superUser; 
   // reemplazar estos pos sus DTOS correspondientes
    public SisStatusDTO status;
    public UsersTokensDTO userTokens;
    public UsersGroupDTO userGroups;
    public UsersDetailsDTO userDetails;
    public UsersRelPermissionsDTO userRelPermisions;
   

  
            
}
