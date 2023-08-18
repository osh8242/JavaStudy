import java.util.ArrayList;
import java.util.List;



public class F_Program3 {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        initData(customerService);

        //지역검색
        List<Customer> result = customerService.searchCustomerByLocation("Seoul");
        System.out.println("지역검색");
        for (Customer customer : result) {
            System.out.println(customer);
        }

        //성별검색
        List<Customer> result2 = customerService.searchCustomerByGender(Gender.Female);
        System.out.println("성별검색");
        for (Customer customer : result2) {
            System.out.println(customer);
        }

    }

    public static void initData(CustomerService service) {
        service.addCustomer(new Customer("customer01", "Seoul", Gender.Male, 21));
        service.addCustomer(new Customer("customer02", "Busan", Gender.Female, 11));
        service.addCustomer(new Customer("customer03", "Seoul", Gender.Male, 45));
        service.addCustomer(new Customer("customer04", "Gwangju", Gender.Female, 32));
        service.addCustomer(new Customer("customer05", "Incheon", Gender.Male, 68));
        service.addCustomer(new Customer("customer06", "Daejeon", Gender.Male, 17));
        service.addCustomer(new Customer("customer07", "Seoul", Gender.Male, 28));
        service.addCustomer(new Customer("customer08", "Cheongju", Gender.Female, 33));
        service.addCustomer(new Customer("customer09", "Jeju", Gender.Male, 29));
        service.addCustomer(new Customer("customer10", "Seoul", Gender.Female, 43));
    }
}