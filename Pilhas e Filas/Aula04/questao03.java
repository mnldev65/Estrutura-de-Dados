// 3) Um sistema precisa controlar tarefas usando simultaneamente uma fila e uma pilha.
// As tarefas chegam e são inseridas na fila, mas algumas tarefas prioritárias precisam
// ser movidas imediatamente para a pilha, sendo resolvidas antes das demais.
// Explique qual será a ordem final de execução das tarefas e justifique o porquê,
// considerando o funcionamento das duas estruturas.


/*
 
    A ordem final é a que sempre que houver itens na pilha (prioritários), 
    eles serão executados primeiro na ordem LIFO. Quando a pilha estiver vazia, 
    as tarefas da fila serão retomadas na ordem FIFO. 
    Isso assegura que as tarefas acumuladas sejam atendidas com prioridade imediata,
    enquanto as não prioritárias seguem a ordem de chegada.

 */