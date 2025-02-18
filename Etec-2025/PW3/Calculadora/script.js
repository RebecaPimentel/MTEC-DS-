const visor = document.getElementById("visor");

function ad(digitos) {
    visor.value += digitos.innerText;
} 

function zero() {
    visor.value += "0";
}

function apagarTudo() {
    visor.value = "";
}

function del() {
    if (visor.value.length > 0) {
        visor.value = visor.value.slice(0, -1);
    }
}

function resul() {
    try{
        visor.value = eval(visor.value);
    } catch {
        alert("Error com a conta: " + visor.value);
    }
}
