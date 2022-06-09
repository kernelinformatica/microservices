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
@Table(name = "geostates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GeoStates.findAll", query = "SELECT g FROM GeoStates g"),
    @NamedQuery(name = "GeoStates.findByIdStates", query = "SELECT g FROM GeoStates g WHERE g.idStates = :idStates"),
    @NamedQuery(name = "GeoStates.findByIso", query = "SELECT g FROM GeoStates g WHERE g.iso = :iso"),
    @NamedQuery(name = "GeoStates.findByName", query = "SELECT g FROM GeoStates g WHERE g.name = :name"),
    @NamedQuery(name = "GeoStates.findByDescription", query = "SELECT g FROM GeoStates g WHERE g.description = :description"),
    @NamedQuery(name = "GeoStates.findByGeoLocAltitude", query = "SELECT g FROM GeoStates g WHERE g.geoLocAltitude = :geoLocAltitude"),
    @NamedQuery(name = "GeoStates.findByGeoLocLongitude", query = "SELECT g FROM GeoStates g WHERE g.geoLocLongitude = :geoLocLongitude")})
public class GeoStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_states")
    private Integer idStates;
    @Column(name = "iso")
    private String iso;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "geo_loc_altitude")
    private String geoLocAltitude;
    @Column(name = "geo_loc_longitude")
    private String geoLocLongitude;
    @OneToMany(mappedBy = "idState", fetch = FetchType.LAZY)
    private List<Geocitys> geocitysList;
    @JoinColumn(name = "id_country", referencedColumnName = "id_country")
    @ManyToOne(fetch = FetchType.LAZY)
    private Geocountry idCountry;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;

    public GeoStates() {
    }

    public GeoStates(Integer idStates) {
        this.idStates = idStates;
    }

    public Integer getIdStates() {
        return idStates;
    }

    public void setIdStates(Integer idStates) {
        this.idStates = idStates;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public List<Geocitys> getGeocitysList() {
        return geocitysList;
    }

    public void setGeocitysList(List<Geocitys> geocitysList) {
        this.geocitysList = geocitysList;
    }

    public Geocountry getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Geocountry idCountry) {
        this.idCountry = idCountry;
    }

    public SisStatus getStatus() {
        return status;
    }

    public void setStatus(SisStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStates != null ? idStates.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeoStates)) {
            return false;
        }
        GeoStates other = (GeoStates) object;
        if ((this.idStates == null && other.idStates != null) || (this.idStates != null && !this.idStates.equals(other.idStates))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.GeoStates[ idStates=" + idStates + " ]";
    }
    
}
