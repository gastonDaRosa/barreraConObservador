package com.example.barrera.modelo;

import com.example.barrera.modelo.observador.Observable;
import com.example.barrera.modelo.observador.Observador;

public class Automovil extends Vehiculo implements Observador {
   public Automovil() {
   }


   private void frenar() {
      System.out.println(" AUTOMOVIL -----  FRENAR<<<");
   }

   private void arrancar() {
      System.out.println("AUTOMOVIL -----  ARRANCAR>>>>");
   }
   
   @Override
   public void actualizar(Observable origen, Object evento) {
      if(evento.equals(Barrera.Eventos.subioBarrera))   arrancar();
      if(evento.equals(Barrera.Eventos.bajoBarrera))   frenar();
   }

}
