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
@Table(name = "sis_modules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SisModules.findAll", query = "SELECT s FROM SisModules s"),
    @NamedQuery(name = "SisModules.findByIdModule", query = "SELECT s FROM SisModules s WHERE s.idModule = :idModule"),
    @NamedQuery(name = "SisModules.findByName", query = "SELECT s FROM SisModules s WHERE s.name = :name"),
    @NamedQuery(name = "SisModules.findByDescription", query = "SELECT s FROM SisModules s WHERE s.description = :description")})
public class SisModules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_module")
    private Integer idModule;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "idModule", fetch = FetchType.LAZY)
    private List<UsersChangePasswords> usersChangePasswordsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idModule", fetch = FetchType.LAZY)
    private List<DbConfigs> dbConfigsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idModule", fetch = FetchType.LAZY)
    private List<UsersPermissions> usersPermissionsList;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SisStatus status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idModule", fetch = FetchType.LAZY)
    private List<SisModuleRelClient> sisModuleRelClientList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idModule", fetch = FetchType.LAZY)
    private List<UsersGroups> usersGroupsList;

    public SisModules() {
    }

    public SisModules(Integer idModule) {
        this.idModule = idModule;
    }

    public SisModules(Integer idModule, String name, String description) {
        this.idModule = idModule;
        this.name = name;
        this.description = description;
    }

    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
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
    public List<DbConfigs> getDbConfigsList() {
        return dbConfigsList;
    }

    public void setDbConfigsList(List<DbConfigs> dbConfigsList) {
        this.dbConfigsList = dbConfigsList;
    }

    @XmlTransient
    public List<UsersPermissions> getUsersPermissionsList() {
        return usersPermissionsList;
    }

    public void setUsersPermissionsList(List<UsersPermissions> usersPermissionsList) {
        this.usersPermissionsList = usersPermissionsList;
    }

    public SisStatus getStatus() {
        return status;
    }

    public void setStatus(SisStatus status) {
        this.status = status;
    }

    @XmlTransient
    public List<SisModuleRelClient> getSisModuleRelClientList() {
        return sisModuleRelClientList;
    }

    public void setSisModuleRelClientList(List<SisModuleRelClient> sisModuleRelClientList) {
        this.sisModuleRelClientList = sisModuleRelClientList;
    }

    @XmlTransient
    public List<UsersGroups> getUsersGroupsList() {
        return usersGroupsList;
    }

    public void setUsersGroupsList(List<UsersGroups> usersGroupsList) {
        this.usersGroupsList = usersGroupsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModule != null ? idModule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SisModules)) {
            return false;
        }
        SisModules other = (SisModules) object;
        if ((this.idModule == null && other.idModule != null) || (this.idModule != null && !this.idModule.equals(other.idModule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.SisModules[ idModule=" + idModule + " ]";
    }
    
}
