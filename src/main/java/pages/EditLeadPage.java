package pages;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers {
	public EditLeadPage() {
		this.driver=driver;
		this.test=test;
		if (verifyTitle(" opentaps CRM") == false) {
			reportStep("This is not view LeadPage", "Fail");
		}
	}

	public EditLeadPage enterCompanyName() {
		enterById("updateLeadForm_companyName", "HDFC-credila");
		return this;
	}

	public EditLeadPage enterFirstName() {
		enterById("updateLeadForm_firstName", "sreeja");
		return this;
	}

	public EditLeadPage enterLastName() {
		enterById("updateLeadForm_lastName", "tirupal");
		return this;
	}

	public ViewLeadPage clickOnupdate() {
		clickByClassName("smallSubmit");
		return new ViewLeadPage();
	}

}