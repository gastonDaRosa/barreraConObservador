package com.example.barrera.modelo;



import com.example.barrera.modelo.observador.Observable;

public class Barrera extends Observable{
   private boolean arriba = false;

   public static enum Eventos {
      subioBarrera,
      bajoBarrera,
      roja
   }

   public Barrera() {
   }


   public void on(){
        System.out.println("----ON---");
        System.out.println();
        System.out.println("----SUBIO Barrera---");
        pausa(3);
        detectarMovimiento();
        
        System.out.println();
        System.out.println("----BAJO Barrera---");
        pausa(10);
        detectarReposo();

        System.out.println();
        System.out.println("--- LUZ ROJA ---");
        avisar(Eventos.roja);

        System.out.println();
        System.out.println("--- FIN ---");
    }
    private void pausa(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException ex) {
        }
    }

    private void detectarMovimiento() {
        System.out.println("---MOVIMIENTO DETECTADO---");
        arriba = true;
        avisar(Eventos.subioBarrera);
    }
    private void detectarReposo() {
        System.out.println("...REPOSO...");
        arriba=false;
        avisar(Eventos.bajoBarrera);
    }

}