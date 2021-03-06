/*
 * Name : Rakesh Kumar
 * Student number : 991556750
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            double r = (Math.random()*(13+1));
            int num = (int) r;
            double r1 = (Math.random()*(13+1));
            int num2 = (int) r1;
            c.setValue(num);
            c.setSuit(Card.SUITS[num2]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the card value=");
        System.out.println("enter the card suit=");
        
        // and search magicHand here
        
        //Then report the result here
        
    }
    
}