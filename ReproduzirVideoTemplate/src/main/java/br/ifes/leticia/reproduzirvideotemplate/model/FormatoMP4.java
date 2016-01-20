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
public class FormatoMP4 extends Formato{
    
    public FormatoMP4(String codec){
        super(codec);
    }
    
    @Override
    public void carregarArquivo(){
        System.out.println("Carregando arquivo Avi");
    }
    
    @Override
    public void carregarLegendas(){
        System.out.println("Carregando legenda Avi");
    }
    
    @Override
    public void reproduzirVideo(){
        System.out.println("Reproduzindo Video Avi. Codec: "+ getCodec());
    }
    
    @Override
    public void finalizarReproducao(){
        System.out.println("Finalizando Avi");
    }
    
}
