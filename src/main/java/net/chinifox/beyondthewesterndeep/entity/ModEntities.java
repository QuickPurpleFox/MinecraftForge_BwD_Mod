package net.chinifox.beyondthewesterndeep.entity;

import net.chinifox.beyondthewesterndeep.BeyondTheWesternDeepMod;
import net.chinifox.beyondthewesterndeep.entity.custom.CanidEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BeyondTheWesternDeepMod.MOD_ID);

    public static final RegistryObject<EntityType<CanidEntity>> CANID = ENTITY_TYPES.register("canid", () -> EntityType.Builder.of(CanidEntity::new, MobCategory.MISC).sized(1f, 2f).build("canid"));

    public static void register(IEventBus eventBus)
    {
        ENTITY_TYPES.register(eventBus);
    }
}
