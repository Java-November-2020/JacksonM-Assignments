import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique{
    public static void main(String[] args) {
        //Create a trackList of type HashMap
        HashMap<String, String> titleTrackList = new HashMap<String, String>();
        //Add in at least 4 songs that are stored by title
        titleTrackList.put("Photograph","Loving can hurt, loving can hurt sometimes, But it's the only thing that I know.");
        titleTrackList.put("I Don't Care","I'm at a party I don't wanna be at And I don't ever wear a suit and tie.");
        titleTrackList.put("Attention","You've been runnin round, runnin round, runnin round throwin that dirt all on my name");
        titleTrackList.put("We Don't Talk Anymore", "We don't talk anymore, like we used to do");
        
        //Pull out one of the songs by its track title
        String name = titleTrackList.get("We Don't Talk Anymore");
        System.out.println(name);

        // ● Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> keys = titleTrackList.keySet();
        for(String key: keys){
            System.out.println(key + ": " + titleTrackList.get(key));
        }
    }
}