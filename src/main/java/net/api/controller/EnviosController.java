
package net.api.controller;

import java.util.List;
import net.api.entity.Envios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.api.service.IEnviosService;

/**
 *
 * @author Informatica
 */
@RestController
@RequestMapping("/api")
public class EnviosController {
    @Autowired
    private IEnviosService service;
    
    @GetMapping("/envios")
    public List<Envios> buscarTodas(){
       return service.buscarTodos();
        
    }
    
    @PostMapping("/envios")
    public Envios guardar(@RequestBody Envios envios){
        service.guardar(envios);        
        return envios;
    }
    
    @PutMapping("/envios")
    public Envios modificar(@RequestBody Envios envios){
        service.guardar(envios);
        return envios;
    }
    
    @DeleteMapping("/envios/{id}")
    public String eliminar(@PathVariable("id") int idenvios){
        service.eliminar(idenvios);
        return "Registro Elimando";
    }
}
