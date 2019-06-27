<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script
            src="https://code.jquery.com/jquery-3.4.0.js"
            integrity="sha256-DYZMCC8HTC+QDr5QNaIcfR7VSPtcISykd+6eSmBW5qo="
            crossorigin="anonymous"></script>
    <title>Guest</title>
</head>
<body>
<br>
<a href="/guest">Back</a>
<br>
<script>
    function message(query) {
        if (query.length === 10){
            var type = 'Date';
        } else {
            query = document.getElementById('query1').value + 'T' + document.getElementById('query2').value
        }

        $.ajax({
            method: "GET",
            url: '/guest/search.json?q=' + query + '&t=' + type
        }).done(function (response) {
            let resultPlace = document.getElementById('result');
            let resultString = '<table>';
            console.clear();
            for (let i = 0; i < response.length; i++) {
                let current = response[i];
                resultString += '<tr>';
                resultString += '<td>';
                resultString += current['dateSeance'] + ' ' + current['name'] + ' ' + current['number'] + ' ' + current['age'] + ' ' + current['gender'];
                resultString += '</td>';
                resultString += '</tr>';
            }
            resultString += '</table>';
            resultPlace.innerHTML = resultString;
        });
    }
</script>
<div>
    <input id="query1" type="date" onkeyup="message(document.getElementById('query1').value)">
    <input id="query2" type="time" onkeyup="message(document.getElementById('query2').value)">
</div>
<div id="result"></div>

</body>
</html>