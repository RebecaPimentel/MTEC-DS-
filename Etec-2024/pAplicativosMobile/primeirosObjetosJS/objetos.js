// Objetos

var aluno1 = {
    matricula: 230562,
    nome: 'Rebeca Elaine Pimentel da Silva',
    curso: 'Desenvolvimento de Sistemas',
    ativo: true
};

var aluno2 = {
    matricula: 230061,
    nome: 'Barbara Samira Santiesteban Saravia',
    curso: 'Desenvolvimento de Sistemas',
    ativo: true
};

console.log(aluno1.matricula);
console.log(aluno1.nome);
console.log(aluno1.curso);
console.log(aluno1.ativo);
aluno1.dataNascimento = '16/10/2007';
console.log(aluno1.dataNascimento);
console.log('    ');
console.log(aluno2.nome);
console.log(aluno2.curso);
console.log(aluno2.ativo);
aluno2.dataNascimento = '12/06/2007';
console.log(aluno2.dataNascimento);



delete aluno1.dataNascimento;

// Undefined e null
 var x;
 var y = null;

 // Arrays

 var frutas = ['Banana' ,'Laranja ' ,'Maça'];