package org.example.day4._2_controlflow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Logic tests")
public class ControlFlowExercisesTest {

    private ControlFlowExercises exercises = new ControlFlowExercises();

    @Nested
    @DisplayName("kidsRide")
    class KidsRide {

        @Test
        @DisplayName("should return true for (30, false)")
        void kidsRide_30_false() {
            assertTrue(exercises.kidsRide(30, false));
        }

        @Test
        @DisplayName("should return true for (13, true)")
        void kidsRide_13_true() {
            assertTrue(exercises.kidsRide(13, true));
        }

        @Test
        @DisplayName("should return false for (12, false)")
        void kidsRide_12_false() {
            assertFalse(exercises.kidsRide(12, false));
        }

        @Test
        @DisplayName("should return false for (5, false)")
        void kidsRide_5_false() {
            assertFalse(exercises.kidsRide(5, false));
        }

        @Test
        @DisplayName("should return false for (31, true)")
        void kidsRide_31_true() {
            assertFalse(exercises.kidsRide(31, true));
        }
    }

    @Nested
    @DisplayName("find8")
    class Find8 {

        @Test
        @DisplayName("should return true for (8, 8)")
        void find8_8_8() {
            assertTrue(exercises.find8(8, 8));
        }

        @Test
        @DisplayName("should return true for (8, -5)")
        void find8_8_5() {
            assertTrue(exercises.find8(8, -5));
        }

        @Test
        @DisplayName("should return true for (7, 15)")
        void find8_7_15() {
            assertTrue(exercises.find8(7, 15));
        }

        @Test
        @DisplayName("should return true for (4, 2)")
        void find8_4_2() {
            assertTrue(exercises.find8(4, 2));
        }

        @Test
        @DisplayName("should return true for (6, 2)")
        void find8_6_2() {
            assertTrue(exercises.find8(6, 2));
        }

        @Test
        @DisplayName("should return false for (-8, 1)")
        void find8_8_1() {
            assertFalse(exercises.find8(-8, 1));
        }

        @Test
        @DisplayName("should return false for (12, 0)")
        void find8_12_0() {
            assertFalse(exercises.find8(12, 0));
        }
    }

    @Nested
    @DisplayName("sum")
    class Sum {

        @Test
        @DisplayName("should return 9 for (2, 3, 4)")
        void sum_2_3_4() {
            assertEquals(9, exercises.sum(2, 3, 4));
        }

        @Test
        @DisplayName("should return 6 for (2, 2, 4)")
        void sum_2_2_4() {
            assertEquals(6, exercises.sum(2, 2, 4));
        }

        @Test
        @DisplayName("should return 8 for (5, 3, 3)")
        void sum_5_3_3() {
            assertEquals(8, exercises.sum(5, 3, 3));
        }

        @Test
        @DisplayName("should return 1 for (1, 1, 1)")
        void sum_1_1_1() {
            assertEquals(1, exercises.sum(1, 1, 1));
        }

        @Test
        @DisplayName("should return 6 for (4, 2, 4)")
        void sum_4_2_4() {
            assertEquals(6, exercises.sum(4, 2, 4));
        }

        @Test
        @DisplayName("should return 15 for (5, 7, 3)")
        void sum_5_7_3() {
            assertEquals(15, exercises.sum(5, 7, 3));
        }
    }

    @Nested
    @DisplayName("goOut")
    class GoOut {

        @Test
        @DisplayName("should return true for (false, false, false)")
        void goOut_f_f_f() {
            assertTrue(exercises.goOut(false, false, false));
        }

        @Test
        @DisplayName("should return true for (true, true, false)")
        void goOut_t_t_f() {
            assertTrue(exercises.goOut(true, true, false));
        }

        @Test
        @DisplayName("should return false for (true, true, true)")
        void goOut_t_t_t() {
            assertFalse(exercises.goOut(true, true, true));
        }

        @Test
        @DisplayName("should return false for (false, false, true)")
        void goOut_f_f_t() {
            assertFalse(exercises.goOut(false, false, true));
        }

        @Test
        @DisplayName("should return false for (true, false, false)")
        void goOut_t_f_f() {
            assertFalse(exercises.goOut(true, false, false));
        }
    }

    @Nested
    @DisplayName("hangPaintings")
    class HangPaintings {

        @Test
        @DisplayName("should return true for (4, 1, 2)")
        void hangPaintings_4_1_2() {
            assertTrue(exercises.hangPaintings(4, 1, 2));
        }

        @Test
        @DisplayName("should return true for (3, 2, 10)")
        void hangPaintings_3_2_10() {
            assertTrue(exercises.hangPaintings(3, 2, 10));
        }

        @Test
        @DisplayName("should return true for (6, 1, 11)")
        void hangPaintings_6_1_11() {
            assertTrue(exercises.hangPaintings(6, 1, 11));
        }

        @Test
        @DisplayName("should return false for (3, 2, 9)")
        void hangPaintings_3_2_9() {
            assertFalse(exercises.hangPaintings(3, 2, 9));
        }

        @Test
        @DisplayName("should return false for (1, 4, 12)")
        void hangPaintings_1_4_12() {
            assertFalse(exercises.hangPaintings(1, 4, 12));
        }

        @Test
        @DisplayName("should return false for (20, 0, 21)")
        void hangPaintings_20_0_21() {
            assertFalse(exercises.hangPaintings(20, 0, 21));
        }
    }

    @Nested
    @DisplayName("canParty")
    class CanParty {

        @Test
        @DisplayName("should return \"Don't party\" for (1, false)")
        void canParty_1_f() {
            assertEquals("Don't party", exercises.canParty(1, false));
        }

        @Test
        @DisplayName("should return \"Party till midnight\" for (6, false)")
        void canParty_6_f() {
            assertEquals("Party till midnight", exercises.canParty(6, false));
        }

        @Test
        @DisplayName("should return \"Party till midnight\" for (3, true)")
        void canParty_3_t() {
            assertEquals("Party till midnight", exercises.canParty(3, true));
        }

        @Test
        @DisplayName("should return \"Party all night\" for (5, true)")
        void canParty_5_t() {
            assertEquals("Party all night", exercises.canParty(5, true));
        }
    }
}
