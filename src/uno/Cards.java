/**
 * -SYST 17796 Project - UNO card game.
 * @author Xiaohong, Seo, Jonathon, Muhammad , 07 12 2019 hi* 
 */
package uno;

/**
 * A class to model cards. Cards have a value(ZERO,ONE,TWO,THREE,FOUR, 
 * FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD) and a suit
 * (RED,YELLOW,GREEN,BLUE). There are 60 cards in a deck. This code has high
 * cohesion - the ability of a class to do one thing well, which make programmer
 * to use it as a standard deck of Uno cards. 
 * Make the Suit/Value type an Enumerated type which are easy to 
 * compare and add a layer of coupling if we want to change them.
 *  
 * @author Xiaohong, Seo, Jonathon, Muhammad, 2019
 */
public class Cards {
    /**
    * make the Suit type an Enumerated type which are easy to compare and 
    * add a layer of coupling if we want to change them.
    */ 
    public enum Color {red, yellow, green, blue};

    /**
     * make the Value type an Enumerated type which are easy to compare and 
     * add a layer of coupling if we want to change them.
     */ 
    public enum Value{      
        ZERO("0"),
        ONE("1"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"), 
        EIGHT("8"),
        NINE("9"),
        SKIP("skip"),
        REVERSE("reverse"),
        DRAWTWO("picker"),
        DRAWFOUR("pick_four"),
        WILDCARD("color_change");
        
        private final String alias;
        Value(String name) {
            this.alias=name;
        }
    
    }
    private final Color color;
    private final Value value;

    /**
     * Constructs a Card with a specific s and v
     * 
     * @param c, this Card's color.
     * @param v, this Card's value.
     */ 
    public Cards(Color c, Value v)
    {
       this.color = c;
       this.value = v;
    }

    /**
     * @return the value
     */
    public Value getValue() {
            return this.value;
    }

    /**
     * @return the suit
    */
    public Color getColor() {
            return this.color;
    }
    

    
    public String toString() {
        return this.color + " " + this.value;
    }
    
    public boolean match(Cards card) {
        if (this.color==card.color || this. value==card.value) return true;
        if (this.value==Cards.Value.DRAWFOUR ||
                this.value==Cards.Value.DRAWTWO ||
                this.value==Cards.Value.WILDCARD ||
                this.value==Cards.Value.REVERSE ||
                this.value==Cards.Value.SKIP) return true;
        return false;
    }
    
}
