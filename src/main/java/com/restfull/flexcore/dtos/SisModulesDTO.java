/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.SisModules;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class SisModulesDTO {
    public Integer idModule;
    public String name;
    public String description;
    public UsersChangePasswordsDTO usersChangePasswords;
    public UsersPermissionsDTO usersPermissions;
    public SisModuleRelClient sisModulerelClient;
    public SisStatusDTO sisStatus; 
    
    
  
    

}
