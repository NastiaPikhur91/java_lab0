package lab0;
import java.util.ArrayList;
public class Variant17 {
	/**First Task**************/
	protected class Abc{
		private int sumAC;
		private int sumBC;
		private int sum;
		Abc(){
			sumAC=0;
			sumBC=0;
			sum = 0;
		}
		Abc(int sac, int sbc, int s){
			sumAC = sac;
			sumBC = sbc;
			sum = s;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj==this) {
				return true;
			}
			if(obj==null||obj.getClass()!=this.getClass()) {
				return false;
			}
			
			Abc s =(Abc)obj;
				return (s.sumAC==this.sumAC && s.sum==this.sum && s.sumBC==this.sumBC);
		}
	}
	 public Abc calculate(int a, int b, int c) {
		 Abc q = new Abc();
		 q.sumAC = c-a;
		 q.sumBC = c-b;
		 q.sum = q.sumAC+q.sumBC;
		 return q;
	 }
	 /**Second Task********************/
	 public   int integerTask(int num) {
			assert  num>999 : "Wrong iput";
			num/=1000;
			while(num>=10) 
				num/=10;
			return num;
		}
	 /**Three */
	 public  boolean strTask(int a) {
		 if(a%2!=0 && (a>=100 && a<=999))return true;
		 else return false;
	 }
	 /**Four*/
	 protected class TaskIf{
			private double A;
			private double B;
			private double C;
			TaskIf(){
				A=0;
				B=0;
				C = 0;
			}
			TaskIf(double a, double b, double c){
				A = a;
				B = b;
				C = c;
			}
			@Override
			public boolean equals(Object obj) {
				if(obj==this) {
					return true;
				}
				if(obj==null||obj.getClass()!=this.getClass()) {
					return false;
				}
				
				TaskIf s =(TaskIf)obj;
					return (s.A==this.A && s.B==this.B && s.C==this.C);
			}
		}
		 public TaskIf tetsIfTask(double a, double b, double c) {
			 TaskIf q = new TaskIf(a,b,c);
			 if((a<b && a<c && b<c) || (a>b && b>c && a>c)) {
				 q.A*=2;
				 q.B*=2;
				 q.C*=2;
			 }
			 else {
				 q.A*=-1;
				 q.B*=-1;
				 q.C*=-1;
			 }
			 return q;
		 }
		 
		 
		 
	public  String taskCase(int a) {
		String first="";
		String second="";
		String rez="";
		if(a<10 || a>40) throw new AssertionError("Wron iputt");
		else {
			
			switch(a%10) {
			case 1: first="Один"; break;
			case 2: first="Два"; break;
			case 3: first="Три"; break;
			case 4: first="Четыре"; break;
			case 5: first="Пять"; break;
			case 6: first="Шесть"; break;
			case 7: first="Семь"; break;
			case 8: first="Восемь"; break;
			case 9: first="Девять"; break;
			default: first="";break;
			}
			int n = a/10;
			switch(n) {
			case 1: second="Один"; break;
			case 2: second="Двадцать"; break;
			case 3: second="Тридцать"; break;
			case 4: second="Сорок"; break;
			default: second="";break;
			}
			if(second=="Один") {
				if(first.equals("Один")) 
					{second="Одиннадцать"; first="";}
				else if(first.equals("Два")) 
						{second="Двенадцать"; first="";}
				else if(first.equals("Три")) 
					{second="Тринадцать"; first="";}
				else if(first.equals("Четрые")) 
					{second="Четырнадцать"; first="";}	
				else if(first.equals("Пять")) 
					{second="Пятнадцать"; first="";}
				else if(first.equals("Шесть")) 
					{second="Шестнадцать"; first="";}
				else if(first.equals("Семь")) 
					{second="Семнадцать"; first="";}
				else if(first.equals("Восемь")) 
					{second="Восемнадцать"; first="";}	
				else if(first.equals("Девять")) 
					{second="Девятнадцать"; first="";}
				else  
					{second="Десять"; first="";}
			}
		
		}
			
		rez=second+" "+first+" учебных заданий";
		return rez;
	}
	
	
	
	
	public  double forTask(double A, int N) {
		double res=1;
		if (N<=0)  throw new AssertionError("Wron iputt");
		else
			for (int i=1; i<=N; i++) 
				res+= Math.pow(A, i) ;
		return res;
	}
	
	
	public  ArrayList whileTask(int n){
		ArrayList rez = new ArrayList();
		while(n!=0) {
			rez.add(n%10);
			n/=10;
		}
		return rez;
	}
	
	
	
	double arrTask(double[] mas, int n){
		double rez = 0.0;
		for (int i=0; i<n; i++) 
			if(i==n-2) 
				return rez;
			else {
					if(mas[i]<=mas[i+1] && mas[i+1]>=mas[i+2] && rez<=mas[i+1]) 
						rez=mas[i+1];
				}
		return rez;
	}
	
	
	
	
public  int[][]  matrixTask(int [][] mas, int n, int m){
		
		int a = mas[0][0];
		int index = 0;
		for (int i= 0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mas[i][j]<a) {
					a=mas[i][j];
					index = j;
				}
			}
		}
		
		int [][]arr = new int [n][m-1];
		if (index!=m-1)
		for (int i=0, I=0; i<n; i++) {
			for (int j=0, J=0; j<m; j++) {
				arr[I][J]=mas[i][j];
					J++;
					if(J==m-1) {
						J=0;
						I++;
					}
			}
		}
		else {
			for (int i=0; i<n; i++) {
				for (int j=0; j<m-1; j++) {
					arr[i][j]=mas[i][j];
						
					}
			}
		}
		return arr;
	}

	public static void main (String args[]) {
		
	 }
	 
}
