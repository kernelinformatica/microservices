/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dario
 */
@Entity
@Table(name = "geocitys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Geocitys.findAll", query = "SELECT g FROM Geocitys g"),
    @NamedQuery(name = "Geocitys.findByIdCity", query = "SELECT g FROM Geocitys g WHERE g.idCity = :idCity"),
    @NamedQuery(name = "Geocitys.findByName", query = "SELECT g FROM Geocitys g WHERE g.name = :name"),
    @NamedQuery(name = "Geocitys.findByIso", query = "SELECT g FROM Geocitys g WHERE g.iso = :iso"),
    @NamedQuery(name = "Geocitys.findByPostalCode", query = "SELECT g FROM Geocitys g WHERE g.postalCode = :postalCode"),
    @NamedQuery(name = "Geocitys.findByGeoLocAltitude", query = "SELECT g FROM Geocitys g WHERE g.geoLocAltitude = :geoLocAltitude"),
    @NamedQuery(name = "Geocitys.findByGeoLocLongitude", query = "SELECT g FROM Geocitys g WHERE g.geoLocLongitude = :geoLocLongitude")})
public class Geocitys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_city")
    private Integer idCity;
    @Column(name = "name")
    private String name;
    @Column(name = "iso")
    private String iso;
    @Column(name = "postal_code")
    private Integer postalCode;
    @Column(name = "geo_loc_altitude")
    private String geoLocAltitude;
    @Column(name = "geo_loc_longitude")
    private String geoLocLongitude;
    @OneToMany(mappedBy = "idCity", fetch = FetchType.LAZY)
    private List<Clients> clientsList;
    @JoinColumn(name = "id_state", referencedColumnName = "id_states")
    @ManyToOne(fetch = FetchType.LAZY)
    private GeoStates idState;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;
    @OneToMany(mappedBy = "idCity", fetch = FetchType.LAZY)
    private List<UsersDetails> usersDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCity", fetch = FetchType.LAZY)
    private List<Companys> companysList;

    public Geocitys() {
    }

    public Geocitys(Integer idCity) {
        this.idCity = idCity;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getGeoLocAltitude() {
        return geoLocAltitude;
    }

    public void setGeoLocAltitude(String geoLocAltitude) {
        this.geoLocAltitude = geoLocAltitude;
    }

    public String getGeoLocLongitude() {
        return geoLocLongitude;
    }

    public void setGeoLocLongitude(String geoLocLongitude) {
        this.geoLocLongitude = geoLocLongitude;
    }

    @XmlTransient
    public List<Clients> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }

    public GeoStates getIdState() {
        return idState;
    }

    public void setIdState(GeoStates idState) {
        this.idState = idState;
    }

    public SisStatus getStatus() {
        return status;
    }

    public void setStatus(SisStatus status) {
        this.status = status;
    }

    @XmlTransient
    public List<UsersDetails> getUsersDetailsList() {
        return usersDetailsList;
    }

    public void setUsersDetailsList(List<UsersDetails> usersDetailsList) {
        this.usersDetailsList = usersDetailsList;
    }

    @XmlTransient
    public List<Companys> getCompanysList() {
        return companysList;
    }

    public void setCompanysList(List<Companys> companysList) {
        this.companysList = companysList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCity != null ? idCity.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Geocitys)) {
            return false;
        }
        Geocitys other = (Geocitys) object;
        if ((this.idCity == null && other.idCity != null) || (this.idCity != null && !this.idCity.equals(other.idCity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.Geocitys[ idCity=" + idCity + " ]";
    }
    
}
