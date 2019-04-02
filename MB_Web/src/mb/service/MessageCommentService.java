package mb.service;

import java.util.List;

import mb.entity.MessageComment;

public class MessageCommentService {
	MessageCommentDAO dao = new MessageCommentDAO();
	
	public void createMessage(MessageComment mc) {
		dao.insertMessageComment(mc);
	}
	public List<MessageComment> getMessages(){
		List<MessageComment> list= dao.selectMessageComment();
		return list;
	}
	public List<MessageComment> getMessageById(int id) {
		List<MessageComment> mc = dao.selectMessageCommentById(id);
		return mc;
	}
	public void updateMessageComment(MessageComment mc) {
		dao.updateMessageComment(mc);
	}
	public void deleteMessageComment(MessageComment mc) {
		dao.deleteMessageComment(mc);
	}
	
	
}
