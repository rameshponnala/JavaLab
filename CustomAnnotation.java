import java.lang.annotation.Annotation;
//@MyAnnotation
@MyAnnotation(author="Rams",course="custom annotaion demo class")
class CustomAnnotation 
{
	public static void main(String[] args) 
	{
		CustomAnnotation ca=new CustomAnnotation();
		Class c=ca.getClass();
		Annotation an=c.getAnnotation(MyAnnotation.class);
		MyAnnotation custom=(MyAnnotation)an;
		System.out.println("Annotated Author is: "+custom.author());
		System.out.println("Annotated course is: "+custom.course());

	}
}
