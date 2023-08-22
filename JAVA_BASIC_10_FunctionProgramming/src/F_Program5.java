import java.util.ArrayList;
import java.util.List;

enum Gender{
    Male, FeMale
}

enum SearchOption{
    Location , Gender
}


// DTO(VO) 객체
class Customer{
    private String id;
    private String location;
    private Gender gender;  //enum 열거 타입
    private int age;


    public Customer(String id, String location, Gender gender, int age) {
        super();
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
        return "Customer [id=" + id + ", location=" + location + ", gender=" + gender + ", age=" + age + "]";
    }

}

class CustomerService{
    private List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer newCustomer) {
        this.customers.add(newCustomer);
    }

    //요구사항
    //location 지역으로 검색된 고객목록 추출
    //parameter  location
    //명령형 (imperative)
    public List<Customer> searchCustomerByLoation(String location){

        List<Customer> findCustomers = new ArrayList<>();
        for(Customer customer : customers) {
            if(customer.getLocation().equals(location)) {
                findCustomers.add(customer);
            }
        }
        return findCustomers;
    }

    //요구사항
    //성별로 검색하기
    public List<Customer> searchCustomerByGender(Gender gender){

        List<Customer> findCustomers = new ArrayList<>();
        for(Customer customer : customers) {
            if(customer.getGender().equals(gender)) {
                findCustomers.add(customer);
            }
        }
        return findCustomers;
    }

    //요구사항
    //지역 검색 하는 함수와 성별로 검색하는 함수를 통합
    public List<Customer> searchCustomerBy(SearchOption searchoption, String searchvalue){
        List<Customer> findCustomers = new ArrayList<>();
        for(Customer customer : customers) {
            if(searchoption.equals(searchoption.Location)) {
                //지역검색
                if(customer.getLocation().equals(searchvalue)) {
                    findCustomers.add(customer);
                }
            }else if(searchoption.equals(searchoption.Gender)) {
                //성별검색
                if(customer.getGender().name().equals(searchvalue)) {  //주의
                    findCustomers.add(customer);
                }
            }

        }
        return findCustomers;
    }


    //인터페이스를 기반으로 검색하기
    public List<Customer> searchCustomer(SearchFilter filter){

        List<Customer> foundCustomers = new ArrayList<>();

        for(Customer customer : customers) {
            if(filter.isMatched(customer)) { //일치 한다면 .... //filter.isMatched 구현해야 합니다
                foundCustomers.add(customer);
            }
        }

        return foundCustomers;
    }
}

//추가사항 ......
interface SearchFilter{
    boolean isMatched(Customer customer);
}



public class F_Program5 {

    public static void main(String[] args) {

        CustomerService service = new CustomerService();
        initData(service);

        List<Customer> results = new ArrayList<>();


		/*
		//익명 객체
		Thread th3 = new Thread(new Runnable() {  //
			@Override
			public void run() {
				//제어 구문 사용
				for(int i = 0 ; i < 1000 ; i++) {
					System.out.println("th3 " + i); //내부적으로 생성된 이름 반환
				}
				System.out.println("th3 함수 END");
			}
		});
		th3.start();



		*/

        //SearchFilter 인터페이스를 익명 객체 구현
        results = service.searchCustomer(new SearchFilter() { //익명 객체 (클래스 라는 이름이 없는) 1회성

            @Override
            public boolean isMatched(Customer customer) {
                if(customer.getLocation().equals("Seoul")) {
                    return true;
                }else {
                    return false;
                }

            }
        });

        for(Customer customer :results) {
            System.out.println(customer);
        }

        //우리가 ...종착역   Stream 사용하기 (API)
        //Stream 은 람다식을 사용
        //Collection 자원을 효울적으로 필터링 조회 ..... (성능)

        System.out.println("-------------람다식-----------------");

        List<Customer> results2 = new ArrayList<>();
        results2 = service.searchCustomer(customer -> customer.getGender().equals(Gender.Male));
        for(Customer customer :results2) {
            System.out.println(customer);
        }

        System.out.println("------------람다식-------------------");
        List<Customer> results3 = new ArrayList<>();
        results3 = service.searchCustomer(customer -> customer.getLocation().equals("Seoul") && customer.getAge() > 40);
        for(Customer customer :results3) {
            System.out.println(customer);
        }
    }
    public static void initData(CustomerService service) {
        service.addCustomer(new Customer("customer01", "Seoul",   Gender.Male, 30));
        service.addCustomer(new Customer("customer02", "Busan",   Gender.FeMale, 55));
        service.addCustomer(new Customer("customer03", "Seoul",   Gender.FeMale, 13));
        service.addCustomer(new Customer("customer04", "Gwangju", Gender.Male, 27));
        service.addCustomer(new Customer("customer05", "Gwangju", Gender.FeMale, 60));
        service.addCustomer(new Customer("customer06", "Incheon", Gender.Male, 29));
        service.addCustomer(new Customer("customer07", "Seoul",   Gender.Male, 42));
        service.addCustomer(new Customer("customer08", "Seoul",   Gender.FeMale, 45));
        service.addCustomer(new Customer("customer09", "Seoul",   Gender.FeMale, 33));
        service.addCustomer(new Customer("customer10", "Seoul",   Gender.Male, 20));
    }

}