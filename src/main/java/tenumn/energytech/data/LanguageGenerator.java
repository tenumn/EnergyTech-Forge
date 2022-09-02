package tenumn.energytech.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import org.apache.commons.lang3.StringUtils;
import tenumn.energytech.EnergyTech;
import tenumn.energytech.ModItems;

public class LanguageGenerator extends LanguageProvider {

    public LanguageGenerator(DataGenerator gen) {
        super(gen, EnergyTech.ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + EnergyTech.ID, EnergyTech.NAME);

        ModItems.ITEMS.getEntries().forEach(item -> {
            String[] strings = item.get().toString().split("_");
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < strings.length; i++) {
                name.append(StringUtils.capitalize(strings[i])).append(i != strings.length - 1 ? " " : "");
            }
            add(item.get(), name.toString());
        });
    }
}
