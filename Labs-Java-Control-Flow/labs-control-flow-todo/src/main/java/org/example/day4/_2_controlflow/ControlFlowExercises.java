package org.example.day4._2_controlflow;

public class ControlFlowExercises {
    /*
        TODO 3
        Children ride bicycles when the temperature outside is between 15 and 30 degrees (inclusive).
        Unless it is winter, then the lower limit is 10 instead of 15. Given an int temp and a boolean isWinter,
        return true if children ride bikes and false otherwise.

        kidsRide(30, false) -> true
        kidsRide(13, true)  -> true
        kidsRide(12, false) -> false
        kidsRide(5, false)  -> false
        kidsRide(31, true)  -> false
     */
    boolean kidsRide(int temp, boolean isWinter) {
        if (isWinter){
            return (temp <= 30 && temp >=10);
        }else{
            return (temp <= 30 && temp >= 15);
        }
    }

    /*
        TODO 4

        Given two int values, a and b, return true if either one is 8. Or if their sum, difference or product is 6.
        The function Math.abs(num) computes the absolute value of a number.

        find8(8, 8)  -> true
        find8(8, -5) -> true
        find8(7, 15) -> true
        find8(4, 2)  -> true
        find8(6, 2)  -> true
        find8(-8, 1) -> false
        find8(12, 0) -> false
     */
    boolean find8(int a, int b) {
        if (a == 8 || b == 8){
            return true;
        } else if(a + b == 8){
            return true;
        } else if(a * b == 8){
            return true;
        }else if(Math.abs(a - b) == 8){
            return true;
        }

        return false;
    }

    /*
        TODO 5

        Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
        it should only count once towards the sum.

        sum(2, 3, 4) -> 9
        sum(2, 2, 4) -> 6
        sum(5, 3, 3) -> 8
        sum(1, 1, 1) -> 1
        sum(4, 2, 4) -> 6
        sum(5, 7, 3) -> 15
     */
    int sum(int a, int b, int c) {
        if(a == b && b == c){
            return a;
        } else if(a == b ){
            return a + c;
        } else if(b == c){
            return a + b;
        } else if(a == c){
            return b + c;
        }

        return a + b + c;
    }

    /*
        TODO 6

        You are invited out to dinner. Return true if you should go. Normally you go, except on Sundays you only
        go with your mom. In all cases, if it is past 20, you do not go.

        goOut(false, false, false) → true
        goOut(true, true, false)   → true
        goOut(true, true, true)    → false
        goOut(false, false, true)  → false
        goOut(true, false, false)  → false
     */
    boolean goOut(boolean isSunday, boolean isMom, boolean isPast20) {
        if(isSunday && isMom){
            if(isPast20){
                return false;
            } else{
                return true;
            }
        } else if(!isSunday && !isMom){
            return true;

        }else if(isPast20){
            return false;
        }
        return false;
    }

    /*
        TODO 7

        You want to hang paintings in a line, next to one another, on a gallery wall. The wall is 'length' meters long.
        You have a number of small paintings (1 m each) and big paintings (5 m each). Return true if it is possible
        to fill the entire wall by choosing from the given paintings. There are no gaps between paintings.

        hangPaintings(4, 1, 9)   -> true
        hangPaintings(3, 2, 10)  -> true
        hangPaintings(6, 1, 11)  -> true
        hangPaintings(3, 2, 9)   -> false
        hangPaintings(1, 4, 12)  -> false
        hangPaintings(20, 0, 21) -> false
     */
    boolean hangPaintings(int small, int big, int length) {
        int bigPainting = big * 5;
        if (small + bigPainting == length){
            return true;
        }

        return false;
    }

    /*
        TODO 8

        Given a day of the week encoded as 1=Mon, 2=Tue, 3=Wed, ...7=Sun, and a boolean indicating if we are on vacation,
        return a String saying whether you should party or not. Mon-Thu and Sun, the String should be "Don't party"
        and on Fri and Sat, it should be "Party till midnight". Unless you are on vacation, then on Mon-Thu and Sun
        it should be "Party till midnight", and Fri and Sat it should be "Party all night".

        canParty(1, false) -> "Don't party"
        canParty(6, false) -> "Party till midnight"
        canParty(3, true)  -> "Party till midnight"
        canParty(5, true)  -> "Party all night"
     */
    String canParty(int day, boolean vacation) {
        if(vacation){
            if(day == 5 || day == 6){
                return  "Party all night";
            } else{
                return "Party till midnight";
            }
        }else if(!vacation){
            if(day == 5 || day == 6){
                return "Party till midnight";
            } else{
                return "Don't party";
            }

        }

        return "";
    }
}
