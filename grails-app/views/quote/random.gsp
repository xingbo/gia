<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Random Quote</title>
    <link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
</head>

<body>
    <q>${quote.content}</q>
    <p>${quote.author}</p>
</body>
</html>