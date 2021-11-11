package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@interface info{
	int authorID();
	String author() default "null";
	String supervisor() default "null";
	String date();
	String time();
	int version();
	String description() default "general class";
}

@info(authorID =45, date ="6 june", time ="9am", version =18)
public class custom{
	public static void main(String[]args) {
}
	
}