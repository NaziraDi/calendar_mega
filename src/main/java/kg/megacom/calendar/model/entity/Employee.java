package kg.megacom.calendar.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.persistence.Entity;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_employee")
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class Employee extends AbstractPersistable {

    @Column(name = "last_name", nullable = false)
    String lastName;

    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "msisdn", nullable = false)
    String msisdn;

    @Column(name = "status", nullable = false)
    String status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accounts_id", referencedColumnName = "id")
    Accounts accounts;

    @Column(name = "is_active", columnDefinition = "BOOLEAN DEFAULT TRUE")
    Boolean isActive;

}

