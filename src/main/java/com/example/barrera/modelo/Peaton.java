package com.example.barrera.modelo;

import com.example.barrera.modelo.observador.Observable;
import com.example.barrera.modelo.observador.Observador;

public class Peaton extends Persona implements Observador {
   public Peaton() {
   }
   
   private void caminar() {
      System.out.println(" PEATON **CAMINAR");
   }

   private void detener() {
      System.out.println("PEATON **DETENER");
   }

   private void correr() {
      System.out.println("PEATON **CORREEEEE ROJA");
   }

   @Override
   public void actualizar(Observable origen, Object evento) {
      if(evento.equals(Barrera.Eventos.subioBarrera))   caminar();
      if(evento.equals(Barrera.Eventos.bajoBarrera))   detener();
      if(evento.equals(Barrera.Eventos.roja))   correr();
   }

}
