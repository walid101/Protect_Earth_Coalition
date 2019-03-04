package edmt.dev.helloworld.Scenes;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class backgroundSet
{
    Texture image;
    float y1;
    float imageScale;
    public backgroundSet(String backName)
    {
        image = new Texture(backName);
        y1 = image.getHeight();
    }
    public void UpdateAndRender(SpriteBatch batch)
    {
        batch.draw(image, 0, y1, Gdx.graphics.getWidth(), image.getHeight() * imageScale);
    }
    public void resize(int width, int height)
    {
        imageScale = width/image.getWidth();
    }
}
