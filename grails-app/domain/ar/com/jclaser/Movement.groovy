package ar.com.jclaser
/** movimientos de efectivo realizados por compras ventas,
 * sacar plata de la caja por xxx, o ponerla por xxx
 */
class Movement {
	
	Double amount ; //importe
	int placeIndicator;
	Date lastUpdated;//fecha del movimiento

	static constraints = {
		amount nullable:false;
		placeIndicator nullable:false;
		lastUpdated nullable:false;
    }
}
