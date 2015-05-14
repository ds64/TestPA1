package Task3;

public class ArturDent {
    private boolean isDanger;
    private boolean hasAccomplice;

    public ArturDent(boolean isDanger, boolean hasAccomplice)
    {
        this.isDanger = isDanger;
        this.hasAccomplice = hasAccomplice;
    }

    public boolean getIsDanger()
    {
        return isDanger;
    }

    public void setIsDanger(boolean isDanger)
    {
        this.isDanger = isDanger;
    }

    public boolean getHasAccomplice()
    {
        return hasAccomplice;
    }

    public void setHasAccomplice(boolean hasAccomplice)
    {
        this.hasAccomplice = hasAccomplice;
    }
}
