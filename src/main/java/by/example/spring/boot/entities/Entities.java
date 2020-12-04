package by.example.spring.boot.entities;

import by.example.spring.boot.entity.Entity;
import by.example.spring.boot.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Entities {

    @Autowired
    private EntityService entityService;

    //get request
    @RequestMapping("/entities")
    public List<Entity> findEntities() {
        return entityService.returnAllEntities();
    }

    //get request
    @RequestMapping("/entities/{id}")
    public Entity findEntityById(@PathVariable String id) {
        return entityService.returnEntity(id);
    }

    //post request
    @RequestMapping(method = RequestMethod.POST, value = "/entities")
    public void addEntity(@RequestBody Entity entity) {
        entityService.addEntity(entity);
    }

    //post request
    @RequestMapping(method = RequestMethod.PUT, value = "/entities/{id}")
    public void updateEntity(@RequestBody Entity entity, @PathVariable String id) {
        entityService.updateEntity(entity, id);
    }

    //post request
    @RequestMapping(method = RequestMethod.DELETE, value = "/entities/{id}")
    public void deleteEntity(@PathVariable String id) {
        entityService.deleteEntity(id);
    }
}
