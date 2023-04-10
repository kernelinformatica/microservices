/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.dtos;
import com.core.entities.Users;
import com.core.entities.UsersGroups;
import com.core.entities.SisStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.ObjectInputFilter.Status;
import java.util.Date;


/**
 *
 * @author Dario Quiroga
 */

public class UsersDTO {
 
    
    public Integer idKey;
   
    public String name;
    public String lastName;
    public String user;
    public String passwords;
    public String loginQrPath;
    public String mail;
    public Date created;
    public Date modify;
    public Boolean superUser; 
    public SisStatus status;
     public UsersGroupsDTO idUserGroup;
  
    public Integer getIdKey() {
        return idKey;
    }

    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
    }
  

    public String getName() {
        return name;
    }

    

    public UsersGroupsDTO getIdUserGroup() {
        return idUserGroup;
    }

    public void setIdUserGroup(UsersGroupsDTO idUserGroup) {
        this.idUserGroup = idUserGroup;
    }

   

  

    
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getLoginQrPath() {
        return loginQrPath;
    }

    public void setLoginQrPath(String loginQrPath) {
        this.loginQrPath = loginQrPath;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModify() {
        return modify;
    }

    public void setModify(Date modify) {
        this.modify = modify;
    }

    public Boolean getSuperUser() {
        return superUser;
    }

    public void setSuperUser(Boolean superUser) {
        this.superUser = superUser;
    }

    public SisStatus getStatus() {
        return status;
    }

    public void setStatus(SisStatus status) {
        this.status = status;
    }

    
   

  
            
}
