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
    <json:array name="countryList" items="${list}" var="country">
        <json:object>
            <json:property name="id" value="${country.id}"></json:property>
            <json:property name="name" value="${country.countryname}"></json:property>
            <json:property name="code" value="${country.countrycode}"></json:property>
        </json:object>
    </json:array>
</json:object>