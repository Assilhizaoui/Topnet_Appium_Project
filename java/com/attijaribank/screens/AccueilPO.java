package com.attijaribank.screens;
import org.openqa.selenium.support.PageFactory;

import com.attijaribank.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AccueilPO extends Base {
public AccueilPO () {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	  
}

@AndroidFindBy (id="com.attijariwafabank.main:id/welcomeSubtitle")
private MobileElement first_Acceuil_Text ;

@AndroidFindBy(id="com.attijariwafabank.main:id/loginBtn")
private MobileElement first_Login_Btn ;

@AndroidFindBy(className = "android.widget.TextView")
private MobileElement welcome_Text ;

@AndroidFindBy(id = "com.attijariwafabank.main:id/btn_menu")
private MobileElement menu_Btn;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='Accueil']")
private MobileElement acceuil_btn ;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='Paramètres']")
private MobileElement parameter_btn ;

@AndroidFindBy(id = "com.attijariwafabank.main:id/imgLanguage")
private MobileElement language_btn;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='Français']")
private MobileElement francais_btn ; 

@AndroidFindBy(xpath ="//android.widget.TextView[@text='العربية']")
private MobileElement arab_btn ; 

@AndroidFindBy(xpath ="//android.widget.TextView[@text='English']")
private MobileElement english_btn ; 

@AndroidFindBy(id = "com.attijariwafabank.main:id/btn_back")	
private MobileElement retour_btn;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='Demande de crédit en ligne']")
private MobileElement credit_btn ;

@AndroidFindBy(xpath = "//android.view.View[@index='3']")
private MobileElement creditText ;


@AndroidFindBy(xpath ="//android.widget.TextView[@text='Assistance']")
private MobileElement assistance_btn ;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='FAQ']")
private MobileElement faq_btn ;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='Sécurité']")
private MobileElement securite_btn ;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='Applications et Sites Web']")
private MobileElement app_et_site_btn ;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='Offres produits']")
private MobileElement offre_btn ;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='Mentions légales']")
private MobileElement mentions_l_btn ;

@AndroidFindBy(xpath ="//android.widget.TextView[@text='Protection des données personnelles']")
private MobileElement protection_btn ;

@AndroidFindBy(xpath ="//android.view.ViewGroup[@index='14']")
private MobileElement condition_btn ;

@AndroidFindBy(id="credit_immobilier")
private MobileElement credit_imm_btn;

@AndroidFindBy(id = "com.attijariwafabank.main:id/titleTextView")
private MobileElement credit_P_Title ;

@AndroidFindBy(id = "com.attijariwafabank.main:id/textView2")
private MobileElement assi_user_Text;


@AndroidFindBy(id = "com.attijariwafabank.main:id/textView2")
private MobileElement assi_card_Text;

@AndroidFindBy(id = "com.attijariwafabank.main:id/radioBtnCard") 
private MobileElement card_btn ; 

@AndroidFindBy(id = "com.attijariwafabank.main:id/radioBtnWorld")
private MobileElement world_btn ;

@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='1']")
private MobileElement country ;

public MobileElement getCountry() {
	return country;
}
public void setCountry(MobileElement country) {
	this.country = country;
}
public MobileElement getCard_btn() {
	return card_btn;
}
public void setCard_btn(MobileElement card_btn) {
	this.card_btn = card_btn;
}
public MobileElement getWorld_btn() {
	return world_btn;
}
public void setWorld_btn(MobileElement world_btn) {
	this.world_btn = world_btn;
}
public String getAssi_user_Text() {
	String msg_user = assi_card_Text.getText();
	
	return msg_user;
	
}
public void setAssi_user_Text(MobileElement assi_user_Text) {
	this.assi_user_Text = assi_user_Text;
}
public String getAssi_card_Text() {
	String msg_card =assi_card_Text.getText() ;
	return msg_card;
}
public void setAssi_card_Text(MobileElement assi_card_Text) {
	this.assi_card_Text = assi_card_Text;
}
public void setRetour_btn(MobileElement retour_btn) {
	this.retour_btn = retour_btn;
}


public String getCredit_P_Title() {
	
	String title = credit_P_Title.getText();
			
	return title ;
}
public void setCredit_P_Title(MobileElement credit_P_Title) {
	this.credit_P_Title = credit_P_Title;
}
public MobileElement getCredit_imm_btn() {
	return credit_imm_btn;
}
public void setCredit_imm_btn(MobileElement credit_imm_btn) {
	this.credit_imm_btn = credit_imm_btn;
}
public String getCreditText() {
	String msg_credit = creditText.getText() ;
	return msg_credit;
}
public void setCreditText(MobileElement creditText) {
	this.creditText = creditText;
}

public MobileElement getRetour_btn() {
	return retour_btn;
}
public void setRetout_btn(MobileElement retout_btn) {
	this.retour_btn = retout_btn;
}


public MobileElement getMenu_Btn() {
	return menu_Btn;
}
public void setMenu_Btn(MobileElement menu_Btn) {
	this.menu_Btn = menu_Btn;
}
public MobileElement getAcceuil_btn() {
	return acceuil_btn;
}
public void setAcceuil_btn(MobileElement acceuil_btn) {
	this.acceuil_btn = acceuil_btn;
}
public MobileElement getParameter_btn() {
	return parameter_btn;
}
public void setParameter_btn(MobileElement parameter_btn) {
	this.parameter_btn = parameter_btn;
}
public MobileElement getCredit_btn() {
	return credit_btn;
}
public void setCredit_btn(MobileElement credit_btn) {
	this.credit_btn = credit_btn;
}
public MobileElement getAssistance_btn() {
	return assistance_btn;
}
public void setAssistance_btn(MobileElement assistance_btn) {
	this.assistance_btn = assistance_btn;
}
public MobileElement getFaq_btn() {
	return faq_btn;
}
public void setFaq_btn(MobileElement faq_btn) {
	this.faq_btn = faq_btn;
}
public MobileElement getSecurite_btn() {
	return securite_btn;
}
public void setSecurite_btn(MobileElement securite_btn) {
	this.securite_btn = securite_btn;
}
public MobileElement getApp_et_site_btn() {
	return app_et_site_btn;
}
public void setApp_et_site_btn(MobileElement app_et_site_btn) {
	this.app_et_site_btn = app_et_site_btn;
}
public MobileElement getOffre_btn() {
	return offre_btn;
}
public void setOffre_btn(MobileElement offre_btn) {
	this.offre_btn = offre_btn;
}
public MobileElement getMentions_l_btn() {
	return mentions_l_btn;
}
public void setMentions_l_btn(MobileElement mentions_l_btn) {
	this.mentions_l_btn = mentions_l_btn;
}
public MobileElement getProtection_btn() {
	return protection_btn;
}
public void setProtection_btn(MobileElement protection_btn) {
	this.protection_btn = protection_btn;
}
public MobileElement getCondition_btn() {
	return condition_btn;
}
public void setCondition_btn(MobileElement condition_btn) {
	this.condition_btn = condition_btn;
}

public String getFirst_Acceuil_Text() {
	String msg_1 =first_Acceuil_Text.getText();	
	return msg_1;
}
public void setFirst_Acceuil_Text(MobileElement first_Acceuil_Text) {
	this.first_Acceuil_Text = first_Acceuil_Text;
}
public MobileElement getFirst_Login_Btn() {
	return first_Login_Btn;
}
public void setFirst_Login_Btn(MobileElement first_Login_Btn) {
	this.first_Login_Btn = first_Login_Btn;
}
public String getWelcome_Text() {
	String msg_2 = welcome_Text.getText();
	return msg_2;
}
public void setWelcome_Text(MobileElement welcome_Text) {
	this.welcome_Text = welcome_Text;
} 
public MobileElement getLanguage_btn() {
	return language_btn;
}
public void setLanguage_btn(MobileElement language_btn) {
	this.language_btn = language_btn;
}
public MobileElement getFrancais_btn() {
	return francais_btn;
}
public void setFrancais_btn(MobileElement francais_btn) {
	this.francais_btn = francais_btn;
}
public MobileElement getArab_btn() {
	return arab_btn;
}
public void setArab_btn(MobileElement arab_btn) {
	this.arab_btn = arab_btn;
}
public MobileElement getEnglish_btn() {
	return english_btn;
}
public void setEnglish_btn(MobileElement english_btn) {
	this.english_btn = english_btn;
}
}
