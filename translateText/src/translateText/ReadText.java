package translateText;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class   ReadText {
	String s,nextS0,nextS1,nextS2,nextS3,nextS4 = "";
	
	String[] fullList2 = new String[1000];
	 public String getS () {
	       return s;
	    }
	
	public ReadText(String string) {
	Scanner in;
		try {
			in = new Scanner(new File(string));
			while(in.hasNext())
				s += in.nextLine() + "\r\n";
				in.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void loadfulldate(String[][] fullList, int  howMuch)//���������� ������ �� �����������
	{
	int w=0;
		for(int n=0;n<howMuch;n++ )
		{
			
				nextS0=fullList[0][n].split(":")[1];//�������� ������ �� ����������
				nextS1=fullList[1][n].split(":")[1];
				nextS2=fullList[2][n].split(":")[1];
				nextS3=fullList[3][n].split(":")[1];
				nextS4=fullList[4][n].split(":")[1];
				
				//��������� �� ����� ������
				UnloadingFiles UnloadingFiles=new UnloadingFiles(nextS0,nextS1,nextS2,nextS3,nextS4);
				fullList2[n]=UnloadingFiles.getString();//������������ ������
				
			}
		MyFreme	frame=new MyFreme(fullList2);//����� �� ������ ������
	
		
	    }
	public String[] getfullList2(){
		return fullList2;
	}
		
	}
	
		
	
	
	



