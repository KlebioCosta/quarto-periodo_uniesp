
//Exibir nome, sobrenome e cpf na ordem pedida

var nome = "Klébio";
const cpf = 1234567890-0;

function dadosCliente() {
    let sobreNome = "Costa";

    return `\tNome: ${nome} 
    \tSobrenome: ${sobreNome}
    \tCPF: ${cpf}`
}
console.log(dadosCliente());