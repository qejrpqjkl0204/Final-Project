/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2018-08-28 02:23:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.*;
import modelDTO.*;

public final class TedMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/ITStudy/6.%20project/00.project-Final/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/webproject/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1534853174438L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("model");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("modelDTO");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/modal_pop.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/TedMain.css\">\r\n");
      out.write("        \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("    <title>final-project</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"css/simple-sidebar.css\" rel=\"stylesheet\">\r\n");
      out.write("<Style>\r\n");
      out.write("/* .pop_video .pop_wrap .video_wrapper{position:relative; height:200px; overflow:hidden; max-width:100%;} */\r\n");
      out.write(".videobox{text-align: center;}\r\n");
      out.write(".box{float:right; padding:16px}\r\n");
      out.write(".main_box{float:right; weight:80px; height:70px}\r\n");
      out.write("#page-content-wrapper{background-color:black; padding:10px}\r\n");
      out.write("</Style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'yes'){\r\n");
      out.write("\talert(\"회원가입을 축하드립니다!\");\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <!-- Page Content -->\r\n");
      out.write("        <div id=\"page-content-wrapper\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("            \t<a href=\"TedMain.jsp\"><img src=\"image/tedLogo.png\" style=\"width: 500px;\"></a>\r\n");
      out.write("            \t<button class=\"main_box\" onclick=\"go();\">게시판</button>\r\n");
      out.write("            \t<script>\r\n");
      out.write("\t\t               function go(){\r\n");
      out.write("\t\t                  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.permit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'permit'){\r\n");
      out.write("\t\t                     return window.location.href= 'list.do';\r\n");
      out.write("\t\t                  } else {\r\n");
      out.write("\t\t                     alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t               }\r\n");
      out.write("               </script>\r\n");
      out.write("\t\t\t\t<button class=\"main_box\" onclick=\"window.location.href = 'join.jsp';\">회원가입</button>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \t<div class=\"videobox\"style=\"background-color:black\">\r\n");
      out.write("\t\t\t\t<video width=\"1000\" height=\"400\" loop autoplay muted> \r\n");
      out.write("\t\t\t\t<source\tsrc=\"video/ted.mp4\" type=\"video/mp4\"></video>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"topicTable\" style=\"float:left; padding: 30px; margin-right:30px; width: 700px; heigth: 750px\">\r\n");
      out.write("   <div>\r\n");
      out.write("      <button type=\"button\" class=\"topicbtn\" style=\"width: 200px;\" onclick=\"searchCount('Technology_Science');location='page7.jsp'\">\r\n");
      out.write("         <img src=\"image/technology.jpg\" alt=\"Norway\" style=\"width:100%\" ><br>Technology_Science\r\n");
      out.write("      </button>\r\n");
      out.write("\r\n");
      out.write("      <button type=\"button\" class=\"topicbtn\" style=\"width: 200px;\" onclick=\"searchCount('Politics');go2();\">\r\n");
      out.write("         <img src=\"image/politics.jpg\" alt=\"Norway\" style=\"width:100%\"><br>Politics\r\n");
      out.write("      </button>\r\n");
      out.write("      <script>\r\n");
      out.write("\t\t               function go2(){\r\n");
      out.write("\t\t                  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.permit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'permit'){\r\n");
      out.write("\t\t                     return window.location.href= 'page4.jsp';\r\n");
      out.write("\t\t                  } else {\r\n");
      out.write("\t\t                     alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t               }\r\n");
      out.write("               </script>\r\n");
      out.write("\r\n");
      out.write("      <button type=\"button\" class=\"topicbtn\" style=\"width: 200px;\" onclick=\"searchCount('Health_Medical');go3();\">\r\n");
      out.write("         <img src=\"image/health&medical.jpg\" alt=\"Norway\" style=\"width:100%\"><br>Health_Medical\r\n");
      out.write("      </button>\r\n");
      out.write("      <script>\r\n");
      out.write("\t\t               function go3(){\r\n");
      out.write("\t\t                  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.permit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'permit'){\r\n");
      out.write("\t\t                     return window.location.href= 'page2.jsp';\r\n");
      out.write("\t\t                  } else {\r\n");
      out.write("\t\t                     alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t               }\r\n");
      out.write("               </script>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("   <div>\r\n");
      out.write("      <button type=\"button\" class=\"topicbtn\" style=\"width: 200px;\" onclick=\"searchCount('Self-development');go4();\">\r\n");
      out.write("         <img src=\"image/self_development.jpg\" alt=\"Norway\" style=\"width:100%\"><br>Self-development\r\n");
      out.write("      </button>\r\n");
      out.write("      <script>\r\n");
      out.write("\t\t               function go4(){\r\n");
      out.write("\t\t                  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.permit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'permit'){\r\n");
      out.write("\t\t                     return window.location.href= 'page3.jsp';\r\n");
      out.write("\t\t                  } else {\r\n");
      out.write("\t\t                     alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t               }\r\n");
      out.write("               </script>\r\n");
      out.write("\r\n");
      out.write("      <button type=\"button\" class=\"topicbtn\" style=\"width: 200px;\" onclick=\"searchCount('Education');go5()\">\r\n");
      out.write("         <img src=\"image/education.png\" alt=\"Norway\" style=\"width:100%\"><br>Education\r\n");
      out.write("      </button>\r\n");
      out.write("      <script>\r\n");
      out.write("\t\t               function go5(){\r\n");
      out.write("\t\t                  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.permit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'permit'){\r\n");
      out.write("\t\t                     return window.location.href= 'page8.jsp';\r\n");
      out.write("\t\t                  } else {\r\n");
      out.write("\t\t                     alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t               }\r\n");
      out.write("               </script>\r\n");
      out.write("\r\n");
      out.write("      <button type=\"button\" class=\"topicbtn\" style=\"width: 200px;\" onclick=\"searchCount('Environment');go6();\">\r\n");
      out.write("         <img src=\"image/environment.jpg\" alt=\"Norway\" style=\"width:100%\"><br>Environment\r\n");
      out.write("      </button>\r\n");
      out.write("      <script>\r\n");
      out.write("\t\t               function go6(){\r\n");
      out.write("\t\t                  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.permit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'permit'){\r\n");
      out.write("\t\t                     return window.location.href= 'page5.jsp';\r\n");
      out.write("\t\t                  } else {\r\n");
      out.write("\t\t                     alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t               }\r\n");
      out.write("               </script>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <div>\r\n");
      out.write("      <button type=\"button\" class=\"topicbtn\" style=\"width: 200px;\" onclick=\"searchCount('Society');go7();\">\r\n");
      out.write("         <img src=\"image/society.jpg\" alt=\"Norway\" style=\"width:100%\"><br>Society\r\n");
      out.write("      </button>\r\n");
      out.write("      <script>\r\n");
      out.write("\t\t               function go7(){\r\n");
      out.write("\t\t                  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.permit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'permit'){\r\n");
      out.write("\t\t                     return window.location.href= 'page6.jsp';\r\n");
      out.write("\t\t                  } else {\r\n");
      out.write("\t\t                     alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t               }\r\n");
      out.write("               </script>\r\n");
      out.write("\t<button type=\"button\" class=\"topicbtn\" style=\"width: 200px;\" onclick=\"searchCount('Economy');go8();\">\r\n");
      out.write("         <img src=\"image/economic.jpg\" alt=\"Norway\" style=\"width:100%\"><br>Economy\r\n");
      out.write("      </button>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t               function go8(){\r\n");
      out.write("\t\t                  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.permit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'permit'){\r\n");
      out.write("\t\t                     return window.location.href= 'page0.jsp';\r\n");
      out.write("\t\t                  } else {\r\n");
      out.write("\t\t                     alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t               }\r\n");
      out.write("               </script>\r\n");
      out.write("      <button type=\"button\" class=\"topicbtn\" style=\"width: 200px;\" onclick=\"searchCount('Art');go9();\">\r\n");
      out.write("         <img src=\"image/art.jpg\" alt=\"Norway\" style=\"width:100%\"><br>Art\r\n");
      out.write("      </button>\r\n");
      out.write("      <script>\r\n");
      out.write("\t\t               function go9(){\r\n");
      out.write("\t\t                  if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.permit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == 'permit'){\r\n");
      out.write("\t\t                     return window.location.href= 'page1.jsp;';\r\n");
      out.write("\t\t                  } else {\r\n");
      out.write("\t\t                     alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t               }\r\n");
      out.write("               </script>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"realTable\" style=\"width:100px; float:left;\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "real.html", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<!-- Bootstrap core JavaScript -->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /TedMain.jsp(56,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.sid}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<button class=\"main_box\" onclick=\"window.location.href = 'login.jsp';\">로그인</button>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /TedMain.jsp(59,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.sid}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<button class=\"main_box\" onclick=\"window.location.href = 'MainController?command=logout';\">로그아웃</button>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
