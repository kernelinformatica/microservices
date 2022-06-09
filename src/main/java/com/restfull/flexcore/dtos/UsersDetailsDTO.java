/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Geocitys;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Dario
 */
public class UsersDetailsDTO {
    public Integer idUserDetails;
    public String addressStreet;
    public Integer addressNumber;
    public Integer celNumber;
    public Date dateBorn;
    public Long docNumber;
    public String  facebook;
    public String instagram;
    public String linkedin; 
    public String passportNumber;
     public String twiter;
    public GeoCitysDTO geoCity;
    public UsersDTO user;
    public SisStatusDTO status;

    public Integer getIdUserDetails() {
        return idUserDetails;
    }

    public void setIdUserDetails(Integer idUserDetails) {
        this.idUserDetails = idUserDetails;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    public Integer getCelNumber() {
        return celNumber;
    }

    public void setCelNumber(Integer celNumber) {
        this.celNumber = celNumber;
    }

    public Date getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(Date dateBorn) {
        this.dateBorn = dateBorn;
    }

    public Long getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(Long docNumber) {
        this.docNumber = docNumber;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getTwiter() {
        return twiter;
    }

    public void setTwiter(String twiter) {
        this.twiter = twiter;
    }

    public GeoCitysDTO getGeoCity() {
        return geoCity;
    }

    public void setGeoCity(GeoCitysDTO geoCity) {
        this.geoCity = geoCity;
    }

    public UsersDTO getUser() {
        return user;
    }

    public void setUser(UsersDTO user) {
        this.user = user;
    }

    public SisStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SisStatusDTO status) {
        this.status = status;
    }
    

}
