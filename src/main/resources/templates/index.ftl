<!DOCTYPE html>
<html lang="en">
<head>
<script src="/js/react/build/react.js"></script>
<script src="/js/react/build/react-dom.js"></script>
<script src="/js/react/build/browser.min.js"></script>
<script src="/js/react.js"></script>
<script src="/js/md5.js"></script>
<script src="/js/jquery-1.8.3.min.js"></script>
<link   type="text/css" rel="stylesheet" href="/css/application.css"></script>

</head>
<body>

	<div id="example" class="exa"></div>

	${m}

	<div id="example2" class="exa"></div>

	<div id="example3" class="exa"></div>

	<div id="example4" class="exa"></div>

	<div id="example5" class="exa"></div>

	<script type="text/babel">
     ReactDOM.render(
  		<h1>Hello, world!</h1>,
 	 	document.getElementById('example')
	);
    
   	var names = ['Alice', 'Emily', 'Kate'];
	ReactDOM.render(
		<div>
			{
				names.map(function(name){
					return <div key={name}>Hello,{name}!</div>
				})
			}
		</div>,
		document.getElementById('example2')

	);


	var arr = [
  		<h1>Hello world!</h1>,
  		<h2>React is awesome</h2>,
	];
	ReactDOM.render(
  		<div key={arr}>{arr}</div>,
  		document.getElementById('example3')
	);

	var HelloMessage = React.createClass({
		render:function(){
			return <h1>Hello {this.props.name}</h1>
		}
	});

	ReactDOM.render(
		<HelloMessage name="John" />,document.getElementById("example4")
	);
    </script>



	<script type="text/javascript">
		$(function() {
			console.log(hex_md5("123qwe"));
		});
	</script>
</body>
</html>