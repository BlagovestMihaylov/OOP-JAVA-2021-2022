package cardsTask;// Fig. 7.9: Card.java
// Card class represents a playing card.

import java.io.OptionalDataException;

public class Card
{
   private String face; // face of card ("Ace", "Deuce", ...)
   private String suit; // suit of card ("Hearts", "Diamonds", ...)

   // two-argument constructor initializes card's face and suit
   public Card( String cardFace, String cardSuit )
   {
      face = cardFace; // initialize face of card
      suit = cardSuit; // initialize suit of card
   } // end two-argument Card constructor

   // return String representation of Card
   public String toString() 
   { 
      return face + " of " + suit;
   } // end method toString

   public String getFace()
   {
      return face;
   }

   public void setFace(String face)
   {
      this.face = face;
   }

   public String getSuit()
   {
      return suit;
   }

   public void setSuit(String suit)
   {
      this.suit = suit;
   }


} // end class Card

