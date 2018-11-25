package javaWeek_2.exercise3;


import java.util.List;

public class Hansel {

    private Integer footSize = 41;


    private Boolean isRightSize(HikingBoot hikingBoot) {
        return hikingBoot.getSize().equals(footSize);
    }

    public void tryHikingBoot(List<HikingBoot> recommendations) {

        for (HikingBoot hikingBoot : recommendations) {
            if(!isRightSize(hikingBoot)) {
                System.out.println("This one does not fit, sorry.");
            }
            else {
                System.out.println("I’m buying this one, thanks!");
                return;
            }
        }

    }

}

/*
Define the Hansel agent class that has a footSize attribute with the value 41.

Define in the Hansel class an isRightSize method that receives a HikingBoot and
compares its size with his footSize and returns if they are the same.
This method has private visibility so that only the Hansel class can use it.

Define in the Hansel class a tryHikingBoots method that receives a list of HikingBoot
 and tries them one by one. If the HikingBoot doesn’t have the right size, he will say
  “This one does not fit, sorry.” and continue with the next. If it is 41 he will say
  “I’m buying this one, thanks!” and stop trying more boots.
 */