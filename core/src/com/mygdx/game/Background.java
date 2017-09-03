package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by RoGr on 03.09.2017.
 */


//ЧТО БЫ ФОН ШЕЛ ДРУГ ЗА ДРУГОМ МЫ ДЕЛАЕМ ДВА ФОНА С ИДУЩИМ ДРУГ ЗА ДРУГОМ
public class Background {

    class BgPicture{
        private Texture tx;
        private Vector2 pos;//Координаты

        public BgPicture(Vector2 pos){
            tx = new Texture("back.png");
            this.pos = pos;
        }
    }

    private int speed;//Скорость фона
    private BgPicture[] backs;

    public Background() {
        speed = 4;
        backs = new BgPicture[2];
        backs[0] = new BgPicture(new Vector2(0,0));
        backs[1] = new BgPicture(new Vector2(800,0));
    }

    //Отрисовка фонов
    public void render(SpriteBatch batch){
        for (int i = 0; i < backs.length ; i++) {
            batch.draw(backs[i].tx,backs[i].pos.x, backs[i].pos.y);
        }
    }

    //Если первая картинка заходит за  стороны экрана, обновляем её позицию
    public void update(){
        for (int i = 0; i < backs.length ; i++) {
            backs[i].pos.x -=speed;
        }
        if(backs[0].pos.x < -800){
            backs[0].pos.x = 0;
            backs[1].pos.x = 800;
        }
    }

}
