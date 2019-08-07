package aug5;

import org.openqa.selenium.WebDriver;

import selenium.methods;

public class functiondrivenmain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		methods met = new methods();
		String kw = null;
		String xp = null;
		String td = null;
		String file_path = "D:/aug5.xlsx";
		fdmethod fdm = new fdmethod();
		
		WebDriver dr =null ;
		
		for(int i =1 ; i < 6; i++)
		{
			for(int j = 1 ; j < 4; j++)
			{
				switch(j)
				{
				case 1:
					kw = met.read(i, j, file_path);
					break;
				case 2:
					xp = met.read(i, j, file_path);
					break;
				case 3:
					td = met.read(i, j, file_path);
					break;			
				}
			}

			switch(kw)
			{
			case "launch browser":
				dr = fdm.browser(td);
				break;
			case "enter text":
				fdm.enter_txt(xp, td, dr);
				break;
			case "click":
				fdm.click(xp, dr);
				break;
			case "verify":
				if( fdm.verify(xp, td, dr))
					met.write(i, 4, file_path, "Passed");
				else
					met.write(i, 4, file_path, "Failed");
				break;
			}
		}

	}

}
