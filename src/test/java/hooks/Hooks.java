package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Hooks {


    @Before
    public void setup() {
//raporlama ile ilgili birtakım konfigurasyonlar yapılır..

        //eğer her senaryoda kullanılacak bir obje var ise yine burada oluşturulur..



    }
    @After
    public void tearDown(){
//senario loglanır
        //uı testi olmadığı için quıte yapılmaz ve screenshot alınmaz


    }




}
