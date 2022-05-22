package org.dmdev.event.entity;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EntityListener {

    @EventListener(condition = "#root.args[0].accessType.name() == 'VIEW'")
    public void entityListener(EntityEvent entityEvent) {
        System.out.println("event " + entityEvent);
    }
}
