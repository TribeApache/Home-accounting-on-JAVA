package PersonalFinance;

import PersonalFinance.settings.Text;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonalFinance {
    public static void main(String[] args) {
        init();
        System.out.println(Text.get("PROGRAM_NAME"));
        System.out.println(Arrays.toString(Text.getMonths()));
    }
private static void init(){
    Text.init();
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    try {
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Roboto-Light.ttf")));
    } catch (FontFormatException e) {                // Переписать в дальнейшем строки с 18 по 21 в multi catch
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
