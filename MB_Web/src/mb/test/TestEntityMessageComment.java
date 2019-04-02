package mb.test;

import mb.entity.MBException;
import mb.entity.MessageComment;

public class TestEntityMessageComment {
	
	public static void main(String[] args) {
		MessageComment mc = new MessageComment();
		try {
			mc.setIssuedate("2019-01-25");
			System.out.println(mc);
		} catch (MBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
