<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<%@ include file="include/head.jsp" %>
<body>
<div class="container">
<%@ include file="include/menu.jsp" %>
<form class="form-horizontal" action=do?command=CreateTask method="POST">
<fieldset>

<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Создание задания</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="name_task">Название</label>
  <div class="col-md-4">
  <input id="name_task" name="name_task" value="TestNameTask" type="text" placeholder="" class="form-control input-md" required="">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="description_task">Описание</label>
  <div class="col-md-4">
  <input id="description_task" name="description_task" value="TestDescriptionTask" type="text" placeholder="" class="form-control input-md" required="">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="date">Дата</label>
  <div class="col-md-4">
  <input id="date" name="date" value="2019" type="text" placeholder="" class="form-control input-md" required="">
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="id_goals">Номер цели</label>
  <div class="col-md-4">
  <input id="id_goals" name="id_goals" type="text" placeholder="" class="form-control input-md" required="">
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="create_task"></label>
  <div class="col-md-4">
    <button id="create" name="create" class="btn btn-primary">Создать</button>
  </div>
</div>

</fieldset>
</form>

</fieldset>
</form>
</div>
</body>
</html>

