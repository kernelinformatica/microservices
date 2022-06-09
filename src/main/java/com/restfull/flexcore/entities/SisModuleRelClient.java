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
@Table(name = "sis_module_rel_client")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SisModuleRelClient.findAll", query = "SELECT s FROM SisModuleRelClient s"),
    @NamedQuery(name = "SisModuleRelClient.findByIdModuleRelClient", query = "SELECT s FROM SisModuleRelClient s WHERE s.idModuleRelClient = :idModuleRelClient"),
    @NamedQuery(name = "SisModuleRelClient.findByDomain", query = "SELECT s FROM SisModuleRelClient s WHERE s.domain = :domain")})
public class SisModuleRelClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_module_rel_client")
    private Integer idModuleRelClient;
    @Basic(optional = false)
    @Column(name = "domain")
    private String domain;
    @JoinColumn(name = "id_client", referencedColumnName = "id_client")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Clients idClient;
    @JoinColumn(name = "id_module", referencedColumnName = "id_module")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SisModules idModule;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SisStatus status;

    public SisModuleRelClient() {
    }

    public SisModuleRelClient(Integer idModuleRelClient) {
        this.idModuleRelClient = idModuleRelClient;
    }

    public SisModuleRelClient(Integer idModuleRelClient, String domain) {
        this.idModuleRelClient = idModuleRelClient;
        this.domain = domain;
    }

    public Integer getIdModuleRelClient() {
        return idModuleRelClient;
    }

    public void setIdModuleRelClient(Integer idModuleRelClient) {
        this.idModuleRelClient = idModuleRelClient;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
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
        hash += (idModuleRelClient != null ? idModuleRelClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SisModuleRelClient)) {
            return false;
        }
        SisModuleRelClient other = (SisModuleRelClient) object;
        if ((this.idModuleRelClient == null && other.idModuleRelClient != null) || (this.idModuleRelClient != null && !this.idModuleRelClient.equals(other.idModuleRelClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.SisModuleRelClient[ idModuleRelClient=" + idModuleRelClient + " ]";
    }
    
}
