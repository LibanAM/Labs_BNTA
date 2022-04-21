package org.example.day4._3_strings;

public class StringExercises {
    /*
       Prefix the param with 'Good job, '

       goodJob("Anna")          -> "Good job, Anna!"
       goodJob("my friend")     -> "Good job, my friend!"
       goodJob("XYZ")           -> "Good job, XYZ!"
       goodJob("Indiana Jones") -> "Good job, Indiana Jones!"

    */
    String goodJob(String name) {
        return "Good job, " + name + "!";
    }

    /*

       If String is even length, return first half x2. Else return original String.

       doubleFirstHalf("HeyYou")   -> "HeyHey"
       doubleFirstHalf("12345678") -> "12341234"
       doubleFirstHalf("M")        -> "M"
       doubleFirstHalf("panda")    -> "panda"
    */
    String doubleFirstHalf(String str) {
        if (str.length()%2 == 0) {
            String half = str.substring(0, str.length() / 2);
            return half + half;
        }
        return str;
    }

    /*

        interlace("A", "B")      -> "ABABA"
        interlace("Sun", "Moon") -> "SunMoonSunMoonSun"
        interlace("blue", "red") -> "blueredblueredblue"
        interlace("Hi", "Ciao")  -> "HiCiaoHiCiaoHi"
     */
    String interlace(String a, String b) {
        return a+b+a+b+a;
    }

    /*

        cutEnds("Java")  -> "av"
        cutEnds("koala") -> "oal"
        cutEnds("XX")    -> ""
        cutEnds("a")     -> ""
     */
    String cutEnds(String str) {
        return str.length() < 2 ? "" : str.substring (1, str.length()-1);
    }

    /*

       addTags("smile", "i")        -> <i>smile</i>
       addTags("777666555", "phone" -> <phone>777666555</phone>
       addTags("welcome", "header"  -> <header>welcome</header>
     */
    String addTags(String word, String tag) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /*

       copyLastChars("computer") -> "ter ter"
       copyLastChars("ABCD")     -> "BCD BCD"
       copyLastChars("Hi")       -> "Hi Hi"
       copyLastChars("Amazing")  -> "ing ing"
     */
    String copyLastChars(String str) {
        if (str.length() < 3) {
            return str + " " + str;
        }
        String end = str.substring(str.length()-3);
        return end + " " + end;
    }
}
