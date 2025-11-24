public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lower = str.toLowerCase();
        return lower;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
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
}
