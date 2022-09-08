package PersonalFinance.settings;

import java.util.HashMap;

final public class Text {
    private static HashMap<String, String> data = new HashMap();
    public static String get(String key){
        return data.get(key);
    }
    public static String[] getMonths() {
        String[] months = new String[12];
        months[0] = get(JANUARY);
        months[0] = get(FEBRUARY);
        months[0] = get(MARCH);
        months[0] = get(APRIL);
        months[0] = get(MAY);
        months[0] = get(JUNE);
        months[0] = get(JULY);
        months[0] = get(AUGUST);
        months[0] = get(SEPTEMBER);
        months[0] = get(OCTOBER);
        months[0] = get(NOVEMBER);
        months[0] = get(DECEMBER);
        return months;

    }

    public static void init() {
        data.put("PROGRAM_NAME", "Домашняя бухгалтерия");
        data.put("MENU_FILE", "Файл");
        data.put("MENU_EDIT", "Правка");
        data.put("MENU_VIEW", "Вид");
        data.put("PROGRAM_HELP", "Помощь");


        data.put("JANUARY", "Январь");
        data.put("FEBRUARY", "Февраль");
        data.put("MARCH", "Март");
        data.put("APRIL", "Апрель");
        data.put("MAY", "Май");
        data.put("JUNE", "Июнь");
        data.put("JULY", "Июль");
        data.put("AUGUST", "Август");
        data.put("SEPTEMBER", "Сентябрь");
        data.put("OCTOBER", "Октябрь");
        data.put("NOVEMBER", "Ноябрь");
        data.put("DECEMBER", "Декабрь");

    }

}
