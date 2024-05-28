package epv.tecnologia.pos_api.repos;

import epv.tecnologia.pos_api.domain.Imagen;
import epv.tecnologia.pos_api.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImagenRepository extends JpaRepository<Imagen, Long> {

    Imagen findFirstByProducto(Producto producto);

}
