<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>无权限访问</title>
		<#include "include.ftl">
		<link href="${base}/resources/css/style.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="${base}/resources/js/jquery.js"></script>
		<script type="text/javascript">
			$(function(){
			    $('.error').css({'position':'absolute','left':($(window).width()-490)/2});
				$(window).resize(function(){  
			    	$('.error').css({'position':'absolute','left':($(window).width()-490)/2});
			    });
			});
		</script>
	</head>
	<body style="background:#edf6fa;">
		<div class="place">
	    	<span>位置：</span>
		    <ul class="placeul">
			    <li><a href="${base}/back/home/index">首页</a></li>
			    <li><a href="javascript:void(0);">无权限访问</a></li>
		    </ul>
	    </div>
	    <div class="error">
		    <h2>非常遗憾，您无权限访问！</h2>
		    <p>看到这个提示，就自认倒霉吧!</p>
		    <div class="reindex"><a href="${base}/home/main">返回首页</a></div>
	    </div>
	</body>
</html>