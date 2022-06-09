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
@Table(name = "users_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersGroups.findAll", query = "SELECT u FROM UsersGroups u"),
    @NamedQuery(name = "UsersGroups.findByIdUsersGroups", query = "SELECT u FROM UsersGroups u WHERE u.idUsersGroups = :idUsersGroups"),
    @NamedQuery(name = "UsersGroups.findByDescription", query = "SELECT u FROM UsersGroups u WHERE u.description = :description"),
    @NamedQuery(name = "UsersGroups.findByName", query = "SELECT u FROM UsersGroups u WHERE u.name = :name")})
public class UsersGroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_users_groups")
    private Integer idUsersGroups;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "idUserGroup", fetch = FetchType.LAZY)
    private List<Users> usersList;
    @OneToMany(mappedBy = "idUserGroup", fetch = FetchType.LAZY)
    private List<UsersGroupsPermissions> usersGroupsPermissionsList;
    @JoinColumn(name = "id_client", referencedColumnName = "id_client")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Clients idClient;
    @JoinColumn(name = "id_module", referencedColumnName = "id_module")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SisModules idModule;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;

    public UsersGroups() {
    }

    public UsersGroups(Integer idUsersGroups) {
        this.idUsersGroups = idUsersGroups;
    }

    public Integer getIdUsersGroups() {
        return idUsersGroups;
    }

    public void setIdUsersGroups(Integer idUsersGroups) {
        this.idUsersGroups = idUsersGroups;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    @XmlTransient
    public List<UsersGroupsPermissions> getUsersGroupsPermissionsList() {
        return usersGroupsPermissionsList;
    }

    public void setUsersGroupsPermissionsList(List<UsersGroupsPermissions> usersGroupsPermissionsList) {
        this.usersGroupsPermissionsList = usersGroupsPermissionsList;
    }

    public Clients getIdClient() {
        return idClient;
    }

    public void setIdClient(Clients idClient) {
        this.idClient = idClient;
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
        hash += (idUsersGroups != null ? idUsersGroups.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersGroups)) {
            return false;
        }
        UsersGroups other = (UsersGroups) object;
        if ((this.idUsersGroups == null && other.idUsersGroups != null) || (this.idUsersGroups != null && !this.idUsersGroups.equals(other.idUsersGroups))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.UsersGroups[ idUsersGroups=" + idUsersGroups + " ]";
    }
    
}
