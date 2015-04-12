package ar.com.jclaser


/** 
 * Seria la cantidad de producto actual que tengo se compras
 * cada compra genera uno o varios stocks.
 * 
 * @author JuanC
 *
 */
class ProductStock {
	Product product;
	Double amountUnity //precio actual
	Double unity //cantidad entera o variable
	Date expirationDay //fecha de vencimiento
	
    static constraints = {
		expirationDay nullable: false;
    }
}
