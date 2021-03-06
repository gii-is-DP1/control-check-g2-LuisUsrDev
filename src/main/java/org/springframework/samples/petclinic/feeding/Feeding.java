package org.springframework.samples.petclinic.feeding;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.pet.Pet;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Feeding {

    @Id
    Integer id;

    @NotNull
    @Column(name = "start_date")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    LocalDate startDate;

    @NotNull
    @Column(name = "weeks_duration")
    @Min(value = 1)
    double weeksDuration;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "pet_id")
    Pet pet;   
}
