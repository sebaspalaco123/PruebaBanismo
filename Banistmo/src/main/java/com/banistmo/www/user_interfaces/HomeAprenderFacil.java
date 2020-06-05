package com.banistmo.www.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/aprender-es-facil/")
public class HomeAprenderFacil extends PageObject {
    public static final Target CIBER_SEGURIDAD = Target.the("ciber seguridad").locatedBy("//div[6]//div[1]//div[1]//div[3]//a[1]");

}
