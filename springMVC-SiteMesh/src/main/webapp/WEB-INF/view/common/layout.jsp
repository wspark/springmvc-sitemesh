<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>

<html>
<head>
 <title><decorator:title default="example" /></title>
 <link href="<%= request.getContextPath() %>/sitemesh/decorators/layout.css" rel="stylesheet" type="text/css">
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <decorator:head />
</head>  
<body leftmargin="0" topmargin="0">
<table width="100%" height="100%" border="1">
 <tr>
  <td id="header" colspan="2">  header area</td>
 </tr>
 
 <tr>
  <td valign="top" width="200"> left area   </td>

  <td width="*">
   <table width="100%" height="100%" cellspacing="0">
    <tr>
     <td id="pageTitle">
      <decorator:title />
     </td>
    </tr>
    <tr>
     <td valign="top" height="100%">
      <decorator:body />
     </td>
    </tr>
   </table>
  </td>
 </tr>

 <tr>
  <td id="footer" height="20" colspan="2" align="center">  footer area </td>
 </tr>
</table>

</body>
</html>