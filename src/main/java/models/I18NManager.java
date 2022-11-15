package models;

import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager manager;
    HashMap<String, ResourceBundle> data;
    private I18NManager() {
        this.data = new HashMap<String ,ResourceBundle>();

    }

    public static I18NManager getInstance() {
        if (manager==null){
            manager = new I18NManager();
        }
        return manager;
    }
    public String getText (String lengua, String etiqueta){
        return data.get(lengua).getString(etiqueta);
    }
}
