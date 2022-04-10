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
@Table(name = "tb_weekday")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Weekday extends AbstractPersistable<Long>{

    @Column(name = "weekday", nullable = false)
    String weekday;
}
