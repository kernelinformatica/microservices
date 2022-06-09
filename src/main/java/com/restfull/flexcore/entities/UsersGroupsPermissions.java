/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.entities;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dario
 */
@Entity
@Table(name = "users_groups_permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersGroupsPermissions.findAll", query = "SELECT u FROM UsersGroupsPermissions u"),
    @NamedQuery(name = "UsersGroupsPermissions.findByIdGroupsPermissions", query = "SELECT u FROM UsersGroupsPermissions u WHERE u.idGroupsPermissions = :idGroupsPermissions"),
    @NamedQuery(name = "UsersGroupsPermissions.findByName", query = "SELECT u FROM UsersGroupsPermissions u WHERE u.name = :name"),
    @NamedQuery(name = "UsersGroupsPermissions.findByIso", query = "SELECT u FROM UsersGroupsPermissions u WHERE u.iso = :iso"),
    @NamedQuery(name = "UsersGroupsPermissions.findByAdd", query = "SELECT u FROM UsersGroupsPermissions u WHERE u.add = :add"),
    @NamedQuery(name = "UsersGroupsPermissions.findByEdit", query = "SELECT u FROM UsersGroupsPermissions u WHERE u.edit = :edit"),
    @NamedQuery(name = "UsersGroupsPermissions.findByDelete", query = "SELECT u FROM UsersGroupsPermissions u WHERE u.delete = :delete"),
    @NamedQuery(name = "UsersGroupsPermissions.findByReadOnly", query = "SELECT u FROM UsersGroupsPermissions u WHERE u.readOnly = :readOnly")})
public class UsersGroupsPermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_groups_permissions")
    private Integer idGroupsPermissions;
    @Column(name = "name")
    private String name;
    @Column(name = "iso")
    private String iso;
    @Column(name = "add")
    private Boolean add;
    @Column(name = "edit")
    private Boolean edit;
    @Column(name = "delete")
    private Boolean delete;
    @Column(name = "readOnly")
    private Boolean readOnly;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;
    @JoinColumn(name = "id_user_group", referencedColumnName = "id_users_groups")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsersGroups idUserGroup;

    public UsersGroupsPermissions() {
    }

    public UsersGroupsPermissions(Integer idGroupsPermissions) {
        this.idGroupsPermissions = idGroupsPermissions;
    }

    public Integer getIdGroupsPermissions() {
        return idGroupsPermissions;
    }

    public void setIdGroupsPermissions(Integer idGroupsPermissions) {
        this.idGroupsPermissions = idGroupsPermissions;
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

    public Boolean getAdd() {
        return add;
    }

    public void setAdd(Boolean add) {
        this.add = add;
    }

    public Boolean getEdit() {
        return edit;
    }

    public void setEdit(Boolean edit) {
        this.edit = edit;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public SisStatus getStatus() {
        return status;
    }

    public void setStatus(SisStatus status) {
        this.status = status;
    }

    public UsersGroups getIdUserGroup() {
        return idUserGroup;
    }

    public void setIdUserGroup(UsersGroups idUserGroup) {
        this.idUserGroup = idUserGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGroupsPermissions != null ? idGroupsPermissions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersGroupsPermissions)) {
            return false;
        }
        UsersGroupsPermissions other = (UsersGroupsPermissions) object;
        if ((this.idGroupsPermissions == null && other.idGroupsPermissions != null) || (this.idGroupsPermissions != null && !this.idGroupsPermissions.equals(other.idGroupsPermissions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.UsersGroupsPermissions[ idGroupsPermissions=" + idGroupsPermissions + " ]";
    }
    
}
