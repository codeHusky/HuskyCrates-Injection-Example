package com.codehusky.huskycrates.injectiontester;

import com.codehusky.huskycrates.HuskyCrates;
import com.codehusky.huskycrates.crate.virtual.Item;
import com.codehusky.huskycrates.crate.virtual.Slot;
import com.codehusky.huskycrates.event.CrateInjectionEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.item.ItemTypes;
import org.spongepowered.api.plugin.Dependency;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id="hcinjectiontest", name="HuskyCratesInjectionTester", version = "1.0.0", dependencies = {@Dependency(id="huskycrates", version = "2.0.0")})
public class Main {
    @Listener
    public void inject(CrateInjectionEvent event){
        Slot testSlot = new Slot(new Item("&7Test", ItemTypes.GOLDEN_SWORD,null,1,null,null,null,null),null,null,1,null,null,null);
        HuskyCrates.registry.getCrate("injectCrate").injectSlot(testSlot);
    }
}
