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
@Table(name = "client_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientDetails.findAll", query = "SELECT c FROM ClientDetails c"),
    @NamedQuery(name = "ClientDetails.findByIdClientDetails", query = "SELECT c FROM ClientDetails c WHERE c.idClientDetails = :idClientDetails"),
    @NamedQuery(name = "ClientDetails.findBySmInstagram", query = "SELECT c FROM ClientDetails c WHERE c.smInstagram = :smInstagram"),
    @NamedQuery(name = "ClientDetails.findBySmTwitter", query = "SELECT c FROM ClientDetails c WHERE c.smTwitter = :smTwitter"),
    @NamedQuery(name = "ClientDetails.findBySmFacebook", query = "SELECT c FROM ClientDetails c WHERE c.smFacebook = :smFacebook"),
    @NamedQuery(name = "ClientDetails.findBySmLinkeding", query = "SELECT c FROM ClientDetails c WHERE c.smLinkeding = :smLinkeding"),
    @NamedQuery(name = "ClientDetails.findBySmTelegram", query = "SELECT c FROM ClientDetails c WHERE c.smTelegram = :smTelegram"),
    @NamedQuery(name = "ClientDetails.findBySmWathsUp", query = "SELECT c FROM ClientDetails c WHERE c.smWathsUp = :smWathsUp")})
public class ClientDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_client_details")
    private Integer idClientDetails;
    @Column(name = "smInstagram")
    private String smInstagram;
    @Column(name = "smTwitter")
    private String smTwitter;
    @Column(name = "smFacebook")
    private String smFacebook;
    @Column(name = "smLinkeding")
    private String smLinkeding;
    @Column(name = "smTelegram")
    private String smTelegram;
    @Column(name = "smWathsUp")
    private String smWathsUp;
    @JoinColumn(name = "id_client", referencedColumnName = "id_client")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clients idClient;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SisStatus status;

    public ClientDetails() {
    }

    public ClientDetails(Integer idClientDetails) {
        this.idClientDetails = idClientDetails;
    }

    public Integer getIdClientDetails() {
        return idClientDetails;
    }

    public void setIdClientDetails(Integer idClientDetails) {
        this.idClientDetails = idClientDetails;
    }

    public String getSmInstagram() {
        return smInstagram;
    }

    public void setSmInstagram(String smInstagram) {
        this.smInstagram = smInstagram;
    }

    public String getSmTwitter() {
        return smTwitter;
    }

    public void setSmTwitter(String smTwitter) {
        this.smTwitter = smTwitter;
    }

    public String getSmFacebook() {
        return smFacebook;
    }

    public void setSmFacebook(String smFacebook) {
        this.smFacebook = smFacebook;
    }

    public String getSmLinkeding() {
        return smLinkeding;
    }

    public void setSmLinkeding(String smLinkeding) {
        this.smLinkeding = smLinkeding;
    }

    public String getSmTelegram() {
        return smTelegram;
    }

    public void setSmTelegram(String smTelegram) {
        this.smTelegram = smTelegram;
    }

    public String getSmWathsUp() {
        return smWathsUp;
    }

    public void setSmWathsUp(String smWathsUp) {
        this.smWathsUp = smWathsUp;
    }

    public Clients getIdClient() {
        return idClient;
    }

    public void setIdClient(Clients idClient) {
        this.idClient = idClient;
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
        hash += (idClientDetails != null ? idClientDetails.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientDetails)) {
            return false;
        }
        ClientDetails other = (ClientDetails) object;
        if ((this.idClientDetails == null && other.idClientDetails != null) || (this.idClientDetails != null && !this.idClientDetails.equals(other.idClientDetails))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.ClientDetails[ idClientDetails=" + idClientDetails + " ]";
    }
    
}
