/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.reproduzirvideotemplate.model;

import br.ifes.leticia.reproduzirvideotemplate.control.Formato;

/**
 *
 * @author Leticia
 */
public class FormatoMP3 extends Formato{
    
    public FormatoMP3(String codec){
        super(codec);
    }
    
    @Override
    public void carregarArquivo(){
        System.out.println("Carregando arquivo MP3");
    }
    
    @Override
    public void carregarLegendas(){
        System.out.println("Carregando legenda MP3");
    }
    
    @Override
    public void reproduzirVideo(){
        System.out.println("Reproduzindo Video. Codec: "+ getCodec());
    }
    
    @Override
    public void finalizarReproducao(){
        System.out.println("Finalizando MP3\n");
    }
}
