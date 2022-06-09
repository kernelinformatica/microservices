/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dario
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByIdUser", query = "SELECT u FROM Users u WHERE u.idUser = :idUser"),
    @NamedQuery(name = "Users.findByName", query = "SELECT u FROM Users u WHERE u.name = :name"),
    @NamedQuery(name = "Users.findByLastname", query = "SELECT u FROM Users u WHERE u.lastname = :lastname"),
    @NamedQuery(name = "Users.findByUser", query = "SELECT u FROM Users u WHERE u.user = :user"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByLoginQrPath", query = "SELECT u FROM Users u WHERE u.loginQrPath = :loginQrPath"),
    @NamedQuery(name = "Users.findByMail", query = "SELECT u FROM Users u WHERE u.mail = :mail"),
    @NamedQuery(name = "Users.findByCreated", query = "SELECT u FROM Users u WHERE u.created = :created"),
    @NamedQuery(name = "Users.findByModify", query = "SELECT u FROM Users u WHERE u.modify = :modify"),
    @NamedQuery(name = "Users.findBySuperUser", query = "SELECT u FROM Users u WHERE u.superUser = :superUser")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "user")
    private String user;
    @Column(name = "password")
    private String password;
    @Column(name = "login_qr_path")
    private String loginQrPath;
    @Column(name = "mail")
    private String mail;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "modify")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modify;
    @Column(name = "super_user")
    private Boolean superUser;
    @OneToMany(mappedBy = "idUser", fetch = FetchType.LAZY)
    private List<UsersChangePasswords> usersChangePasswordsList;
    @OneToMany(mappedBy = "idUser", fetch = FetchType.LAZY)
    private List<UsersTokens> usersTokensList;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;
    @JoinColumn(name = "id_user_group", referencedColumnName = "id_users_groups")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsersGroups idUserGroup;
    @OneToMany(mappedBy = "idUser", fetch = FetchType.LAZY)
    private List<UsersDetails> usersDetailsList;
    @OneToMany(mappedBy = "idUser", fetch = FetchType.LAZY)
    private List<UsersRelPermissions> usersRelPermissionsList;

    public Users() {
    }

    public Users(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginQrPath() {
        return loginQrPath;
    }

    public void setLoginQrPath(String loginQrPath) {
        this.loginQrPath = loginQrPath;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModify() {
        return modify;
    }

    public void setModify(Date modify) {
        this.modify = modify;
    }

    public Boolean getSuperUser() {
        return superUser;
    }

    public void setSuperUser(Boolean superUser) {
        this.superUser = superUser;
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

    @XmlTransient
    public List<UsersDetails> getUsersDetailsList() {
        return usersDetailsList;
    }

    public void setUsersDetailsList(List<UsersDetails> usersDetailsList) {
        this.usersDetailsList = usersDetailsList;
    }

    @XmlTransient
    public List<UsersRelPermissions> getUsersRelPermissionsList() {
        return usersRelPermissionsList;
    }

    public void setUsersRelPermissionsList(List<UsersRelPermissions> usersRelPermissionsList) {
        this.usersRelPermissionsList = usersRelPermissionsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.Users[ idUser=" + idUser + " ]";
    }
    
}
