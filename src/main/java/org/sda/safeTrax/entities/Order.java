package org.sda.safeTrax.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "st_order")
public class Order extends BaseEntity {

    @Column(name = "price")
    private Float price;
}
