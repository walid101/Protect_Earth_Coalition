package edmt.dev.helloworld.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import edmt.dev.helloworld.PEC;
import edmt.dev.helloworld.Scenes.Modular;

import static edmt.dev.helloworld.PEC.V_HEIGHT;
import static edmt.dev.helloworld.PEC.V_WIDTH;

public class PlayScreen implements Screen
{
    private PEC game;
    public static Texture backgroundTexture;
    public static Sprite backgroundSprite;
    private SpriteBatch spriteBatch;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private Modular mod;
    public PlayScreen(PEC game)
    {
        this.game = game;
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(V_WIDTH, V_HEIGHT, gameCam);
        mod = new Modular(game.batch);
    }
    private void loadTextures()
    {
        backgroundTexture = new Texture("trashbot_title.png");
        backgroundSprite = new Sprite(backgroundTexture);

    }
    public void renderBackground()
    {
        backgroundSprite.draw(spriteBatch);
    }
    @Override
    public void show()
    {

    }

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //renderBackground();
        game.batch.setProjectionMatrix(mod.stage.getCamera().combined);
        mod.stage.draw();
    }

    @Override
    public void resize(int width, int height)
    {
        gamePort.update(width,height);

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
