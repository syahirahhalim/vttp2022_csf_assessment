// Add your models here if you have any

export interface OrderSummary {
    orderId: number
	name: string 
	email: string 
	amount: any
    
}

export interface Order {
     orderId: number
	 name: string 
	 email: string 
	 size: number 
	 sauce: string
	 thickCrust: boolean
     toppings: string
     comments: string
}
 
export type OrderDB = {
    [ key: string ] : Order
}

export const orderDB: OrderDB = {}