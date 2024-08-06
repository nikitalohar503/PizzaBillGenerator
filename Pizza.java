package com.beginsjava;

public class Pizza {

    private int price;
    private Boolean veg ;
    private int extracheese =100;
    private int extratoppings=150;
    private int bagpack=40;
    private int basePizzaPrice;
    private  boolean isExtracheese = false;
    private boolean isExtraTopping=false;
    private boolean isOptedForTakeaway=false;


    public Pizza(Boolean veg) {
        this.veg = veg;

        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }

        basePizzaPrice=this.price;
    }

    public void addExtraCheese(){
        isExtracheese=true;
        System.out.println("extra cheese added");
        this.price += extracheese;

    }

    public void addExtraToppings(){
        isExtraTopping=true;
        System.out.println("extra topping added");
        this.price += extratoppings;

    }
    public void takeAway(){
        isOptedForTakeaway=true;
        System.out.println("take away opted");
        this.price += bagpack;
    }

    public void getBill(){
        String bill= "";
        System.out.println("pizza : "+ basePizzaPrice);

        if(isExtracheese){
            bill += "extra cheese added:" + extracheese + "\n";
        }

        if(isExtraTopping){
            bill += "extra toppings added: " + extratoppings + "\n";
        }

        if(isOptedForTakeaway){
            bill += "take away here:  "+  bagpack;
        }

        bill += "Bill: "+ this.price +"\n";
        System.out.println(bill);
    }

//    public void getPizzaprice(){
//        System.out.println(this.price);
//    }
}
