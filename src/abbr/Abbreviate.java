package abbr;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     *
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */
    public static String abbreviate(String string) {
        String newString="";
        if(string == null){
            return null;
        }
        string = string.toLowerCase();
        for(int i=0;i<string.length();i++){
            if(!(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='u'||string.charAt(i)=='o'||string.charAt(i)=='i')){
               newString+=string.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
    }

}
