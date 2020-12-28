package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void monoHorizontalHasAt1() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean out = MatrixCheck.monoHorizontal(input, 1);
        assertThat(true, is(out));
    }

    @Test
    public void monoHorizontalHasAt2() {
        char[][] input = {
                {'X', 'X', 'g'},
                {'t', 't', 't'},
                {'X', 'X', 'X'},
        };
        boolean out = MatrixCheck.monoHorizontal(input, 2);
        assertThat(true, is(out));
    }

    //_____________________________/* VERTICAL TEST*/____________________________________
    @Test
    public void whenHasMonoVerticalHasAt2() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));

    }

    @Test
    public void whenHasMonoVerticalHasAt1() {
        char[][] input = {
                {'e', 'X', 'X'},
                {'y', 'X', '0'},
                {'X', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 1);
        assertThat(result, is(true));
    }
}