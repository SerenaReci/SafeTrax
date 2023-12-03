package org.sda.safeTrax.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "st_company")
public class Company extends BaseEntity{
    @Column(name = "title")
    private String title;

    @Column(name = "phone")
    private String phone;
}
