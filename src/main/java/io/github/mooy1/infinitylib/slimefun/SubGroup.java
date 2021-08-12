package io.github.mooy1.infinitylib.slimefun;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;

/**
 * A category that is hidden from the main guide page
 *
 * @author Mooy1
 */
public final class SubGroup extends ItemGroup {

    public SubGroup(String key, ItemStack item) {
        this(key, item, 3);
    }

    public SubGroup(String key, ItemStack item, int tier) {
        super(AbstractAddon.makeKey(key), item, tier);
    }

    @Override
    public boolean isHidden(@Nonnull Player p) {
        return true;
    }

}
