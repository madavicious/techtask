package pl.madavicious.techtask.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigInteger;


@Entity
@Getter
@Table(name = "tabela_testowa")
public class MockData {
    @Id
    @Column(name="id")
    private BigInteger id;

    @Column(name = "kolumna1")
    private String kolumna1;

    @Column(name = "kolumna2")
    private String kolumna2;

    @Column(name = "kolumna3")
    private String kolumna3;

    @Column(name = "kolumna4")
    private BigInteger kolumna4;
}
