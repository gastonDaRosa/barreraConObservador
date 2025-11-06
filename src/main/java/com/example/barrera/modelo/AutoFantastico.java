package com.example.barrera.modelo;

import com.example.barrera.modelo.observador.Observable;
import com.example.barrera.modelo.observador.Observador;

public class AutoFantastico extends Automovil implements Observador  {
   public AutoFantastico() {
   }

   /*
   public void bajoBarrera() {
      this.saltar();
   }
   */

   private void barreraArriba() {
      System.out.println("AUTO FANTASTICO...");
   }

   private void saltar() {
      System.out.println("AUTO FANTASTICO.......<<<---SALTAR-->>>");
   }

   @Override
   public void actualizar(Observable origen, Object evento) {
      if(evento.equals(Barrera.Eventos.subioBarrera))   barreraArriba();
      if(evento.equals(Barrera.Eventos.bajoBarrera))   saltar();
   }
}