package com.mycompany.automatas_ep3;

import lombok.Setter;

/**@author Enrique*/
public class AutomataTel{
    @Setter private String cinta;
    
    public boolean estadoA(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoA(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoA(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoB(posicion+1);
            return false;
    }
    private boolean estadoB(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoB(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoC(posicion+1);
            return false;
    }
    private boolean estadoC(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoD(posicion+1);
            return false;
    }
    private boolean estadoD(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoE(posicion+1);
    if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoD(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoC(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoC(posicion+1);
            return false;
    }
    private boolean estadoE(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoE(posicion+1);
        //if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoF(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoF(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoF(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoF(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoF(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoF(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoF(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoF(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoF(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoF(posicion+1);
            return false;
    }
    private boolean estadoF(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoF(posicion+1);
        //if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoG(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoG(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoG(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoG(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoG(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoG(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoG(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoG(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoG(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoG(posicion+1);
            return false;
    }
    private boolean estadoG(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoG(posicion+1);
        //if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);       
        if(cinta.charAt(posicion)=='0') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoH(posicion+1);
            return false;
    }
    private boolean estadoH(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        //if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoH(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoH(posicion+1);
            return false;
    }
    private boolean estadoI(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        //if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoJ(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoJ(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoJ(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoJ(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoJ(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoJ(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoJ(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoJ(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoJ(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoJ(posicion+1);
            return false;
    }
    private boolean estadoJ(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoJ(posicion+1);
        //if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoK(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoK(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoK(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoK(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoK(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoK(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoK(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoK(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoK(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoK(posicion+1);
            return false;
    }
    private boolean estadoK(int posicion){
        if(posicion==cinta.length()) return false;
        if(cinta.charAt(posicion)==' ') return estadoK(posicion+1);
        //if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoL(posicion+1);
            return false;
    }
    private boolean estadoL(int posicion){
        if(posicion==cinta.length()) return true;
        if(cinta.charAt(posicion)==' ') return estadoK(posicion+1);
        //if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoL(posicion+1);
            return false;
    }
    private boolean estadoM(int posicion){
        if(posicion==cinta.length()) return false;
        //if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoM(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoN(posicion+1);
            return false;
    }
    private boolean estadoN(int posicion){
        if(posicion==cinta.length()) return false;
        //if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoN(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoO(posicion+1);
            return false;
    }
    private boolean estadoO(int posicion){
        if(posicion==cinta.length()) return false;
        //if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoO(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoP(posicion+1);
            return false;
    }
     private boolean estadoP(int posicion){
        if(posicion==cinta.length()) return false;
        //if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoQ(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoP(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoP(posicion+1);
            return false;
    }
    private boolean estadoQ(int posicion){
        if(posicion==cinta.length()) return false;
        //if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoQ(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoR(posicion+1);
            return false;
    }
    private boolean estadoR(int posicion){
        if(posicion==cinta.length()) return false;
        //if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoR(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoS(posicion+1);
            return false;
    }
    private boolean estadoS(int posicion){
        if(posicion==cinta.length()) return false;
        //if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoS(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoT(posicion+1);
            return false;
    }
    private boolean estadoT(int posicion){
        if(posicion==cinta.length()) return false;
        //if(cinta.charAt(posicion)==' ') return estadoI(posicion+1);
        if(cinta.charAt(posicion)=='-') return estadoT(posicion+1);
        if(cinta.charAt(posicion)=='0') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='1') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='2') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='3') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='4') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='5') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='6') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='7') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='8') return estadoL(posicion+1);
        if(cinta.charAt(posicion)=='9') return estadoL(posicion+1);
            return false;
    }
}