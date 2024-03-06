
// função para dobrar numeros do array

function dobrarNumeros(){
    const dobrarValores = listNumeros.map(i => i * 2)
    return dobrarValores;
};

const listNumeros = [2, 4, 6, 8, 13];

console.log(`\nPrimmeira lista: ${listNumeros.join(" - ")}`);
console.log(`Nova lista: \t${dobrarNumeros().join(" - ")}\n`);