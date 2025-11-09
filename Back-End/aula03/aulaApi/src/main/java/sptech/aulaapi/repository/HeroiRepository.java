package sptech.aulaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.aulaapi.model.Heroi;

public interface HeroiRepository extends JpaRepository<Heroi, Integer> {
}
