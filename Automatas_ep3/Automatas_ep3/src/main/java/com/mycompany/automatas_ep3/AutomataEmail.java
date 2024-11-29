package com.mycompany.automatas_ep3;

import lombok.Setter;

/**@author Enrique*/
public class AutomataEmail {
    
    @Setter private String cinta;
    
    public boolean estadoZ(int posicion){
        if(posicion == cinta.length()) return false;
if(cinta.charAt(posicion) ==  'a') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'b') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'c') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'd') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'e') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'f') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'g') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'h') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'i') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'j') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'k') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'l') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'm') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'n') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'ñ') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'o') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'p') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'q') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'r') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  's') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  't') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'u') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'v') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'w') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'x') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'y') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'z') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'A') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'B') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'C') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'D') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'E') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'F') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'G') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'H') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'I') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'J') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'K') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'L') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'M') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'N') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'Ñ') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'O') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'P') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'Q') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'R') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'S') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'T') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'U') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'V') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'W') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'X') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'Y') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  'Z') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '0') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '1') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '2') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '3') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '4') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '5') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '6') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '7') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '8') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '9') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '-') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '_') return estadoA(posicion+1);
if(cinta.charAt(posicion) ==  '.') return estadoA(posicion+1);

        return false;
    }
    
    private boolean estadoA(int posicion){
        if(posicion == cinta.length()) return false;
        if(cinta.charAt(posicion)== '@') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'a') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'c') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'd') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'e') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'f') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'n') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'ñ') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'o') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'p') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  't') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'u') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'x') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'y') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'D') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'F') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'K') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'M') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'N') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'P') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'U') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'Y') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '9') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoA(posicion+1);
        if(cinta.charAt(posicion) ==  '.') return estadoA(posicion+1);
        
        return false;
    } 
    
    private boolean estadoB(int posicion){
        
        if(posicion == cinta.length()) return false;
        
        if(cinta.charAt(posicion)== '.') return estadoC(posicion+1);
        
        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'c') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'e') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'n') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'o') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  't') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'x') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'M') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'N') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);
        
        return false;
    }  

    private boolean estadoC(int posicion){
        if(posicion == cinta.length()) return false;
        
        if(cinta.charAt(posicion) ==  'c') return estadoD(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoD(posicion+1);
        if(cinta.charAt(posicion) ==  'n') return estadoJ(posicion+1);
        if(cinta.charAt(posicion) ==  'N') return estadoJ(posicion+1);
        if(cinta.charAt(posicion) ==  '.') return false;
        
        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion+1);
        
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'e') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'o') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  't') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'x') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'M') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);

        
        return false;
    }
    
    private boolean estadoD(int posicion){
        if(posicion == cinta.length()) return false;
        if(cinta.charAt(posicion) ==  'o') return estadoE(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoE(posicion+1);
        if(cinta.charAt(posicion) ==  '.') return estadoC(posicion+1);
        
        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'c') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'e') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'n') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  't') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'x') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'M') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'N') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion+1);
        
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);

        return false;
    }
    
    private boolean estadoE(int posicion){
        if(posicion == cinta.length()) return false;
        
        if(cinta.charAt(posicion) ==  'M') return estadoF(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoF(posicion+1);
        if(cinta.charAt(posicion) ==  '.') return estadoC(posicion+1);
        
        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'c') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'e') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion+1);
        
        if(cinta.charAt(posicion) ==  'n') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'o') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  't') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'x') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'N') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);
        
        return false;
    }
    
    
    private boolean estadoF(int posicion){
        if(posicion == cinta.length()) return true;
        if(cinta.charAt(posicion) ==  '.') return estadoG(posicion+1);
        
        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'c') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'e') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'n') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'o') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  't') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'x') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'M') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'N') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion+1);	
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);

        return false;
    }
    
    private boolean estadoG(int posicion){
        
        if(posicion == cinta.length()) return true;
        if(cinta.charAt(posicion) ==  '.') return false;

        if(cinta.charAt(posicion) ==  'M') return estadoH(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoH(posicion+1);

        if(cinta.charAt(posicion) ==  '.') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'c') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'e') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'n') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'o') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  't') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'x') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'N') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);
        return false;

    }
    
    private boolean estadoH(int posicion){
        
        if(posicion == cinta.length()) return false;	
        if(cinta.charAt(posicion) ==  'x') return estadoI(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoI(posicion+1);
        if(cinta.charAt(posicion) ==  '.') return estadoC(posicion+1);

        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'c') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'e') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'n') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'o') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  't') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'M') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'N') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);


        return false;
    }
    
    private boolean estadoI(int posicion){
		
        if(posicion == cinta.length()) return true;	
        if(cinta.charAt(posicion) ==  '.') return estadoC(posicion++);
        
        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'c') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'e') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'm') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'n') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'o') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  't') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'x') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'C') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'E') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'M') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'N') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'O') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'T') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'X') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion++);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);      
     
        return false;
    }
    
    private boolean estadoJ(int posicion){

        if(posicion == cinta.length()) return true;
        if(cinta.charAt(posicion) ==  'e') return estadoK(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoK(posicion+1);
        if(cinta.charAt(posicion) ==  '.') return estadoC(posicion+1);

        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'c') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'n') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'o') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  't') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'x') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'M') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'N') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);

        return false;
    }
    
    private boolean estadoK(int posicion){

        if(posicion == cinta.length()) return false;
        if(cinta.charAt(posicion) ==  't') return estadoF(posicion+1);
        if(cinta.charAt(posicion) ==  'T') return estadoF(posicion+1);
        if(cinta.charAt(posicion) ==  '.') return estadoC(posicion+1);

        if(cinta.charAt(posicion) ==  'a') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'b') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'c') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'd') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'e') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'f') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'g') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'h') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'i') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'j') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'k') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'l') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'm') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'n') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'o') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'p') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'r') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  's') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'u') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'v') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'w') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'x') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'A') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'B') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'C') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'D') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'E') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'F') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'G') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'H') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'I') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'J') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'K') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'L') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'M') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'N') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Ñ') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'O') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'P') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Q') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'R') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'S') return estadoB(posicion+1);

        if(cinta.charAt(posicion) ==  'U') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'V') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'W') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'X') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Y') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  'Z') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '0') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '1') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '2') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '3') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '4') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '5') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '6') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '7') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '8') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '9') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '-') return estadoB(posicion+1);
        if(cinta.charAt(posicion) ==  '_') return estadoB(posicion+1);

        return false;
    }
    
}
