<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ page import="../common/head.jsp" %> --%>
<jsp:include page="common/head.jsp"></jsp:include>
<h1>
	Hello world!  
</h1>
<P>  The time on the server is ${serverTime}. </P>
<script type="text/javascript">
	location.href= "${pageContext.request.contextPath}/login_form";
</script>
<jsp:include page="common/footer.jsp"></jsp:include>
