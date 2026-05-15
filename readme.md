# BlackBattleship

## Membros do grupo

- David Costa, nº 124423
- Gabriel Matos, nº 112967
- João Nicolau, nº 111111
- Maria Frade, nº 122477


## Product Backlog

### User Stories

1. Como jogador, quero introduzir um nickname antes de iniciar o jogo, para poder ser identificado durante a partida.

   Critérios de aceitação:
   - O sistema deve permitir inserir um nickname.
   - O nickname não deve estar vazio.
   - Após inserir o nickname, o jogador deve conseguir avançar para a criação ou entrada numa partida.

2. Como jogador, quero consultar as instruções do jogo, para compreender as regras antes de começar a jogar.

   Critérios de aceitação:
   - Deve existir uma opção visível para aceder às instruções.
   - As instruções devem explicar o funcionamento geral da batalha naval.
   - O jogador deve conseguir voltar à página principal depois de consultar as instruções.

3. Como jogador, quero criar uma nova partida, para poder iniciar um jogo de batalha naval.

   Critérios de aceitação:
   - O sistema deve permitir criar uma nova partida.
   - Após criar a partida, o jogador deve ser encaminhado para a página do jogo.
   - A partida criada deve ficar disponível para ser jogada.

4. Como jogador, quero gerar um link de convite, para poder partilhar a partida com outro jogador.

   Critérios de aceitação:
   - O sistema deve gerar um link associado à partida criada.
   - O link deve poder ser copiado ou partilhado.
   - Outro jogador deve conseguir aceder à partida através desse link.

5. Como jogador convidado, quero entrar numa partida através de um link, para poder jogar contra outro jogador.

   Critérios de aceitação:
   - O link deve abrir a partida correta.
   - O jogador convidado deve conseguir introduzir o seu nickname.
   - Após entrar, o jogador deve ficar associado à partida.

6. Como jogador, quero jogar contra um robot, para poder testar o jogo sem depender de outro jogador.

   Critérios de aceitação:
   - Deve existir uma opção para jogar contra um robot.
   - O jogo deve iniciar mesmo sem outro jogador humano.
   - O robot deve realizar jogadas automaticamente.

7. Como jogador, quero posicionar os meus navios no tabuleiro, para preparar a minha estratégia antes do início da partida.

   Critérios de aceitação:
   - O sistema deve permitir selecionar posições no tabuleiro.
   - Os navios devem ser colocados apenas em posições válidas.
   - O jogador deve receber feedback quando tentar fazer uma colocação inválida.

8. Como jogador, quero confirmar a posição dos meus navios, para indicar que estou pronto para iniciar a partida.

   Critérios de aceitação:
   - Deve existir uma opção para confirmar a configuração do tabuleiro.
   - O sistema deve validar se todos os navios foram colocados.
   - Após a confirmação, o jogador deve aguardar o início da partida ou o adversário.

9. Como jogador, quero atacar uma posição no tabuleiro adversário, para tentar atingir os navios do outro jogador.

   Critérios de aceitação:
   - O jogador deve conseguir selecionar uma célula do tabuleiro adversário.
   - O sistema deve registar a jogada.
   - O jogador não deve conseguir atacar a mesma posição mais do que uma vez.

10. Como jogador, quero receber feedback após cada ataque, para saber se acertei, falhei ou afundei um navio.

   Critérios de aceitação:
   - O sistema deve indicar o resultado da jogada.
   - O tabuleiro deve ser atualizado visualmente após o ataque.
   - O jogador deve conseguir distinguir posições já atacadas.

11. Como jogador, quero que o sistema controle os turnos da partida, para garantir que cada jogador joga apenas na sua vez.

   Critérios de aceitação:
   - O sistema deve indicar de quem é a vez de jogar.
   - O jogador não deve conseguir jogar fora do seu turno.
   - Após uma jogada válida, o turno deve passar para o adversário.

12. Como jogador, quero visualizar o estado atual da partida, para acompanhar a evolução do jogo.

   Critérios de aceitação:
   - O sistema deve apresentar o meu tabuleiro.
   - O sistema deve apresentar o tabuleiro adversário com as jogadas realizadas.
   - O jogador deve conseguir perceber o progresso da partida.

13. Como jogador, quero ser informado quando a partida termina, para saber se ganhei ou perdi.

   Critérios de aceitação:
   - O sistema deve detetar quando todos os navios de um jogador foram afundados.
   - Deve ser apresentada uma mensagem de vitória ou derrota.
   - Após o fim da partida, não devem ser permitidas novas jogadas.

14. Como jogador, quero poder iniciar uma nova partida após terminar um jogo, para continuar a jogar sem ter de procurar novamente a página inicial.

   Critérios de aceitação:
   - Deve existir uma opção para iniciar uma nova partida.
   - O jogador deve conseguir regressar ao menu principal.
   - O novo jogo deve começar sem depender do estado da partida anterior.

15. Como organizador, quero criar ou participar em campeonatos, para permitir que vários jogadores compitam entre si.

   Critérios de aceitação:
   - O sistema deve disponibilizar uma funcionalidade associada a campeonatos.
   - Os jogadores devem conseguir participar numa competição organizada.
   - O sistema deve apresentar informação relevante sobre o campeonato.

16. Como jogador, quero visualizar mensagens de erro claras, para perceber o que aconteceu quando uma ação não é permitida.

   Critérios de aceitação:
   - O sistema deve apresentar mensagens quando uma ação falha.
   - As mensagens devem ser compreensíveis para o utilizador.
   - O jogador deve conseguir corrigir a ação com base na mensagem apresentada.
