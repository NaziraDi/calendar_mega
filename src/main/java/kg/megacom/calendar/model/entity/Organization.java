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
@Table(name = "tb_organization")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Organization extends AbstractPersistable<Long>{

    @Column(name = "title", nullable = false)
    String title;

   @OneToOne
   @JoinColumn(name = "organization_id")
   Organization organization;
}
