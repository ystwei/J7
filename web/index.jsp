<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <title>test</title>
  <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
  <style type="text/css">
    body { padding: 20px; }
  </style>
  <script type="text/javascript">

    function ok(){
      if(document.getElementById("username").value==""){

        alert("发帖人不能为空！");
        return ;
      }
      if(document.getElementById("title").value==""){

        alert("标题不能为空！");
        return ;
      }

      if(document.getElementById("content").value.trim()==""){

        alert("内容不能为空！");
        return ;
      }
      if(document.getElementById("email").value==""){

        alert("邮箱不能为空！");
        return ;
      }else{//验证邮箱
        var mail=document.getElementById("email").value;
        var filter  = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        if (filter.test(mail)) {

        }else {
          alert('您的电子邮件格式不正确');
          return ;
        }
      }


      document.all.form1.submit();

    }
  </script>
</head>

<body>


<h3>发帖驿站</h3>
<form method="post" name="form1" action="message?action=add" class=" form-horizontal">
  <div class="control-group">
    <div class="control-label">
      <label for="username">用户名：</label>
    </div>
    <div class="controls">
      <input type="text" id="username"  name="username"/>
    </div>
  </div>
  <div class="control-group">
    <div class="control-label">
      <label for="email">邮箱：</label>
    </div>
    <div class="controls">
      <input type="text" id="email"  name="email"/>
    </div>
  </div>


  <div class="control-group">
    <div class="control-label">
      <label for="title">帖子标题：</label>
    </div>
    <div class="controls">
      <input type="text" id="title"  name="title" />
    </div>
  </div>

  <div class="control-group">
    <div class="control-label">
      <label for="title">帖子内容：</label>
    </div>
    <div class="controls">
      <textarea id="content" name="content" rows="10" cols="20">



      </textarea>
    </div>
  </div>


  <div class="control-group">
    <div class="controls">
      <input type="button" class="btn_login" onclick="ok()" value="提 交"/>
      <a href="message?action=query" class="reg">帖子浏览</a>
    </div>
  </div>
</form>



<script src="bootstrap/js/jquery.js" type="text/javascript"></script>
<script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>
