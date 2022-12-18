/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Prueksa
 */
@Entity
@Table(name = "COVIDDATA2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coviddata2.findAll", query = "SELECT c FROM Coviddata2 c"),
    @NamedQuery(name = "Coviddata2.findByYy", query = "SELECT c FROM Coviddata2 c WHERE c.yy = :yy"),
    @NamedQuery(name = "Coviddata2.findByWeeknum", query = "SELECT c FROM Coviddata2 c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Coviddata2.findByProvince", query = "SELECT c FROM Coviddata2 c WHERE c.province = :province"),
    @NamedQuery(name = "Coviddata2.findByNewCase", query = "SELECT c FROM Coviddata2 c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Coviddata2.findByTotalCase", query = "SELECT c FROM Coviddata2 c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Coviddata2.findByNewCaseExcludeabroad", query = "SELECT c FROM Coviddata2 c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Coviddata2.findByTotalCaseExcludeabroad", query = "SELECT c FROM Coviddata2 c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Coviddata2.findByNewDeath", query = "SELECT c FROM Coviddata2 c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Coviddata2.findByTotalDeath", query = "SELECT c FROM Coviddata2 c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Coviddata2.findByUpdateDate", query = "SELECT c FROM Coviddata2 c WHERE c.updateDate = :updateDate")})
public class Coviddata2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "YY")
    private Integer yy;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Size(max = 100)
    @Column(name = "PROVINCE")
    private String province;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Size(max = 40)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Coviddata2() {
    }

    public Coviddata2(Integer yy) {
        this.yy = yy;
    }

    public Integer getYy() {
        return yy;
    }

    public void setYy(Integer yy) {
        this.yy = yy;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yy != null ? yy.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coviddata2)) {
            return false;
        }
        Coviddata2 other = (Coviddata2) object;
        if ((this.yy == null && other.yy != null) || (this.yy != null && !this.yy.equals(other.yy))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Coviddata2[ yy=" + yy + " ]";
    }
    
}
