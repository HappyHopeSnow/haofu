<%--
  Created by IntelliJ IDEA.
  User: lianle1
  Date: 2015/12/17
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <title>登录</title>
  <meta charset="UTF-8">
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">

  <script type="text/javascript" src="/js/jquery.min.js"></script>
  <script src="../js/jquery.easyui.min.js" type="text/javascript"></script>
  <script src="../js/easyui-lang-zh_CN.js" type="text/javascript"></script>
  <script src="../js/left.js" type="text/javascript"></script>
  <script type="text/javascript" data-main="http://static.starft.cn/mt41/script/main" src="../js/require.js" charset="UTF8"></script>

  <link rel="stylesheet" type="text/css" href="../css/easyui/themes/default/easyui.css">
  <link rel="stylesheet" type="text/css" href="../css/easyui/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="../css/easyui/demo.css">
  <script type="text/javascript">
    $(function() {

      $('#user_login_loginForm').form({
        url : '/admin/checkuser.json',
        success : function(data) {
          var object = eval('(' + data + ')');
          if(object.status == 200) {
            location.href = "/admin/index"
          } else {
            alert("账号或密码错误!")
          }
        }
      });
      $('#user_login_loginForm input').bind('keyup', function(event) {/* 增加回车提交功能 */
        if (event.keyCode == '13') {
          $('#user_login_loginForm').submit();
        }
      });
    });
  </script>
</head>

<body style="background:url(/images/background.jpg)">
<div id="cc" class="easyui-layout" style="width:600px;height:400px;" >
  <div data-options="region:'center',title:'center title',closed:true" style="padding:5px;background:#eee;">
    <div id="user_login_loginDialog" class="easyui-dialog" style="width:400px;height:200px;"
         data-options="title:'登录',modal:true,closable:false,buttons:[{
						text:'登录',
						iconCls:'icon-ok',
						handler:function(){
							$('#user_login_loginForm').submit();
						}
					}]">
      <form id="user_login_loginForm" method="post">
        <table>
          <tr>
            <th>登录名</th>
            <td><input name="name" class="easyui-validatebox"
                       data-options="required:true,missingMessage:'登陆名称必填'" value=""/>
            </td>
          </tr>
          <tr>
            <th>密码</th>
            <td><input type="password" name="password" class="easyui-validatebox"
                       data-options="required:true,missingMessage:'密码必填'" value=""/>
            </td>
          </tr>
        </table>
      </form>
    </div>
  </div>
</div>
</body>
</html>
