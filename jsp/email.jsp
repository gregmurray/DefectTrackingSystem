<html>

	<head>
		<title> Email Simulation</title>
	</head>
	
	<body>
		<h1> Email Simulation</h1>

		<h5>Subject: <%= request.getAttribute("subject") %> </h5>
		<p>Message: <%= request.getAttribute("message") %> </p>
		
	</body>

</html>
