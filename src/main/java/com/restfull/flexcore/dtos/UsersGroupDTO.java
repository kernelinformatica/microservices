/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Clients;
import com.restfull.flexcore.entities.SisModules;
import com.restfull.flexcore.entities.UsersGroups;
import com.restfull.flexcore.entities.UsersGroupsPermissions;

/**
 *
 * @author Dario
 */
public class UsersGroupDTO {
    
    public Integer idUsersGroups;
    public String description;
    public String name;
    public UsersDTO users;
    // convertir a dtos
    public UsersGroupsPermissions  usersGroupsPermissions;
    public Clients clients;
    public SisModules sisModule;
    public SisStatusDTO sisStatus;
            
    
}
