# BlackBattleship

## Páginas consultadas

- Página principal do jogo: https://papergames.io/en/battleship
- Página de criação de torneio: https://papergames.io/en/t/create-tournament
- Página dos meus torneios: https://papergames.io/en/t/my-tournaments
- Página RANKA / rankings: https://papergames.io/en/blog/ranka

## Membros do grupo

- David Costa, nº 124423
- Gabriel Matos, nº 112967
- João Nicolau, nº 111111
- Maria Frade, nº 122477

## Product Backlog

### Distribuição das User Stories por Membro

| Membro | Número | User Stories atribuídas |
|---|---:|---|
| João Nicolau | 111111 | User Story 1, 2, 3 e 4 |
| Gabriel Matos | 112967 | User Story 5, 6, 7 e 8 |
| Maria Frade | 122477 | User Story 9, 10, 11 e 12 |
| David Costa | 124423 | User Story 13, 14, 15 e 16 |

### User Stories

1. Como jogador, quero aceder à página principal do jogo Battleship, para poder iniciar uma partida de batalha naval online.

   Critérios de aceitação:
   - A página principal do jogo deve ser carregada corretamente.
   - O título ou identificação do jogo Battleship deve estar visível.
   - As opções principais de jogo devem estar disponíveis para o utilizador.

2. Como jogador, quero consultar as regras do jogo, para compreender como funciona a batalha naval antes de começar a jogar.

   Critérios de aceitação:
   - A página deve apresentar uma secção com as regras do jogo.
   - As regras devem explicar que o jogo é por turnos.
   - As regras devem indicar que o objetivo é afundar todos os navios do adversário.

3. Como jogador, quero jogar com um amigo, para poder iniciar uma partida contra outro jogador conhecido.

   Critérios de aceitação:
   - Deve existir uma opção para jogar com um amigo.
   - Ao selecionar essa opção, o sistema deve iniciar o processo de criação de uma partida.
   - A partida deve permitir a participação de outro jogador.

4. Como jogador, quero partilhar uma partida com outro jogador, para que outra pessoa consiga entrar no mesmo jogo.

   Critérios de aceitação:
   - O sistema deve permitir criar ou aceder a uma partida partilhável.
   - O outro jogador deve conseguir aceder à partida através do mecanismo disponibilizado pelo site.
   - A partida deve ficar disponível para ambos os jogadores.

5. Como jogador, quero jogar contra um robot, para poder testar o jogo sem depender de outro jogador humano.

   Critérios de aceitação:
   - Deve existir uma opção para jogar contra um robot.
   - O jogo deve iniciar mesmo sem outro jogador humano.
   - A partida contra o robot deve apresentar o tabuleiro de jogo.

6. Como jogador, quero jogar online contra um jogador aleatório, para poder encontrar automaticamente um adversário.

   Critérios de aceitação:
   - Deve existir uma opção para jogar online contra um jogador aleatório.
   - O sistema deve iniciar o processo de procura ou entrada numa partida online.
   - O jogador deve ser encaminhado para uma sessão de jogo ou sala de espera.

7. Como jogador, quero realizar um ataque no tabuleiro adversário, para tentar atingir os navios do oponente.

   Critérios de aceitação:
   - O sistema deve permitir selecionar uma posição válida no tabuleiro adversário.
   - A jogada deve ser registada após o clique numa célula disponível.
   - O estado do tabuleiro deve ser atualizado após a jogada.

8. Como jogador, quero receber feedback após realizar uma jogada, para saber se o meu ataque acertou ou falhou.

   Critérios de aceitação:
   - O sistema deve apresentar uma indicação visual ou textual após a jogada.
   - O jogador deve conseguir distinguir uma jogada que acertou de uma jogada que falhou.
   - O tabuleiro deve mostrar que a posição já foi atacada.

9. Como jogador, quero impedir a repetição de uma jogada numa posição já atacada, para evitar jogadas inválidas durante a partida.

   Critérios de aceitação:
   - O sistema deve identificar posições que já foram atacadas.
   - O jogador não deve conseguir repetir uma jogada numa célula já selecionada.
   - O sistema deve apresentar feedback ou impedir a ação caso o jogador tente repetir a jogada.

10. Como jogador, quero perceber quando é novamente a minha vez de jogar, para seguir corretamente o sistema de turnos.

   Critérios de aceitação:
   - O sistema deve indicar ou refletir visualmente o estado do turno.
   - O jogador deve conseguir perceber quando pode realizar uma jogada.
   - Após uma jogada válida, o estado da partida deve ser atualizado.

11. Como jogador, quero beneficiar de uma jogada adicional quando acerto num navio, para continuar a atacar de acordo com as regras do jogo.

   Critérios de aceitação:
   - Quando o jogador acerta num navio, o sistema deve permitir nova jogada.
   - O estado do tabuleiro deve manter o registo do acerto.
   - A sequência da jogada deve respeitar as regras apresentadas no site.

12. Como jogador, quero visualizar o estado atual da partida, para acompanhar a evolução do jogo.

   Critérios de aceitação:
   - O sistema deve apresentar o tabuleiro do jogador.
   - O sistema deve apresentar o tabuleiro adversário ou a área de ataques.
   - O jogador deve conseguir perceber o progresso da partida através da interface.

13. Como jogador, quero ser informado quando a partida termina, para saber se ganhei ou perdi.

   Critérios de aceitação:
   - O sistema deve detetar quando todos os navios de um jogador foram destruídos.
   - Deve ser apresentada uma indicação de fim de jogo.
   - Após o fim da partida, não devem ser permitidas novas jogadas nessa partida.

14. Como jogador, quero consultar a tabela de classificação diária, para acompanhar a posição dos jogadores no ranking.

   Critérios de aceitação:
   - A página deve apresentar uma leaderboard ou ranking diário.
   - O jogador deve conseguir visualizar informação associada à classificação.
   - A informação do ranking deve estar acessível a partir da página do jogo ou de uma página relacionada.

15. Como organizador, quero criar um torneio privado, para permitir que vários jogadores participem numa competição organizada.

   Critérios de aceitação:
   - Deve existir uma opção para criar torneio.
   - A página de criação de torneio deve estar acessível.
   - O sistema deve indicar que o torneio pode ser partilhado com outros jogadores através de um link único.

16. Como organizador, quero consultar os meus torneios, para acompanhar os torneios criados ou disponíveis.

   Critérios de aceitação:
   - Deve existir uma página ou opção para consultar os meus torneios.
   - A página deve apresentar uma lista ou tabela de torneios.
   - A página deve indicar informação como nome do torneio, jogo, número de participantes, estado ou data de criação.
