/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dario
 */
@Entity
@Table(name = "geocountry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Geocountry.findAll", query = "SELECT g FROM Geocountry g"),
    @NamedQuery(name = "Geocountry.findByIdCountry", query = "SELECT g FROM Geocountry g WHERE g.idCountry = :idCountry"),
    @NamedQuery(name = "Geocountry.findByName", query = "SELECT g FROM Geocountry g WHERE g.name = :name"),
    @NamedQuery(name = "Geocountry.findByIso", query = "SELECT g FROM Geocountry g WHERE g.iso = :iso"),
    @NamedQuery(name = "Geocountry.findByCode", query = "SELECT g FROM Geocountry g WHERE g.code = :code"),
    @NamedQuery(name = "Geocountry.findByGeoLocAltitude", query = "SELECT g FROM Geocountry g WHERE g.geoLocAltitude = :geoLocAltitude"),
    @NamedQuery(name = "Geocountry.findByGeoLocLongitude", query = "SELECT g FROM Geocountry g WHERE g.geoLocLongitude = :geoLocLongitude")})
public class Geocountry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_country")
    private Integer idCountry;
    @Column(name = "name")
    private String name;
    @Column(name = "iso")
    private String iso;
    @Column(name = "code")
    private Integer code;
    @Column(name = "geo_loc_altitude")
    private String geoLocAltitude;
    @Column(name = "geo_loc_longitude")
    private String geoLocLongitude;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;
    @OneToMany(mappedBy = "idCountry", fetch = FetchType.LAZY)
    private List<GeoStates> geoStatesList;

    public Geocountry() {
    }

    public Geocountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public SisStatus getStatus() {
        return status;
    }

    public void setStatus(SisStatus status) {
        this.status = status;
    }

    @XmlTransient
    public List<GeoStates> getGeoStatesList() {
        return geoStatesList;
    }

    public void setGeoStatesList(List<GeoStates> geoStatesList) {
        this.geoStatesList = geoStatesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCountry != null ? idCountry.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Geocountry)) {
            return false;
        }
        Geocountry other = (Geocountry) object;
        if ((this.idCountry == null && other.idCountry != null) || (this.idCountry != null && !this.idCountry.equals(other.idCountry))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.Geocountry[ idCountry=" + idCountry + " ]";
    }
    
}
