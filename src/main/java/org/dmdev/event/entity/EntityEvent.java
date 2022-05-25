package org.dmdev.event.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.EventObject;
@Getter
@Setter
public class EntityEvent extends EventObject {

    private  AccessType accessType;

    public EntityEvent(Object source, AccessType accessType) {
        super(source);
        this.accessType = accessType;
    }
}
