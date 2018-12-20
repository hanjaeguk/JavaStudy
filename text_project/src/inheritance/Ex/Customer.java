package inheritance.Ex;

public class Customer {
//	Product[] banana = new Product[5];
//	Product[] milk = new Product[5];
//	Product[] egg = new Product[5];
//	Product[] bread = new Product[5];
//	
//	int ba = 0;
//	int mi = 0;
//	int eg = 0;
//	int br = 0;
	
//	void buy(Product p) {
//		if(p instanceof Banana) { // p °´Ã¼°¡ Banana³Ä??
//			banana[ba++] = p;
//		}else if(p instanceof Banana) {
//			milk[mi++] = p;
//		}else if(p instanceof Banana) {
//			egg[eg++] = p;
//		}else if(p instanceof Banana) {
//			bread[br++] = p;
//		}
//	}
	Product[] pro = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		pro[i++] = p;

	}
	
	void TotalPrice() {
		int sum = 0;
		for(int j = 0;j<i;j++) {
			sum = sum + pro[j].price;
		}
		System.out.println(sum);

	}
}
