<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<#include "../common/include.ftl" />
		<script type="text/javascript">
			$(function(){	
				$(".nav li a").click(function(){
					$(".nav li a.selected").removeClass("selected")
					$(this).addClass("selected");
				});
				$(".nav").find("li:first").find("a").trigger("click");
			});
		</script>
	</head>
	<body style="background:url(${base}/resources/images/topbg.gif) repeat-x;">
	    <div class="topleft">
	    	<a href="${base}/home/authc/main.html" target="_parent"><img src="${base}/resources/images/logo.png" title="系统首页" /></a>
	    </div>
	    <ul class="nav">
		    <#if (menus?size>0)>
				<#list menus as menu>
					<li>
					<form action="${base}/home/authc/left.html" target="leftFrame" id="${menu.dataId!}">
			    		<input type="hidden" name="parent" value="${menu.dataId!}" />
			    		<a onclick="$('#${menu.dataId!}').submit();" class="selected" style="cursor:pointer;">
			    			<img src="${base}/resources/images/${menu.extensionA!}" title="${menu.resName!}" />
			    			<h2>${menu.resName!}</h2>
			    		</a>
		    		</form>
		    		</li>
				</#list>
			</#if>
	    </ul>
	    <div class="topright">    
		    <ul>
                <li><a href="${base}/authc/account/modifypassword" target="rightFrame">修改密码</a></li>
				<li><span><img src="${base}/resources/images/help.png" title="帮助"  class="helpimg"/></span><a href="#">帮助</a></li>
				<li><a href="#">关于</a></li>
				<li><a href="${base}/home/authc/logout" target="_parent">退出</a></li>
				</ul>
	    	<div class="user">
	    		<span>admin</span>
	    	</div>
	    </div>
	</body>
</html>