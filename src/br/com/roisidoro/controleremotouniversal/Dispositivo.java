
package br.com.roisidoro.controleremotouniversal;


public class Dispositivo {
    private int volume;
    private int canal;
       
    public void aumentarVolume(){
        int i = 1;
        if (volume <100) {
            volume +=i;
        } else {
            volume = 100;
        }
    }
    
    public void diminuirVolume(){
        int i = 1;
        if (volume > 0) {
            volume -=i;
        } else {
            volume = 0;
        }
    }
    
    public int aumentarCanal(){
        int i = 1;
        if (canal < 500) {
            canal +=i;
        } else {
            canal = 0 + i;
        }
        return canal;
    }
    
    public void diminuirCanal(){
        int i = 1;
        if (canal > 1) {
            canal -=i;
        } else {
            canal = 500;
        }
    }
    
    public void escolherAparelho(){
        System.out.println("TV ou TV Box?"); 
    }
    
    public Dispositivo() {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100){
            volume = 100;
        } else if (volume < 0){
            volume = 0;
        }
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 500){
            canal = 500;
        } else if(canal < 1){
            canal = 1;
        }
        this.canal = canal;                        
    }
       
    @Override
    public String toString() {
        
        return "Aparelho: " + getClass().getSimpleName() + " Canal: " + getCanal() + " Volume: " + getVolume(); 
    }
    
    
}
