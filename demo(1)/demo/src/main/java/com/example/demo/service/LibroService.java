package com.example.demo.service;

import com.example.demo.model.Libro;
import com.example.demo.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
  @Autowired
  LibroRepository libroRepository;
  public void crearLibro(Libro libro){
    libroRepository.save(libro);
  }
  public List<Libro> obtenerListaLibros(){
    return libroRepository.findAll();
  }
}
