package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenPostAndFinishTrue() {
        char[] word = {'a', 'u', 't', 'u', 'm', 'n'};
        char[] post = {'u', 'm', 'n'};
        assertThat(EndsWith.endsWith(word, post), is(true));
    }

    @Test
    public void whenPostAndFinishIsFalse() {
        char[] word = {'a', 'u', 't', 'u', 'm', 'n'};
        char[] post = {'u', 'n', 'o'};
        assertThat(EndsWith.endsWith(word, post), is(false));
    }
}