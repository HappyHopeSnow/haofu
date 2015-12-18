<%@ page contentType="text/html; charset=UTF-8" %>
<script>
    function add() {
        var postData = $("#ff").serialize();
        if(verifyUserName($.trim($("input[name='username']").val())) == null) {
            alert("登陆账户必须为6-18位英文字母")
            return
        }
        $.post("/vm/business/saveorupdate", postData, function (returnData) {
            if (returnData.status == 200) {
//                        $.messager.alert("保存成功", "保存成功");
                openTab('商家列表', "/vm/business/tolist")
            } else {
                $.messager.alert(returnData.message, returnData.message)
            }
        })
    }
    /**
     * 验证用户名格式
     * @param username
     * @returns {Array|{index: number, input: string}}
     */
    function verifyUserName(username) {
        var reg = /^[a-zA-Z]\w{6,18}$/;
        var r = username.match(reg);
        return r;
    }
</script>
<div closable="true" class="easyui-layout" fit="true" border="false">
    <div data-options="region:'center',split:true">
        <form id="ff" method="post">
            <input type="hidden" id="id" name="id" value="${business.id}">
            <input type="hidden" id="sysUserId" name="sysUserId" value="${business.sysUserId}">
            <table cellpadding="5">
                <tr>
                    <td>商家姓名</td>
                    <td><input class="easyui-textbox" style="width: 300px" type="text" name="name"
                               data-options="required:true"
                               value="${business.name}">
                    </td>
                </tr>
                <tr>
                    <td>商家简介</td>
                    <td><input class="easyui-textbox" style="width: 300px" type="text" name="descrp" data-options=""
                               value="${business.desc}">
                    </td>
                </tr>
                <tr>
                    <td>商家姓名</td>
                    <td><input class="easyui-textbox" style="width: 300px" type="text" name="name"
                               data-options="required:true"
                               value="${business.name}">
                    </td>
                </tr>
                <tr>
                    <td>手机</td>
                    <td><input class="easyui-textbox" style="width: 300px" type="text" name="mobile"
                               data-options="required:true"
                               value="${business.mobile}">
                    </td>
                </tr>
                <tr>
                    <td>旺旺id</td>
                    <td><input class="easyui-textbox" style="width: 300px" type="text" name="aliName" data-options=""
                               value="${business.aliName}">
                    </td>
                </tr>
                <tr>
                    <td>qq</td>
                    <td><input class="easyui-textbox" style="width: 300px" type="text" name="qq" data-options=""
                               value="${business.qq}">
                    </td>
                </tr>
                <tr>
                    <td>mail</td>
                    <td><input class="easyui-textbox" style="width: 300px" type="text" name="mail" data-options=""
                               value="${business.mail}">
                    </td>
                </tr>
                <tr>
                    <td>描述</td>
                    <td><input class="easyui-textbox" style="width: 300px" type="text" name="descrp" data-options=""
                               value="${business.descrp}">
                    </td>
                </tr>
            </table>
        </form>

    </div>
    <div data-options="region:'south'" style="height:70px;">
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'" id="add"
           onclick="add()">保存</a>
    </div>
</div>