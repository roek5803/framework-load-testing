const express = require('express');
const uuidv1 = require('uuid/v1');
const app = express();
const PORT = 8095;

const computePi = (n) => {
    let sequenceFormula = 0;

    for (let counter = 1; counter < n; counter += 2) {
        sequenceFormula = sequenceFormula + ((1.0 / (2.0 * counter - 1)) - (1.0 / (2.0 * counter + 1)));
    }

    return 4 * sequenceFormula;
};

app.get('/', (req, res) => {
    res.send('Hello World!');
});

app.get('/api/pi', (req, res) => {
    const pi = computePi(10000000);
    res.send(uuidv1() + '-' + pi);
});

app.listen(PORT, () => {
    console.log('listening on port ' + PORT + '!');
});