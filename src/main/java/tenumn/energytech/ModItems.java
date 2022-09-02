package tenumn.energytech;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tenumn.energytech.item.ItemBase;
import tenumn.energytech.item.ItemEnergyCard;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EnergyTech.ID);

    public static final RegistryObject<ItemEnergyCard> energy_card = ITEMS.register("energy_card", () -> new ItemEnergyCard(new Item.Properties()));
    public static final RegistryObject<ItemBase> copper_plate = ITEMS.register("copper_plate",() -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<ItemBase> iron_plate = ITEMS.register("iron_plate",() -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<ItemBase> steel_plate = ITEMS.register("steel_plate",() -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<ItemBase> gold_plate = ITEMS.register("gold_plate",() -> new ItemBase(new Item.Properties()));
}