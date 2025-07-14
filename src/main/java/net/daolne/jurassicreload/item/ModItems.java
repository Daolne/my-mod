package net.daolne.jurassicreload.item;

import net.daolne.jurassicreload.JurassicReloadMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JurassicReloadMod.MOD_ID);

    public static final RegistryObject<Item> EMPTY_SYRINGE = ITEMS.register("empty_syringe",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMBER_CANE = ITEMS.register("amber_cane",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
