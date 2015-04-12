package ar.com.jclaser

class Customer extends Pearson{
	static hasMany = [workOrders: WorkOrder]
    static constraints = {
    }
	
}
