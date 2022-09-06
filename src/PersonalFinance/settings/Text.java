package PersonalFinance.settings;

import java.util.HashMap;

final public class Text {
    private static HashMap<String, String> data = new HashMap();

    public static void init() {
        data.put("PROGRAM_NAME", "Домашняя бухгалтерия");
        data.put("MENU_FILE", "Файл");
        data.put("MENU_EDIT", "Правка");
        data.put("MENU_VIEW", "Вид");
        data.put("PROGRAM_HELP", "Помощь");
    }
}
