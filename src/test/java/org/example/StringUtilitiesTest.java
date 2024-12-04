package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilitiesTest {
    StringUtilities stringUtilities;

    @BeforeEach
    void setUp(){
        stringUtilities = new StringUtilities();
    }

    @Test
    @DisplayName("Odwracanie")
    void reverseInputString(){
        assertEquals("retsewlys", stringUtilities.reverseInputString("sylwester"));
    }

    @Test
    @DisplayName("Usuwanie białych znaków")
    void spaceDelete(){
        assertEquals("alamakota", stringUtilities.spaceDelete("ala ma kota"));
    }

    @Test
    @DisplayName("Czy słowo jest palindromem")
    void validPalindrome(){
        assertEquals(true, stringUtilities.validPalindrome("kajak"));
    }

    @Test
    @DisplayName("lowerCamel")
    void lowerCamel(){
        assertEquals("jaJestemBardzoDobrymProgramistą", stringUtilities.lowerCamel("Ja jestem bardzo dobrym programistą"));
    }

    @Test
    @DisplayName("usuwanie spacji przed i po wyrazie")
    void pureWord(){
        assertEquals("Komputer", stringUtilities.pureWord("    Komputer      "));
    }

    @Test
    @DisplayName("czy ciąg znaków zawiera inny ciąg znaków")
    void ifContains(){
        assertEquals(true, stringUtilities.ifContains("Telefon komórkowy", "telefon"));
    }
}