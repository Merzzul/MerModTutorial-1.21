package com.merzzul.mermod.item;

import com.merzzul.mermod.MerMod;
import com.merzzul.mermod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MerMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MER_TAB = CREATIVE_MODE_TABS.register("mer_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CTUXORIUM.get()))
                    .title(Component.translatable("creativetab.mermod_tab"))
                    .displayItems((pParametrs, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.CTUXORIUM.get());
                        pOutput.accept(Items.DIAMOND);
                        pOutput.accept(ModBlocks.CTUXORIUM_BLOCK.get());
                    })
                    .build());

    public static void registres(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}