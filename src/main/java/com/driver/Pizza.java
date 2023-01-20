package com.driver;

public class Pizza {
    private int ExtraCheese = 0;
   private int ExtraToppings = 0;
   private int TakeAway = 0;

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) price = 300;
        else price  = 400;

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        ExtraCheese++;
        if(ExtraCheese == 1) {
            price += 80;
        }
    }

    public void addExtraToppings(){
        ExtraToppings++;
        if(ExtraToppings == 1) {
            if (isVeg) {
                price += 70;

            } else {
                price += 120;

            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        TakeAway++;
        if(TakeAway ==1) {
            price += 20;
        }
    }

    public String getBill(){
        String basePrice = "" , ExCheese = "" , ExTop = "" , take = "", total = "";

        if(isVeg) {
            basePrice =  "Base Price Of The Pizza: 300";
            bill = basePrice;
        }else {
            basePrice ="Base Price Of The Pizza: 400";
            bill = basePrice;
        }

        if(ExtraCheese >= 1){
            ExCheese = "Extra Cheese Added: 80";
            bill += "\n" + ExCheese;
        }

        if(ExtraToppings >= 1){
            if(isVeg){
                ExTop = "Extra Toppings Added: 70";
                bill += "\n" + ExTop;
            }else{
                ExTop = "Extra Toppings Added: 120";
                bill += "\n" + ExTop;
            }
        }

        if(TakeAway >= 1){
            take = "Paperbag Added: 20";
            bill += "\n" + take;
        }


        String s = String.valueOf(price);
        bill += "\n" + "Total Price: "+s + "\n";

        return this.bill;
    }
}
