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
public abstract class Formato {
    private final String codec;
    
    public Formato(String codec){
        this.codec = codec;
    }

    public String getCodec() {
        return codec;
    }
    
    public void reproduzir(){
        carregarArquivo();
        carregarLegendas();
        reproduzirVideo();
        finalizarReproducao();
    }
    
    public abstract void carregarArquivo();
    public abstract void carregarLegendas();
    public abstract void reproduzirVideo();
    public abstract void finalizarReproducao();
}
