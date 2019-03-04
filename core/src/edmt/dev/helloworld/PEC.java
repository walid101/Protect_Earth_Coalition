package edmt.dev.helloworld;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector3;

import edmt.dev.helloworld.Scenes.backgroundSet;
import edmt.dev.helloworld.Screens.PlayScreen;

public class PEC extends Game {
	public static final int V_WIDTH = 640;
	public static final int V_HEIGHT = 360;
	public backgroundSet background;
	public SpriteBatch batch;
	private OrthographicCamera cam; //this is the view
	private ShapeRenderer sr; //this is used to draw
	private Vector3 pos; //represents position of mouse (or finger)
	@Override
	public void create ()
	{


		batch = new SpriteBatch();
		//this.background = new backgroundSet("trashbot_title.png");
		setScreen(new PlayScreen(this));

		/**
		sr = new ShapeRenderer();
		cam = new OrthographicCamera();
		cam.setToOrtho(false,Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); //view is set to full screen

		pos = new Vector3((float)Gdx.graphics.getWidth() / 2, (float)Gdx.graphics.getHeight()/2, 0); //position of mouse is in the center
		**/

	}

	@Override
	public void render ()
	{
		//logic
		super.render();//refers to the current screen (so we are in the current screen)
		//background.UpdateAndRender(batch);
		/**
		cam.update();


		if(Gdx.input.isTouched())
		{
			pos.set((float)Gdx.input.getX(), (float)Gdx.input.getY(),0);
			cam.unproject(pos);
		}
		//drawing
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		sr.begin(ShapeRenderer.ShapeType.Filled);
		sr.setColor(Color.BLUE);
		sr.circle(pos.x,pos.y,64);
		sr.end();
*		*/
		/**
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
		 **/
	}

	@Override
	public void resize(int width, int height)
	{
		//this.background.resize(width,height);
		super.resize(width, height);
	}

	@Override
	public void dispose ()
	{
		/**
		batch.dispose();
		img.dispose();
		//sr.dispose();
		 **/
	}
}
