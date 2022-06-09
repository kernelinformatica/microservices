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
@Table(name = "platforms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platforms.findAll", query = "SELECT p FROM Platforms p"),
    @NamedQuery(name = "Platforms.findByIdPlatform", query = "SELECT p FROM Platforms p WHERE p.idPlatform = :idPlatform"),
    @NamedQuery(name = "Platforms.findByName", query = "SELECT p FROM Platforms p WHERE p.name = :name"),
    @NamedQuery(name = "Platforms.findByDescription", query = "SELECT p FROM Platforms p WHERE p.description = :description")})
public class Platforms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_platform")
    private Integer idPlatform;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "idPlatform", fetch = FetchType.LAZY)
    private List<UsersChangePasswords> usersChangePasswordsList;
    @OneToMany(mappedBy = "idPlatform", fetch = FetchType.LAZY)
    private List<UsersTokens> usersTokensList;

    public Platforms() {
    }

    public Platforms(Integer idPlatform) {
        this.idPlatform = idPlatform;
    }

    public Integer getIdPlatform() {
        return idPlatform;
    }

    public void setIdPlatform(Integer idPlatform) {
        this.idPlatform = idPlatform;
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

    @XmlTransient
    public List<UsersChangePasswords> getUsersChangePasswordsList() {
        return usersChangePasswordsList;
    }

    public void setUsersChangePasswordsList(List<UsersChangePasswords> usersChangePasswordsList) {
        this.usersChangePasswordsList = usersChangePasswordsList;
    }

    @XmlTransient
    public List<UsersTokens> getUsersTokensList() {
        return usersTokensList;
    }

    public void setUsersTokensList(List<UsersTokens> usersTokensList) {
        this.usersTokensList = usersTokensList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlatform != null ? idPlatform.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platforms)) {
            return false;
        }
        Platforms other = (Platforms) object;
        if ((this.idPlatform == null && other.idPlatform != null) || (this.idPlatform != null && !this.idPlatform.equals(other.idPlatform))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.Platforms[ idPlatform=" + idPlatform + " ]";
    }
    
}
