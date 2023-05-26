//Дана json-строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

package HomeWorkJava;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sem2Task3 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("test.json")) {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(reader);   //JSONObject obj = (JSONObject) jsonParser.parse(reader);
            JSONArray array= (JSONArray) obj;        //JSONArray array= (JSONArray) jsonObject.get("people");

//            Object obj = new JSONParser().parse(reader);
//            JSONArray array= (JSONArray) obj;

            for (Object o : array) {
                JSONObject object = (JSONObject) o;
                String firstName = (String) object.get("Lastname");
                String score = (String) object.get("score");
                String sub = (String) object.get("subject");
                System.out.println("студент " + firstName + " получил " + score + " по предмету " + sub);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
