package net.chinifox.beyondthewesterndeep.datagen;

import net.chinifox.beyondthewesterndeep.BeyondTheWesternDeepMod;
import net.chinifox.beyondthewesterndeep.Util.ModTags;
import net.chinifox.beyondthewesterndeep.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider
{

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BeyondTheWesternDeepMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        //this.tag(ModTags.Blocks.[smth]) //add block
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.SILVER_ORE.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.SILVER_ORE.get());
    }
}
