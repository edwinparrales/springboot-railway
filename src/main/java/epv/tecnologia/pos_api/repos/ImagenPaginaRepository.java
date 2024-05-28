package epv.tecnologia.pos_api.repos;

import epv.tecnologia.pos_api.domain.ImagenPagina;
import epv.tecnologia.pos_api.domain.Pagina;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImagenPaginaRepository extends JpaRepository<ImagenPagina, Long> {

    ImagenPagina findFirstByPagina(Pagina pagina);

}
