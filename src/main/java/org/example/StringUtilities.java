package org.example;

public class StringUtilities {
    public static String reverseInputString(String myString){
        if(myString == null)
            return myString;

        String reverseString="";

        for (int i = myString.length() -1; i>=0; i--){
            reverseString = reverseString + myString.charAt(i);
        }
        return reverseString;
    }

    public static String spaceDelete(String myString){
        for (int i = myString.length()-1; i>=0; i--){

            myString = myString.replace(" ","");
        }
        return myString;
    }

    public static boolean validPalindrome(String myString) {
        for (int i = 0, j = myString.length() - 1;i<j; i++, j--){
            if(myString.charAt(i) != myString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static String lowerCamel( String myString )
        {
            int ctr = 0 ;

            int n = myString.length( ) ;
            char ch[ ] = myString.toCharArray( ) ;
            int c = 0 ;
            for ( int i = 0; i < n; i++ )
            {

                if( i == 0 )

                    ch[ i ] = Character.toLowerCase( ch[ i ] ) ;
                if ( ch[ i ] == ' ' )
                {
                    ctr++ ;
                    ch[ i + 1 ] = Character.toUpperCase( ch[ i + 1 ] ) ;
                }
                else
                    ch[ c++ ] = ch[ i ] ;
            }
            return String.valueOf( ch, 0, n - ctr ) ;
        }

        public static String pureWord( String myString){
        return myString.trim();
        }

        public static boolean ifContains(String myString, String word ){
        word.toLowerCase();
        return myString.toLowerCase().contains(word);
        }





}
