import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Wish You Were Here","I dig my toes into the sand");
        trackList.put("Nice To Know You","And higher than the heights we often think we know");
        trackList.put("Echo","There's something about the look in your eyes");
        trackList.put("11 A.M.","And I start my day thinking about what i've thrown away");

        String lyrics = trackList.get("Wish You Were Here");
        System.out.println("Lyrics: " + lyrics);

        Set<String> keys = trackList.keySet();
        for (String key : keys){
            System.out.print("Track: " + key );
            System.out.println(" Lyrics: " + trackList.get(key));
        }
    }
}
