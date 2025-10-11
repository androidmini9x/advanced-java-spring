package com.codingnomads.springdata.example.ddl.onetoone.unidirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.annotations.One;

import java.util.Date;

@Entity
@Table(name = "register_car")
@NoArgsConstructor
@Getter
@Setter
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @OneToOne
    private Car car;

}
