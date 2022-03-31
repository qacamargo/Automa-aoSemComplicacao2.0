package br.com.chronosAcademy.media;

public class Media {
    public String calculamedia(double v, double v1) {
        double media = (v + v1)/2;
        if (media <5){
            return "reprovado";
        }
        return "Aprovado";
    }
}
