/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2016-11-04 04:20:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lecture_005fcategory_005finsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menu_name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("lecture", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("<!-- Content Wrapper. Contains page content -->\r\n");
      out.write("<div class=\"content-wrapper\">\r\n");
      out.write("\t<!-- Content Header (Page header) -->\r\n");
      out.write("\t<section class=\"content-header\">\r\n");
      out.write("\t\t<h1>카테고리 추가</h1>\r\n");
      out.write("\t\t<!-- \t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t<li><a href=\"#\"><i class=\"fa fa-youtube-play\"></i>강의</a></li>\r\n");
      out.write("\t\t\t<li class=\"active\">카테고리</li>\r\n");
      out.write("\t\t</ol> -->\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Main content -->\r\n");
      out.write("\t<section class=\"content\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<!-- left column -->\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<!-- general form elements -->\r\n");
      out.write("\t\t\t\t<div class=\"box box-primary\">\r\n");
      out.write("\t\t\t\t\t<!-- /.box-header -->\r\n");
      out.write("\t\t\t\t\t<!-- form start -->\r\n");
      out.write("\t\t\t\t\t<form role=\"form\" name=\"lectureCategoryInsertForm\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"\">분류</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-md-6\"> <input type=\"radio\" name=\"sort\" class=\"minimal\" checked value=\"0\">이론 강의</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-md-6\"> <input type=\"radio\" name=\"sort\" class=\"minimal\" value=\"1\">프로젝트 강의</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"lec_cat_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"title\">이름</label> <input type=\"text\" class=\"form-control\" id=\"title\" name=\"title\" placeholder=\"카테고리 이름을 입력해주세요\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"lec_cat_instructor\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"instructor\">강사</label> <input type=\"text\" class=\"form-control\" id=\"instructor\" name=\"instructor\" placeholder=\"강사 이름을 입력해주세요\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"lec_cat_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"content\">설명</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"form-control\" rows=\"3\" id=\"content\" name=\"content\" placeholder=\"카테고리 설명을 입력주세요\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"lec_cat_summary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"summary\">요약</label> <input type=\"text\" class=\"form-control\" id=\"summary\" name=\"summary\" placeholder=\"카테고리 요약을 입력주세요\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"lec_cat_lang\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"lang\">개발 언어</label> <input type=\"text\" class=\"form-control\" id=\"lang\" name=\"lang\" placeholder=\"개발 언어를 입력주세요\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"lec_cat_ide\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"ide\">개발 환경</label> <input type=\"text\" class=\"form-control\" id=\"ide\" name=\"ide\" placeholder=\"개발 환경 입력주세요\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"lec_cat_price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"price\">가격</label> <input type=\"number\" class=\"form-control\" id=\"price\" name=\"price\" placeholder=\"가격을 입력해주세요\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"lec_cat_img_file\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"exampleInputFile\">강의 설명 이미지</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input width=\"100%\" type=\"file\" id=\"imgFile\" name=\"imgFile\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"help-block\">1000X400 크기에 최적화 되어있습니다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"lec_cat_summary_img_file\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"exampleInputFile\">강의 요약 이미지</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input width=\"100%\" type=\"file\" id=\"summaryImgFile\" name=\"summaryImgFile\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"help-block\">500X500 크기에 최적화 되어있습니다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"\">출력 방식 설정</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-md-6\"> <input type=\"radio\" name=\"isSummary\" class=\"minimal\" checked value=\"0\">요약 이미지 + 요약 내용</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-md-6\"> <input type=\"radio\" name=\"isSummary\" class=\"minimal\" value=\"1\">설명 이미지</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- /.box-body -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" onClick=\"addLectureCategory()\">추가</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.box -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- /.content -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- /.content-wrapper -->\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/footer.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menu_name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("lecture_category", request.getCharacterEncoding()), out, false);
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