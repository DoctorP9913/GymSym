/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymsym;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author DoctorP
 */
@Entity
@Table(name = "INSTANCE", catalog = "", schema = "DOCTORP")
@NamedQueries({
    @NamedQuery(name = "Instance_1.findAll", query = "SELECT i FROM Instance_1 i")
    , @NamedQuery(name = "Instance_1.findByWiid", query = "SELECT i FROM Instance_1 i WHERE i.wiid = :wiid")
    , @NamedQuery(name = "Instance_1.findByHours", query = "SELECT i FROM Instance_1 i WHERE i.hours = :hours")
    , @NamedQuery(name = "Instance_1.findByMaxCapacity", query = "SELECT i FROM Instance_1 i WHERE i.maxCapacity = :maxCapacity")
    , @NamedQuery(name = "Instance_1.findByRoomName", query = "SELECT i FROM Instance_1 i WHERE i.roomName = :roomName")
    , @NamedQuery(name = "Instance_1.findByDays", query = "SELECT i FROM Instance_1 i WHERE i.days = :days")
    , @NamedQuery(name = "Instance_1.findByWpid", query = "SELECT i FROM Instance_1 i WHERE i.wpid = :wpid")
    , @NamedQuery(name = "Instance_1.findByDuration", query = "SELECT i FROM Instance_1 i WHERE i.duration = :duration")})
public class Instance_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WIID")
    private Integer wiid;
    @Column(name = "HOURS")
    private String hours;
    @Column(name = "MAX_CAPACITY")
    private Integer maxCapacity;
    @Column(name = "ROOM_NAME")
    private String roomName;
    @Column(name = "DAYS")
    private String days;
    @Column(name = "WPID")
    private Integer wpid;
    @Column(name = "DURATION")
    private Integer duration;

    public Instance_1() {
    }

    public Instance_1(Integer wiid) {
        this.wiid = wiid;
    }

    public Integer getWiid() {
        return wiid;
    }

    public void setWiid(Integer wiid) {
        Integer oldWiid = this.wiid;
        this.wiid = wiid;
        changeSupport.firePropertyChange("wiid", oldWiid, wiid);
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        String oldHours = this.hours;
        this.hours = hours;
        changeSupport.firePropertyChange("hours", oldHours, hours);
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        Integer oldMaxCapacity = this.maxCapacity;
        this.maxCapacity = maxCapacity;
        changeSupport.firePropertyChange("maxCapacity", oldMaxCapacity, maxCapacity);
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        String oldRoomName = this.roomName;
        this.roomName = roomName;
        changeSupport.firePropertyChange("roomName", oldRoomName, roomName);
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        String oldDays = this.days;
        this.days = days;
        changeSupport.firePropertyChange("days", oldDays, days);
    }

    public Integer getWpid() {
        return wpid;
    }

    public void setWpid(Integer wpid) {
        Integer oldWpid = this.wpid;
        this.wpid = wpid;
        changeSupport.firePropertyChange("wpid", oldWpid, wpid);
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        Integer oldDuration = this.duration;
        this.duration = duration;
        changeSupport.firePropertyChange("duration", oldDuration, duration);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wiid != null ? wiid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instance_1)) {
            return false;
        }
        Instance_1 other = (Instance_1) object;
        if ((this.wiid == null && other.wiid != null) || (this.wiid != null && !this.wiid.equals(other.wiid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gymsym.Instance_1[ wiid=" + wiid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
