/* Modulos
* 
*   Escreva um programa em Node.js que permita ao usuário converter entre Fahrenheit e Celsius. O programa deve fornecer duas opções:
*
*   Converter de Fahrenheit para Celsius.
*   Converter de Celsius para Fahrenheit.
* 
*/

import http from 'http'
import fahrenheit from "./fahrenheit.js";
import celsius from "./celsius.js";

http.createServer((req, res) => {
    
    const celNumero=30;
    res.write(`Converter de Celsius para Fahrenheit\n`);
    res.write(`${fahrenheit(celNumero)}\n\n`);
    
    const fahNumero=50;
    res.write(`Converter de Fahrenheit para Celsius\n`);
    res.write(`${celsius(fahNumero)}\n`);
    
    res.end()  
}).listen(5000, () => {console.log('app rodando')})
