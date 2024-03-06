import React from 'react'
import Exercicio01Adicao from './components/Exercicio01Adicao'
import Exercicio01Subtracao from './components/Exercicio01Subtracao'
import Exercicio01Multiplicacao from './components/Exercicio01Multiplicacao'
import Exercicio01Divisao from './components/Exercicio01Divisao'

const App = () => {
  return (
    <div>
      <Exercicio01Adicao num1= {5} num2= {9} />
      <Exercicio01Subtracao num1= {7} num2= {2} />
      <Exercicio01Divisao num1= {144} num2= {12}/>
      <Exercicio01Multiplicacao num1= {17} num2= {7} />
    </div>
  )
}
export default App