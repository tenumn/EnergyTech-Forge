package tenumn.energytech.item;

import net.minecraft.world.item.Item;
import tenumn.energytech.EnergyTech;

public class ItemBase extends Item {
    public ItemBase(Properties properties) {
        super(properties.tab(EnergyTech.TAB_MAIN));
    }
}
