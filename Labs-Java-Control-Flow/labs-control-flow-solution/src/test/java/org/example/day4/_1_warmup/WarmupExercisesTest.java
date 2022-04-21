package org.example.day4._1_warmup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("WarmupExercises tests")
class WarmupExercisesTest {

    private WarmupExercises warmupExercises = new WarmupExercises();

    @Nested
    @DisplayName("isFirstGreaterThanSecond")
    class IsFirstGreaterThanSecond {

        @Test
        @DisplayName("should return false for -2, -1")
        void isFirstGreaterThanSecondCase1() {

            assertFalse(warmupExercises.isFirstGreaterThanSecond(-2, -1));
        }

        @Test
        @DisplayName("should return true for -1, -2")
        void isFirstGreaterThanSecondCase2() {

            assertTrue(warmupExercises.isFirstGreaterThanSecond(-1, -2));
        }

        @Test
        @DisplayName("should return true for 2, 1")
        void isFirstGreaterThanSecondCase3() {

            assertTrue(warmupExercises.isFirstGreaterThanSecond(2, 1));
        }

        @Test
        @DisplayName("should return false for 1, 2")
        void isFirstGreaterThanSecondCase4() {

            assertFalse(warmupExercises.isFirstGreaterThanSecond(1, 2));
        }

        @Test
        @DisplayName("should return false for 0, 0")
        void isFirstGreaterThanSecondCase5() {

            assertFalse(warmupExercises.isFirstGreaterThanSecond(0, 0));
        }

    }

    @Nested
    @DisplayName("equalStrings")
    class EqualStrings {

        @Test
        @DisplayName("should return true for \"\", \"\"")
        void equalStringsCase1() {
            assertTrue(warmupExercises.equalString("",""));
        }

        @Test
        @DisplayName("should return false for \"\", \"test\"")
        void equalStringsCase2() {
            assertFalse(warmupExercises.equalString("","test"));
        }

        @Test
        @DisplayName("should return true for \"test\", \"test\"")
        void equalStringsCase3() {
            assertTrue(warmupExercises.equalString("test","test"));
        }

    }

}