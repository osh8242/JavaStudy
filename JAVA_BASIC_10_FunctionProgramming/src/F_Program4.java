import java.util.ArrayList;
import java.util.List;

enum Gender {
    Male, Female
}

enum SearchOption {
    Location, Gender
}

class Customer {
    private String id;
    private String location;
    private Gender gender;
    private int age;

    public Customer(String id, String location, Gender gender, int age) {
        this.id = id;
        this.location = location;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    //요구사항
    //location 지역으로 검색된 고객목록을 추출해라!!
    //parameter로 location을 받아서 일치한 customer 배열을 리턴하면됨
    //명령형(imperative)
    public List<Customer> searchCustomerByLocation(String location) {
        List<Customer> customersByLocation = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getLocation().equals(location)) customersByLocation.add(customer);
        }
        return customersByLocation;
    }

    //요구사항
    //성별로 검색하기
    public List<Customer> searchCustomerByGender(Gender gender) {
        List<Customer> customersByGender = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getGender().equals(gender)) customersByGender.add(customer);
        }
        return customersByGender;
    }

    public List<Customer> searchCustomerBy(SearchOption searchOption, String searchValue) {
        List<Customer> customersBySearchOption = new ArrayList<>();
        for (Customer customer : customers) {
            if (searchOption.equals(SearchOption.Location)) {
                if (customer.getLocation().equals(searchValue)) customersBySearchOption.add(customer);
            } else if (searchOption.equals(SearchOption.Gender)) {
                if (customer.getGender().name().equals(searchValue)) customersBySearchOption.add(customer);
            }
        }
        return customersBySearchOption;
    }
}

public class F_Program4 {
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

        //옵션검색
        List<Customer> result3 = customerService.searchCustomerBy(SearchOption.Gender, "Female");
        System.out.println("옵션검색(성별)");
        for (Customer customer : result3) {
            System.out.println(customer);
        }

        //옵션검색
        List<Customer> result4 = customerService.searchCustomerBy(SearchOption.Location, "Seoul");
        System.out.println("옵션검색(지역)");
        for (Customer customer : result4) {
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