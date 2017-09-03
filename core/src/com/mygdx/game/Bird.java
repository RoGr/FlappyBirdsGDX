package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad;

import static com.badlogic.gdx.Input.*;

/**
 * Created by RoGr on 03.09.2017.
 */

public class Bird {

    Texture img;
    Vector2 position;
    float vy;
    float gravity;

    public Bird(){
        img = new Texture("bird1.png");
        position = new Vector2(100,300);
        vy = 0;
        gravity = -0.7f;
    }

    public void render(SpriteBatch batch){
        batch.draw(img,position.x,position.y);
    }


    public void update(){
        if(Gdx.input.isKeyPressed(Keys.SPACE)) {
            vy = 10;
        }
        vy += gravity;
        position.y += vy;

    }

}
