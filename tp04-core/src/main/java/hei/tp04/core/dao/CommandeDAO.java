package hei.tp04.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import hei.tp04.core.entity.Commande;

public interface CommandeDAO extends JpaRepository<Commande, Long> {
}
