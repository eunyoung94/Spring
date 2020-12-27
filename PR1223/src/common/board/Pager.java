package common.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class Pager{
	private int totalRecord;
	private int pageSize=10;
	private int totalPage;
	private int blockSize=10;
	private int currentPage=1;
	private int firstPage;
	private int lastPage;
	private int curPos;
	private int num;
	
	public void init(HttpServletRequest request,List list) {
		totalRecord=list.size();
		totalPage=(int)Math.ceil((float)totalRecord/pageSize);
		if(request.getParameter("currentPage")!=null) {
			currentPage=Integer.parseInt(request.getParameter("currentPage"));
		}
		firstPage=currentPage-(currentPage-1)%blockSize;
	}
	}