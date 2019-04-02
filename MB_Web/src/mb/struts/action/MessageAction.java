package mb.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import mb.entity.Employee;
import mb.entity.MessageComment;
import mb.entity.RoleType;
import mb.service.MessageCommentService;

public class MessageAction implements RequestAware, ModelDriven<MessageComment>, Preparable {

	private MessageCommentService service = new MessageCommentService();
	private MessageComment messageComment;
	

	// 給getModel使用
	private Integer id;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMessageComment(MessageComment messageComment) {
		this.messageComment = messageComment;
	}

	static {
		System.out.println("start");
	}

	// 查詢公佈欄資訊
	public String list() {
		//模擬登入者
				ActionContext actionContext = ActionContext.getContext(); 
			    Map<String,Object> session = actionContext.getSession();
			    Employee emp = new Employee();
			    emp.setEmp_no(1);
			    emp.setRoleType(RoleType.ADM);
			    session.put("LoginUser", emp); 
		request.put("message_lists", service.getMessages());
		return "list";
	}

	// 修改公佈欄資訊
	public String edit() {
		return "edit";
	}
	
	public void prepareEdit() {
		messageComment = service.getMessageById(id).get(0);
	}
	//送出修改結果
	public String update() {
		System.out.println(messageComment);
		service.updateMessageComment(messageComment);
		return "success";
	}
	
	public void prepareUpdate() {
		messageComment = new MessageComment();
		//模擬登入員工
		ActionContext actionContext = ActionContext.getContext(); 
		Map<String,Object> session = actionContext.getSession();
		Employee emp = (Employee)session.get("LoginUser"); 
		messageComment.setEmployee(emp);
	}
	//除單筆資料
	public String delete() {
		service.deleteMessageComment(messageComment);
		return "success";
	}
	//新增公布事項
	public String create() {

		return "create";
	}
	public void prepareCreate() {
		messageComment = new MessageComment();
		ActionContext actionContext = ActionContext.getContext(); 
	    Map<String,Object> session = actionContext.getSession();
		Employee emp = (Employee)session.get("LoginUser"); 
		messageComment.setEmployee(emp);
	}
	//儲存新增
	public String save() {
		System.out.println("更新或新增："+messageComment);
		service.createMessage(messageComment);
		return "success";
	}
	public void prepareSave() {

		messageComment = new MessageComment();
		ActionContext actionContext = ActionContext.getContext(); 
	    Map<String,Object> session = actionContext.getSession();
		Employee emp = (Employee)session.get("LoginUser"); 
		messageComment.setEmployee(emp);
	}

	@Override
	public void prepare() throws Exception {
		System.out.println("prepare...");
	}
	
	//model driven
	@Override
	public MessageComment getModel() {
		return messageComment;
	}
	
	//for request
	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}

}
