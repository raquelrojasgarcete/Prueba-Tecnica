
package net.api.service.jpa;

import java.util.List;
import net.api.entity.Envios;
import net.api.repository.EnviosRepository;
import net.api.service.IEnviosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Informatica
 */
@Service
public class EnviosService implements IEnviosService{

    @Autowired
    private EnviosRepository repoenvios;
    
    @Override
    public List<Envios> buscarTodos() {
        return repoenvios.findAll();
    }

    @Override
    public void guardar(Envios envios) {
        repoenvios.save(envios);
    }

    @Override
    public void eliminar(int idenvios) {
        repoenvios.deleteById(idenvios);
    }
    
}
