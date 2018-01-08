import java.util.concurrent.TimeUnit;
class Test
{
	public static void main(String[] args) throws InterruptedException {
		
		//with reference of super class and object of SuperClass lets see what all can be done
		SuperClass su=new SuperClass();//1
		su.method1(); //only method 1 can be accessed using SuperClass method and SuperClass object
		
		TimeUnit.SECONDS.sleep(3);//this method has been used for 3 seconds delay before calling the next method 
		//with reference of SuperClass creating a SubClass member
		SuperClass su1= new SubClass();//2
		su1.method1();
	//even by creating an object of SubClass with reference of SuperClass we can access only method 1 because 
	//the reference pointer only knows about the methods of SuperClass as it is pointing to SuperClass 
		
	/* you dont have to worry about this comment until you reach the last line

		su1.method2();
	*/
	
		
		//SubClass sb=new SuperClass();//3
		//you cannot create an SuperClass object by referring to SubClass
		//ie SubClass reference cannot create an object of SuperClass
		TimeUnit.SECONDS.sleep(3);//this method has been used for 3 seconds delay before calling the next method 
		SubClass sb1=new SubClass();//4
		sb1.method1();
		sb1.method2();
		//wooah a SubClass reference with SubClass object can implement both the methods from SubClass and also from SuperClass
		
	}
}

		class SuperClass 
		{
				public void method1()
				{
					System.out.println("This method is from SuperClass");
				}
			/* you dont have to worry about this comment until you reach the last line
			 *this method is created so that the SuperClass reference knows about the subclass method which will be overridden in subclass 
				public void method2()
				{
				
				}
			*/	
			
		}

		class SubClass extends SuperClass
		{
			public void method2()
			{
				System.out.println("This method is from SubClass");
			}
		}
		
		
//now if you want to access subclass members using superclass reference you will have to create an abstract method of of subclass so that 
//the superclass reference can know about the method present in subclass and can override it
//by removing comments which under /* ...... */ we can see that method2 of subclass can be accessed with the reference of superclass and object of subclass
