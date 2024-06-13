package edu.lucas.primeirasemana;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        if (volume == 100) {
            System.out.println("Volume Máximo!");
        } else {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        }
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando o canal para: " + canal);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
