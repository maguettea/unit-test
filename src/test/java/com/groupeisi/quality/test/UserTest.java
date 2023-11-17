package com.groupeisi.quality.test;

import com.groupeisi.quality.entities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUserCreation() {
        // Création d'un utilisateur
        User user = new User("Maguette", "Kane", "maguettekanea@gmail.com", "helle@112");

        // Vérification des attributs de l'utilisateur
        assertEquals("Maguette", user.getFirstName());
        assertEquals("Kane", user.getLastName());
        assertEquals("maguettekanea@gmail.com", user.getEmail());
        assertEquals("helle@112", user.getPassword());
    }

    @Test
    public void testSettersAndGetters() {
        // Création d'un utilisateur
        User user = new User();

        // Utilisation des setters pour définir les attributs
        user.setFirstName("Papis");
        user.setLastName("Seck");
        user.setEmail("papis@gmail.com");
        user.setPassword("passer@1");

        // Vérification des valeurs définies par les setters
        assertEquals("Papis", user.getFirstName());
        assertEquals("Seck", user.getLastName());
        assertEquals("papis@gmail.com", user.getEmail());
        assertEquals("passer@1", user.getPassword());
    }
}
