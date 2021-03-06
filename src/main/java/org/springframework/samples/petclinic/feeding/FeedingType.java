package org.springframework.samples.petclinic.feeding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FeedingType {
    
    @Id
    Integer id;

    @NotEmpty
    @Column
    @Length(min = 0, max = 30)
    String name;

    @NotEmpty
    @Column
    String description;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "pet_type_id")
    PetType petType;
}
