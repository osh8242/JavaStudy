package kr.or.kosa;

public class FakeFlower {
	private String flowerName;
	private int flowerPrice;
	private boolean available;

	public FakeFlower(String flowerName, int flowerPrice, boolean available) {
		this.flowerName = flowerName;
		this.flowerPrice = flowerPrice;
		this.available = available;
	}

	public String getFlowerName() {
		return flowerName;
	}

	public int getFlowerPrice() {
		return flowerPrice;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
