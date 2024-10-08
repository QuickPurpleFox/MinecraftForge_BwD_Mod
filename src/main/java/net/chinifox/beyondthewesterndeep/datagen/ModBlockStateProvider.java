package net.chinifox.beyondthewesterndeep.datagen;

import net.chinifox.beyondthewesterndeep.BeyondTheWesternDeepMod;
import net.chinifox.beyondthewesterndeep.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider
{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BeyondTheWesternDeepMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(ModBlocks.SILVER_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
