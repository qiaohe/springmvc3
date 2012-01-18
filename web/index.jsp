<%--
  Created by IntelliJ IDEA.
  User: johnson
  Date: 1/2/12
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Spring MVC demo</title>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js">
    </script>
    <script type="text/javascript">
        $(document).ready(function() {
            $.ajax({
                url: "http://localhost:8080/users.html",
                dataType:"json",
                success: function(data){
                    var info = '';
                    $.each(data, function(index, value) {
                        info = info + "userName:" + value.userName + " password:" + value.password + "<br>";
                    });
                    $("#users").html(info);
                }
            });
        }
               )
    </script>

</head>
<body>
<div id="users">

</div>
<button id="btn" title="CLick" >Click me</button>
</body>
</html>