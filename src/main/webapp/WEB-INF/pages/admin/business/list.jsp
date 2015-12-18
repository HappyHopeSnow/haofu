<%@ page import="com.haofu.entity.Business" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%
    List<Business> businessList = (List<Business>) request.getAttribute("list");
%>
<script>
    function edit(id) {
        openTab('编辑商家', '/admin/business/toedit?id=' + id);
    }
    function del(id) {
        $.messager.confirm('确认删除', '确认要删除商家?', function (r) {
            if (r) {
                $.getJSON("/admin/business/del.json", {"id": id}, function (data) {
                    if (data.status == 200) {
                    } else {
                        alert("删除失败")
                    }
                    $('#dg').datagrid('reload')
                })
            }
        });
    }

    $(function () {
        var pager = $('#dg').datagrid({
            rownumbers: false,
            singleSelect: true,
            pagination: true,
            url: "/admin/business/list",
            method: "post",
            fitColumns: true,
            fit: true,
            pageSize: 20,
            striped: true,
            checkOnSelect: false,
            selectOnCheck: false,
            columns: [[
                {field: 'id', title: 'id', width: 30, align: 'center'},
                {field: 'name', title: '商家姓名', width: 30, align: 'center'},
                {field: 'mobile', title: '手机', width: 30, align: 'center'},
                {field: 'searchKey', title: '搜索关键字', width: 30, align: 'center'},
                {field: 'qq', title: 'qq', width: 30, align: 'center'},
                {field: 'mail', title: '邮箱', width: 30, align: 'center'},
                {field: 'descrp', title: '描述', width: 30, align: 'center'},
                {
                    field: 'action',
                    title: '操作',
                    width: 100,
                    align: 'center',
                    formatter: function (value, rec, rowIndex) {
                        return "<a href='javascript:void(0)' onclick='edit(" +
                                rec.id + ")'>修改</a>&nbsp;"

                    }
                }
            ]]
        }).datagrid('getPager');	// get the pager of datagrid
        pager.pagination({
            pageSize: 20,
            buttons: [{
                iconCls: 'icon-add',
                handler: function () {
                    openTab('添加商家', '/admin/business/toadd')
                }
            }]
        });
    })

</script>

<div class="easyui-layout" fit="true" border="false">
    <div data-options="region:'north',split:true" style="height:70px;">
    </div>

    <div data-options="region:'center'">
        <table id="dg"></table>
        <div id="helpdgoods" class="easyui-window" title="帮助" style="width:400px;height:150px;"
             data-options="resizable:true,modal:true,closed:true">
            <ol>
                <li> 点击推荐值, 可以直接修改, 点击其他地方则自动保存, 如果失败会弹出失败信息, 成功则无响应</li>
                <li> 在搜索框中输入名称可模糊查询</li>
                <li> 在搜索框中输入id可精确查询</li>
                <li> 在下拉选选择状态可按状态查询</li>
                <li> 点击列表框头部的列名可以排序, 可以排序的列有:
                    <br>推荐值, 官方价, 内部价, 创建时间
                </li>
                <li>如有问题或建议, 通知管理员 连乐 <a target=blank
                                          href=http://wpa.qq.com/msgrd?V=3&uin=364214799&Site=star&Menu=yes><img
                        border="0" SRC=http://wpa.qq.com/pa?p=1:953924393:9 alt="q我"></a></li>
            </ol>


        </div>
    </div>
</div>