package org.sda.safeTrax.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "st_company")
public class Company extends BaseEntity{
    @Column(name = "title")
    private String title;

    @Column(name = "phone")
    private String phone;

    @OneToMany
    List<Order> orders;
}

