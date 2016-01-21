/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.leticia.reproduzirvideotemplate.control.Formato;
import br.ifes.leticia.reproduzirvideotemplate.control.Video;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Leticia
 */
public class TesteVideo {
    
    public TesteVideo() {
    }
    
    @Test
    public void TesteVideoFormato(){
        Video video = new Video("O bom dinossauro", 80.00, "MP4");
        Assert.assertEquals("MP4", video.getFormato().getCodec());
    }
    
    @Test
    public void TesteVideoTitulo(){
        Video video = new Video("O bom dinossauro", 80.00, "MP4");
        Assert.assertEquals("O bom dinossauro", video.getTitulo());
    }

    @Test
    public void TesteFormato(){
        Video video = new Video("O bom dinossauro", 80.00, "MP4");
        Formato formato = video.getFormato();
        Assert.assertEquals("MP4", formato.getCodec());
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
