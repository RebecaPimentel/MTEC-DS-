//import modulo externo
import express from 'express';
import exphbs from 'express-handlebars';
import path from 'path';

import { getCpsPage } from './controllers/cpsController.js';
import { getCursosPage } from './controllers/cursosController.js';
import { getDtsComemorativasPage } from './controllers/dtsComemorativasController.js';
import { getEventosCulturaisPage } from './controllers/eventosCulturaisController.js';
import { getPaginaFofocaPage } from './controllers/paginaFofocaController.js';

const app = express();

const hbs = exphbs.create({
  partialsDir: ["views/partials"]
});

app.engine('handlebars', hbs.engine);
app.set("view engine", "handlebars");
app.set("views", "./views");

app.use(express.urlencoded({ extended: true }));
app.use(express.json());

app.use(express.static('public'));

// Primeira rota
app.get("/", (req, res) => {
  let end = path.resolve('./views/index.html');
  res.sendFile(end);
});

// Rotas 
app.get('/cps', getCpsPage);
app.get('/curso', getCursosPage);
app.get('/dtsComemorativas', getDtsComemorativasPage);
app.get('/eventosCulturais', getEventosCulturaisPage);
app.get('/paginaFofoca', getPaginaFofocaPage);


app.listen(3000, ()=>{console.log("Funcionando na porta 3000")})
