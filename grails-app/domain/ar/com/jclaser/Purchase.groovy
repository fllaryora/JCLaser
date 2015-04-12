package ar.com.jclaser
/** obtengo stock de productos del proveedor
 * 
 * @author JuanC
 *
 */
class Purchase {
	Provider provider; //origen de la compra'
	Movement move; //plata total que se movio en la compra';
	static hasMany = [purchaseProducts: PurchseProduct]
    static constraints = {
		provider nullable:false;
		move nullable:false;
    }
}
