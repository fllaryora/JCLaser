package ar.com.jclaser

class WorkOrderDetails {
	WorkOrder workOrder
	JointWork work
	Double fees; //es el precio que se realizo la venta en el pasado, el precio de ahora pudo haber aumentado
	Double hours //cantidad de horas insumidas
	String observation
    static constraints = {
		observation nullable:true
    }
}
