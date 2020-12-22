package leetcode_JPMC;

import java.util.Vector;

//import sun.jvm.hotspot.tools.SysPropsDumper;

public class A1 {

	
	public static int binaaa (int a) {
		int p = (int)Math.pow(2, a);
		int count = 0;
		
		for(int i=0; i<p;i++) {
			String aa = Integer.toBinaryString(i);
			if(!aa.contains("11")) {
				count++;
				System.out.println(aa);
			}
				
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(binaaa(3));
		
		
		/*
		 * Vector<String> interfaceStatuses = new Vector<String>();
		 * interfaceStatuses.add("active"); interfaceStatuses.add("inactive");
		 * interfaceStatuses.add("inactive"); int minActive = 2;
		 * 
		 * int count = 0; for (String string : interfaceStatuses) {
		 * if(string.equals("active")) { count++; if(count>=2) System.out.println(
		 * true); } } System.out.println( false);
		 * 
		 * 
		 * String a = "Ethernet13" + "DeviceConfig";
		 * 
		 * String b = "Ethernet8"; System.out.println(a.indexOf("Ethernet{[]}"));
		 * System.out.println(a.contains("Ethernet")); System.out.println(b.length());
		 * System.out.println(b.charAt(8));
		 * 
		 * 
		 * char cc = b.charAt(8);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("Ethernet1".contains("Ethernet"));
		 * 
		 * 
		 * System.out.println(Integer.toBinaryString(31));
		 */
		
		
		
		
				
		
		
		
	}
	
	

}
