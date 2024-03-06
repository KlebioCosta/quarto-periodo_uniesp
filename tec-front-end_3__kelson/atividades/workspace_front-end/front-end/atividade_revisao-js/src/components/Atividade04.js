
// Manipulando Array Média do Aluno


function resultFinal(){
    if(media<=0){
        return `O aluno nao possui notas. 
        `;
    }else if (media >0 && media < 5){
        return `Aluno Reprovado! 
        `
    }else if (media >= 5 && media < 7){
        return `Aluno apto para final!!
         `
    }else{
        return `Aluno Aprovado!!! 
        `;
    }
}

function resultNotas(){
    for(let i=0 ; i<notas.length ; i++){
        soma += notas[i];
    }
    media = soma/notas.length;
    media = media.toFixed(2);
    return `
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     -=-=-=-=   MÉDIA DO PERIODO ATUAL   =-=-=-=-
           -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

        A primeira nota do aluno é: ${notas[0]}
        A segunda nota do aluno é: ${notas[1]}
        A terceira nota do aluno é: ${notas[2]}

        Média final: ${media}
        ${resultFinal()}`;

}
var notas = [8, 7.6, 5];
var soma = 0;
var media = 0;

console.log(resultNotas());