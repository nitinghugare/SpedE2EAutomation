package Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	
	Map jsonData;

	public Map readJson(String jsonFileName, String env) throws FileNotFoundException, IOException, ParseException{
		
		Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
        
        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;
        
        this.jsonData = ((Map)jo.get(env));
        
        return this.jsonData;
	}

	public String getDataValue(Map value , String key) {
		String dataValue = null;
		Iterator<Map.Entry> itr1 = value.entrySet().iterator();
        
        while (itr1.hasNext()) {
            itr1 = ((Map) itr1.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                dataValue = (String) pair.getValue();
            }
        }	
        return dataValue;
	}
}
