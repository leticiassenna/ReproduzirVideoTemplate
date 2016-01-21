/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.reproduzirvideotemplate.control;

import br.ifes.leticia.reproduzirvideotemplate.model.FormatoAVI;
import br.ifes.leticia.reproduzirvideotemplate.model.FormatoMP3;
import br.ifes.leticia.reproduzirvideotemplate.model.FormatoMP4;

/**
 *
 * @author Leticia
 */
public class Video {
    String titulo;
    double minutos;
    Formato formato;

    public String getTitulo() {
        return titulo;
    }

    public double getMinutos() {
        return minutos;
    }

    public Formato getFormato() {
        return formato;
    }
    
    public Video(String titulo, double minutos, String codec){
        this.titulo = titulo;
        this.minutos = minutos;
        executa(codec);
        descricaoVideo();
    }
    
    public final void executa(String codec){
        if (null != codec)switch (codec) {
            case "AVI":
                this.formato = new FormatoAVI(codec);
                break;
            case "MP3":
                this.formato = new FormatoMP3(codec);
                break;
            default:
                this.formato = new FormatoMP4(codec);
                break;
        }
    }
    
    
    public final void descricaoVideo(){
        System.out.println("Vídeo: " + this.titulo 
             + ", " + this.minutos + " minutos,"
             + " formato: " + this.formato.getCodec()); 
    }
}
