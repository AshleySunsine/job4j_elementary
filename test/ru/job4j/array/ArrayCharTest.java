package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
public class ArrayCharTest {
    @Test
        public void whenStartWithPrefixIsTrue() {
        char[] word = new char[] {'q', 'u', 'a', 'n', 't', 'i', 't', 'y'};
        char[] pref = new char[] {'q', 'u', 'a', 'n', 't'};
        boolean out = ArrayChar.startsWith(word, pref);
        assertThat(out, is(true));
}

    @Test
        public void whenStartWithPrefixIsFalse() {
        char[] word = new char[] {'q', 'u', 'a', 'n', 't', 'i', 't', 'y'};
        char[] pref = new char[] {'q', 'u', 'e', 'e', 'n'};
        boolean out = ArrayChar.startsWith(word, pref);
        assertThat(out, is(false));
    }
}