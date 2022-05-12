package com.stc.security.model;

import lombok.Data;

import javax.persistence.*;

/**
 * User: job
 * Date: 9/05/22
 * Time: 20:26
 *
 * @author job
 */
@Data
@Entity
@Table(name = "servicio", schema = "security")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idservicio")
    private int serviceId;
    @Column(name = "codigo")
    private String code;
    @Column(name = "descripcion")
    private String description;
}
