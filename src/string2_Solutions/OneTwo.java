package string2_Solutions;

public class OneTwo {

    public String oneTwo(String str) {


        if(str.length()<3) {return str;}

        String result ="";

        char[] letters = str.toCharArray();

        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {

            if (i%3==2||i==0){
                if (i!=0){ch=letters[i-3]; result+=ch;}
                continue;
            }

            result+=letters[i];

        }

        result+=ch;

        return result;

    }

}

/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */