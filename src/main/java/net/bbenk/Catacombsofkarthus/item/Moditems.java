package net.bbenk.Catacombsofkarthus.item;

import net.bbenk.Catacombsofkarthus.Catacombsofkarthus;
import net.bbenk.Catacombsofkarthus.item.custom.DataTabletItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Catacombsofkarthus.MODID);

    public static final RegistryObject<Item> TRACEOFDEATH = ITEMS.register("traceofdeath",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUNTRESSBOW = ITEMS.register("huntressbow",
            () -> new BowItem(new Item.Properties().durability(888)));
    //Edit texture to add voxel on ends of bow
    //Potentially add circle to bow texture
    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet",
            () -> new DataTabletItem(new Item.Properties().stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
