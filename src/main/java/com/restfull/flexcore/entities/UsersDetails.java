/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dario
 */
@Entity
@Table(name = "users_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersDetails.findAll", query = "SELECT u FROM UsersDetails u"),
    @NamedQuery(name = "UsersDetails.findByIdUserDetails", query = "SELECT u FROM UsersDetails u WHERE u.idUserDetails = :idUserDetails"),
    @NamedQuery(name = "UsersDetails.findByAddressStreet", query = "SELECT u FROM UsersDetails u WHERE u.addressStreet = :addressStreet"),
    @NamedQuery(name = "UsersDetails.findByAddressNumber", query = "SELECT u FROM UsersDetails u WHERE u.addressNumber = :addressNumber"),
    @NamedQuery(name = "UsersDetails.findByCelNumber", query = "SELECT u FROM UsersDetails u WHERE u.celNumber = :celNumber"),
    @NamedQuery(name = "UsersDetails.findByDateBorn", query = "SELECT u FROM UsersDetails u WHERE u.dateBorn = :dateBorn"),
    @NamedQuery(name = "UsersDetails.findByDocNumber", query = "SELECT u FROM UsersDetails u WHERE u.docNumber = :docNumber"),
    @NamedQuery(name = "UsersDetails.findByFacebook", query = "SELECT u FROM UsersDetails u WHERE u.facebook = :facebook"),
    @NamedQuery(name = "UsersDetails.findByInstagram", query = "SELECT u FROM UsersDetails u WHERE u.instagram = :instagram"),
    @NamedQuery(name = "UsersDetails.findByLinkedin", query = "SELECT u FROM UsersDetails u WHERE u.linkedin = :linkedin"),
    @NamedQuery(name = "UsersDetails.findByPassportNumber", query = "SELECT u FROM UsersDetails u WHERE u.passportNumber = :passportNumber"),
    @NamedQuery(name = "UsersDetails.findByTwiter", query = "SELECT u FROM UsersDetails u WHERE u.twiter = :twiter")})
public class UsersDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user_details")
    private Integer idUserDetails;
    @Column(name = "addressStreet")
    private String addressStreet;
    @Column(name = "addressNumber")
    private Integer addressNumber;
    @Column(name = "celNumber")
    private Long celNumber;
    @Column(name = "dateBorn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBorn;
    @Column(name = "docNumber")
    private Long docNumber;
    @Column(name = "facebook")
    private String facebook;
    @Column(name = "instagram")
    private String instagram;
    @Column(name = "linkedin")
    private String linkedin;
    @Column(name = "passportNumber")
    private BigInteger passportNumber;
    @Column(name = "twiter")
    private String twiter;
    @JoinColumn(name = "id_city", referencedColumnName = "id_city")
    @ManyToOne(fetch = FetchType.LAZY)
    private Geocitys idCity;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SisStatus status;
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users idUser;

    public UsersDetails() {
    }

    public UsersDetails(Integer idUserDetails) {
        this.idUserDetails = idUserDetails;
    }

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

    public Long getCelNumber() {
        return celNumber;
    }

    public void setCelNumber(Long celNumber) {
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

    public BigInteger getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(BigInteger passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getTwiter() {
        return twiter;
    }

    public void setTwiter(String twiter) {
        this.twiter = twiter;
    }

    public Geocitys getIdCity() {
        return idCity;
    }

    public void setIdCity(Geocitys idCity) {
        this.idCity = idCity;
    }

    public SisStatus getStatus() {
        return status;
    }

    public void setStatus(SisStatus status) {
        this.status = status;
    }

    public Users getIdUser() {
        return idUser;
    }

    public void setIdUser(Users idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserDetails != null ? idUserDetails.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersDetails)) {
            return false;
        }
        UsersDetails other = (UsersDetails) object;
        if ((this.idUserDetails == null && other.idUserDetails != null) || (this.idUserDetails != null && !this.idUserDetails.equals(other.idUserDetails))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.UsersDetails[ idUserDetails=" + idUserDetails + " ]";
    }
    
}
