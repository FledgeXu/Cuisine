package snownee.cuisine.api.process;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public final class Hybridization implements IdentityBasedProcessingRecipe
{
    private String id;
    private final List<IBlockState> statesA;
    private final List<IBlockState> statesB;
    private final IBlockState resultState;
    private final List<ItemStack> displayItemsA;
    private final List<ItemStack> displayItemsB;
    private final List<ItemStack> displayResultItems;

    public Hybridization(List<IBlockState> statesA, List<IBlockState> statesB, IBlockState resultState, List<ItemStack> displayItemsA, List<ItemStack> displayItemsB, List<ItemStack> displayResultItems)
    {
        this.statesA = statesA;
        this.statesB = statesB;
        this.resultState = resultState;
        this.displayItemsA = displayItemsA;
        this.displayItemsB = displayItemsB;
        this.displayResultItems = displayResultItems;
    }

    @Override
    public boolean matches(Object... inputs)
    {
        return inputs.length == 2 && statesA.contains(inputs[0]) && statesB.contains(inputs[1]);
    }

    public List<ItemStack> getDisplayItemsA()
    {
        return displayItemsA;
    }

    public List<ItemStack> getDisplayItemsB()
    {
        return displayItemsB;
    }

    public List<ItemStack> getDisplayResultItems()
    {
        return displayResultItems;
    }

    public List<IBlockState> getStatesA()
    {
        return statesA;
    }

    public List<IBlockState> getStatesB()
    {
        return statesB;
    }

    public IBlockState getResultState()
    {
        return resultState;
    }

    @Override
    public void setID(String id)
    {
        this.id = id;
    }

    @Override
    public String getID()
    {
        return id;
    }

}
