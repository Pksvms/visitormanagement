package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class appointmentProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
   
try {
    String FullName = request.getParameter("fullname");
    String ICNum = request.getParameter("icnum");
    String ContactNo = request.getParameter("contactno");
    String mail = request.getParameter("email");
    String CarPlate = request.getParameter("carplate");
    String AppointmentDate = request.getParameter("appointmentdate");
    String Reason = request.getParameter("purpose");
    String Peoplemeet = request.getParameter("peoplemeet");
    String location = request.getParameter("place");
    String checkValues[] = request.getParameterValues("symptoms");
    String value="";
    String Trip = request.getParameter("travel");
    String State = request.getParameter("countries");
    String Situation = "empty";
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pks_visitormanager?zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8","project","fypteam");
   
    for(int i=0;i<checkValues.length;i++) {
        value += checkValues[i]+", ";   
    }
      
    Statement st = conn.createStatement();
    st.executeUpdate("INSERT INTO APPOINTMENT (Visitor_Name, IC_num, Phone_Number, Email, Vehicle_Number, "
                    + "Appointment_date, Purpose, People_meet, Place, Symptoms, Travel, Countries, Status) values "
                    + "('"+FullName+"','"+ICNum+"','"+ContactNo+"','"+mail+"','"+CarPlate+"','"+AppointmentDate+"','"+Reason+"','"
                    + ""+Peoplemeet+"','"+location+"','"+value+"','"+Trip+"','"+State+"','"+Situation+"')");
   
    RequestDispatcher rd=request.getRequestDispatcher("appointmentSucess.jsp");  
    rd.include(request,response);
    
}
catch (Exception e) {
    out.println("Something went wrong !! Please <a href='visitorAppoinment.jsp'>try again</a>");
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
