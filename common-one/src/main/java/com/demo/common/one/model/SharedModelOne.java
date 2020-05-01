package com.demo.common.one.model;

import com.demo.common.base.model.BaseEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SharedModelOne extends PanacheEntity implements BaseEntity {

    private String name;

    private LocalDateTime createdAt;

    @Override
    public void someMethod() {

    }
}
