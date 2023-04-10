/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dario
 */
@Entity
@Table(name = "sis_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SisStatus.findAll", query = "SELECT s FROM SisStatus s"),
    @NamedQuery(name = "SisStatus.findByIdKey", query = "SELECT s FROM SisStatus s WHERE s.idKey = :idKey"),
    @NamedQuery(name = "SisStatus.findByName", query = "SELECT s FROM SisStatus s WHERE s.name = :name"),
    @NamedQuery(name = "SisStatus.findByDescription", query = "SELECT s FROM SisStatus s WHERE s.description = :description")})
public class SisStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_key")
    private Integer idKey;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public SisStatus() {
    }

    public SisStatus(Integer idKey) {
        this.idKey = idKey;
    }

    public Integer getIdKey() {
        return idKey;
    }

    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKey != null ? idKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SisStatus)) {
            return false;
        }
        SisStatus other = (SisStatus) object;
        if ((this.idKey == null && other.idKey != null) || (this.idKey != null && !this.idKey.equals(other.idKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.core.dtos.SisStatus[ idKey=" + idKey + " ]";
    }
    
}
