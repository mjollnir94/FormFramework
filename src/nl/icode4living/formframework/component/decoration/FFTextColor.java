package nl.icode4living.formframework.component.decoration;

import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.util.TextUtil;

import java.awt.*;


/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class FFTextColor extends FFDecoration {

    private Color c;
    private Integer s;

    public FFTextColor(FFComponent temp, Color c, Integer s) {
        super(temp);
        this.c = c;
        this.s = s;
    }

    @Override
    public void draw(Graphics2D gc2d) {
        super.draw(gc2d);
        gc2d.setColor(c != null ? c : Color.BLACK);
        gc2d.setFont(s != null ? new Font("arial", Font.PLAIN, s) : new Font("arial", Font.PLAIN, 16));
        TextUtil.drawCenteredString(getText(), getWidth(), getHeight(), getX(), getY(), gc2d);
    }
}
