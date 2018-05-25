/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymsym;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author DoctorP
 */
@Entity
@Table(name = "ACCOUNT", catalog = "", schema = "DOCTORP")
@NamedQueries({
    @NamedQuery(name = "Account_1.findAll", query = "SELECT a FROM Account_1 a")
    , @NamedQuery(name = "Account_1.findByAcid", query = "SELECT a FROM Account_1 a WHERE a.acid = :acid")
    , @NamedQuery(name = "Account_1.findByUsername", query = "SELECT a FROM Account_1 a WHERE a.username = :username")
    , @NamedQuery(name = "Account_1.findByPassword", query = "SELECT a FROM Account_1 a WHERE a.password = :password")
    , @NamedQuery(name = "Account_1.findByEmail", query = "SELECT a FROM Account_1 a WHERE a.email = :email")
    , @NamedQuery(name = "Account_1.findByDate", query = "SELECT a FROM Account_1 a WHERE a.date = :date")
    , @NamedQuery(name = "Account_1.findByState", query = "SELECT a FROM Account_1 a WHERE a.state = :state")
    , @NamedQuery(name = "Account_1.findByAccountType", query = "SELECT a FROM Account_1 a WHERE a.accountType = :accountType")})
public class Account_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACID")
    private Integer acid;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "STATE")
    private String state;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    public Account_1() {
    }

    public Account_1(Integer acid) {
        this.acid = acid;
    }

    public Account_1(Integer acid, String username, String password, String email, Date date, String state, String accountType) {
        this.acid = acid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.date = date;
        this.state = state;
        this.accountType = accountType;
    }

    public Integer getAcid() {
        return acid;
    }

    public void setAcid(Integer acid) {
        Integer oldAcid = this.acid;
        this.acid = acid;
        changeSupport.firePropertyChange("acid", oldAcid, acid);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        String oldAccountType = this.accountType;
        this.accountType = accountType;
        changeSupport.firePropertyChange("accountType", oldAccountType, accountType);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acid != null ? acid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account_1)) {
            return false;
        }
        Account_1 other = (Account_1) object;
        if ((this.acid == null && other.acid != null) || (this.acid != null && !this.acid.equals(other.acid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gymsym.Account_1[ acid=" + acid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
