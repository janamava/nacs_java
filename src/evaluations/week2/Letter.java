package evaluations.week2;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Letter {

    private String address;
    private Boolean isStamped = false;

    public Letter(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Boolean isStamped() {
        return isStamped;
    }

    public void setStamped(/*Boolean isStamped*/) {
        isStamped = true;
    }
}



/*
The Letter has an address and also a boolean that states if it is stamped.
 It has a getAddress method. It also has a isStamped method that
  returns whether the letter has been stamped.
   It also has a stamp method that sets the stamped attribute to true.
 */
