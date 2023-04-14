package kr.or.kosa;

import java.util.Scanner;

public class FakeFlowerVendingMachine {
	private int serialNum;
	private String brandName;
	private int asPeriod;

	public FakeFlowerVendingMachine(int serialNum, String brandName, int asPeriod) {
		this.serialNum = serialNum;
		this.brandName = brandName;
		this.asPeriod = asPeriod;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public String getBrandName() {
		return brandName;
	}

	public int getAsPeriod() {
		return asPeriod;
	}

	public boolean isConfirmed(FakeFlower selectedFlower) {
		if (!selectedFlower.isAvailable()) {
			return false;
		}
		System.out.printf("선택하신 상품은 [%s], 가격은 [%d]입니다.\n", selectedFlower.getFlowerName(),
				selectedFlower.getFlowerPrice());
		System.out.println("구매하시겠습니까?");
		System.out.println("1.Yes\t2.No");
		Scanner sc = new Scanner(System.in);
		int inputValue = Integer.parseInt(sc.nextLine());
		if (inputValue == 1) {
			return true;
		} else if (inputValue == 2) {
			return false;
		} else {
			System.out.println("1(결제) 혹은 2(취소) 숫자를 눌러주세요");
			return false;
		}

	}

	public void buyProduct(FakeFlower selectedFlower) {
		System.out.println("금액을 투입하세요");
		int inputCash = 0;
		int change = 0;
		do {
			Scanner sc = new Scanner(System.in);
			inputCash += Integer.parseInt(sc.nextLine());
			change = inputCash - selectedFlower.getFlowerPrice();
			if (change < 0) {
				System.out.println("금액이 부족함니다..T^T");
				System.out.println("부족한 금액은 " + Math.abs(change) + "입니다");
				System.out.println("금액을 더 넣어주세요^0^");

			} else {
				selectedFlower.setAvailable(false);
				System.out.println("=====================================================================");
				System.out.println("호갱님, 구매해주셔서 감사합니다.");
				System.out.println("구매하신 " + selectedFlower.getFlowerName() + "를 받으세요");
				System.out.println("거스름돈은 " + change + "입니다");
				System.out.println("이용해주셔서 감사함니다");
				System.out.println("=====================================================================");

			}
		} while (change < 0);

	}

}
