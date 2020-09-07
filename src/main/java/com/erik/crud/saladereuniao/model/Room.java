package com.erik.crud.saladereuniao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="meetingroom")
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="startHour", nullable = false)
    private String startHour; /* colocado como string de propóstio */
    @Column(name="endHour", nullable = false)
    private String endHour; /* colocado como string de propóstio */
    @Column(name="date", nullable = false)
    private String date; /* colocado como string de propóstio */

}
