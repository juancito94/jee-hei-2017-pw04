package hei.tp04.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import hei.tp04.core.entity.Produit;

public interface ProduitDAO extends JpaRepository<Produit, Long> {
}
