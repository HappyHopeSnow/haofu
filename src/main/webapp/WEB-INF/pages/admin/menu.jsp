<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>数据中心管理系统</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <script src="../js/jquery.min.js" type="text/javascript"></script>
    <script src="../js/jquery.easyui.min.js" type="text/javascript"></script>
    <script src="../js/left.js" type="text/javascript"></script>
    <script src="../js/require.js" type="text/javascript"></script>
    <link href="../css/easyui/themes/default/easyui.css" rel="stylesheet" type="text/css" />
    <link href="../css/easyui/themes/icon.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="../css/easyui/themes/demo.css">

    <script>
        $.ajaxSetup({
            //完成请求后触发。即在success或error触发后触发
            complete: function (xhr, status) {
                if (xhr.status == 401) {
                    location.href = "/admin";
                }
            }
        })
    </script>
</head>
<body class="easyui-layout" id="main">
<div region="north" title="Logo" noheader="true"
     style="height:80px; border-bottom: 3px solid #99BBE8;background:url(/images/0yuangou.png) no-repeat center bottom">
    <!-- #set(SysUser user)-->
    您好, ${user.username}, <a href="/admin/logout">退出</a>
</div>
<div region="west" title="导航" iconCls="" style="width:200px">
    <ul class="easyui-tree">
        <li>
            <span>总部</span>
            <ul>
                <li>
                    <span>河北</span>
                    <ul>
                        <li iconCls="">
                            <span><a href="javascript:void(0);"
                                     onclick="openTab('商家列表','/admin/business/tolist')">商家列表</a></span>
                        </li>

                        <li iconCls="">
                            <span><a href="javascript:void(0);"
                                     onclick="openTab('添加商家','/admin/business/toadd')">添加商家</a></span>
                        </li>
                    </ul>
                </li>
                <li>
                    <span>${sysResources.name}</span>
                    <ul>
                        <li iconCls="">
                            <span><a href="javascript:void(0);"
                                     onclick="openTab('北京','www.baidu.com')">北京</a></span>
                        </li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
</div>
<div region="center" title="Content" noheader="true" style="overflow: hidden">
    <div id="right" class="easyui-tabs" fit="true" border="false" style="border-left: 3px solid #99BBE8;">
        <!--<div id="shouye" title="首页" >-->
        <!---->
        <!--</div>-->
    </div>
</div>
<div data-options="region:'south'" style="height:70px;">
    <p align="center">Copyright © 2014 www.ixingji.com 京ICP备11047534号-3 All Rights Reserved.</p>
    <p align="center">（北京）信息技术有限公司 版权所有</p>
</div>
</body>
</html>
