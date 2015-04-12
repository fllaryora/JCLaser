package ar.com.jclaser

/** es la lista de los producros de una compra,
 *  o el stock original desde otro punto de vista
 * 
 * @author JuanC
 *
 */
class PurchseProduct {
	Purchase purchase
	Product product
	Double currentAmount;
	Integer volume;
	//la fecha esta en el movimiento
    static constraints = {
		
    }
	
}
