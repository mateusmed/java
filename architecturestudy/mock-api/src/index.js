
const express = require('express');
const timeout = require('connect-timeout');


const app = express();
const port = 3000;
const bodyParser = require('body-parser');
app.use(bodyParser.json());


// -> PARA FORÇAR O TIMEOUT
//app.use(timeout(120000));
//app.use(haltOnTimedout);
//
//function haltOnTimedout(req, res, next){
//    if (!req.timedout) next();
//}


app.get('/', (req, res) => {
    res.send('Hello World!')
});

app.get('/health', (req, res) => {
    res.send('systems up')
});

app.get('/car', (req, res) => {

    let listResponse = [
        {
            "xname": "f40"
        },
        {
            "name": "z4"
        }
    ];

    res.status(200).send(listResponse);
});

app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`)
});

