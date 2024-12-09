package tests;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class C8_JsonPathKullanimi {
        /*
        {
                "firstName":"Ahmet",
                "lastName":"Bulut",
                "address":{
                   	"streetAddress":"Kurtulus cad.",
                   	"city":"Ankara",
                	"postalCode":"06100" },
                "age":49,
                "phoneNumbers":[
                    {
                       "number":"532-555 55 55",
                      "type":"cep"
                    },
                    {
                      "number":"0312-123 4567",
                      "type":"ev "
                    }
                  ]
          }

         */
    @Test
    public void test(){

        JSONObject kisiBilgisi=new JSONObject();
        JSONObject adresBilgisi=new JSONObject();
        JSONObject telefonBilgileri=new JSONObject();
            JSONObject evTelBilgisi=new JSONObject();
            JSONObject cepTelBilgisi=new JSONObject();

        cepTelBilgisi.put("number","532-555 55 55");
        cepTelBilgisi.put("type","cep");
        evTelBilgisi.put("number","216-555 55 55");
        evTelBilgisi.put("type","ev");


        adresBilgisi.put("streetAddress","Kurtulus cad.");
        adresBilgisi.put("city","Ankara");
        adresBilgisi.put("postalCode","06100");

        kisiBilgisi.put( "firstName","Murat");
        kisiBilgisi.put( "lastName","Yiğit");
        kisiBilgisi.put("address",adresBilgisi);
        kisiBilgisi.put("phoneNumbers",telefonBilgileri);

        System.out.println(kisiBilgisi);
    }
}
