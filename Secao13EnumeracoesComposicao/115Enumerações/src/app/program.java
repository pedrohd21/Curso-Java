package app;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class program {

	public static void main(String[] args) {
//		Enumera��es
//		� � um tipo especial que serve para especificar de forma literal um
//		conjunto de constantes relacionadas
//		� Palavra chave em Java: enum
//		� Vantagem: melhor sem�ntica, c�digo mais leg�vel e auxiliado pelo
//		compilador
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
