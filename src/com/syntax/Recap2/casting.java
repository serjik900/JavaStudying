package Recap2;

public class casting {

	public static void main(String[] args) {
		//Explicit/narrowing/Manual
		//
short largerBox=128;
byte smallerBox=(byte)largerBox;
System.out.println(smallerBox);


//Explicit
int largerBox1=129;
short smallerBox2=(short)largerBox;
System.out.println(smallerBox2);

//Implicit/widening/auto
short smallerBox3=45;
long largerBox3=smallerBox3;
System.out.println(smallerBox3);

	}

}
