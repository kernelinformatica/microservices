/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dario
 */
@Entity
@Table(name = "users_tokens")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersTokens.findAll", query = "SELECT u FROM UsersTokens u"),
    @NamedQuery(name = "UsersTokens.findByIdUsersTokens", query = "SELECT u FROM UsersTokens u WHERE u.idUsersTokens = :idUsersTokens"),
    @NamedQuery(name = "UsersTokens.findByHashId", query = "SELECT u FROM UsersTokens u WHERE u.hashId = :hashId"),
    @NamedQuery(name = "UsersTokens.findByDateFrom", query = "SELECT u FROM UsersTokens u WHERE u.dateFrom = :dateFrom"),
    @NamedQuery(name = "UsersTokens.findByDateTo", query = "SELECT u FROM UsersTokens u WHERE u.dateTo = :dateTo"),
    @NamedQuery(name = "UsersTokens.findBySource", query = "SELECT u FROM UsersTokens u WHERE u.source = :source"),
    @NamedQuery(name = "UsersTokens.findByAgent", query = "SELECT u FROM UsersTokens u WHERE u.agent = :agent"),
    @NamedQuery(name = "UsersTokens.findByPublicIp", query = "SELECT u FROM UsersTokens u WHERE u.publicIp = :publicIp"),
    @NamedQuery(name = "UsersTokens.findByPrivateIp", query = "SELECT u FROM UsersTokens u WHERE u.privateIp = :privateIp")})
public class UsersTokens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_users_tokens")
    private Integer idUsersTokens;
    @Basic(optional = false)
    @Column(name = "hash_id")
    private String hashId;
    @Column(name = "date_from")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;
    @Column(name = "date_to")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;
    @Column(name = "source")
    private String source;
    @Column(name = "agent")
    private String agent;
    @Column(name = "public_ip")
    private String publicIp;
    @Column(name = "private_ip")
    private String privateIp;
    @JoinColumn(name = "id_platform", referencedColumnName = "id_platform")
    @ManyToOne(fetch = FetchType.LAZY)
    private Platforms idPlatform;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users idUser;

    public UsersTokens() {
    }

    public UsersTokens(Integer idUsersTokens) {
        this.idUsersTokens = idUsersTokens;
    }

    public UsersTokens(Integer idUsersTokens, String hashId) {
        this.idUsersTokens = idUsersTokens;
        this.hashId = hashId;
    }

    public Integer getIdUsersTokens() {
        return idUsersTokens;
    }

    public void setIdUsersTokens(Integer idUsersTokens) {
        this.idUsersTokens = idUsersTokens;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public Platforms getIdPlatform() {
        return idPlatform;
    }

    public void setIdPlatform(Platforms idPlatform) {
        this.idPlatform = idPlatform;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsersTokens != null ? idUsersTokens.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersTokens)) {
            return false;
        }
        UsersTokens other = (UsersTokens) object;
        if ((this.idUsersTokens == null && other.idUsersTokens != null) || (this.idUsersTokens != null && !this.idUsersTokens.equals(other.idUsersTokens))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.UsersTokens[ idUsersTokens=" + idUsersTokens + " ]";
    }
    
}
