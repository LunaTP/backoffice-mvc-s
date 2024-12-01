package pe.edu.cibertec.backoffice_mvc_s.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.backoffice_mvc_s.entity.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language,Integer> {
}
