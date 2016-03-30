public class WebApiResource {

    final String LOCATIONS_URI = "http://www.printwithme.com/api/locations";
    private Map<String, String> Locations = new HashMap<String, String>();

    public static Map<String, String> Parse(JSONObject json, Map<String,String> output) throws JSONException {
        Iterator<String> keys = json.keys();
        while(keys.hasNext()) {
            String key = keys.next();
            String val = null;
            try {
                JSONObject value = json.getJSONObject(key);
                Parse(value, output);
            } catch (Exception ex) {
                val = json.getString(key);
            }
            if (val != null) {
                output.put(key,val);
            }
        }
        return output;
    }

    public JSONArray Locations() throws IOException, JSONException {
        OkHttpClient http = new OkHttpClient();
        URL apiLocation = new URL(LOCATIONS_URI);
        Request req = new Request.Builder().url(apiLocation).build();
        Response res = http.newCall(req).execute();
        String data = res.body().string();
        JSONObject obj = new JSONObject(data);
        Parse(obj, this.Locations);
        //JSONObject locations = obj.getJSONObject("objects");
        JSONArray locationsList = obj.getJSONArray("objects");
        Log.i("PrintWithMeApiLocations", locationsList.toString());
        return locationsList;
    }
}
