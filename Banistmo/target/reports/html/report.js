$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com.banismo.www/com/banismo/features/consultar_pdf.feature");
formatter.feature({
  "name": "Consultar PDF CiberSeguridad",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Consultar PDF",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "aprender mas de Ciberseguridad",
  "keyword": "Given "
});
formatter.match({
  "location": "ConsultarPDFStepDefinitions.aprenderMasDeCiberseguridad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "voy aprender sobre ciber seguridad",
  "keyword": "When "
});
formatter.match({
  "location": "ConsultarPDFStepDefinitions.voyAprenderSobreCiberSeguridad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido que el pdf se encuentre disponible",
  "keyword": "Then "
});
formatter.match({
  "location": "ConsultarPDFStepDefinitions.validoQueElPdfSeEncuentreDisponible()"
});
formatter.result({
  "status": "passed"
});
});