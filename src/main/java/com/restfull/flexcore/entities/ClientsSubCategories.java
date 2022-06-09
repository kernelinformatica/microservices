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
@Table(name = "clients_sub_categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientsSubCategories.findAll", query = "SELECT c FROM ClientsSubCategories c"),
    @NamedQuery(name = "ClientsSubCategories.findByIdSubCategories", query = "SELECT c FROM ClientsSubCategories c WHERE c.idSubCategories = :idSubCategories"),
    @NamedQuery(name = "ClientsSubCategories.findByName", query = "SELECT c FROM ClientsSubCategories c WHERE c.name = :name"),
    @NamedQuery(name = "ClientsSubCategories.findByDescripton", query = "SELECT c FROM ClientsSubCategories c WHERE c.descripton = :descripton")})
public class ClientsSubCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sub_categories")
    private Integer idSubCategories;
    @Column(name = "name")
    private String name;
    @Column(name = "descripton")
    private String descripton;
    @OneToMany(mappedBy = "idClientSubCategory", fetch = FetchType.LAZY)
    private List<Clients> clientsList;
    @JoinColumn(name = "id_category", referencedColumnName = "id_clients_category")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ClientsCategories idCategory;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;

    public ClientsSubCategories() {
    }

    public ClientsSubCategories(Integer idSubCategories) {
        this.idSubCategories = idSubCategories;
    }

    public Integer getIdSubCategories() {
        return idSubCategories;
    }

    public void setIdSubCategories(Integer idSubCategories) {
        this.idSubCategories = idSubCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    @XmlTransient
    public List<Clients> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }

    public ClientsCategories getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(ClientsCategories idCategory) {
        this.idCategory = idCategory;
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
        hash += (idSubCategories != null ? idSubCategories.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientsSubCategories)) {
            return false;
        }
        ClientsSubCategories other = (ClientsSubCategories) object;
        if ((this.idSubCategories == null && other.idSubCategories != null) || (this.idSubCategories != null && !this.idSubCategories.equals(other.idSubCategories))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.ClientsSubCategories[ idSubCategories=" + idSubCategories + " ]";
    }
    
}
