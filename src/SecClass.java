public class SecClass {
    public double secMethod(double angle)
    {
        //return 1.0+0.5*angle*angle+5/24*Math.pow(angle,4)+61/720*Math.pow(angle,6)+277/8064*Math.pow(angle,8);
        return 1.0/Math.cos(angle);
    }
}
