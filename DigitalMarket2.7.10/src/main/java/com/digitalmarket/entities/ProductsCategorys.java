/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalmarket.entities;

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
@Table(name = "product_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsCategorys.findAll", query = "SELECT p FROM ProductsCategorys p"),
    @NamedQuery(name = "ProductsCategorys.findByIdProdCategory", query = "SELECT p FROM ProductsCategorys p WHERE p.idProdCategory = :idProdCategory"),
    @NamedQuery(name = "ProductsCategorys.findByName", query = "SELECT p FROM ProductsCategorys p WHERE p.name = :name"),
    @NamedQuery(name = "ProductsCategorys.findByDescription", query = "SELECT p FROM ProductsCategorys p WHERE p.description = :description"),
    @NamedQuery(name = "ProductsCategorys.findByStatus", query = "SELECT p FROM ProductsCategorys p WHERE p.status = :status")})
public class ProductsCategorys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prod_category")
    private Integer idProdCategory;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Integer status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProdCategory", fetch = FetchType.LAZY)
    private List<Products> productsList;

    public ProductsCategorys() {
    }

    public ProductsCategorys(Integer idProdCategory) {
        this.idProdCategory = idProdCategory;
    }

    public Integer getIdProdCategory() {
        return idProdCategory;
    }

    public void setIdProdCategory(Integer idProdCategory) {
        this.idProdCategory = idProdCategory;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @XmlTransient
    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProdCategory != null ? idProdCategory.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductsCategorys)) {
            return false;
        }
        ProductsCategorys other = (ProductsCategorys) object;
        if ((this.idProdCategory == null && other.idProdCategory != null) || (this.idProdCategory != null && !this.idProdCategory.equals(other.idProdCategory))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.digitalmarket.entities.ProductsCategorys[ idProdCategory=" + idProdCategory + " ]";
    }
    
}
