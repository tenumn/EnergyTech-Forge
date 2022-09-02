package tenumn.energytech.item;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;

import java.util.logging.Level;

public class ItemEnergyCard extends ItemBase {
    public ItemEnergyCard(Properties properties) {
        super(properties.stacksTo(1));
    }

    public static int getX(ItemStack stack) {
        return stack.getTag().getInt("x");
    }

    public static int getY(ItemStack stack) {
        return stack.getTag().getInt("y");
    }

    public static int getZ(ItemStack stack) {
        return stack.getTag().getInt("z");
    }

    // TODO
    public static ResourceKey<Level> getDimension(ItemStack stack) {
        return null;
    }

    // TODO
    public static boolean isValid() {
        return false;
    }

    public void bind(ItemStack stack, BlockPos pos, String dimension) {
        CompoundTag tag = stack.getTag();
        if (tag == null) tag = new CompoundTag();
        tag.putInt("x", pos.getX());
        tag.putInt("y", pos.getY());
        tag.putInt("z", pos.getZ());
        tag.putString("dimension", dimension);
        stack.setTag(tag);
    }
}