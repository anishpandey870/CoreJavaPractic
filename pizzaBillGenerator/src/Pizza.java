public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesPrice=100;
    private int extraTopingPrice=150;
    private int takeWayPrice=20;
    private int basePizzaPrice;
    private boolean isExtraChees = false;
    private boolean isExtraToping =false;
    private boolean isTakeAway =false;

    public Pizza(boolean veg) {
       this.veg=veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        this.basePizzaPrice= price;
    }

    public void addExtraChees(){
        isExtraChees=true;
      this.price +=extraCheesPrice;
    }
    public void addExtraToping(){
        isExtraToping=true;
     this.price +=extraTopingPrice;
    }
    public void takeAway(){
        isTakeAway=true;
        this.price +=takeWayPrice;
    }
    public void getBill(){
        String bill="";
        System.out.println("price of pizz :"+basePizzaPrice);
        if(isExtraChees){
            bill +="this add here exta chees :"+extraCheesPrice+"\n";
        }
        if(isExtraToping){
            bill +="this add here exta chees :"+extraTopingPrice+"\n";
        }
        if(isTakeAway){
            bill +="this add here exta chees :"+takeWayPrice+"\n";
        }
        bill += "bill :"+ this.price+"\n";
        System.out.println(bill);
    }
}
