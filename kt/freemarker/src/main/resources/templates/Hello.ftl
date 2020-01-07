<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
     <div align="center">
         <p>
             ${name}
         </p>
     </div>
     <div align="center">
         <h3>图书列表</h3>
         <table>
             <tr>
                 <td>书名</td>
             </tr>
             <tr>
                 <td>图书数量：${books?size}</td>
             </tr>
             <#list books as book>
                 <tr>
                     <td>${book}</td>
                 </tr>
             </#list>

         </table>
     </div>
</body>
</html>