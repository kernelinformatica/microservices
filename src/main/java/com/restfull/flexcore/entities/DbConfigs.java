/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "db_configs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DbConfigs.findAll", query = "SELECT d FROM DbConfigs d"),
    @NamedQuery(name = "DbConfigs.findByIdConfig", query = "SELECT d FROM DbConfigs d WHERE d.idConfig = :idConfig"),
    @NamedQuery(name = "DbConfigs.findByDbName", query = "SELECT d FROM DbConfigs d WHERE d.dbName = :dbName"),
    @NamedQuery(name = "DbConfigs.findByDbHost", query = "SELECT d FROM DbConfigs d WHERE d.dbHost = :dbHost"),
    @NamedQuery(name = "DbConfigs.findByDbUser", query = "SELECT d FROM DbConfigs d WHERE d.dbUser = :dbUser"),
    @NamedQuery(name = "DbConfigs.findByDbPassword", query = "SELECT d FROM DbConfigs d WHERE d.dbPassword = :dbPassword"),
    @NamedQuery(name = "DbConfigs.findByDbPort", query = "SELECT d FROM DbConfigs d WHERE d.dbPort = :dbPort"),
    @NamedQuery(name = "DbConfigs.findByHashKey", query = "SELECT d FROM DbConfigs d WHERE d.hashKey = :hashKey"),
    @NamedQuery(name = "DbConfigs.findByMicroServiceName", query = "SELECT d FROM DbConfigs d WHERE d.microServiceName = :microServiceName"),
    @NamedQuery(name = "DbConfigs.findByMicroServiceDescription", query = "SELECT d FROM DbConfigs d WHERE d.microServiceDescription = :microServiceDescription"),
    @NamedQuery(name = "DbConfigs.findByMicroServiceUrl", query = "SELECT d FROM DbConfigs d WHERE d.microServiceUrl = :microServiceUrl")})
public class DbConfigs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_config")
    private Integer idConfig;
    @Column(name = "dbName")
    private String dbName;
    @Column(name = "dbHost")
    private String dbHost;
    @Column(name = "dbUser")
    private String dbUser;
    @Column(name = "dbPassword")
    private String dbPassword;
    @Column(name = "dbPort")
    private BigInteger dbPort;
    @Basic(optional = false)
    @Column(name = "hashKey")
    private String hashKey;
    @Column(name = "microServiceName")
    private String microServiceName;
    @Column(name = "microServiceDescription")
    private String microServiceDescription;
    @Column(name = "microServiceUrl")
    private String microServiceUrl;
    @JoinColumn(name = "id_module", referencedColumnName = "id_module")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SisModules idModule;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;

    public DbConfigs() {
    }

    public DbConfigs(Integer idConfig) {
        this.idConfig = idConfig;
    }

    public DbConfigs(Integer idConfig, String hashKey) {
        this.idConfig = idConfig;
        this.hashKey = hashKey;
    }

    public Integer getIdConfig() {
        return idConfig;
    }

    public void setIdConfig(Integer idConfig) {
        this.idConfig = idConfig;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbHost() {
        return dbHost;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public BigInteger getDbPort() {
        return dbPort;
    }

    public void setDbPort(BigInteger dbPort) {
        this.dbPort = dbPort;
    }

    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }

    public String getMicroServiceName() {
        return microServiceName;
    }

    public void setMicroServiceName(String microServiceName) {
        this.microServiceName = microServiceName;
    }

    public String getMicroServiceDescription() {
        return microServiceDescription;
    }

    public void setMicroServiceDescription(String microServiceDescription) {
        this.microServiceDescription = microServiceDescription;
    }

    public String getMicroServiceUrl() {
        return microServiceUrl;
    }

    public void setMicroServiceUrl(String microServiceUrl) {
        this.microServiceUrl = microServiceUrl;
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
        hash += (idConfig != null ? idConfig.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DbConfigs)) {
            return false;
        }
        DbConfigs other = (DbConfigs) object;
        if ((this.idConfig == null && other.idConfig != null) || (this.idConfig != null && !this.idConfig.equals(other.idConfig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.DbConfigs[ idConfig=" + idConfig + " ]";
    }
    
}
