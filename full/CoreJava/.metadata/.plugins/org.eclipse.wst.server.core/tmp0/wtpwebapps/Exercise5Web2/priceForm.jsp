<%@ include file="header.txt" %>

<fieldset>
	<legend>Enter the price range</legend>
	
	<form class="form" action="viewProductsByPrice">
		<div>
			<label>Minimum</label>
			<input size="10" name="min_price" />
		</div>
		<div>
			<label>Maximum</label>
			<input size="10" name="max_price" />
		</div>
		<div>
			<label></label>
			<button>Submit</button>
		</div>
		
	</form>
</fieldset>
<%@ include file="footer.txt" %>