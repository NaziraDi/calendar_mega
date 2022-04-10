package kg.megacom.calendar.model.entity;

import kg.megacom.calendar.model.enums.EmployeeStatus;
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
@Table(name = "tb_employee")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee extends AbstractPersistable<Long> {

    @Column(name = "last_name", nullable = false)
    String lastName;

    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "email", nullable = false, unique = true)
    String email;

    @Column(name = "msisdn", nullable = false)
    String msisdn;

    @Column(name = "employee_status_id")
    EmployeeStatus employeeStatus;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    Account account;

    @Column(name = "is_active", columnDefinition = "BOOLEAN DEFAULT TRUE")
    Boolean isActive;

}

