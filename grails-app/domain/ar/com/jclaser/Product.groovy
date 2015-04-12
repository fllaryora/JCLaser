package ar.com.jclaser
/** Productos de interes, no comprables sino de lista*/
class Product {
	 String name;
	  String detail;
	  String barCode;
	  Double least //'el stock del producto no deberia bajar de este valor' ,
	  Double highest // 'el stock del producto no deberia superar este valor' ,
	  Integer expitarionDayWarning // 'el stock  peligrara en el periodo con vencerse' ,
    static constraints = {
		name nullable: false;
		detail nullable:true;
		barCode nullable:true;
		least nullable:true;
		highest nullable:true;
		expitarionDayWarning nullable:true;
    }
}
