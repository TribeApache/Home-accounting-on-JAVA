package PersonalFinance;

import PersonalFinance.settings.Text;

import java.awt.*;
import java.io.File;

public class PersonalFinance {
    public static void main(String[] args) {
        init();
    }
private static void init(){
    Text.init();
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File())); // - вывести в отдельный класс, добавить путь к шрифту
}
}
