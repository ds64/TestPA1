package Task3;

public class MrProsser {

    private boolean isArguing;
    private boolean lookedAround;
    private boolean isWorried;
    private boolean isSurprised;
    private Health hisHealth;

    public MrProsser(boolean isArguing, boolean lookedAround, boolean isWorried, boolean isSurprised, Health hisHealth)
    {
        this.isArguing = isArguing;
        this.lookedAround = lookedAround;
        this.isWorried = isWorried;
        this.isSurprised = isSurprised;
        this.hisHealth = hisHealth;
    }

    public boolean getIsArguing()
    {
        return isArguing;
    }

    public void setIsArguing(boolean isArguing)
    {
        this.isArguing = isArguing;
    }

    public boolean getLookedAround()
    {
        return lookedAround;
    }

    public void setLookedAround(boolean lookedAround)
    {
        this.lookedAround = lookedAround;
    }

    public boolean getIsWorried()
    {
        return isWorried;
    }

    public void setIsWorried(boolean isWorried)
    {
        this.isWorried = isWorried;
    }

    public boolean getIsSurprised()
    {
        return  isSurprised;
    }

    public void setIsSurprised(boolean isSurprised)
    {
        this.isSurprised = isSurprised;
    }

    public Health getHisHealth()
    {
        return hisHealth;
    }

    public void setHisHealth(Health hisHealth)
    {
        this.hisHealth = hisHealth;
    }
}
