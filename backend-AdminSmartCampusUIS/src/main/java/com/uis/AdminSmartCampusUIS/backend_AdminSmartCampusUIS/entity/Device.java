package com.uis.AdminSmartCampusUIS.backend_AdminSmartCampusUIS.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long global_id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    private boolean is_gateway;       

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date create_at;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date update_at;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name= "fk_parent")
    private Device deviceParent;

    @ManyToMany
    private Set<Application> aplications;

    @ManyToMany
    private Set<Resource> resources;
    
    @ManyToMany
    private Set<Property> properties;  

    @OneToMany(mappedBy = "deviceParent", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Device> devices;
  
    public Device(Long id) {
        this.id  = id;
    }
    
    public boolean isEndPoint(){
        if(this.is_gateway()){
            return true;
        } else {
            return false;
        }
    }
}
