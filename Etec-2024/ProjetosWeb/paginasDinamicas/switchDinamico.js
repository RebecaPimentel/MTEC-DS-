const http = require("http");
const url = require("url");

const port = 3000;

const server = http.createServer((req, res) => {

    const urlInfo = url.parse(req.url, true);
    const p = parseInt(urlInfo.query.p);

    res.statusCode = 200;
    res.setHeader("Content-Type", "text/html");

    if (!p || isNaN(p)) {
        res.end("Por favor, forneça um número válido para a 'placa'");
    } else {
        let message;

        switch (p % 10) {
            case 1:
            case 2:
                message = "Não circulam na segunda-feira";
                break;
            case 3:
            case 4:
                message = "Não circulam na terça-feira";
                break;
            case 5:
            case 6:
                message = "Não circulam na quarta-feira";
                break;
            case 7:
            case 8:
                message = "Não circulam na quinta-feira";
                break;
            case 9:
            case 0:
                message = "Não circulam na sexta-feira";
                break;
            default:
                message = "Data inválida";
                break;
        }

        res.end(`<h1>${message}</h1>`);
    }
});

server.listen(port, () => {
    console.log(`Servidor rodando na porta: ${port}`);
});