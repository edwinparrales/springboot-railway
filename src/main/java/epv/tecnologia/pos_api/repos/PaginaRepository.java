package epv.tecnologia.pos_api.repos;

import epv.tecnologia.pos_api.domain.CategoriaPagina;
import epv.tecnologia.pos_api.domain.Pagina;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaginaRepository extends JpaRepository<Pagina, Long> {

    Pagina findFirstByCategoria(CategoriaPagina categoriaPagina);

}
