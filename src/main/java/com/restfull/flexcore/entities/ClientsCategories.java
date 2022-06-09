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
@Table(name = "clients_categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientsCategories.findAll", query = "SELECT c FROM ClientsCategories c"),
    @NamedQuery(name = "ClientsCategories.findByIdClientsCategory", query = "SELECT c FROM ClientsCategories c WHERE c.idClientsCategory = :idClientsCategory"),
    @NamedQuery(name = "ClientsCategories.findByName", query = "SELECT c FROM ClientsCategories c WHERE c.name = :name"),
    @NamedQuery(name = "ClientsCategories.findByDescription", query = "SELECT c FROM ClientsCategories c WHERE c.description = :description")})
public class ClientsCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_clients_category")
    private Integer idClientsCategory;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategory", fetch = FetchType.LAZY)
    private List<ClientsSubCategories> clientsSubCategoriesList;

    public ClientsCategories() {
    }

    public ClientsCategories(Integer idClientsCategory) {
        this.idClientsCategory = idClientsCategory;
    }

    public Integer getIdClientsCategory() {
        return idClientsCategory;
    }

    public void setIdClientsCategory(Integer idClientsCategory) {
        this.idClientsCategory = idClientsCategory;
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

    public SisStatus getStatus() {
        return status;
    }

    public void setStatus(SisStatus status) {
        this.status = status;
    }

    @XmlTransient
    public List<ClientsSubCategories> getClientsSubCategoriesList() {
        return clientsSubCategoriesList;
    }

    public void setClientsSubCategoriesList(List<ClientsSubCategories> clientsSubCategoriesList) {
        this.clientsSubCategoriesList = clientsSubCategoriesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClientsCategory != null ? idClientsCategory.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientsCategories)) {
            return false;
        }
        ClientsCategories other = (ClientsCategories) object;
        if ((this.idClientsCategory == null && other.idClientsCategory != null) || (this.idClientsCategory != null && !this.idClientsCategory.equals(other.idClientsCategory))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.ClientsCategories[ idClientsCategory=" + idClientsCategory + " ]";
    }
    
}
