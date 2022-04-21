package org.example.day4._3_strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("StringExercises tests")
class StringExercisesTest {

    private StringExercises stringTraining = new StringExercises();

    @Nested
    @DisplayName("goodJob")
    class GoodJob {

        @Test
        @DisplayName("should return \"Good job, Anna!\" for \"Anna\"")
        void goodJob_Anna() {
            assertEquals("Good job, Anna!", stringTraining.goodJob("Anna"));
        }

        @Test
        @DisplayName("should return \"Good job, my friend!\" for \"my friend\"")
        void goodJob_myFriend() {
            assertEquals("Good job, my friend!", stringTraining.goodJob("my friend"));
        }

        @Test
        @DisplayName("should return \"Good job, XYZ!\" for \"XYZ\"")
        void goodJob_XYZ() {
            assertEquals("Good job, XYZ!", stringTraining.goodJob("XYZ"));
        }

        @Test
        @DisplayName("should return \"Good job, Indiana Jones!\" for \"Indiana Jones\"")
        void goodJob_IndianaJones() {
            assertEquals("Good job, Indiana Jones!", stringTraining.goodJob("Indiana Jones"));
        }
    }

    @Nested
    @DisplayName("doubleFirstHalf")
    class DoubleFirstHalf {

        @Test
        @DisplayName("should return \"HeyHey\" for \"HeyYou\"")
        void doubleFirstHalf_HeyYou() {
            assertEquals("HeyHey", stringTraining.doubleFirstHalf("HeyYou"));
        }

        @Test
        @DisplayName("should return \"12341234\" for \"12345678\"")
        void doubleFirstHalf_12345678() {
            assertEquals("12341234", stringTraining.doubleFirstHalf("12345678"));
        }

        @Test
        @DisplayName("should return \"M\" for \"M\"")
        void doubleFirstHalf_M() {
            assertEquals("M", stringTraining.doubleFirstHalf("M"));
        }

        @Test
        @DisplayName("should return \"\" for \"\"")
        void doubleFirstHalf_Empty() {
            assertEquals("", stringTraining.doubleFirstHalf(""));
        }
    }

    @Nested
    @DisplayName("interlace")
    class Interlace {

        @Test
        @DisplayName("should return \"ABABA\" for \"A\", \"B\"")
        void interlace_A_B() {
            assertEquals("ABABA", stringTraining.interlace("A", "B"));
        }

        @Test
        @DisplayName("should return \"SunMoonSunMoonSun\" for \"Sun\", \"Moon\"")
        void interlace_Sun_Moon() {
            assertEquals("SunMoonSunMoonSun", stringTraining.interlace("Sun", "Moon"));
        }

        @Test
        @DisplayName("should return \"blueredblueredblue\" for \"blue\", \"red\"")
        void interlace_blue_red() {
            assertEquals("blueredblueredblue", stringTraining.interlace("blue", "red"));
        }

        @Test
        @DisplayName("should return \"HiCiaoHiCiaoHi\" for \"Hi\", \"Ciao\"")
        void interlace_Hi_Ciao() {
            assertEquals("HiCiaoHiCiaoHi", stringTraining.interlace("Hi", "Ciao"));
        }
    }

    @Nested
    @DisplayName("cutEnds")
    class CutEnds {

        @Test
        @DisplayName("should return \"av\" for \"Java\"")
        void cutEnds_Java() {
            assertEquals("av", stringTraining.cutEnds("Java"));
        }

        @Test
        @DisplayName("should return \"oal\" for \"koala\"")
        void cutEnds_koala() {
            assertEquals("oal", stringTraining.cutEnds("koala"));
        }

        @Test
        @DisplayName("should return \"\" for \"XX\"")
        void cutEnds_XX() {
            assertEquals("", stringTraining.cutEnds("XX"));
        }

        @Test
        @DisplayName("should return \"\" for \"a\"")
        void cutEnds_a() {
            assertEquals("", stringTraining.cutEnds("a"));
        }
    }

    @Nested
    @DisplayName("addTags")
    class AddTags {

        @Test
        @DisplayName("should return \"<i>smile</i>\" for \"smile\", \"i\"")
        void addTags_smile_i() {
            assertEquals("<i>smile</i>", stringTraining.addTags("smile", "i"));
        }

        @Test
        @DisplayName("should return \"<phone>777666555</phone>\" for \"777666555\", \"phone\"")
        void addTags_777666555_phone() {
            assertEquals("<phone>777666555</phone>", stringTraining.addTags("777666555", "phone"));
        }

        @Test
        @DisplayName("should return \"<header>welcome</header>\" for \"welcome\", \"header\"")
        void addTags_welcome_header() {
            assertEquals("<header>welcome</header>", stringTraining.addTags("welcome", "header"));
        }
    }

    @Nested
    @DisplayName("copyLastChars")
    class CopyLastChars {

        @Test
        @DisplayName("should return \"ter ter\" for \"computer\"")
        void copyLastChars_computer() {
            assertEquals("ter ter", stringTraining.copyLastChars("computer"));
        }

        @Test
        @DisplayName("should return \"BCD BCD\" for \"ABCD\"")
        void copyLastChars_ABCD() {
            assertEquals("BCD BCD", stringTraining.copyLastChars("ABCD"));
        }

        @Test
        @DisplayName("should return \"Hi Hi\" for \"Hi\"")
        void copyLastChars_Hi() {
            assertEquals("Hi Hi", stringTraining.copyLastChars("Hi"));
        }

        @Test
        @DisplayName("should return \"ing ing\" for \"Amazing\"")
        void copyLastChars_Amazing() {
            assertEquals("ing ing", stringTraining.copyLastChars("Amazing"));
        }
    }

}