<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Media Player</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 50px;
        }
        .player {
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        button {
            margin-top: 10px;
            padding: 10px;
            font-size: 16px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="player">
        <audio id="audio" controls>
            <source src="your-audio-file.mp3" type="audio/mpeg">
            Your browser does not support the audio element.
        </audio>
        <button onclick="playAudio()">Play</button>
        <button onclick="pauseAudio()">Pause</button>
        <button onclick="stopAudio()">Stop</button>
    </div>

    <script>
        const audio = document.getElementById('audio');
        
        function playAudio() {
            audio.play();
        }
        
        function pauseAudio() {
            audio.pause();
        }
        
        function stopAudio() {
            audio.pause();
            audio.currentTime = 0;
        }
    </script>
</body>
</html>
