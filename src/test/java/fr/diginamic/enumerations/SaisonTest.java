package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SaisonTest {

    @Test
    void testValueOfLibelleNominal() {
        // Cas nominaux
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
       assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
       assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
       assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
    }

    @Test
    void testValueOfLibelleCasLimite() {
        // Cas aux limites
        assertNull(Saison.valueOfLibelle("printemps")); // mauvaise casse
        assertNull(Saison.valueOfLibelle("Été")); // accent différent
        assertNull(Saison.valueOfLibelle("")); // chaîne vide
        assertNull(Saison.valueOfLibelle("été")); // casse incorrecte
        assertNull(Saison.valueOfLibelle("Saison inexistante")); // libellé inexistant
    }
}
