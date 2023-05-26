package com.example.demo;

import com.example.demo.model.Libro;
import com.example.demo.repository.LibroRepository;
import com.example.demo.service.LibroService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@SpringBootTest
public class LibroServiceTest {

  @Autowired
  private LibroRepository libroRepository;

  @Autowired
  private LibroService libroService;

  @Captor
  private ArgumentCaptor<Libro> libroCaptor;

  public void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testCrearLibro() {
    int canti = (int) libroRepository.count();
    // Datos de prueba
    Libro libro = new Libro();
    libro.setReferencia("REF123");
    libro.setAutor("Autor 1");
    libro.setPrecio(10L);
    libro.setUbicacion("Ubicación 1");

    libroRepository.save(libro);

    int cantiNueva = (int) libroRepository.count();
    assertTrue(cantiNueva == canti+1);
  }
  @Test
  public void testListaLibros(){
    // Datos de prueba
    Libro libro = new Libro();
    libro.setReferencia("REF123");
    libro.setAutor("Autor 1");
    libro.setPrecio(10L);
    libro.setUbicacion("Ubicación 1");

    libroRepository.save(libro);
    List<Libro> libroList = libroService.obtenerListaLibros();

    assertTrue(libroList.contains(libro));
  }
}
