// 1) Um aplicativo de edição de texto permite que o usuário use a função
// "Desfazer" (Ctrl+Z). Cada ação realizada pelo usuário precisa ser
// desfeita na ordem inversa em que aconteceu.
// Qual estrutura de dados é mais adequada para essa situação: fila ou
// pilha? Explique.

/*
    
    Pilha, já que o desfazer necessita modificar ações na sequência oposta à que aconteceram, ou seja, 
    o último código a ser realizado é o primeiro a ser desfeito.

*/