package tenumn.energytech;

import com.mojang.logging.LogUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.slf4j.Logger;
import tenumn.energytech.data.ItemModelGenerator;
import tenumn.energytech.data.LanguageGenerator;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EnergyTech.ID)
@Mod.EventBusSubscriber(modid = EnergyTech.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnergyTech {
    public static final String ID = "energytech";
    public static final String NAME = "EnergyTech";
    public static final CreativeModeTab TAB_MAIN = new CreativeModeTab(EnergyTech.ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.energy_card.get());
        }
    };
    private static final Logger LOGGER = LogUtils.getLogger();

    public EnergyTech() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(modEventBus);
    }

    @SubscribeEvent
    public static void dataGen(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new ItemModelGenerator(generator, existingFileHelper));
        generator.addProvider(new LanguageGenerator(generator));
    }
}