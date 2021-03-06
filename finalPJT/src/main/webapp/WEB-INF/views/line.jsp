<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/series-label.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>

<style type="text/css">
.highcharts-figure, .highcharts-data-table table {
	min-width: 360px;
	max-width: 800px;
	margin: 1em auto;
}

.highcharts-data-table table {
	font-family: Verdana, sans-serif;
	border-collapse: collapse;
	border: 1px solid #ebebeb;
	margin: 10px auto;
	text-align: center;
	width: 100%;
	max-width: 500px;
}

.highcharts-data-table caption {
	padding: 1em 0;
	font-size: 1.2em;
	color: #555;
}

.highcharts-data-table th {
	font-weight: 600;
	padding: 0.5em;
}

.highcharts-data-table td, .highcharts-data-table th,
	.highcharts-data-table caption {
	padding: 0.5em;
}

.highcharts-data-table thead tr, .highcharts-data-table tr:nth-child(even)
	{
	background: #f8f8f8;
}

.highcharts-data-table tr:hover {
	background: #f1f7ff;
}
</style>

</head>
<body>
	<figure class="highcharts-figure">
		<div id="container"></div>
		<p class="highcharts-description">
			Basic line chart showing trends in a dataset. This chart includes the
			<code>series-label</code>
			module, which adds a label to each line for enhanced readability.
		</p>
	</figure>

	<script type="text/javascript">
		var installation = ${datas.Installation}
		console.log(">>>>>>>>>>>");
		var ary = new Array();

		for (var i = 0; i < installation.length; i++) {
			ary.push(installation[i]);
		}
		console.log(">>>>>>>>>>>");
		console.log(ary);

		Highcharts.chart('container', {

			title : {
				text : 'Solar Employment Growth by Sector, 2010-2016'
			},

			subtitle : {
				text : 'Source: thesolarfoundation.com'
			},

			yAxis : {
				title : {
					text : 'Number of Employees'
				}
			},

			xAxis : {
				accessibility : {
					rangeDescription : 'Range: 2010 to 2017'
				}
			},

			legend : {
				layout : 'vertical',
				align : 'right',
				verticalAlign : 'middle'
			},

			plotOptions : {
				series : {
					label : {
						connectorAllowed : false
					},
					pointStart : 2010
				}
			},

			series : [
					{
						name : 'Installation',
						data : ary
					},
					{
						name : 'Manufacturing',
						data : [ 24916, 24064, 29742, 29851, 32490, 30282,
								38121, 40434 ]
					},
					{
						name : 'Sales & Distribution',
						data : [ 11744, 17722, 16005, 19771, 20185, 24377,
								32147, 39387 ]
					},
					{
						name : 'Project Development',
						data : [ null, null, 7988, 12169, 15112, 22452, 34400,
								34227 ]
					},
					{
						name : 'Other',
						data : [ 12908, 5948, 8105, 11248, 8989, 11816, 18274,
								18111 ]
					} ],

			responsive : {
				rules : [ {
					condition : {
						maxWidth : 500
					},
					chartOptions : {
						legend : {
							layout : 'horizontal',
							align : 'center',
							verticalAlign : 'bottom'
						}
					}
				} ]
			}

		});
	</script>
</body>
</html>