package com.example.android.justjava2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price =calculatePrice();
        String priceMessage= createOrderSummary(price);
        displayMessage(priceMessage);

    }

    public void increment(View view) {

        quantity=quantity+1;
        displayQuantity(quantity);

    }

    /**
     *This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity=quantity-1;
        displayQuantity(quantity);

    }

    //calculate the price of the order method is defined here
    //@return total price
    //or we can write (return quantity*5)
private int calculatePrice(){

    int price=quantity *5 ;
    return price;

}
private String createOrderSummary(int price){
    String priceMessage="Name: Juned";
    priceMessage+= "\nQuantity: "+ quantity;
    priceMessage+= "\nTotal: $" + quantity + price;
    priceMessage= priceMessage+ "\nThank you!";
    return priceMessage;


}





    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }



    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }


}








