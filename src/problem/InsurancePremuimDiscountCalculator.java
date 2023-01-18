package problem;

public class InsurancePremuimDiscountCalculator {

    public int calculatePremiumDiscountPercentile(HealthInsuranceCustomerProfile customer){
        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }

    public int calculatePremiumDiscountPercentile(VehicleInsuranceCustomerProfile customer){
        if(customer.isLoyalCustomer()){
            return 40;
        }
        return 0;
    }

    public int calculatePremiumDiscountPercentile(HomeInsuranceCustomerProfile customer){
        if(customer.isLoyalCustomer()){
            return 40;
        }
        return 0;
    }

}
