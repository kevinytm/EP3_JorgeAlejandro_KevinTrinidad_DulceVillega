package com.mycompany.automatas_ep3;

/**
 *
 * @author Enrique
 */

public class Main {
    public static void main(String[] args) {
       
//        String cinta="166 666 3652";
//       AutomataTel automata = new AutomataTel();
//       automata.setCinta(cinta);
//        System.out.println("Es valida la cadena "+ cinta+" ? "+automata.estadoA(0));
//        
//        String cinta1="1666 66 3652";
//       AutomataTel automata1 = new AutomataTel();
//       automata1.setCinta(cinta1);
//        System.out.println("Es valida la cadena "+ cinta1+" ? "+automata1.estadoA(0));
//        
//        String cinta2="-6 6666 3652";
//       AutomataTel automata2 = new AutomataTel();
//       automata2.setCinta(cinta2);
//        System.out.println("Es valida la cadena "+ cinta2+" ? "+automata2.estadoA(0));
//        
//         String cinta3="1662 666 3652";
//       AutomataTel automata3 = new AutomataTel();
//       automata3.setCinta(cinta3);
//        System.out.println("Es valida la cadena "+ cinta3+" ? "+automata3.estadoA(0));
//        
//        String cinta4="777-100-1223";
//        AutomataTel automata4 = new AutomataTel();
//        automata4.setCinta(cinta4);
//        System.out.println("Es valida la cadena "+ cinta4+" ? "+automata4.estadoA(0));
//        
//        String cinta5="1656-66-3652";
//        AutomataTel automata5 = new AutomataTel();
//        automata5.setCinta(cinta5);
//        System.out.println("Es valida la cadena "+ cinta5+" ? "+automata5.estadoA(0));
//        
//        String cinta6="56-66-3652";
//        AutomataTel automata6 = new AutomataTel();
//        automata6.setCinta(cinta6);
//        System.out.println("Es valida la cadena "+ cinta6+" ? "+automata6.estadoA(0));

            String cinta = "kevinyahirt@gmail.com";
            AutomataEmail automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            cinta = "kevinyahirt@gmail.com.mx";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            cinta = "kevinyahirt@gmail.com.m";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            
            cinta = "kevinyahirt@gmail.net";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));

            cinta = "'@dominio.com";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            cinta = "usuario@dominio..com";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            cinta = "usuario@dominio!.com";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            
            cinta = "usuario@@dominio.com";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            
            cinta = "kevinyahirt@gmail.ne";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            
            cinta = "usuario@dominio.c";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            
            cinta = "usuario@-dominio.com";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            
            cinta = "usuario@dominio_com";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            
            cinta = "usuario@tlaloc.imta.mx";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            
            cinta = "usuario@server01.company.com";
            automata = new AutomataEmail();
            automata.setCinta(cinta);
            System.out.println("El correo "+cinta+" es válida? "+automata.estadoZ(0));
            
            
    }
}



