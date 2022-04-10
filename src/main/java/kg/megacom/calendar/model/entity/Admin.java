package kg.megacom.calendar.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.persistence.Entity;


@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_admin")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Admin extends AbstractPersistable<Long> {
    @ManyToOne
    @JoinColumn(name = "organization_id", referencedColumnName = "id")
    Organization organization;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    Employee employee;
}
