<!DOCTYPE html>
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head lang="en">
    <meta charset="UTF-8"/>
    <title></title>
    <link rel="stylesheet" type="text/css" th:href="@{/css/bootstrap.min.css}"/>
</head>
<body ms-controller="viewmodel">
<h1>Hello World</h1>
<button type="button" class="btn btn-primary" style="margin: 10px;" ms-click="@hello">测试1</button>
<button type="button" class="btn btn-primary" style="margin: 10px;" ms-click="@hello2">测试2</button>
<div ms-controller="wrap">"${a}"</div>
<table class="table table-striped">
    <thead>
    <tr>
        <td class="active">id</td>
        <td class="success">姓名</td>
        <td class="warning">性别</td>
        <td class="danger">年龄</td>
        <td class="info">角色</td>
    </tr>
    </thead>
    <tbody>

<#--<#list datalist as item>-->
    <#--<tr >-->
        <#--<td >${item.id}</td>-->
        <#--<td >${item.name}</td>-->
        <#--<td >${item.sex}</td>-->
        <#--<td >${item.age}</td>-->
        <#--<td >${item.role}</td>-->
    <#--</tr>-->
<#--</#list>-->
    </tbody>
</table>
</body>

<script type="text/javascript">
    var hello = avalon.define({
        $id: "wrap",
        a: "你好啊"
    });
    var hello2 = avalon.define({
        $id: "wrap2",
        a: "大家好",
        b: "哈哈哈"
    });
    avalon.scan();
</script>

<script language="JavaScript" type="text/javascript">
    function mydel(){
        var a=confirm("确定删除吗！");
        if(a==true){
            deleteProductFromCategory_o_${rowCount}.submit();
        }
    }
</script>
</html>
