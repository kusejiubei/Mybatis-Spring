<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>

<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/4/19
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<json:object>
    <json:property name="code" value="${code}"></json:property>
    <json:property name="message" value="${message}"></json:property>
</json:object>
