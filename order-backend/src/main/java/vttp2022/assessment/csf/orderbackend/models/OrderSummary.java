package vttp2022.assessment.csf.orderbackend.models;

import java.util.List;

// IMPORTANT: You can add to this class, but you cannot delete its original content

public class OrderSummary {
	public static final List<OrderSummary> priceSvc = null;
    private Integer orderId;
	private String name;
	private String email;
	private Float amount;

	public void setOrderId(Integer orderId) { this.orderId = orderId; }
	public Integer getOrderId() { return this.orderId; }

	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	public void setEmail(String email) { this.email = email; }
	public String getEmail() { return this.email; }

	public void setAmount(Float amount) { this.amount = amount; }
	public Float getAmount() { return this.amount; }

}
