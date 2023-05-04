import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class JsonOutputer {
    public void outputToJson(ArrayList<SingleReview> arrayList) throws IOException {

        JSONArray list = new JSONArray();

        for(SingleReview s:arrayList)
        {
            JSONObject obj = new JSONObject();
            obj.put("name", s.getFirstName());
            obj.put("time", s.getTime());
            obj.put("languages", s.getLanguage());
            obj.put("item name",s.getItem());
            obj.put("Rating", s.getRating());
            obj.put("description",s.getDescription());
            list.add(obj);
        }

        JSONObject newObj = new JSONObject();
        newObj.put("items list", list);

        try(FileWriter file = new FileWriter("output.json")){
            file.write(newObj.toJSONString());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void outputToJson()
    {
        JSONArray list = new JSONArray();
        JSONObject obj = new JSONObject();


//        obj.put("name", s.getFirstName());
//        obj.put("languages", s.getLanguage());
//        obj.put("item name",s.getItem());
//        obj.put("Rating", s.getRating());
//        obj.put("description",s.getDescription());

        list.add(obj);

        JSONObject newObj = new JSONObject();
        newObj.put("items list", list);

        try(FileWriter file = new FileWriter("output.json")){
            file.write(newObj.toJSONString());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(obj);
    }

}
