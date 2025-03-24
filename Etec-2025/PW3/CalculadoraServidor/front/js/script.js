
/*

*/
document.querySelectorAll(".button").forEach(button => {
  button.addEventListener('click', async(event)=>{
    const visor = document.getElementById("visor").value;
    let id = event.target.id;
    const digito = event.target.innerText;

    const options = {
     headers: {
       'Accept': 'application/json',
       'Content-Type': 'application/json'
     },
     method: "POST",
     body: JSON.stringify({visor: visor, button: id, digito: digito})
     }

    const url = "http://localhost:3000/calc"

    const resp = await fetch(url, options)

    const retorno = await resp.json()

    document.getElementById("visor").value = retorno.resul;
    console.log(retorno)
})
});






// Realizar a requisição para o BackENd




