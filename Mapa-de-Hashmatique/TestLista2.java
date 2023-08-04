import java.util.HashMap;

public class TestLista2 {
public static void main(String[] args) {


    HashMap<String, String> can1HashMap = new HashMap<String, String>();
    can1HashMap.put("VENT'ANNI","Io c'ho vent'anni");
    can1HashMap.put("Morirò da Re ", "E allora prendi la mia mano, bella segnorina");
    can1HashMap.put("Torna a casa ", "Cammino per la mia città ed il vento soffia forte" );
    
    can1HashMap.put("Coraline ", "Coraline bella come il sole");
    

    for (String i : can1HashMap.keySet()) {
    System.out.println("Cancion: " + i + " Lyric: " + can1HashMap.get(i));
        }
    }
}