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
@Table(name = "companys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Companys.findAll", query = "SELECT c FROM Companys c"),
    @NamedQuery(name = "Companys.findByIdCompany", query = "SELECT c FROM Companys c WHERE c.idCompany = :idCompany"),
    @NamedQuery(name = "Companys.findByName", query = "SELECT c FROM Companys c WHERE c.name = :name"),
    @NamedQuery(name = "Companys.findByDescription", query = "SELECT c FROM Companys c WHERE c.description = :description"),
    @NamedQuery(name = "Companys.findByAdress", query = "SELECT c FROM Companys c WHERE c.adress = :adress"),
    @NamedQuery(name = "Companys.findByCuit", query = "SELECT c FROM Companys c WHERE c.cuit = :cuit"),
    @NamedQuery(name = "Companys.findByCuil", query = "SELECT c FROM Companys c WHERE c.cuil = :cuil"),
    @NamedQuery(name = "Companys.findByEmail", query = "SELECT c FROM Companys c WHERE c.email = :email"),
    @NamedQuery(name = "Companys.findByWeb", query = "SELECT c FROM Companys c WHERE c.web = :web")})
public class Companys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_company")
    private Integer idCompany;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "adress")
    private String adress;
    @Column(name = "cuit")
    private Long cuit;
    @Column(name = "cuil")
    private Long cuil;
    @Column(name = "email")
    private String email;
    @Column(name = "web")
    private String web;
    @OneToMany(mappedBy = "idCompany", fetch = FetchType.LAZY)
    private List<Clients> clientsList;
    @JoinColumn(name = "id_city", referencedColumnName = "id_city")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Geocitys idCity;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;

    public Companys() {
    }

    public Companys(Integer idCompany) {
        this.idCompany = idCompany;
    }

    public Integer getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public Long getCuil() {
        return cuil;
    }

    public void setCuil(Long cuil) {
        this.cuil = cuil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @XmlTransient
    public List<Clients> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }

    public Geocitys getIdCity() {
        return idCity;
    }

    public void setIdCity(Geocitys idCity) {
        this.idCity = idCity;
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
        hash += (idCompany != null ? idCompany.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Companys)) {
            return false;
        }
        Companys other = (Companys) object;
        if ((this.idCompany == null && other.idCompany != null) || (this.idCompany != null && !this.idCompany.equals(other.idCompany))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.Companys[ idCompany=" + idCompany + " ]";
    }
    
}
