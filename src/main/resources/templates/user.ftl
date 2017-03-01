<!DOCTYPE html>
<html lang="en">
<head>
<script src="/js/jquery-1.8.3.min.js"></script>
<script src="/js/react/build/react.js"></script>
<script src="/js/react/build/react-dom.js"></script>
<script src="/js/react/build/browser.min.js"></script>
<script src="/js/react.js"></script>
<script src="/js/md5.js"></script>
<link   type="text/css" rel="stylesheet" href="/css/application.css"></script>

</head>
<body>
asdf
	<div id="example" class="exa"></div>
 
	<script type="text/babel">
      var UserGist = React.createClass({
        getInitialState: function() {
          return {
            username: '',
            lastGistUrl: ''
          };
        },
        componentDidMount: function() {
          this.serverRequest = $.get(this.props.source, function (result) {
            var lastGist = result[0];
            this.setState({
              username: lastGist.id,
              lastGistUrl: lastGist.name
            });
          }.bind(this));
        },
        componentWillUnmount: function() {
          this.serverRequest.abort();
        },
        render: function() {
          return (
            <div>
              {this.state.username} 用户最新的 Gist 共享地址：
              <a href={this.state.lastGistUrl}>{this.state.lastGistUrl}</a>
            </div>
          );
        }
      });

      ReactDOM.render(
        <UserGist source="localhost:8443/user/test2" />,
        document.getElementById('example')
      );
    </script>
 
</body>
</html>