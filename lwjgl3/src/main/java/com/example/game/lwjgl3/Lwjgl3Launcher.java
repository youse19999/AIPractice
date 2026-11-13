package com.example.game.lwjgl3;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.example.game.MyGdxGame;

/** Desktop entry point. */
public final class Lwjgl3Launcher {
    private Lwjgl3Launcher() { }

    public static void main(String[] args) {
        new Lwjgl3Application(new MyGdxGame(), config());
    }

    private static Lwjgl3ApplicationConfiguration config() {
        Lwjgl3ApplicationConfiguration configuration = new Lwjgl3ApplicationConfiguration();
        configuration.setTitle("My libGDX Game");
        configuration.setWindowedMode(1280, 720);
        configuration.useVsync(true);
        configuration.setForegroundFPS(60);
        return configuration;
    }
}
