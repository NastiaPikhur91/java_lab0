package lab0;

import org.testng.annotations.Test;
import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.Assert;
public class TestVariant17 {
	/*************************************************/
	@DataProvider
	public Object[][]testABC(){
		return new Object[][] {
			{15, 25, 40, 25,15,40}
		};
	}
	Variant17 main = new Variant17();
	@Test (dataProvider = "testABC")
	public void testForABC(int a, int b, int c, int test1, int test2, int test3) {
		assertEquals(main.calculate(a,b,c), main.new Abc(test1, test2, test3));
		}
	/*************************************************/
	@DataProvider
	public Object[][] testInt(){
		return new Object[][] {
			{350}, {517}
		};
	}
	/*@Test (dataProvider = "testInt")
	public void testForInt(int a, int b) {
		assertEquals(new Variant17().integerTask(a), b);
	}*/
	@Test(expectedExceptions = AssertionError.class, dataProvider ="testInt")
	public void erorrtest2(int a) {
		new Variant17().integerTask(a);
	}
	/*************************************************/
	@DataProvider
	public Object[][] testBool(){
		return new Object[][] {
			{358, false},{567,true} 
		};
	}
	@Test (dataProvider = "testBool")
	public void testForbool(int a, boolean r) {
		assertEquals(new Variant17().strTask(a),r);
	}
	/*************************************************/
	@DataProvider
	public Object[][]testIf(){
		return new Object[][] {
			{1,2,3,2,4,6},{5,-4,10,-5,4,-10}
		};
	}
	@Test (dataProvider = "testIf")
	public void testForIf(double a, double b,double c, double test1, double test2, double test3) {
		assertEquals(main.tetsIfTask(a, b, c), main.new TaskIf(test1, test2, test3));
		}
	
	@DataProvider
	public Object[][] testCase(){
		return new Object[][] {
			{35, "Тридцать Пять учебных заданий"}, {15, "Пятнадцать  учебных заданий"}
		};
	}
	/*************************************************/
	@Test (dataProvider = "testCase")
	public void testForCase(int a, String r) {
		assertEquals(new Variant17().taskCase(a),r);
	}
	@Test(expectedExceptions = AssertionError.class)
	public void erorrtest() {
		new Variant17().integerTask(86);
	}
	/*************************************************/
	@DataProvider
	public Object[][]testFor(){
		return new Object[][] {
			{5,3,156.0},{3.6,7,10850.0381056}
		};
	}
	@Test(dataProvider="testFor")
	public void testFortest(double a, int n, double rez) {
		assertEquals(new Variant17().forTask(a, n),rez);
	}
	@Test(expectedExceptions = AssertionError.class)
	public void erorrtest5() {
		new Variant17().forTask(256.0, -1);
	}
	/*********************************************************/
	@DataProvider
	public Object[][]testWhile(){
		 ArrayList mas = new ArrayList();
		 mas.add(3);
		 mas.add(6);
		 mas.add(1);
		 ArrayList mas1 = new ArrayList();
		 mas1.add(1);
		 mas1.add(5);
		 mas1.add(6);
		 mas1.add(9);
		return new Object[][] {
			{163,mas},{9651, mas1}
		};
	}
	@Test(dataProvider="testWhile")
	public void testForWhile(int a,  ArrayList arr) {
		assertEquals(new Variant17().whileTask(a),arr);
	}
	/********************************************/
	@DataProvider
	public Object[][]testArr(){
		return new Object[][] {
			{ new double[] {3,5,3,5,3,5,21,5,12},9,21}, {new double [] {3,5,234,5,43,5},6,234}
		};
	}сыг
	@Test(dataProvider = "testArr")
	public void testForArr(double [] mas, int n, double r) {
		assertEquals(new Variant17().arrTask(mas, n),r);
	}
	@Test
	public void testMartix() {
		int [][] mas = {{1,2,3,4},
				{8,38,1,2},
				{4,2,5,24},
				{2,5,40,-5}};
		int [][] rez = {{1,2,3},
				{8,38,1},
				{4,2,5},
				{2,5,40}};
		int n = 4;
		int m = 4;
		
		Assert.assertTrue(Arrays.deepEquals(new Variant17().matrixTask(mas,n,m), rez));
		
	}

}
