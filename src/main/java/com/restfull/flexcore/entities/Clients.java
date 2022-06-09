/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "clients")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clients.findAll", query = "SELECT c FROM Clients c"),
    @NamedQuery(name = "Clients.findByIdClient", query = "SELECT c FROM Clients c WHERE c.idClient = :idClient"),
    @NamedQuery(name = "Clients.findByName", query = "SELECT c FROM Clients c WHERE c.name = :name"),
    @NamedQuery(name = "Clients.findByDescription", query = "SELECT c FROM Clients c WHERE c.description = :description"),
    @NamedQuery(name = "Clients.findByAdress", query = "SELECT c FROM Clients c WHERE c.adress = :adress"),
    @NamedQuery(name = "Clients.findByEmail", query = "SELECT c FROM Clients c WHERE c.email = :email"),
    @NamedQuery(name = "Clients.findByPhoneNumber", query = "SELECT c FROM Clients c WHERE c.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Clients.findByWeb", query = "SELECT c FROM Clients c WHERE c.web = :web")})
public class Clients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_client")
    private Integer idClient;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "adress")
    private String adress;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private BigInteger phoneNumber;
    @Column(name = "web")
    private String web;
    @JoinColumn(name = "id_client_sub_category", referencedColumnName = "id_sub_categories")
    @ManyToOne(fetch = FetchType.LAZY)
    private ClientsSubCategories idClientSubCategory;
    @JoinColumn(name = "id_company", referencedColumnName = "id_company")
    @ManyToOne(fetch = FetchType.LAZY)
    private Companys idCompany;
    @JoinColumn(name = "id_city", referencedColumnName = "id_city")
    @ManyToOne(fetch = FetchType.LAZY)
    private Geocitys idCity;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;
    @OneToMany(mappedBy = "idClient", fetch = FetchType.LAZY)
    private List<ClientDetails> clientDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClient", fetch = FetchType.LAZY)
    private List<SisModuleRelClient> sisModuleRelClientList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClient", fetch = FetchType.LAZY)
    private List<UsersGroups> usersGroupsList;

    public Clients() {
    }

    public Clients(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public ClientsSubCategories getIdClientSubCategory() {
        return idClientSubCategory;
    }

    public void setIdClientSubCategory(ClientsSubCategories idClientSubCategory) {
        this.idClientSubCategory = idClientSubCategory;
    }

    public Companys getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Companys idCompany) {
        this.idCompany = idCompany;
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

    @XmlTransient
    public List<ClientDetails> getClientDetailsList() {
        return clientDetailsList;
    }

    public void setClientDetailsList(List<ClientDetails> clientDetailsList) {
        this.clientDetailsList = clientDetailsList;
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
        hash += (idClient != null ? idClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clients)) {
            return false;
        }
        Clients other = (Clients) object;
        if ((this.idClient == null && other.idClient != null) || (this.idClient != null && !this.idClient.equals(other.idClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.Clients[ idClient=" + idClient + " ]";
    }
    
}
