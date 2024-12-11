package testdatas;

import org.json.JSONObject;

public class JsonPlaceHolderTestData {
    public static int basariliStatusCode=200;
    /*
    *
        https://jsonplaceholder.typicode.com/posts/22 url'ine
        bir GET request yolladigimizda
        donen response’in
            status kodunun 200
            ve response body’sinin asagida verilen ile ayni oldugunu test ediniz

        Response body (Expected Data:)
        {
            "userId":3,
            "id":22,
            "title":"dolor sint quo a velit explicabo quia nam",
            "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse"
        }
     */
        public static JSONObject expDataOlsutur(){
              JSONObject expData=new JSONObject();
              expData.put("userId",3);
              expData.put("id",22);
              expData.put("title","dolor sint quo a velit explicabo quia nam");
              expData.put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse");

            return expData;
        }





}
