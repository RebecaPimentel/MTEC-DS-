/* For
* 
*     Criar um programa que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem: "Múltiplo de 10".
* 
*/

for(let i = 0; i<101; i++) {
    
    if(i % 10 == 0) {
        console.log(i," Multiplo de 10")
    } else {
        console.log(i) 
    }
}
