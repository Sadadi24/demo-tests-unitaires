package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaisonTest {

    private Maison maison;

    @BeforeEach
    void setUp() {
        maison = new Maison();
    }

    @Test
    void testAjouterPiece() {
        Piece salon = new Salon(3,46.25);
        maison.ajouterPiece(salon);

        Piece[] pieces = maison.getPieces();
        assertNotNull(pieces);
        assertEquals(1, pieces.length);
        assertEquals("Salon", pieces[0].getType());
    }

    @Test
    void testNbPieces() {
        maison.ajouterPiece(new Chambre(1, 30.0));
        maison.ajouterPiece(new SalleDeBain(1,25.5));

        assertEquals(2, maison.nbPieces());
    }

    @Test
    void testSuperficieEtage() {
        maison.ajouterPiece(new Cuisine(0, 20.0));
        maison.ajouterPiece(new WC(1, 10));
        maison.ajouterPiece(new Salon(0, 30));

        assertEquals(45.0, maison.superficieEtage(0), 50.0);
        assertEquals(20.0, maison.superficieEtage(1), 10);
    }}