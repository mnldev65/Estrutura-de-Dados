// 2) Um hospital precisa organizar os exames realizados em pacientes
// durante o dia. Cada exame é registrado em ordem cronológica. No fim
// do dia, o sistema deve imprimir esses exames na ordem inversa à que
// foram feitos (do último para o primeiro).
// Que estrutura você usaria para guardar os exames: fila ou pilha?
// Implementaria com array ou lista encadeada? Justifique.


/*

    Pilha, já que os exames são enviados em uma sequência cronológica, mas precisa-se imprimir do mais recente
    ao mais antigo. Se o número de exames for grandes ou variável, eu optaria pela lista encadeada, 
    pois ela é dinâmica e não exige redimensionamento 

*/