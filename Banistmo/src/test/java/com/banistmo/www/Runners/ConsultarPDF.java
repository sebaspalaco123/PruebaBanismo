package com.banistmo.www.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = {"com.banistmo.www.Step_Definitions"}, features = {
        "src/test/resources/com.banismo.www/com/banismo/features/consultar_pdf.feature" },

        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/reports/html/",
                "junit:target/reports/junit/allcukes.xml",
                "json:target/reports/cukes.json" })
public class ConsultarPDF {
}
