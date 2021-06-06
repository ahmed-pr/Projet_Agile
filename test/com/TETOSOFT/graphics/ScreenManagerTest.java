package com.TETOSOFT.graphics;

import junit.framework.TestCase;

import java.awt.*;

public class ScreenManagerTest extends TestCase {

    public void testDisplayModesMatch() {
        ScreenManager screenManager = new ScreenManager();
        DisplayMode[] displayModes = screenManager.getCompatibleDisplayModes();
        assertTrue(screenManager.displayModesMatch(screenManager.findFirstCompatibleMode(displayModes), screenManager.getCurrentDisplayMode()));
    }

    public void testGetFullScreenWindow() {
        ScreenManager screenManager = new ScreenManager();
        screenManager.setFullScreen(screenManager.getCurrentDisplayMode());
        assertEquals(screenManager.getFullScreenWindow().getWidth(), screenManager.getWidth());
        assertEquals(screenManager.getFullScreenWindow().getHeight(), screenManager.getHeight());
    }
}