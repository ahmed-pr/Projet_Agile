package com.TETOSOFT.graphics;

import junit.framework.TestCase;

import java.awt.*;

public class AnimationTest extends TestCase {

    public void testTestClone() {
        Animation animation = new Animation();
        assertEquals((int) animation.getTotalDuration(), ((Animation) animation.clone()).getTotalDuration());
    }

    public void testAddFrame() {
        Animation animation = new Animation();
        long totalDuration = animation.getTotalDuration();
        totalDuration += 10;
        animation.addFrame(animation.getImage(), (long) 10);
        assertEquals(totalDuration, animation.getTotalDuration());
    }
}