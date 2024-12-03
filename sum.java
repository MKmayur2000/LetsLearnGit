<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Two Numbers</title>
</head>
<body>
    <h2>Add Two Numbers</h2>
    <input type="number" id="num1" placeholder="Enter first number">
    <input type="number" id="num2" placeholder="Enter second number">
    <button onclick="addNumbers()">Add</button>
    <p id="result"></p>

    <script>
        function addNumbers() {
            const num1 = parseFloat(document.getElementById('num1').value);
            const num2 = parseFloat(document.getElementById('num2').value);
            const sum = num1 + num2;
            document.getElementById('result').innerText = `Sum: ${sum}`;
        }
    </script>
</body>
</html>
