import ar.com.jclaser.Movement

class BootStrap {

    def init = { servletContext ->
		try{
		Movement mv = Movement(amount: 12.3, placeIndicator:1,lastUpdated:new Date())
		mv.save(failOnError:true)
		} catch(Exception e){
		prinntln "Error " + e.getMessage()
		}
    }
    def destroy = {
    }
}
