/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2018-08-24 03:43:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write(".piechart{float:right;}\r\n");
      out.write("html,body{width:1500px; height:2000px; background-color:lime;}\r\n");
      out.write("#info6{width:1500px; height:800px;}\r\n");
      out.write("#page-content-wrapper{background-color:black;}\r\n");
      out.write("\r\n");
      out.write("#piechart0_3d > div > div > div {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tmargin-left:-0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body svg {\r\n");
      out.write("\tfloat:right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#search {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tleft:700px;\r\n");
      out.write("\ttop:580px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#info6 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\ttop:1000px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onLoad=\"ajaxReq6();ajaxFun6('Society');ajaxinfo6('Society');\">   \r\n");
      out.write("\r\n");
      out.write("<div id=\"page-content-wrapper\">\r\n");
      out.write("    <a href=\"TedMain.jsp\"><img src=\"image/tedLogo.png\" style=\"width: 500px;\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"whole\">\r\n");
      out.write("   <div id=\"piechart1_3d\" style=\"width: 1000px; height: 500px; margin:5px 5px;\">\r\n");
      out.write("      <div class=\"piechart\">\r\n");
      out.write("         <!-- 1 pie chart 그리기 -->\r\n");
      out.write("         <script type=\"text/javascript\"\r\n");
      out.write("            src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n");
      out.write("         <script type=\"text/javascript\">\r\n");
      out.write("               google.charts.load(\"current\", {packages:[\"corechart\"]});\r\n");
      out.write("               //google.charts.setOnLoadCallback(drawChart);\r\n");
      out.write("      function drawChart(v) {\r\n");
      out.write("       v = eval(v);  \r\n");
      out.write("        var data = google.visualization.arrayToDataTable(v);\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          title: '주제별 영상 비율 - Society',\r\n");
      out.write("          is3D: true,\r\n");
      out.write("          pieSliceText: 'percentage',\r\n");
      out.write("          slices: { 6: {offset: 0.2}},\r\n");
      out.write("          titleTextStyle:{\r\n");
      out.write("             color:'blue',\r\n");
      out.write("             fontSize:25,\r\n");
      out.write("             bold:true\r\n");
      out.write("          }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var chart = new google.visualization.PieChart(document.getElementById('piechart1_3d'));\r\n");
      out.write("        chart.draw(data, options);\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("         <script type=\"text/javascript\">\r\n");
      out.write("       function ajaxReq6(){\r\n");
      out.write("       var xhttp = new XMLHttpRequest();\r\n");
      out.write("        xhttp.onreadystatechange = function() {\r\n");
      out.write("          if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("             drawChart(this.responseText);\r\n");
      out.write("          }\r\n");
      out.write("        };\r\n");
      out.write("        xhttp.open(\"GET\", \"MainController?command=topic\", true);\r\n");
      out.write("        xhttp.send();\r\n");
      out.write("      };\r\n");
      out.write("     </script>\r\n");
      out.write("      </div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("   <div id=\"search\"><b><strong><font size=\"5\" color=\"red\">연관 검색어 WordCloud</font></strong></b></div>\r\n");
      out.write("   <div class=\"wordCloud\" style=\"width: 500px; height: 10px\">\r\n");
      out.write("         <!-- 0 wordCloud 그리기 -->\r\n");
      out.write("         <script src=\"https://d3js.org/d3.v3.min.js\"></script>\r\n");
      out.write("         <script\r\n");
      out.write("            src=\"https://rawgit.com/jasondavies/d3-cloud/master/build/d3.layout.cloud.js\"\r\n");
      out.write("            type=\"text/JavaScript\"></script>\r\n");
      out.write("\r\n");
      out.write("         <script>\r\n");
      out.write("       function ajaxFun6(v){\r\n");
      out.write("         var xhttp = new XMLHttpRequest();\r\n");
      out.write("         xhttp.onreadystatechange = function() {\r\n");
      out.write("            if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("               \r\n");
      out.write("               //응답된 데이터를 JSON 객체로 변환\r\n");
      out.write("               data = eval(this.responseText);\r\n");
      out.write("               //wordcloud 그리는 함수의 parameter로 반영\r\n");
      out.write("               dataView(data);\r\n");
      out.write("            }\r\n");
      out.write("         };\r\n");
      out.write("         xhttp.open(\"GET\", \"MainController?command=word&topic=\"+v, true);\r\n");
      out.write("         xhttp.send();\r\n");
      out.write("      };\r\n");
      out.write("       \r\n");
      out.write("        var width = 1000, height = 300\r\n");
      out.write("\r\n");
      out.write("        var svg = d3.select(\"body\").append(\"svg\")\r\n");
      out.write("            .attr(\"width\", width)\r\n");
      out.write("            .attr(\"height\", height);\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("         function dataView(data){//사용자 정의 함수\r\n");
      out.write("            showCloud(data);\r\n");
      out.write("            setInterval(function(){\r\n");
      out.write("                 showCloud(data)\r\n");
      out.write("            }, 5000) \r\n");
      out.write("         }\r\n");
      out.write("        \r\n");
      out.write("        wordScale = d3.scale.linear().domain([0, 100]).range([0, 150]).clamp(true);\r\n");
      out.write("        var svg = d3.select(\"svg\").append(\"g\").attr(\"transform\", \"translate(\" + width / 3 + \",\" + height / 2 + \")\");\r\n");
      out.write("\r\n");
      out.write("        function showCloud(data) {\r\n");
      out.write("            d3.layout.cloud().size([width, height])\r\n");
      out.write("                .words(data)\r\n");
      out.write("                .rotate(function (d) {\r\n");
      out.write("                    return d.text.length > 3 ? 0 : 0;\r\n");
      out.write("                })\r\n");
      out.write("                //스케일로 각 단어의 크기를 설정\r\n");
      out.write("                .fontSize(function (d) {\r\n");
      out.write("                    return wordScale(d.counting);\r\n");
      out.write("                })\r\n");
      out.write("                //클라우드 레이아웃을 초기화 > end이벤트 발생 > 연결된 함수 작동  \r\n");
      out.write("                .on(\"end\", draw)\r\n");
      out.write("                .start();\r\n");
      out.write("\r\n");
      out.write("            function draw(words) { \r\n");
      out.write("                var cloud = svg.selectAll(\"text\").data(words)\r\n");
      out.write("                //Entering words\r\n");
      out.write("                cloud.enter()\r\n");
      out.write("                    .append(\"text\")\r\n");
      out.write("                    .style(\"fill-opacity\", .5)\r\n");
      out.write("                    .attr(\"text-anchor\", \"middle\") \r\n");
      out.write("                    .attr('font-size', 1)\r\n");
      out.write("                    .text(function (d) {\r\n");
      out.write("                        return d.text;\r\n");
      out.write("                    }); \r\n");
      out.write("                cloud\r\n");
      out.write("                    .transition()\r\n");
      out.write("                    .duration(600)\r\n");
      out.write("                    .style(\"font-size\", function (d) {\r\n");
      out.write("                        return d.size + \"px\";\r\n");
      out.write("                    })\r\n");
      out.write("                    .attr(\"transform\", function (d) {\r\n");
      out.write("                        return \"translate(\" + [d.x, d.y] + \")rotate(\" + d.rotate + \")\";\r\n");
      out.write("                    })\r\n");
      out.write("                    .style(\"fill-opacity\", 1); \r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    </div>\r\n");
      out.write("   <div id=\"info6\">\r\n");
      out.write("   <div class=\"top10\" style=\"width: 1000px; height: 300px\">\r\n");
      out.write("         <!-- Top10 정보 띄우기 -->\r\n");
      out.write("         <script>\r\n");
      out.write("       function ajaxinfo6(v){\r\n");
      out.write("         var xhttp = new XMLHttpRequest();\r\n");
      out.write("         xhttp.onreadystatechange = function() {\r\n");
      out.write("            if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("               document.getElementById(\"info6\").innerHTML\r\n");
      out.write("               =this.responseText;\r\n");
      out.write("            }\r\n");
      out.write("         };\r\n");
      out.write("         xhttp.open(\"GET\", \"MainController?command=information&topic=\"+v, true);\r\n");
      out.write("         xhttp.send();\r\n");
      out.write("      };\r\n");
      out.write("         </script>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>  \r\n");
      out.write("</div>  \r\n");
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
