function consultaCEP() {
    let cep = document.getElementById('cep').value 
    let url = 'https://viacep.com.br/ws/' + cep + '/json/'
    fetch(url)
        .then(response => response.json())
        .then(data => {
            document.getElementById('logradouro').value = data.logradouro
            document.getElementById('bairro').value = data.bairro
            document.getElementById('localidade').value = data.localidade
            document.getElementById('uf').value = data.uf
        })
        .catch(error => alert("CEP não encontrado"))
}
function consultaCEP() {
            let cep = document.getElementById('cep').value 
            let url = 'https://viacep.com.br/ws/' + cep + '/json/'
            fetch(url)
                .then(response => response.json())
                .then(data => {
                    document.getElementById('logradouro').value = data.logradouro
                    document.getElementById('bairro').value = data.bairro
                    document.getElementById('localidade').value = data.localidade
                    document.getElementById('uf').value = data.uf
                })
                .catch(error => console.error(error))
        }