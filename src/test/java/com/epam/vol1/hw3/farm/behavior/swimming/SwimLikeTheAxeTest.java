package com.epam.vol1.hw3.farm.behavior.swimming;

import com.epam.vol1.hw3.farm.behavior.swimming.SwimLikeTheAxe;
import org.junit.Assert;
import org.junit.Test;

public class SwimLikeTheAxeTest {
    SwimLikeTheAxe swimLikeTheAxe = new SwimLikeTheAxe();

    @Test
    public void swimTest() throws Exception {
        Assert.assertEquals(("\tYou cast it to the water...It sinking to the dark deep"), swimLikeTheAxe.swim());
    }
}