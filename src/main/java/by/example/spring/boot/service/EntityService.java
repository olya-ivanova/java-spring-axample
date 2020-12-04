package by.example.spring.boot.service;

import by.example.spring.boot.entity.Entity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EntityService {

    private List<Entity> entities = new ArrayList<>(Arrays.asList(
            new Entity("one", "Java"),
            new Entity("two", "JavaScript"),
            new Entity("three", "Python"),
            new Entity("four", "C++"),
            new Entity("five", "Ruby")
    ));

    public List<Entity> returnAllEntities() {
        return entities;
    }

    public Entity returnEntity(String id) {
        return entities.stream().filter(e -> e.getId().equals(id)).findFirst().get();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public void updateEntity(Entity entity, String id) {
        for (int i = 0; i < entities.size(); i++) {
            Entity e = entities.get(i);
            if (e.getId().equals(id)) {
                entities.set(i, entity);
            }
        }
    }

    public void deleteEntity(String id) {
        entities.removeIf(e -> e.getId().equals(id));
    }
}
