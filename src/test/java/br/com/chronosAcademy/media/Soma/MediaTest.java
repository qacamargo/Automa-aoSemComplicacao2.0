package br.com.chronosAcademy.media;

import br.com.chronosAcademy.media.Media;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {
    @Test
    public void validaAprovado(){
    Media media = new Media();
    String resultado = media.calculamedia (5.0,5.0);
    assertEquals ("Aprovado",resultado);
    }
    @Test
    public void validaReprovado (){
        Media media = new Media ();
        String resultado = media.calculamedia (4.9,5.0);
        AssertEquals( "Reprovado", resultado);
                            }
    private void AssertEquals(String reprovado, String resultado) {
    }
}