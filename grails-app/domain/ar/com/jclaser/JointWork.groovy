package ar.com.jclaser

//trabajos Comunes ralizados
class JointWork {
	String name;
	String details
	String barCode //codigo de barra
	Double fees //precio por hora o por realizar el trabajo
    static constraints = {
		details nullable:true
		barCode nullable:true
    }
}
