package mb.test;

import java.time.LocalDate;

import mb.entity.Employee;
import mb.entity.MessageComment;
import mb.entity.RoleType;
import mb.service.MessageCommentService;

public class TestMessageCommentService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageCommentService service = new MessageCommentService();
		/*
		 * List<MessageComment> list =service.getMessages(); System.out.println(list);
		 */
		MessageComment mc = new MessageComment();
		Employee emp = new Employee();
		emp.setEmp_no(1);
		emp.setRoleType(RoleType.ADM);
		mc.setDateOfDeadline(LocalDate.now());
		mc.setIssuedate(LocalDate.now());
		mc.setMessageContent("123");
		mc.setTitle("123");
		mc.setEmployee(emp);
		service.createMessage(mc);

	}

}
