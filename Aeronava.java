public class Aeronava {
  
    public String id_aeronava;
    public String model;
        
    
    public Aeronava(String id_aeronava, String model) {
        this.id_aeronava = id_aeronava;
        this.model=model;
    }
        
   public String setIdAeronava(String id_aeronava)
 {
    this.id_aeronava= id_aeronava;
    return id_aeronava;
  }
  
   public String setModel(String model)

	 {
	  this.model = model;
	  return model;
	 }
    
     
}