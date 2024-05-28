package epv.tecnologia.pos_api.repos;

import epv.tecnologia.pos_api.domain.Categoria;
import epv.tecnologia.pos_api.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Producto findFirstByCategoria(Categoria categoria);

    boolean existsByCodigoIgnoreCase(String codigo);

}
