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
@Table(name = "users_permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersPermissions.findAll", query = "SELECT u FROM UsersPermissions u"),
    @NamedQuery(name = "UsersPermissions.findByIdUsersPermissions", query = "SELECT u FROM UsersPermissions u WHERE u.idUsersPermissions = :idUsersPermissions"),
    @NamedQuery(name = "UsersPermissions.findByName", query = "SELECT u FROM UsersPermissions u WHERE u.name = :name"),
    @NamedQuery(name = "UsersPermissions.findByDescription", query = "SELECT u FROM UsersPermissions u WHERE u.description = :description")})
public class UsersPermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_users_permissions")
    private Integer idUsersPermissions;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRules", fetch = FetchType.LAZY)
    private List<UsersRelPermissions> usersRelPermissionsList;
    @JoinColumn(name = "id_module", referencedColumnName = "id_module")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SisModules idModule;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SisStatus status;

    public UsersPermissions() {
    }

    public UsersPermissions(Integer idUsersPermissions) {
        this.idUsersPermissions = idUsersPermissions;
    }

    public UsersPermissions(Integer idUsersPermissions, String name, String description) {
        this.idUsersPermissions = idUsersPermissions;
        this.name = name;
        this.description = description;
    }

    public Integer getIdUsersPermissions() {
        return idUsersPermissions;
    }

    public void setIdUsersPermissions(Integer idUsersPermissions) {
        this.idUsersPermissions = idUsersPermissions;
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
    public List<UsersRelPermissions> getUsersRelPermissionsList() {
        return usersRelPermissionsList;
    }

    public void setUsersRelPermissionsList(List<UsersRelPermissions> usersRelPermissionsList) {
        this.usersRelPermissionsList = usersRelPermissionsList;
    }

    public SisModules getIdModule() {
        return idModule;
    }

    public void setIdModule(SisModules idModule) {
        this.idModule = idModule;
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
        hash += (idUsersPermissions != null ? idUsersPermissions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersPermissions)) {
            return false;
        }
        UsersPermissions other = (UsersPermissions) object;
        if ((this.idUsersPermissions == null && other.idUsersPermissions != null) || (this.idUsersPermissions != null && !this.idUsersPermissions.equals(other.idUsersPermissions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.UsersPermissions[ idUsersPermissions=" + idUsersPermissions + " ]";
    }
    
}
