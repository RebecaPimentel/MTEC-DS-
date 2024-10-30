
// Declarar Variaveis
var i =0;
var verif = false;
var numero = 1;


    //Adicionando a tabuada
while(numero<11){
    while(i<11) {
        const paragrafo = document.createElement('p');
        var r = numero*i;
        paragrafo.textContent = numero+' x '+i+' = '+r;

        document.getElementById('container'+numero).appendChild(paragrafo);
        i++;
    }
    i=0;
    numero++;
}
