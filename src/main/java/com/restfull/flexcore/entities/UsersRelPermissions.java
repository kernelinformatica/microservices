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
@Table(name = "users_rel_permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersRelPermissions.findAll", query = "SELECT u FROM UsersRelPermissions u"),
    @NamedQuery(name = "UsersRelPermissions.findByIdUserRelPermissions", query = "SELECT u FROM UsersRelPermissions u WHERE u.idUserRelPermissions = :idUserRelPermissions"),
    @NamedQuery(name = "UsersRelPermissions.findByAdd", query = "SELECT u FROM UsersRelPermissions u WHERE u.add = :add"),
    @NamedQuery(name = "UsersRelPermissions.findByEdit", query = "SELECT u FROM UsersRelPermissions u WHERE u.edit = :edit"),
    @NamedQuery(name = "UsersRelPermissions.findByDelete", query = "SELECT u FROM UsersRelPermissions u WHERE u.delete = :delete"),
    @NamedQuery(name = "UsersRelPermissions.findByReadOnly", query = "SELECT u FROM UsersRelPermissions u WHERE u.readOnly = :readOnly")})
public class UsersRelPermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user_rel_permissions")
    private Integer idUserRelPermissions;
    @Basic(optional = false)
    @Column(name = "add")
    private boolean add;
    @Basic(optional = false)
    @Column(name = "edit")
    private boolean edit;
    @Basic(optional = false)
    @Column(name = "delete")
    private boolean delete;
    @Basic(optional = false)
    @Column(name = "readOnly")
    private boolean readOnly;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users idUser;
    @JoinColumn(name = "id_rules", referencedColumnName = "id_users_permissions")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private UsersPermissions idRules;

    public UsersRelPermissions() {
    }

    public UsersRelPermissions(Integer idUserRelPermissions) {
        this.idUserRelPermissions = idUserRelPermissions;
    }

    public UsersRelPermissions(Integer idUserRelPermissions, boolean add, boolean edit, boolean delete, boolean readOnly) {
        this.idUserRelPermissions = idUserRelPermissions;
        this.add = add;
        this.edit = edit;
        this.delete = delete;
        this.readOnly = readOnly;
    }

    public Integer getIdUserRelPermissions() {
        return idUserRelPermissions;
    }

    public void setIdUserRelPermissions(Integer idUserRelPermissions) {
        this.idUserRelPermissions = idUserRelPermissions;
    }

    public boolean getAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public boolean getEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public boolean getDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
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

    public UsersPermissions getIdRules() {
        return idRules;
    }

    public void setIdRules(UsersPermissions idRules) {
        this.idRules = idRules;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserRelPermissions != null ? idUserRelPermissions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersRelPermissions)) {
            return false;
        }
        UsersRelPermissions other = (UsersRelPermissions) object;
        if ((this.idUserRelPermissions == null && other.idUserRelPermissions != null) || (this.idUserRelPermissions != null && !this.idUserRelPermissions.equals(other.idUserRelPermissions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.UsersRelPermissions[ idUserRelPermissions=" + idUserRelPermissions + " ]";
    }
    
}
