
// mostrar saida de multiplos de 3 e 5.

function imprimirNumeros(quantidade){
    for(var i=0 ; i < quantidade ; i++) {
        if (i%3 == 0 && i%5 == 0){
            console.log(`Fizz.. .  . ..Buzz`)
        }else if(i%3 == 0){
          console.log(`Fizz`);
        }else if(i%5 == 0){
            console.log(`BuzzZzzZZZz`);
        }else{
            console.log(i);
        }
    }
}
var quantidade = 100;

console.log(`Começa aqui!! `)
imprimirNumeros(quantidade);