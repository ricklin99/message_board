package mb.entity;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MessageComment {
	private Integer id;
	private String title;
	private LocalDate issuedate;
	private LocalDate dateOfDeadline;
	private String messageContent;
	
	private Employee employee;
	
	public MessageComment() {}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) throws MBException { //須符合ISO-8601
		try {
		LocalDate date = LocalDate.parse(issuedate);
		this.setIssuedate(date);
		}catch(DateTimeParseException ex) {
			throw new MBException("發佈日期日期格式不正確",ex);
		}
	}
	public void setIssuedate(LocalDate issuedate) {
		this.issuedate = issuedate;
	}
	
	public LocalDate getDateOfDeadline() {
		return dateOfDeadline;
	}
	public void setDateOfDeadline(String dateOfDeadline) throws MBException { //須符合ISO-8601
		try {
		LocalDate date = LocalDate.parse(dateOfDeadline);
		this.setDateOfDeadline(date);
		}catch(DateTimeParseException ex) {
			throw new MBException("截止日期日期格式不正確",ex);
		}
	}
	public void setDateOfDeadline(LocalDate dateOfDeadline) {
		this.dateOfDeadline = dateOfDeadline;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	@Override
	public String toString() {
		return "MessageComment [id=" + id + ", title=" + title + ", issuedate=" + issuedate + ", dateOfDeadline="
				+ dateOfDeadline + ", messageContent=" + messageContent + ", employee=" + employee  + "]";
	}
	
	
	
	

}
