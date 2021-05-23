package tomaszjh.expandedreactors.config;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.*;
import net.minecraftforge.fml.client.config.DummyConfigElement.*;
import net.minecraftforge.fml.client.config.GuiConfigEntries.*;

import tomaszjh.expandedreactors.refrence.Refrence;
import tomaszjh.expandedreactors.util.Lang;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ERConfigGuiFactory implements IModGuiFactory {


    @Override
    public void initialize(Minecraft minecraftInstance) {

    }
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return ERGuiConfig.class;
    }

    public static class ERGuiConfig extends GuiConfig {


        public ERGuiConfig(GuiScreen parentScreen) {
            super(parentScreen, getConfigElements(), Refrence.MOD_ID, false, false, "Test");
        }

        private static List<IConfigElement> getConfigElements() {
            List<IConfigElement> list = new ArrayList<>();
            list.add(categoryElement(ERConfig.CATEGORY_EXPERIMENTAL, CategoryEntryExperimental.class));
            return list;
        }

        private static DummyCategoryElement categoryElement(String categoryName, Class<? extends IConfigEntry> categoryClass){
            return new DummyCategoryElement(Lang.localise("gui.er.config.category." + categoryName), "gui.er.config.category." + categoryName, categoryClass);
        }

        public static class CategoryEntryExperimental extends CategoryEntry implements IConfigCategory  {
            public CategoryEntryExperimental(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
                super(owningScreen, owningEntryList, configElement);
            }
        }
    }

    @Override
    public boolean hasConfigGui() {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen parentScreen) {
        return null;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }
}
