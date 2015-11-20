<%@ page import="com.test.GenerateOOM" %>
<html>
<head>
  <script language="javascript">
    setTimeout(function(){ window.location.href = "/"; }, 3);
  </script>
</head>
<body>
  <h1>Test OOM!</h1>
  <p><%=GenerateOOM.generate()%></p>
</body>
</html>
