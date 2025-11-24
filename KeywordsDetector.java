
public class KeywordsDetector {

    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);

    }
    public static boolean contains(String str1, String str2) {
        boolean doesContain = false;
        int count = 0;
        int i;
        int z =0;
        for (i = 0 ; i<str2.length();i++){
            
            for(;z<str1.length();z++){
               //System.out.println("char i ="+str2.charAt(i)+ " char z ="+str1.charAt(z)+" count ="+count+" z="+z);
                if (str2.charAt(i)==str1.charAt(z)){
                    count ++;
                    z++;
                    break;
                }
               else if ( (str2.charAt(i)!=str1.charAt(z))){
                    count =0;
                    i=0;
                    
               }
            }
        }
        if (count==str2.length()){
            return true;
        }
        return doesContain;
    }
    public static String lowerCase(String str) {
        String lower = str.toLowerCase();
        return lower;
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        int i = 0;
        int z = 0;
        String str1;
        String str2;
        for (; i < sentences.length; i++) {
             str1 = lowerCase(sentences[i]);
            for (; z < keywords.length; z++) {
                str2 = lowerCase(keywords[z]);
                if (contains(str1, str2)==true) {
                    System.out.println(sentences[i]);
                    z=0;
                    break;
                }
            }
            z=0;
        }
    }
}
