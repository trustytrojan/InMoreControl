package mcjty.incontrol.rules;

import net.minecraft.entity.Entity;

import java.util.HashMap;
import java.util.Map;

import mcjty.tools.varia.Tools;

public class EntityModCache {

    private Map<Class, String> cache = new HashMap<>();

    public String getMod(Entity entity) {
        Class<? extends Entity> cls = entity.getClass();
        if (!cache.containsKey(cls)) {
            cache.put(cls, Tools.findModID(cls));
        }
        return cache.get(cls);
    }
}
