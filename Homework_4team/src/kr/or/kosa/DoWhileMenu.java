package kr.or.kosa;

import java.util.Scanner;

public class DoWhileMenu {

	public int displayMenu(FakeFlower flower1, FakeFlower flower2, FakeFlower flower3, FakeFlower flower4) {
		int inputValue = 0;
		do {
			System.out.println("*******************");
			System.out.println("*******꽃자판기*******");
			System.out.println("*******************");
			System.out.println("**  @   **   #   **");
			System.out.println("**  |   **   |   **");
			System.out.println("**1.장미 **2.카네이션**");
			System.out.println("*******************");
			System.out.println("**  &   **   ^   **");
			System.out.println("**  |   **   |   **");
			System.out.println("**3.무궁화**4.국화  **");
			System.out.println("*******************");
			System.out.println("**************   **");
			System.out.println("*******************");

			System.out.println("******조화판매기******");
			if (!flower1.isAvailable()) {
				System.out.print("(재고없음) ");
			}
			System.out.println("1. " + flower1.getFlowerName() + "\t\t" + flower1.getFlowerPrice() + "원");
			if (!flower2.isAvailable()) {
				System.out.print("(재고없음) ");
			}
			System.out.println("2. " + flower2.getFlowerName() + "\t" + flower2.getFlowerPrice() + "원");
			if (!flower3.isAvailable()) {
				System.out.print("(재고없음) ");
			}
			System.out.println("3. " + flower3.getFlowerName() + "\t\t" + flower3.getFlowerPrice() + "원");
			if (!flower4.isAvailable()) {
				System.out.print("(재고없음) ");
			}
			System.out.println("4. " + flower4.getFlowerName() + "\t\t" + flower4.getFlowerPrice() + "원");
			System.out.println("********************");

			System.out.println("호갱님 환영합니다");
			System.out.println("구매를 원하시는 상품의 번호를 입력하세요");
			Scanner sc = new Scanner(System.in);
			inputValue = Integer.parseInt(sc.nextLine());

			if (inputValue != 1 && inputValue != 2 && inputValue != 3 && inputValue != 4) {
				System.out.println("올바른 메뉴번호를 입력하세요");
				System.out.println("=====================================================================");
				System.out.println();
			} else {
				break;
			}
		} while (true);

		return inputValue;
	}

}
