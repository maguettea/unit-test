package com.groupeisi.quality.dao;

import com.groupeisi.quality.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Méthodes supplémentaires si nécessaire
}
