/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.reproduzirvideotemplate.app;

import br.ifes.leticia.reproduzirvideotemplate.control.Formato;
import br.ifes.leticia.reproduzirvideotemplate.control.Video;

/**
 *
 * @author Leticia
 */
public class Application {
    public static void main(String[] args) {
        Video video;
        Formato formato;
        
        video = new Video("O bom dinossauro", 80.00, "MP4");
        formato = video.getFormato();
        formato.reproduzir();
        
        video = new Video("Noé", 120.00, "MP3");
        formato = video.getFormato();
        formato.reproduzir();
        
        video = new Video("Minha mãe é uma peça", 90.00, "AVI");
        formato = video.getFormato();
        formato.reproduzir();
    }
}
