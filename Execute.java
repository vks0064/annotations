package annotation3;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int sequence()default 0;
	
}


public class execute3 {
public static void main(String[]args) {
}

}
class testing {
	 private int pin;
	 public testing(int pin) {this.pin=pin;}
	 
	 


     @Execute()
     public static void run2() {
     }
     
     
     @Execute()
     public static void run()
     {
    	 
     }
     
     @Execute()
     public static void run3()
     {
    	 
     }
}
     
