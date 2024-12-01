package pe.edu.cibertec.backoffice_mvc_s.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.backoffice_mvc_s.entity.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film,Integer> {
}
