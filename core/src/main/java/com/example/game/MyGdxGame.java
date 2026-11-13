package com.example.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

/** Minimal libGDX game. Replace this with your game logic. */
public class MyGdxGame extends ApplicationAdapter {
    @Override
    public void render() {
        Gdx.gl.glClearColor(0.08f, 0.10f, 0.16f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}
