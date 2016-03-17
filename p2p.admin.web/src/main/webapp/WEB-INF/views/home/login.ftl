<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>欢迎登录后台管理系统</title>
		<#include "../common/include.ftl" />
		<script src="${base}/resources/js/cloud.js" type="text/javascript"></script>
		<script src="${base}/resources/plugins/block/jquery.blockUI.js" type="text/javascript"></script>
		<script language="javascript">
			$(function(){
				if(top.location.href != window.location.href){
					top.location.href = window.location.href;
				}
		    	$('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
				$(window).resize(function(){
			    	$('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
			    });
			});
			var doLogin = function(){
				var username = $("#username").val();
				var password = $("#password").val();
				var remember = $("#remember").is(":checked");
				$.blockUI({message:"<div style='line-height:40px;'>用户登录中,请稍后......</div>"});
				$.ajax({
					url:"${base}/home/anon/login.json",
					type:"POST",
					dataType:"json",
					timeout:-1,
                    async:true,
					data:{
						username:username,
						password:password,
						remember:remember
					},
					success:function(data){
						alert(data.success);
						if(data && data.success){
							window.location.href="${base}/home/authc/main.html";
						}else{
							$.unblockUI();
							$.blockUI({message:"<div style='line-height:40px;'>"+data.message+"</div>",timeout:4000});
						}
					},
					error:function(){
						$.unblockUI();
						$.blockUI({message:"<div style='line-height:40px;'>登陆失败!</div>",timeout:4000});
					}
				});
			};
		</script> 
	</head>
	<body style="background-color:#1c77ac; background-image:url(${base}/resources/images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
		<div id="mainBody">
			<div id="cloud1" class="cloud"></div>
			<div id="cloud2" class="cloud"></div>
		</div>  
		<div class="logintop">    
			<span>欢迎登录后台管理界面平台</span>    
			<ul>
				<li><a href="#">回首页</a></li>
				<li><a href="#">帮助</a></li>
				<li><a href="#">关于</a></li>
			</ul>    
		</div>
		<div class="loginbody">
			<span class="systemlogo"></span> 
			<div class="loginbox">
                <form action="${base}/home/login" method="post">
                    <ul>
                        <li><input id="username" type="text" class="loginuser" value='admin'/></li>
                        <li><input id="password" type="password"  class="loginpwd" value='123456' onkeydown='if(event.keyCode==13){loginbtn.click()}'/></li>
                        <li>
                            <input type="button" id="loginbtn" class="loginbtn" value="登录" onclick="doLogin()"/>
                            <label>
                                <input id="remember" type="checkbox" value="true" checked="checked" />记住密码
                            </label>
                            <label>
                                <a href="#">忘记密码？</a>
                            </label>
                        </li>
                    </ul>
                </form>
			</div>
		</div>
		<div class="loginbm">版权所有  2016 </div>
	</body>
</html>