package tcsorgula;

import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class TurkishWS {
   
	public boolean TurkishTcSorg(String tc,String ad,String soyad,int yil){
		 boolean ret=false;  
		try {
	             KPSPublicLocator loc = new KPSPublicLocator();
	             KPSPublicSoap soap = loc.getKPSPublicSoap();

	              ret = soap.TCKimlikNoDogrula(new Long(tc),ad, soyad, yil);

	         } catch (Exception e) {
	        	  ret=false;
	         }
		return ret;	
	}
	
	 public static void main(String args[]) {
         try {
             KPSPublicLocator loc = new KPSPublicLocator();
             KPSPublicSoap soap = loc.getKPSPublicSoap();

             boolean ret = soap.TCKimlikNoDogrula(new Long("85648588348"),"MEHMET", "ÖZKAN", 1987);

             System.out.println("My return : " + ret);
         } catch (Exception e) {
             System.err
                     .println("Error occurred while sending SOAP Request to Server");
             e.printStackTrace();
         }
     }
	 
}

 
