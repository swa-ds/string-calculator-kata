package de.doubleslash.kata;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayNameGeneration(ReplaceUnderscores.class)
class StringCalculatorTest {

    @Test
    void some_test() {
        assertThat(true).isTrue();
    }

}
