/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.reproduzirvideotemplate.control;

/**
 *
 * @author Leticia
 */
public class Video {
    String titulo;
    int minutos;
    String qualidade;
    Formato codec;
    
    public Video(String titulo, int minutos, String qualidade, Formato codec){
        this.titulo = titulo;
        this.minutos = minutos;
        this.qualidade = qualidade;
        this.codec = codec;
    }
    
    public void executa(){
        this.codec.getCodec();
    }
    
    
}
