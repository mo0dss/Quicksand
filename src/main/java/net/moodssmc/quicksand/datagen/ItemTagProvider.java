package net.moodssmc.quicksand.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.moodssmc.quicksand.Reference;
import net.moodssmc.quicksand.core.ModBlocks;
import net.moodssmc.quicksand.core.ModTags;
import org.jetbrains.annotations.Nullable;

public class ItemTagProvider extends ItemTagsProvider
{
    public ItemTagProvider(DataGenerator generator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(generator, blockTagsProvider, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        this.tag(Tags.Items.SAND_COLORLESS).add(ModBlocks.QUICKSAND.get().asItem());
        this.tag(Tags.Items.SAND_RED).add(ModBlocks.RED_QUICKSAND.get().asItem());

        this.tag(ModTags.QUICKSAND_IMMUNE_WEARABLES).add(Items.LEATHER_BOOTS);
    }
}
