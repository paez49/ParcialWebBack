package com.example.demo.rest;

import com.example.demo.model.Libro;
import com.example.demo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
  @Autowired
  private LibroService libroService;

  @PostMapping
  public void crearLibro(@RequestBody Libro libro) {
    libroService.crearLibro(libro);
  }

  @GetMapping
  public List<Libro> obtenerLibros() {
    return libroService.obtenerListaLibros();
  }
}

