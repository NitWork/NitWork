package test;

import main.Add;

public class Add_Opration {
   public static void main(String[] args) {
	   Add ad=new Add() {

		@Override
		public int addMe(int x, int y) {
			int z=x+y;
			return z;
		}
		   
	   };
	   System.out.println(ad.addMe(30, 6));
   }
}
