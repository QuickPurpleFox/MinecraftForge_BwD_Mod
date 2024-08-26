package net.chinifox.beyondthewesterndeep.item;

import net.chinifox.beyondthewesterndeep.BeyondTheWesternDeepMod;
import net.chinifox.beyondthewesterndeep.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeyondTheWesternDeepMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("western_deep_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SILVERCOIN.get()))
            .title(Component.translatable("creativetab.western_deep_tab")).displayItems((itemDisplayParameters, output) -> {
                //items
                output.accept(ModItems.SILVERCOIN.get());
                output.accept(ModItems.SILVER.get());
                //blocks
                output.accept(ModBlocks.SILVER_ORE.get());
            })
            .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
