/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Ramana Elanko 991845654
 */


import java.util.Random;
import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner inp = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Random rnd = new Random();
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue(rnd.nextInt(1,13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rnd.nextInt(3)]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getSuit() + " , " +  magicHand[i].getValue());
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("What is the value of your card?");
        int CardValue = inp.nextInt();
        System.out.println("What is the suit of your card?");
        String SuitValue = inp.next();
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++){
            
            if (magicHand[i].getValue() == CardValue && magicHand[i].getSuit().equals(SuitValue)){
                
                System.out.println("You found a match!");
            }    
            
        }
        //Then report the result here
        // add one luckcard hard code 2,clubs
        Card Lucky = new Card;
        Lucky.setValue(7);
        Lucky.setSuit(1);
    }
    
}
