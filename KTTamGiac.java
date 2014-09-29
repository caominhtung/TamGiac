

public class KTTamGiac {
	 static String Tg(int a, int b, int c){
			String Tg = new String();
			int KQ;
	
			if((a+b<=c)||(b+c<=a)||(c+a<=b)){
				KQ=0;
				Tg = "Khong phai tam giac.";
			}else{
				KQ=1;
			}
			
			if(KQ==1){
				if((a==b)||(b==c)||(c==a)){
					Tg = "Tam giac can.";
				}else if((a==b) && (b==c)){
					Tg = "Tam giac deu.";
				}else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a)){
					Tg = "Tam giac vuong.";
				}else{
					Tg = "Tam giac thuong.";
				}
				
				//return Tg;	
			}
			return Tg;
	}
}

