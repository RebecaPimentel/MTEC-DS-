function ad(variavel, digitos) {
    return variavel + digitos;
} 

function zero(variavel) {
    return variavel + "0";
}

function apagarTudo() {
    return "";
}

function del(variavel) {
    if (variavel.length > 0) {
        variavel = variavel.slice(0, -1);
    }
    return variavel;
}

function resul( variavel) {
    if (variavel === "0/0") {
        return "Error 0";
    } else {
        try{
            var r = eval(variavel);
            r = r.toString();
            return r;
        } catch {
            return "Error com a conta";
        }
    }
    
}

module.exports = {ad, zero, apagarTudo, del, resul}