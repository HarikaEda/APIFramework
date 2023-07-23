package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(//features = " ",
       // glue = "stepdefinitions",çağırılır
        //monochrome = true,
        //plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"},
// rapor oluşturabiliyoruz
       // tags = {"~@wip"},dahil edilecek tagler çağırılır// smoke runner->smoke tag i bulumam testleri çalıştır
       // strict = true,
        //dryRun = false---bunu true yapmak çok mantıklı olmuyordu,testleri çalıştırmıyor
// sadece karşılığının olup olmadığına bakıyor



)
public class Runner extends AbstractTestNGCucumberTests {

//cucumber ve testNG yi beraber kullandığımızda run etmek için bu methodu kullnıyoruz...

//smoke runner->smoke tag i bulumam scenarioları çalıştırır
//regression runner->regression tum scenarioları çalıştırır
//belirli bir grup ->booking runner->booking ile alakalı tüm endpoint testlerini çalıştırır...



}
