package pages;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers {
	public FindLeadPage() {
		this.driver=driver;
		this.test=test;
		if (verifyTitle("Find Leads | opentaps CRM") == false) {
			reportStep("This is not Find LeadPage", "Fail");
		}
	}

	public FindLeadPage enterFirstName() {
		enterByName("firstName", "Madhu");
		return this;
	}

	public FindLeadPage clickOnFindLeads() {
		clickByLink("Find Leads");
		return this;
	}

	public ViewLeadPage clickOnLink() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return new ViewLeadPage();
	}

}
