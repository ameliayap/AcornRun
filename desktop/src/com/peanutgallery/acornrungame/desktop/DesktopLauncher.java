package com.peanutgallery.acornrungame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.peanutgallery.acornrungame.AcornRunGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "AcornRun";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new AcornRunGame(), config);
	}
}
