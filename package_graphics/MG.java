import package_graphics.*;

public class MG {
    public static void main(String []args){
       package_graphics.pg testObj = new  package_graphics.pg();
	
        System.out.println(testObj.recArea(1,2));
        System.out.println(testObj.cirArea(10));
        System.out.println(testObj.squArea(10));
        System.out.println(testObj.triArea(10,2));
    }
} 