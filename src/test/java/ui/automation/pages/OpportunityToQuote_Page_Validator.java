package ui.automation.pages;

import org.openqa.selenium.Keys;

import cigniti.automation.utilities.Selenide;
import cigniti.base.BaseUtil;

public class OpportunityToQuote_Page_Validator extends BasePageValidator<OpportunityToQuote_Page> {
	public OpportunityToQuote_Page_Validator(OpportunityToQuote_Page Map1) {
		super(Map1);

	}

	public void enter_Data_opportunityName(String opportunityName) throws Throwable {
		this.getMap().opportunityNameField().sendKeys(opportunityName);
	}

	public void enter_Data_acctName(String AcctName) throws Throwable {
		this.getMap().accountNameField().sendKeys(AcctName);
		Selenide.smallwaitTime();
		this.getMap().johnsonInvmntLtd().click();
	}

	public void enter_Data_closeDate(String closeDate) throws Throwable {
		this.getMap().closeDateField().sendKeys(Keys.CONTROL, "a");
		this.getMap().closeDateField().sendKeys(Keys.BACK_SPACE);
		this.getMap().closeDateField().clear();
		this.getMap().closeDateField().sendKeys(closeDate);
		;
	}

	public void enter_Data_probability(String probability) throws Throwable {
		this.getMap().probabilityField().clear();
		this.getMap().probabilityField().sendKeys(probability);
		;
	}

	public void enter_Data_amount(String amount) throws Throwable {
		this.getMap().amountField().click();
		this.getMap().amountField().sendKeys(Keys.CONTROL, "a");
		this.getMap().amountField().sendKeys(Keys.BACK_SPACE);
		this.getMap().amountField().clear();
		this.getMap().amountField().clear();
		this.getMap().amountField().sendKeys(amount);
		;
	}

	public void enter_Data_riskCompetitionComments(String riskCompetitionComments) throws Throwable {
		this.getMap().riskCompetitionCommentsField().sendKeys(riskCompetitionComments);
		;
	}

	public void select_stage_Drop(String stage) throws Throwable {
		this.getMap().selectstageDrpDwnBtn(stage);
	}

	public void select_type_Drop(String type) throws Throwable {
		this.getMap().selectTypeDrpDwnBtn(type);
	}

	public void click_productsDrpdownInRightPane_link() throws Throwable {
		this.getMap().productsDrpdownInRightPane().click();
	}

	public void click_choosePriceBookInProductDrpdwn() throws Throwable {
		Selenide.jSClick(this.getMap().choosePriceBookInProductDrpdwn());
	}

	public void click_addProductInDrpdwn() throws Throwable {
		Selenide.jSClick(this.getMap().addProductInDrpdwn());
	}

	public void click_CheckBoxForProductNameInAddProduct(String chkbox) throws Throwable {
		this.getMap().checkBoxToSelectInAddProduct(chkbox).click();
	}

	public void click_Next_Btn() throws Throwable {
		this.getMap().nextBtnInAddProduct().click();
	}

	public void enter_Data_quantity(String quantity) throws Throwable {
		this.getMap().quantityInEditSelectedProductsthrows().click();
		this.getMap().quantityAfterClickInEditSelectedProducts().sendKeys(quantity);
	}

	public void enter_Data_date(String date) throws Throwable {
		this.getMap().dateInEditSelectedProducts().click();
		this.getMap().dateInAfterClickEditSelectedProducts().sendKeys(date);
	}

	public void click_QuoteDrpdwnInRightsidePane_Link() throws Throwable {
		this.getMap().quotesDrpdownInRightPane().click();

	}

	public void click_saveBtnInChoosePriceBook_Btn() throws Throwable {
		Selenide.smallwaitTime();
		this.getMap().saveBtnInChoosePriceBook().click();

	}

	public void click_NewQuoteInQuoteDrpdwn() throws Throwable {
		Selenide.jSClick(this.getMap().newQuoteInQuoteDrpdwn());

	}

	public void enter_data__quoteName(String quoteName) throws Throwable {
		this.getMap().quoteNameField().sendKeys(quoteName);

	}

	public void enter_Data_ExpirationDate(String date) throws Throwable {
		this.getMap().expirationDateField().sendKeys(date);
	}

	public void select_status_Drop(String status) throws Throwable {

		this.getMap().selectstatusDrpDwnBtn(status);
	}

	public int count_QuoteLineItems() throws Throwable {
		return Integer.parseInt(String.valueOf(this.getMap().quoteLineItemsCount().charAt(1)));

	}

	public void click_Save_Button() throws Throwable {
		this.getMap().saveButton().click();
	}

	public void click_FirstQuote_Name(String quoteName) throws Throwable {
		this.getMap().FirstQuoteName(quoteName).click();
	}

	public void click_createPDFbutton() throws Throwable {
		this.getMap().createPDFbutton().click();
	}

	public void click_saveToQuoteButton() throws Throwable {
		this.getMap().saveToQuoteButton();
	}

	public String get_PdfName() throws Throwable {
		return this.getMap().pdfName();
	}

}
