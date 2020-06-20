import javax.swing.JOptionPane;

class Bicycle{
    
String brand;        
int gear;
int wheels;

String brandGet() {
    
return brand;    
}      
    
int gearGet() {
return gear;

}    
    
int wheelsGet() {
return wheels;    
    
}

void brandSet (String brandReturned){
    
brand = brandReturned;    
}

void gearSet (int gearReturned){
    
gear = gearReturned;
}

void wheelsSet (int wheelsReturned){
    
wheels = wheelsReturned;   
}


Bicycle(String brandInitialize, int gearInitialize, int wheelsInitialize){
  
brand = brandInitialize;    
gear =  gearInitialize;
wheels = wheelsInitialize;

}


}


public class JavaApplicationProject {

    
    public static void main(String[] args) {
        
        String brandInitialize="";
        int gearInitialize=0;
        int wheelsInitialize=0;
        
        String geartInitialize;
        String wheelstInitialize;
        
        
        while(brandInitialize.isEmpty()){          
         brandInitialize = JOptionPane.showInputDialog(null, "Please provide bicycle brand"); 
        }
                
        while (gearInitialize <1 || gearInitialize >3){
            
            geartInitialize= JOptionPane.showInputDialog(null, "Please provide bicycle gear value"); 
            
              if(geartInitialize.matches("\\d+")) gearInitialize= Integer.parseInt(geartInitialize);
        }
        
        while (wheelsInitialize <2 || wheelsInitialize >3){
            
            wheelstInitialize =JOptionPane.showInputDialog(null, "Please provide bicycle number of wheels"); 
        
                if(wheelstInitialize.matches("\\d+")) wheelsInitialize= Integer.parseInt(wheelstInitialize);
        }
        
        Bicycle bicycle1 = new Bicycle(brandInitialize, gearInitialize, wheelsInitialize);
        
        
        System.out.println("Bicycle brand : " + bicycle1.brandGet() );
        System.out.println("Bicycle gear value : " + bicycle1.gearGet() );
        System.out.println("Bicycle number of wheels : " + bicycle1.wheelsGet() );
        
       
        
        
    }
    
}
