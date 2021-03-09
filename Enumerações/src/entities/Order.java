package entities;

import java.util.Date;

import entities.aula1.OrderStatus;

public class Order {
	
	private Integer Id;
	private Date moment;
	private OrderStatus status;
	

		public Order() {
			
		}


		public Order(Integer id, Date moment, OrderStatus status) {
			super();
			Id = id;
			this.moment = moment;
			this.status = status;
		}


		public Integer getId() {
			return Id;
		}


		public void setId(Integer id) {
			Id = id;
		}


		public Date getMoment() {
			return moment;
		}


		public void setMoment(Date moment) {
			this.moment = moment;
		}


		public OrderStatus getStatus() {
			return status;
		}


		public void setStatus(OrderStatus status) {
			this.status = status;
		}


		@Override
		public String toString() {
			return "Order [Id=" + Id + ", moment=" + moment + ", status=" + status + "]";
		}
		
		
}
