package states;

import java.util.HashMap;
import java.util.Map;

public class USStates {

    /**
     * Count states by their first letter.
     *
     * @return
     *   A map from the initial (capital) letter to the number of states whose
     *   names start with that letter.  The map should have exactly 26 keys, one
     *   for each letter of the alphabet.  For example, 'A' should be a key with
     *   value 4 (Alabama, Alaska, Arizona, Arkansas), and 'B' should be a key
     *   with value 0.
     */
    public static Map<Character, Integer> countStatesByFirstLetter() {
        Map<Character, Integer> map= new HashMap<Character, Integer>();
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //I am assuming I don't have to check for lowercase and uppercase because the list
        //provided has every first letter in uppercase
        for(int i=0;i<alphabet.length();i++){
            map.put(alphabet.charAt(i),0);
        }
        for(String name: STATE_NAMES){
            char first=name.charAt(0);
            int num;
            if(map.containsKey(first)){
                num=map.get(first);
                num++;
                map.put(first,num);
            } else{
                map.put(first,1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        Map<Character, Integer> counts = countStatesByFirstLetter();
        // Do some simple tests.  Feel free to add your own.
        if (counts.size() != 26) throw new AssertionError();
        if (!counts.containsKey('A')) throw new AssertionError();
        if (counts.get('A') != 4) throw new AssertionError();
        if (!counts.containsKey('B')) throw new AssertionError();
        if (counts.get('B') != 0) throw new AssertionError();
        System.out.println(counts);
    }

    public static final String[] STATE_NAMES = {
            "Alabama",
            "Alaska",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Idaho",
            "Illinois",
            "Indiana",
            "Iowa",
            "Kansas",
            "Kentucky",
            "Louisiana",
            "Maine",
            "Maryland",
            "Massachusetts",
            "Michigan",
            "Minnesota",
            "Mississippi",
            "Missouri",
            "Montana",
            "Nebraska",
            "Nevada",
            "New Hampshire",
            "New Jersey",
            "New Mexico",
            "New York",
            "North Carolina",
            "North Dakota",
            "Ohio",
            "Oklahoma",
            "Oregon",
            "Pennsylvania",
            "Rhode Island",
            "South Carolina",
            "South Dakota",
            "Tennessee",
            "Texas",
            "Utah",
            "Vermont",
            "Virginia",
            "Washington",
            "West Virginia",
            "Wisconsin",
            "Wyoming",
    };
}
