package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas150Then0() {
        int[] data = new int[] {16, 1055, 468, 444, 79984, 1134, 774, 150};
        int el = 150;
        int result = FindLoop.indexOf(data, el);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot11henMinus1() {
        int[] data = new int[] {5, 10, 3};
        int el = 11;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}