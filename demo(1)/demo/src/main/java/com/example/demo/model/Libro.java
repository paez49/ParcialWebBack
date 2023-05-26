package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro_<jd.paez>")
public class Libro {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String referencia;
  private String titulo;
  private String autor;
  private long precio;
  private String ubicacion;


}
