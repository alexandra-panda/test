import junit.framework.TestCase;

public class TriangleTest extends TestCase {
    public void testConstructorIsSideNull() throws InvalidTriangleException{
        try {
            Triangle t1 = new Triangle(0,2,3);
            fail("InvalidTriangleException because side [var1] of triangle can't be 0");
        }catch (InvalidTriangleException e){
        }
        try {
            Triangle t1 = new Triangle(2,0,3);
            fail("InvalidTriangleException because side [var2] of triangle can't be 0");
        }catch (InvalidTriangleException e){
        }
        try {
            Triangle t1 = new Triangle(2,3,0);
            fail("InvalidTriangleException because side [var3] of triangle can't be 0");
        }catch (InvalidTriangleException e){
        }
    }

    public void testConstructorIsSideNegative() throws InvalidTriangleException{
        try {
            Triangle t1 = new Triangle(-1, 3, 4);
            fail("InvalidTriangleException because side [var1] of triangle can't be negative");
        } catch (InvalidTriangleException e) {
        }

        try {
            Triangle t1 = new Triangle(3, -1, 4);
            fail("InvalidTriangleException because side [var2] of triangle can't be negative");
        } catch (InvalidTriangleException e) {
        }

        try {
            Triangle t1 = new Triangle(3, 4, -1);
            fail("InvalidTriangleException because side [var3] of triangle can't be negative");
        } catch (InvalidTriangleException e) {
        }
    }


    public void testConstructorIsCorrectSide1() throws InvalidTriangleException{
        try {
            Triangle t1 = new Triangle(15,9,3);
            fail("InvalidTriangleException because var3>var+var2");
        }catch (InvalidTriangleException e){
        }
    }
    public void testConstructorIsCorrectSide2() throws InvalidTriangleException{
        try {
            Triangle t2 = new Triangle(9,15,3);
            fail("InvalidTriangleException because var2>var1+var3");
        }catch (InvalidTriangleException e){
        }
    }
    public void testConstructorIsCorrectSide3() throws InvalidTriangleException{
        try {
            Triangle t3 = new Triangle(3, 9, 15);
            fail("InvalidTriangleException because var3>var+var2");
        } catch (InvalidTriangleException e) {
        }
    }

    public void testIsoscelButNotEquilateral() throws InvalidTriangleException {
        Triangle triangle = new Triangle(7,7,7);
        Boolean expectedResult = false;
        Boolean result = triangle.isIsosceles();
        System.out.println(result);
//        assertTrue("Triunghiul este isoscel, dar este si echilateral", expectedResult.equals(result));
    }

    public void testIsoscelVar12() throws InvalidTriangleException {
        Triangle triangle = new Triangle(7,7,10);
        Boolean expectedResult = true;
        Boolean result = triangle.isIsosceles();
        assertTrue("Triunghiul este isoscel, var1=var2", expectedResult.equals(result));
    }

    public void testIsoscelVar13() throws InvalidTriangleException {
        Triangle triangle = new Triangle(7,10,7);
        Boolean expectedResult = true;
        Boolean result = triangle.isIsosceles();
        assertTrue("Triunghiul este isoscel, var1=var3", expectedResult.equals(result));
    }

    public void testIsoscelVar23() throws InvalidTriangleException {
        Triangle triangle = new Triangle(10,7,7);
        Boolean expectedResult = true;
        Boolean result = triangle.isIsosceles();
        assertTrue("Triunghiul este isoscel, var2=var3", expectedResult.equals(result));
    }

    public void testScalenVar12() throws InvalidTriangleException {
        Triangle triangle = new Triangle(7,7,10);
        Boolean expectedResult = false;
        Boolean result = triangle.isScalene();
        assertTrue("Triunghiul nu este scalen, var1=var2", expectedResult.equals(result));
    }
    public void testScalenVar13() throws InvalidTriangleException {
        Triangle triangle = new Triangle(7,10,7);
        Boolean expectedResult = false;
        Boolean result = triangle.isScalene();
        assertTrue("Triunghiul nu este scalen, var1=var3", expectedResult.equals(result));
    }
    public void testScalenVar23() throws InvalidTriangleException {
        Triangle triangle = new Triangle(10,7,7);
        Boolean expectedResult = false;
        Boolean result = triangle.isScalene();
        assertTrue("Triunghiul nu este scalen, var2=var3", expectedResult.equals(result));
    }
}
