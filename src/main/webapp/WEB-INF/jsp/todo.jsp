<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add TODO</div>
				<div class="panel-body">
					<form method="post" action="/add-todo">
						<input type="hidden" name="id"/>
						<fieldset class="form-group">
							<label for="description">Description</label>
							<input name="description" type="text" class="form-control"
								required="required" />
							<!-- <errors path="description" cssClass="text-warning" /> -->
						</fieldset>

						<fieldset class="form-group">
							<label for="targetDate">Target Date</label>
							<input name="targetDate" type="datetime-local" class="form-control"
								required="required" />
							<!-- <errors path="targetDate" cssClass="text-warning" /> -->
						</fieldset>

						<button type="submit" class="btn btn-success">Save</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>