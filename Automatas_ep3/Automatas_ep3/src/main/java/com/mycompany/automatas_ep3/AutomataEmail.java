package com.mycompany.automatas_ep3;

import lombok.Setter;

/**@author Enrique*/
public class AutomataEmail {
    
    @Setter private String cinta;
    
    public boolean estadoA(int posicion){
        if(posicion == cinta.length()) return false;
        if(String.valueOf(cinta.charAt(posicion)).matches("[a-zA-Z0-9._\\-,]")) return estadoA(posicion++);
        if(cinta.charAt(posicion)== '@') return estadoB(posicion++);
        return false;
    } 
    
    public boolean estadoB(int posicion){
        if(posicion == cinta.length()) return false;
        if(String.valueOf(cinta.charAt(posicion)).matches("[a-zA-Z0-9_\\-,]")) return estadoB(posicion++);
        if(cinta.charAt(posicion)== '.') return estadoC(posicion++);
        return false;
    }  

    public boolean estadoC(int posicion){
        return false;
    }
    
    public boolean estadoD(int posicion){
        return false;
    }
    
    public boolean estadoE(int posicion){
        return false;
    }
    
    public boolean estadoF(int posicion){
        return false;
    }
    
    public boolean estadoG(int posicion){
        return false;
    }
    
    public boolean estadoH(int posicion){
        return false;
    }
    
    public boolean estadoI(int posicion){
        return false;
    }
    
    public boolean estadoJ(int posicion){
        return false;
    }
    
    public boolean estadoK(int posicion){
        return false;
    }
    
}
