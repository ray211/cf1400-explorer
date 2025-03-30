package com.ray.cf1400.explorer.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "foreign_trade_entrances")
public class ForeignTradeEntrance {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id;

    @Id
    @Column(name = "manifest_number")
    private String manifestNumber;

    private String vesselName;
    private String filingPortName;
    private LocalDate filingDate;
    private String imoNumber;
    private String operatorName;
    private String dockName;

    // Add any other columns you want to show...

    // Getters and setters
}
