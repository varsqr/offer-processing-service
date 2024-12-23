package kz.offerprocessservice.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "skus")
@EqualsAndHashCode(callSuper = true)
public class SkuEntity extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;
}