package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testLevenshteinDistance() {
        // Test de chaînes identiques
        assertEquals(0, StringUtils.levenshteinDistance("test", "test"));

        // Test de chaînes complètement différentes
        assertEquals(4, StringUtils.levenshteinDistance("test", "abcd"));

        // Test de chaînes avec une différence d'un caractère
        assertEquals(1, StringUtils.levenshteinDistance("test", "tent"));
        assertEquals(1, StringUtils.levenshteinDistance("test", "tests"));

        // Test de chaînes avec des différences de case
        assertEquals(1, StringUtils.levenshteinDistance("Test", "test"));

        // Test de chaînes vides
        assertEquals(4, StringUtils.levenshteinDistance("", "test"));
        assertEquals(0, StringUtils.levenshteinDistance("", ""));


    }
}
