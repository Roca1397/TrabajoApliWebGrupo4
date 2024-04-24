package com.yobrunox.trabajoaplicacionesweb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TarjetaDebito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroTarjeta;
    private Date fechaVencimiento;
    private Integer cvv;
    private Integer claveDigital;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "usuario_id")
    Usuario usuario;
}
