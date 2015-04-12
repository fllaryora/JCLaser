package ar.com.jclaser


//venta desde el cliente
class WorkOrder {
	
	Customer customer;// destino de la compra
	Date initialDate //fecha inicio de la orden
	Date endDate // fecha fin estimacion de la orden
	Movement move //plata total que se movio en la compra
	String status // estado de la orden //ICE, todo, wip, done
	String observations ;//observaciones
	
	static hasMany = [ detail: WorkOrderDetails]
	//details tiene dentro el joint work que se hiso
    static constraints = {
		endDate nullable:true;
		observations nullable : true
    }
}
