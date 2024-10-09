function maior (a, b, c) {
    if (a > b && a > c) {
        console.log("Maior numero: "+a);

    }else if (b > a && b > c ) {
        console.log("Maior numero: "+b);
    } else {
        console.log("Maior numero: "+c);

    }
}

function menor (a, b, c){
    var r = a < b && a < c ? a : b < a && b < c ? b :c;
    console.log("Menor numero: "+r);
}


function formataMes (mes) {
     switch (mes) {
        case 1: 
            console.log("Janeiro");
            break;
        case 2: 
            console.log("Fevereiro");
            break;
        case 3: 
            console.log("Março");
            break;
        case 4: 
            console.log("Abril");
            break;
        default:
            console.log('Não imprementei ainda');    
    }
}

formataMes(2);
maior(47,6,8);
menor(47,6,78);

