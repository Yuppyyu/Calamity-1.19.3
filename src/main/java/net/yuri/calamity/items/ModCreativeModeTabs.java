package net.yuri.calamity.items;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yuri.calamity.Calamity;


@Mod.EventBusSubscriber(modid = Calamity.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab calamity;
    @SubscribeEvent
    public static void registerCreativeModeTab(CreativeModeTabEvent.Register event) {
        calamity = event.registerCreativeModeTab(new ResourceLocation(Calamity.MOD_ID, "calamity"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get())).title(Component.translatable("creativemodtab.calamity")));
    }
}
