/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2018-08-22 00:39:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<title>final-project</title>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/modal_pop.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body,h1,h2,h3,h4,h5,h6 {font-family: \"Raleway\", sans-serif}\r\n");
      out.write(".box{float:right; padding:16px}\r\n");
      out.write(".main_box{weight:80px; height:50px}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body class=\"w3-light-grey w3-content\" style=\"max-width:2000px\">\r\n");
      out.write("\r\n");
      out.write("<!-- Sidebar/menu -->\r\n");
      out.write("<div class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:1; width:500px;\" id=\"mySidebar\"><br>\r\n");
      out.write("\t<a href=\"main.jsp\">\r\n");
      out.write("\t\t<button class=\"sidemenu\"; style=\"width:100%; height:100px; font-size:80px;\">TED\r\n");
      out.write("\t\t</button></a>\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "real.html", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- !PAGE CONTENT! -->\r\n");
      out.write("\t<div class=\"w3-main\" style=\"margin-left: 500px\">\r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t<header id=\"portfolio\">\r\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"image/technology.jpg\" style=\"width: 65px;\"\r\n");
      out.write("\t\t\t\tclass=\"w3-circle w3-right w3-margin w3-hide-large w3-hover-opacity\"></a>\r\n");
      out.write("\t\t\t<span class=\"w3-button w3-hide-large w3-xxlarge w3-hover-text-grey\"\r\n");
      out.write("\t\t\t\tonclick=\"w3_open()\"><i class=\"fa fa-bars\"></i></span>\r\n");
      out.write("\t\t\t<div class=\"w3-row-padding w3-padding-16\" id=\"about\">\r\n");
      out.write("\t\t\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t\t\t<button class=\"main_box\">로그인</button>\r\n");
      out.write("\t\t\t\t\t<button class=\"main_box\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-diamond w3-margin-right\"></i>회원가입\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<button class=\"main_box\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-photo w3-margin-right\"></i>게시판\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<!-- First Photo Grid-->\r\n");
      out.write("  <div class=\"w3-row-padding\">\r\n");
      out.write("    <div class=\"w3-third w3-container w3-margin-bottom\">\r\n");
      out.write("      <button id=\"myBtn\"><img src=\"image/technology.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"modal-image\" id=\"searchWord\" \r\n");
      out.write("\t\t\t\tonclick=\"searchCount('Technology_Science')\">Technology_Science</button>\r\n");
      out.write("\t<!-- The Modal -->\r\n");
      out.write("\t\t<div id=\"myModal\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal content -->\r\n");
      out.write("  \t\t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("      \t\t\t<span class=\"close\">&times;</span>\r\n");
      out.write("      \t\t\t\t<h2>Modal Header</h2>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"modal-body\">\r\n");
      out.write("    \t\t\t\t<p>hello world</p>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("      \t\t\t\t\t<h3>Modal Footer</h3>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"w3-third w3-container w3-margin-bottom\">\r\n");
      out.write("      \t<button id=\"myBtn2\"><img src=\"image/economic.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"modal-image\" id=\"searchWord\" \r\n");
      out.write("\t\t\t\tonclick=\"searchCount('Economy')\">Economy</button>\r\n");
      out.write("\t<!-- The Modal -->\r\n");
      out.write("\t\t<div id=\"myModal2\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal content -->\r\n");
      out.write("  \t\t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("      \t\t\t<span class=\"close\">&times;</span>\r\n");
      out.write("      \t\t\t\t<h2>Modal Header</h2>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"modal-body\">\r\n");
      out.write("    \t\t\t\t<p>hello world</p>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("      \t\t\t\t\t<h3>Modal Footer</h3>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"w3-third w3-container\">\r\n");
      out.write("     <button id=\"myBtn3\"><img src=\"image/education.png\" alt=\"Norway\" style=\"width:100%\" class=\"modal-image\" id=\"searchWord\" \r\n");
      out.write("\t\t\t\tonclick=\"searchCount('Education')\">Education</button>\r\n");
      out.write("\t<!-- The Modal -->\r\n");
      out.write("\t\t<div id=\"myModal3\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal content -->\r\n");
      out.write("  \t\t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("      \t\t\t<span class=\"close\">&times;</span>\r\n");
      out.write("      \t\t\t\t<h2>Modal Header</h2>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"modal-body\">\r\n");
      out.write("    \t\t\t\t<p>hello world</p>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("      \t\t\t\t\t<h3>Modal Footer</h3>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  <!-- Second Photo Grid-->\r\n");
      out.write("  <div class=\"w3-row-padding\">\r\n");
      out.write("    <div class=\"w3-third w3-container w3-margin-bottom\">\r\n");
      out.write("      <button id=\"myBtn4\"><img src=\"image/health&medical.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"modal-image\" id=\"searchWord\" \r\n");
      out.write("\t\t\t\tonclick=\"searchCount('Health_Medical')\">Health_Medical</button>\r\n");
      out.write("\t<!-- The Modal -->\r\n");
      out.write("\t\t<div id=\"myModal4\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal content -->\r\n");
      out.write("  \t\t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("      \t\t\t<span class=\"close\">&times;</span>\r\n");
      out.write("      \t\t\t\t<h2>Modal Header</h2>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"modal-body\">\r\n");
      out.write("    \t\t\t\t<p>hello world</p>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("      \t\t\t\t\t<h3>Modal Footer</h3>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"w3-third w3-container w3-margin-bottom\">\r\n");
      out.write("      <button id=\"myBtn5\"><img src=\"image/art.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"modal-image\" id=\"searchWord\" \r\n");
      out.write("\t\t\t\tonclick=\"searchCount('Art')\">Art</button>\r\n");
      out.write("\t<!-- The Modal -->\r\n");
      out.write("\t\t<div id=\"myModal5\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal content -->\r\n");
      out.write("  \t\t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("      \t\t\t<span class=\"close\">&times;</span>\r\n");
      out.write("      \t\t\t\t<h2>Modal Header</h2>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"modal-body\">\r\n");
      out.write("    \t\t\t\t<p>hello world</p>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("      \t\t\t\t\t<h3>Modal Footer</h3>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"w3-third w3-container\">\r\n");
      out.write("      <button id=\"myBtn6\"><img src=\"image/environment.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"modal-image\" id=\"searchWord\" \r\n");
      out.write("\t\t\t\tonclick=\"searchCount('Environment')\">Environment</button>\r\n");
      out.write("\t<!-- The Modal -->\r\n");
      out.write("\t\t<div id=\"myModal6\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal content -->\r\n");
      out.write("  \t\t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("      \t\t\t<span class=\"close\">&times;</span>\r\n");
      out.write("      \t\t\t\t<h2>Modal Header</h2>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"modal-body\">\r\n");
      out.write("    \t\t\t\t<p>hello world</p>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("      \t\t\t\t\t<h3>Modal Footer</h3>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<!-- Third Photo Grid-->\r\n");
      out.write("  <div class=\"w3-row-padding\">\r\n");
      out.write("    <div class=\"w3-third w3-container w3-margin-bottom\">\r\n");
      out.write("      <button id=\"myBtn7\"><img src=\"image/self_development.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"modal-image\" id=\"searchWord\" \r\n");
      out.write("\t\t\t\tonclick=\"searchCount('Self-development')\">Self-development</button>\r\n");
      out.write("\t<!-- The Modal -->\r\n");
      out.write("\t\t<div id=\"myModal7\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal content -->\r\n");
      out.write("  \t\t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("      \t\t\t<span class=\"close\">&times;</span>\r\n");
      out.write("      \t\t\t\t<h2>Modal Header</h2>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"modal-body\">\r\n");
      out.write("    \t\t\t\t<p>hello world</p>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("      \t\t\t\t\t<h3>Modal Footer</h3>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"w3-third w3-container w3-margin-bottom\">\r\n");
      out.write("       <button id=\"myBtn8\"><img src=\"image/politics.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"modal-image\" id=\"searchWord\" \r\n");
      out.write("\t\t\t\tonclick=\"searchCount('Politics')\">Politics</button>\r\n");
      out.write("\t<!-- The Modal -->\r\n");
      out.write("\t\t<div id=\"myModal8\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal content -->\r\n");
      out.write("  \t\t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("      \t\t\t<span class=\"close\">&times;</span>\r\n");
      out.write("      \t\t\t\t<h2>Modal Header</h2>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"modal-body\">\r\n");
      out.write("    \t\t\t\t<p>hello world</p>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("      \t\t\t\t\t<h3>Modal Footer</h3>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"w3-third w3-container\">\r\n");
      out.write("       <button id=\"myBtn9\"><img src=\"image/society.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"modal-image\" id=\"searchWord\" \r\n");
      out.write("\t\t\t\tonclick=\"searchCount('Society')\">Society</button>\r\n");
      out.write("\t<!-- The Modal -->\r\n");
      out.write("\t\t<div id=\"myModal9\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal content -->\r\n");
      out.write("  \t\t<div class=\"modal-content\">\r\n");
      out.write("    \t\t<div class=\"modal-header\">\r\n");
      out.write("      \t\t\t<span class=\"close\">&times;</span>\r\n");
      out.write("      \t\t\t\t<h2>Modal Header</h2>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"modal-body\">\r\n");
      out.write("    \t\t\t\t<p>hello world</p>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("      \t\t\t\t\t<h3>Modal Footer</h3>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer -->\r\n");
      out.write("  <footer class=\"w3-container w3-padding-32 w3-dark-grey\">\r\n");
      out.write("  <div class=\"w3-row-padding\">\r\n");
      out.write("    <div class=\"w3-third\">\r\n");
      out.write("      <h3>FOOTER</h3>\r\n");
      out.write("      <p>Praesent tincidunt sed tellus ut rutrum.</p>\r\n");
      out.write("      <p>Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\">w3.css</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"w3-third\">\r\n");
      out.write("      <h3>BLOG POSTS</h3>\r\n");
      out.write("      <ul class=\"w3-ul w3-hoverable\">\r\n");
      out.write("        <li class=\"w3-padding-16\">\r\n");
      out.write("          <img src=\"image/workshop.jpg\" class=\"w3-left w3-margin-right\" style=\"width:50px\">\r\n");
      out.write("          <span class=\"w3-large\">Lorem</span><br>\r\n");
      out.write("          <span>Sed mattis nunc</span>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"w3-padding-16\">\r\n");
      out.write("          <img src=\"image/gondol.jpg\" class=\"w3-left w3-margin-right\" style=\"width:50px\">\r\n");
      out.write("          <span class=\"w3-large\">Ipsum</span><br>\r\n");
      out.write("          <span>Praes tinci sed</span>\r\n");
      out.write("        </li> \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"w3-third\">\r\n");
      out.write("      <h3>POPULAR TAGS</h3>\r\n");
      out.write("      <p>\r\n");
      out.write("        <span class=\"w3-tag w3-black w3-margin-bottom\">Travel</span> \r\n");
      out.write("        <span class=\"w3-tag w3-grey w3-small w3-margin-bottom\">New York</span> \r\n");
      out.write("        <span class=\"w3-tag w3-grey w3-small w3-margin-bottom\">London</span>\r\n");
      out.write("        <span class=\"w3-tag w3-grey w3-small w3-margin-bottom\">IKEA</span> \r\n");
      out.write("        <span class=\"w3-tag w3-grey w3-small w3-margin-bottom\">NORWAY</span> \r\n");
      out.write("        <span class=\"w3-tag w3-grey w3-small w3-margin-bottom\">DIY</span>\r\n");
      out.write("      </p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"w3-black w3-center w3-padding-24\">Powered by w3.css</div>\r\n");
      out.write("    \r\n");
      out.write("<!-- End page content -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("// Script to open and close sidebar\r\n");
      out.write("function w3_open() {\r\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"block\";\r\n");
      out.write("    document.getElementById(\"myOverlay\").style.display = \"block\";\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function w3_close() {\r\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"none\";\r\n");
      out.write("    document.getElementById(\"myOverlay\").style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
