package ch.tauri0n.growinghouse.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class HouseSapling extends SaplingBlock {
    public HouseSapling() {
        super(null , BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING));
    }

}
