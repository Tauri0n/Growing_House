package ch.tauri0n.growinghouse.blocks;

import ch.tauri0n.growinghouse.GrowingHouse;
import ch.tauri0n.growinghouse.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowingHouse.MODID);

    //public static final RegistryObject<Block> HOUSE_SAPLING = registerBlock("house_sapling", HouseSapling::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> result = BLOCKS.register(name, block);
        return result;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    @SubscribeEvent
    public static void onRegister(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
