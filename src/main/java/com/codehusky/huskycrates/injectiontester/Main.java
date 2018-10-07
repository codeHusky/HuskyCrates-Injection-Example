package com.codehusky.huskycrates.injectiontester;

import com.codehusky.huskycrates.HuskyCrates;
import com.codehusky.huskycrates.crate.virtual.Item;
import com.codehusky.huskycrates.crate.virtual.Slot;
import com.codehusky.huskycrates.event.CrateInjectionEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.item.ItemTypes;
import org.spongepowered.api.plugin.Dependency;
import org.spongepowered.api.plugin.Plugin;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Plugin(id="hcinjectiontest", name="HuskyCratesInjectionTester", version = "1.0.0", dependencies = {@Dependency(id="huskycrates", version = "2.0.0")})
public class Main {
    @Listener
    public void inject(CrateInjectionEvent event){
        //TODO: replace this with builder pattern once implemented
        Slot testSlot = new Slot(
                new Item( //--// Display Item //--//
                        "&7Test", // Name
                        ItemTypes.GOLDEN_SWORD, // Item Type
                        new ArrayList<>(), // Lore
                        1, // Count
                        0, // Metadata/Damage value
                        0, // Durability value
                        new ArrayList<>(), // Enchantment data
                        new LinkedHashMap() // NBT data
                ), //--// Display Item //--//

                new ArrayList<>(), // Rewards
                new ArrayList<>(), // Reward Groups
                1, // Chance integer
                false, // pickRandom (boolean)
                1, // pickSize
                false // pickUnique
        );
        HuskyCrates.registry.getCrate("injectCrate").injectSlot(testSlot);
    }
}
