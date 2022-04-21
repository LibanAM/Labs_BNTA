package org.example.day4._4_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Array training tests")
class ArraysExercisesTest {

    private ArraysExercises arraysExercises = new ArraysExercises();

    @Nested
    @DisplayName("firstLast0")
    class FirstLast0 {

        @Test
        @DisplayName("should return true for [0, 1, 2]")
        void firstLast0_0_1_2() {
            int[] array = {0, 1, 2};
            assertTrue(ArraysExercisesTest.this.arraysExercises.firstLast0(array));
        }

        @Test
        @DisplayName("should return true for [0, 0, 0, 0]")
        void firstLast0_0000() {
            int[] array = {0, 0, 0, 0};
            assertTrue(ArraysExercisesTest.this.arraysExercises.firstLast0(array));
        }

        @Test
        @DisplayName("should return true for [5, 66, 0]")
        void firstLast0_5_66_0() {
            int[] array = {5, 66, 0};
            assertTrue(ArraysExercisesTest.this.arraysExercises.firstLast0(array));
        }

        @Test
        @DisplayName("should return false for [7, 8]")
        void firstLast0_7_8() {
            int[] array = {7, 8};
            assertFalse(ArraysExercisesTest.this.arraysExercises.firstLast0(array));
        }

        @Test
        @DisplayName("should return false for []")
        void firstLast0_empty() {
            int[] array = {};
            assertFalse(ArraysExercisesTest.this.arraysExercises.firstLast0(array));
        }
    }

    @Nested
    @DisplayName("middleInts")
    class MiddleInts {

        @Test
        @DisplayName("should return [26, 34] for [5, 26, 19], [1, 34, 22]")
        void middleInts1() {
            int[] a = {5, 26, 19};
            int[] b = {1, 34, 22};
            int[] result = {26, 34};
            assertArrayEquals(result, arraysExercises.middleInts(a, b));
        }

        @Test
        @DisplayName("should return [99, 20] for [11, 99, 5], [100, 20, 14]")
        void middleInts2() {
            int[] c = {11, 99, 5};
            int[] d = {100, 20, 14};
            int[] result = {99, 20};
            assertArrayEquals(result, arraysExercises.middleInts(c, d));
        }

        @Test
        @DisplayName("should return [7, 17] for [7, 7, 7], [44, 17, 56]")
        void middleInts3() {
            int[] e = {7, 7, 7};
            int[] f = {44, 17, 56};
            int[] result = {7, 17};
            assertArrayEquals(result, arraysExercises.middleInts(e, f));
        }

    }

    @Nested
    @DisplayName("reverse")
    class Reverse {

        @Test
        @DisplayName("should return {\"hello\", \"how\", \"are\", \"you\"} for {\"you\", \"are\", \"how\", \"hello\"}")
        void reverseAllStrings() {

            String[] baseArr = {"you", "are", "how", "hello"};
            String[] reversedArr = {"hello", "how", "are", "you"};

            assertArrayEquals(reversedArr, arraysExercises.reverse(baseArr));
        }

        @Test
        @DisplayName("should return {\"me\", null, \"you\"} for \"you\", null, \"me\"")
        void reverseWithNulls() {
            String[] baseArr = {"me", null, "you", null};
            String[] reversedArr = {null, "you", null, "me"};

            assertArrayEquals(reversedArr, arraysExercises.reverse(baseArr));
        }

    }


    @Nested
    @DisplayName("sum")
    class Sum {

        @Test
        @DisplayName("should return 15 for [3, 4, 8]")
        void sum_3_4_8() {
            int[] nums = {3, 4, 8};
            assertEquals(15, arraysExercises.sum(nums));
        }

        @Test
        @DisplayName("should return 92 for [12, 80]")
        void sum_12_80() {
            int[] nums = {12, 80};
            assertEquals(92, arraysExercises.sum(nums));
        }

        @Test
        @DisplayName("should return 16 for [3, 3, 5, 5]")
        void sum_3_3_5_5() {
            int[] nums = {3, 3, 5, 5};
            assertEquals(16, arraysExercises.sum(nums));
        }

        @Test
        @DisplayName("should return 4 for [4]")
        void sum_4() {
            int[] nums = {4};
            assertEquals(4, arraysExercises.sum(nums));
        }

        @Test
        @DisplayName("should return 0 for []")
        void sum_0() {
            int[] nums = {};
            assertEquals(0, arraysExercises.sum(nums));
        }
    }

    @Nested
    @DisplayName("isBalanced")
    class IsBalanced {


        @Test
        @DisplayName("should return true for [1, 3, 2, 2]")
        void isBalanced_1_3_2_2() {
            int[] nums = {1, 3, 2, 2};
            assertTrue(arraysExercises.isBalanced(nums));
        }

        @Test
        @DisplayName("should return true for [5, 5]")
        void isBalanced_5_5() {
            int[] nums = {5, 5};
            assertTrue(arraysExercises.isBalanced(nums));
        }

        @Test
        @DisplayName("should return true for [8, 0, 2, -2, 8]")
        void isBalanced_8_0_2_2_8() {
            int[] nums = {8, 0, 2, -2, 8};
            assertTrue(arraysExercises.isBalanced(nums));
        }

        @Test
        @DisplayName("should return false for [30]")
        void isBalanced_30() {
            int[] nums = {30};
            assertFalse(arraysExercises.isBalanced(nums));
        }

        @Test
        @DisplayName("should return false for [2, 3, 4, 1, 2]")
        void isBalanced_2_3_4_1_2() {
            int[] nums = {2, 3, 4, 1, 2};
            assertFalse(arraysExercises.isBalanced(nums));
        }
    }

    @Nested
    @DisplayName("diff")
    class Diff {


        @Test
        @DisplayName("should return 9 for [10, 5, 8, 1, 4]")
        void diff_10_5_8_1_4() {
            int[] nums = {10, 5, 8, 1, 4};
            assertEquals(9, arraysExercises.diff(nums));
        }

        @Test
        @DisplayName("should return 3 for [5, 4, 6, 7]")
        void diff_5_4_6_7() {
            int[] nums = {5, 4, 6, 7};
            assertEquals(3, arraysExercises.diff(nums));
        }

        @Test
        @DisplayName("should return 0 for [6, 6]")
        void diff_6_6() {
            int[] nums = {6, 6};
            assertEquals(0, arraysExercises.diff(nums));
        }

        @Test
        @DisplayName("should return 14 for [-5, 3, 9]")
        void diff_5_3_9() {
            int[] nums = {-5, 3, 9};
            assertEquals(14, arraysExercises.diff(nums));
        }
    }

    @Nested
    @DisplayName("countGroups")
    class CountGroups {

        @Test
        @DisplayName("should return 2 for [1, 2, 2, 3, 4, 4]")
        void countGroups_122344() {
            int[] array = {1, 2, 2, 3, 4, 4};
            assertEquals(2, ArraysExercisesTest.this.arraysExercises.countGroups(array));
        }

        @Test
        @DisplayName("should return 2 for [3, 3, 6, 3, 3]")
        void countGroups_33633() {
            int[] array={3, 3, 6, 3, 3};
            assertEquals(2, ArraysExercisesTest.this.arraysExercises.countGroups(array));
        }

        @Test
        @DisplayName("should return 1 for [5, 5, 5, 5, 5]")
        void countGroups_55555() {
            int[] array={5, 5, 5, 5, 5};
            assertEquals(1, ArraysExercisesTest.this.arraysExercises.countGroups(array));
        }

        @Test
        @DisplayName("should return 0 for []")
        void countGroups_empty() {
            int[] array={};
            assertEquals(0, ArraysExercisesTest.this.arraysExercises.countGroups(array));
        }

        @Test
        @DisplayName("should return 0 for [5, 3, 6, 2, 4]")
        void countGroups_53624() {
            int[] array={5, 3, 6, 2, 4};
            assertEquals(0, ArraysExercisesTest.this.arraysExercises.countGroups(array));
        }
    }

    @Nested
    @DisplayName("innerInside")
    class InnerInside {

        @Test
        @DisplayName("should return true for [5, 6, 7, 4, 3, 3], [6, 4]")
        void innerInside_ab() {
            int[] a = {5, 6, 7, 4, 3, 3};
            int[] b = {6, 4};
            assertTrue(arraysExercises.innerInside(a, b));
        }

        @Test
        @DisplayName("should return true for [3, 3, 5, 5, 6, 6], [5, 3]")
        void innerInside_cd() {
            int[] c = {3, 3, 5, 5, 6, 6};
            int[] d = {5, 3};
            assertTrue(arraysExercises.innerInside(c, d));
        }

        @Test
        @DisplayName("should return true for [-1, 2, 3, 2], [3]")
        void innerInside_ef() {
            int[] e = {-1, 2, 3, 2};
            int[] f = {3};
            assertTrue(arraysExercises.innerInside(e, f));
        }

        @Test
        @DisplayName("should return true for [2, 5], [2, 5]")
        void innerInside_gh() {
            int[] g = {2, 5};
            int[] h = {2, 5};
            assertTrue(arraysExercises.innerInside(g, h));
        }

        @Test
        @DisplayName("should return false for [5, 4, 6, 32, 5], [4, 8]")
        void innerInside_ij() {
            int[] i = {5, 4, 6, 32, 5};
            int[] j = {4, 8};
            assertFalse(arraysExercises.innerInside(i, j));
        }

        @Test
        @DisplayName("should return false for [], [5]")
        void innerInside_mn() {
            int[] m = {};
            int[] n = {5};
            assertFalse(arraysExercises.innerInside(m, n));
        }
    }
}
