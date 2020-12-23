/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2020-12-23 05:32:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model2.domain.Board;
import common.board.Pager;
import java.util.List;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.model2.domain.Board");
    _jspx_imports_classes.add("common.board.Pager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	//포워딩을 통해 넘겨받은 request객체에 담겨진 데이터 꺼내자!
	List<Board> boardList=(List)request.getAttribute("boardList");
	out.print("게시물수는?"+boardList.size());
	Pager pager = new Pager();
	pager.init(request,boardList);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("   border-collapse: collapse;\r\n");
      out.write("   border-spacing: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   border: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("   text-align: left;\r\n");
      out.write("   padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("   background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("   <table>\r\n");
      out.write("      <tr>\r\n");
      out.write("         <th>no</th>\r\n");
      out.write("         <th>제목</th>\r\n");
      out.write("         <th>작성자</th>\r\n");
      out.write("         <th>등록일</th>\r\n");
      out.write("         <th>조회수</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

      	//++혹은 --할 대상은 변수로 받아놓고 처리해햐지 편하다
      	int curPos=pager.getCurPos();
      	int num=pager.getNum();
      
      out.write("\r\n");
      out.write("      ");
for(int i=1;i<=pager.getPageSize();i++){ 
      out.write("\r\n");
      out.write("      ");
if(num<1)break;
      out.write("\r\n");
      out.write("      ");
Board board=boardList.get(curPos++);
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("         <td>");
      out.print(num--);
      out.write("</td>\r\n");
      out.write("         <td><a href=\"/board/detail?board_id=");
      out.print(board.getBoard_id());
      out.write('"');
      out.write('>');
      out.print(board.getTitle());
      out.write("</a>[");
      out.print(board.getCnt());
      out.write("]</td>\r\n");
      out.write("         <td>");
      out.print(board.getWriter());
      out.write("</td>\r\n");
      out.write("         <td>");
      out.print(board.getRegdate().substring(0, 10));
      out.write("</td>\r\n");
      out.write("         <td>");
      out.print(board.getHit());
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("         <td colspan=\"5\" style=\"text-align:center\">\r\n");
      out.write("            [1][2][3]\r\n");
      out.write("         </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("         <td colspan=\"3\">\r\n");
      out.write("            <button onClick=\"location.href='/board/regist_form.jsp'\"> 글등록</button>\r\n");
      out.write("         </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}