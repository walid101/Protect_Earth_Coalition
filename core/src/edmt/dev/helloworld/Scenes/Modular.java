package edmt.dev.helloworld.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import static edmt.dev.helloworld.PEC.V_HEIGHT;
import static edmt.dev.helloworld.PEC.V_WIDTH;


public class Modular
{
    public Stage stage;
    public Viewport viewport;
    public Integer worldTime;
    public Label trashBot;
    public Label welcomeTo;

    public static Texture backgroundTexture;
    public static Sprite backgroundSprite;
    private SpriteBatch spriteBatch;

    public Modular(SpriteBatch SpriteB)
    {
        viewport = new FitViewport(V_WIDTH, V_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport,SpriteB);
        Table table = new Table();
        table.top();
        //table.setBackground("@drawable/trashbot_title.png");
        table.setFillParent(true);
        trashBot = new Label("TRASHBOT!", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        welcomeTo = new Label("Welcome To", new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        table.add().expandX();
        table.add(welcomeTo).expandX();
        table.add().expandX();
        table.row();
        table.add().expandX();
        table.add(trashBot);
        table.add().expandX();
        stage.addActor(table);
    }
}
