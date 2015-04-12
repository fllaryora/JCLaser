package ar.com.jclaser

class Pearson {
	String businessName; //razon social del proveedor
	String dni;
	String phone;
	String email;
	String cuit;
	String cuil;
	Integer repute;
    static constraints = {
		businessName nullable:false;
		repute nullable:false;
		dni nullable:true
		phone nullable:true;
		email nullable:true;
		cuit nullable:true;
		cuil nullable:true;
		
    }
}
