
package net.api.service;

import java.util.List;
import net.api.entity.Envios;

/**
 *
 * @author Informatica
 */
public interface IEnviosService {
    List<Envios> buscarTodos();
    void guardar(Envios envios);
    void eliminar(int idenvios);

}
