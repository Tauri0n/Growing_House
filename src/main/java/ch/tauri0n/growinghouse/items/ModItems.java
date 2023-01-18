package ch.tauri0n.growinghouse.items;

import ch.tauri0n.growinghouse.GrowingHouse;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrowingHouse.MODID);

    public static final RegistryObject<Item> UNDOING_TALISMAN = ITEMS.register("undoing_talisman",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    //.tab(CreativeModeTab.TAB_MISC)
                    ));

    @SubscribeEvent
    public static void onRegister(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
