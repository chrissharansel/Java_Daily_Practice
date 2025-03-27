package Collections.ArrayList.Orders;

public class Order {
	int orderId;
	String customerName;
	double totalAmount;
	
	Order(int orderId,String customerName,double totalAmount){
		this.orderId=orderId;
		this.customerName=customerName;
		this.totalAmount=totalAmount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", totalAmount=" + totalAmount + "]";
	}
}
