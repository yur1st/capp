package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity(name = "Line")
@Table(name = "line")
@Data
@Audited
public class Line extends BaseEntity {

    private String lineName;

    @OneToMany(mappedBy = "line", cascade = CascadeType.ALL)
    private List<Workplace> workplaces;

    public void addWorkplace(Workplace workplace) {
        workplaces.add(workplace);
        workplace.setLine(this);
    }

    public void removeWorkplace(Workplace workplace) {
        workplaces.remove(workplace);
        workplace.setLine(null);
    }

}
