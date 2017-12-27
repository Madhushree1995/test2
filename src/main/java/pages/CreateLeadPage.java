package pages;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers{
		public CreateLeadPage() {
			if (verifyTitle("Create Lead | opentaps CRM") == false) {
				reportStep("This is not CtreateLeadPage", "Fail");
		}
}
		public CreateLeadPage enterCompanyName() {
			enterById("createLeadForm_companyName","Moolya");
			return this;
		}
		public CreateLeadPage enterFirstName() {
			enterById("createLeadForm_firstName","Madhu");
			return this;
		}
		public CreateLeadPage enterLastName() {
			enterById("createLeadForm_lastName","Shree");
			return this;
		}
		public ViewLeadPage clickOnCreateLead() {
			clickByName("submitButton");
			return new ViewLeadPage();
		}
}
