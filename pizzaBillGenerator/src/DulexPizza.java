public class DulexPizza  extends Pizza{

    public DulexPizza(boolean veg) {
        super(veg);
        super.addExtraChees();
        super.addExtraToping();
    }
}
