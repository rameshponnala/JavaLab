import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
	 String author() default "Ramesh Ponnala";
	 String course() default "OOP Java";
}
