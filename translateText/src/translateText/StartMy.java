package translateText;

public class StartMy {
	private String[] list ;
	private String[] list1 ;
	private  int k;
	private String[][] fullList = new String[5][1000];
	private  int j=0,howMuch=50/*��� ����� ����� ���������*/;
	public ReadText myN;
    public StartMy() {
    	myN = new ReadText("D:/test.txt");//������� ����
    	myN.loadfulldate(createFullList( myN.getS()),howMuch);
    	
    	 }

	private String[][] createFullList(String myString) {
		list =	myString.split("H=0-4:0", 2);//�������� ���������� �����
		 list1 =	list[1].split(",");
	        for ( int n=1;n< list1.length;n++) {
	        	if (k<6) {
	        		
	        		fullList[k][j]=list1[n];
	        	
	        		 k++;	
	        	}
	        	
	        	
	        if (k==5) {

	        	k=0;
	        	j++;
	        	
	        }
		
		
	}

	        return fullList;
  
    }}
    
    



