package audioplayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
        
        
        
public class AudioPlayer {

    AudioPlayer(){
        
    }
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
       FileInputStream a;
        a = new FileInputStream("C:\\Users\\sony\\Documents\\NetBeansProjects\\AudioPlayer\\src\\audioplayer\\Whistle Baja.mp3");
        
        
        Player p=new Player(a);
        p.play();
    }
    
}
