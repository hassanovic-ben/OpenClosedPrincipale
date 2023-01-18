package solution;

import problem.HealthInsuranceCustomerProfile;

public class InsurancePremuimDiscountCalculator {

    public int calculatePremiumDiscountPercentile(CustomerProfile customer){
        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }

}
