package com.helgi.flappybirdgame;

import com.helgi.framework.Screen;
import com.helgi.framework.implementation.AndroidGame;

/*
 * �ETTA ER SKR�IN SEM R�SIST VEGNA �ESS A� �A� ER STILLT �ANNIG �
 * ANDROIDMANIFEST.XML UNDIR ANDROID NAME:
 * android:name="com.helgi.flappybirdgame.FlappyBirdGame".
 * 
 * �ETTA ER �� "MAIN-KLASI" LEIKJARINS.
 * 
 * Kalla� er � getInitScreen(). �a� er "main-FALL" leikjarins.
 * 
 */
public class FlappyBirdGame extends AndroidGame {
	
	// Vi� byrjum � �v� a� kalla � LoadingScreen.
	@Override
    public Screen getInitScreen() {
        return new LoadingScreen(this);
	}
}
