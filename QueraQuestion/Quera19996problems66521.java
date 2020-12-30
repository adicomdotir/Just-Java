import java.util.*;
import java.util.stream.Collectors;

public class Quera19996problems66521 {
    List<Player> players = new ArrayList<>();
    List<Team> teams = new ArrayList<>();
    List<PlayerTeam> playerTeamList = new ArrayList<>();

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Quera19996problems66521 myClass = new Quera19996problems66521();

        while(sc.hasNext()) {
            String cmd = sc.nextLine();
            if (cmd.length() == 0) {
                continue;
            }
            if (cmd == "end") {
                break;
            }
            if (cmd.contains("new player")) {
                myClass.newPlayer(cmd);
            }
            if (cmd.contains("new team")) {
                myClass.newTeam(cmd);
            }
            if (cmd.contains("buy")) {
                myClass.buyPlayer(cmd);
            }
            if (cmd.contains("sell")) {
                myClass.sellPlayer(cmd);
            }
            if (cmd.contains("match")) {
                myClass.match(cmd);
            }
            if (cmd.contains("rank")) {
                myClass.rank();
            }

        }
    }

    private void rank() {
        List<Team> result = teams.stream().sorted((o1, o2) -> {
            if (o2.win - o1.win == 0) {
                if (o1.lose - o2.lose == 0) {
                    return o2.id - o1.id;
                } else {
                    return o1.lose - o2.lose;
                }
            } else {
                return o2.win - o1.win;
            }
        }).collect(Collectors.toList());
        for (int i = 0; i < result.size(); i++) {
            message((i + 1) + ". " + result.get(i).name);
        }
    }

    private void match(String matchString) {
        String[] arrOfStr = matchString.split(" ");
        int teamIdA = Integer.parseInt(arrOfStr[1]);
        int teamIdB = Integer.parseInt(arrOfStr[2]);

        Team teamA = null;
        Team teamB = null;
        for (Team tm: teams) {
            if (tm.id == teamIdA) {
                teamA = tm;
            }
            if (tm.id == teamIdB) {
                teamB = tm;
            }
        }
        if (teamA == null || teamB == null) {
            System.out.println("team doesnt exist");
        }

        int powerA = 0;
        int powerB = 0;

        int countPlayerA = 0;
        int countPlayerB = 0;
        for (PlayerTeam pt :playerTeamList) {
            if (pt.teamId == teamIdA) {
                countPlayerA++;
                if (countPlayerA <= 11) {
                    Player pl = players.stream().filter(x -> x.id == pt.playerId).findFirst().get();
                    powerA += pl.speed + pl.finishing;
                }
            }
            if (pt.teamId == teamIdB) {
                countPlayerB++;
                if (countPlayerB <= 11) {
                    Player pl = players.stream().filter(x -> x.id == pt.playerId).findFirst().get();
                    powerB += pl.speed + pl.defence;
                }
            }
        }
        if (countPlayerA < 11 || countPlayerB < 11) {
            System.out.println("the game can not be held due to loss of the players");
        }

        if (powerA > powerB) {
            teamA.money += 1000;
            teamA.win++;
            teamB.lose++;
        } else if (powerA < powerB) {
            teamB.money += 1000;
            teamB.win++;
            teamA.lose++;
        }

    }

    private void newPlayer(String playerString) {
        String[] arrOfStr = playerString.split(" ");
        players.add(new Player(players.size() + 1, arrOfStr[2], Integer.parseInt(arrOfStr[3]), Integer.parseInt(arrOfStr[4]), Integer.parseInt(arrOfStr[5]), Integer.parseInt(arrOfStr[6])));
    }

    private void newTeam(String teamString) {
        String[] arrOfStr = teamString.split(" ");
        teams.add(new Team(teams.size() + 1, arrOfStr[2], Integer.parseInt(arrOfStr[3])));
    }

    private void buyPlayer(String buyString) {
        String[] arrOfStr = buyString.split(" ");
        Player player = null;
        for (Player pl : players) {
            if (pl.id == Integer.parseInt(arrOfStr[1])) {
                player = pl;
                break;
            }
        }
        if (player == null) {
            System.out.println("player with the id playerID doesnt exist");
            return;
        }

        Team team = null;
        for (Team tm : teams) {
            if (tm.id == Integer.parseInt(arrOfStr[2])) {
                team = tm;
                break;
            }
        }
        if (team == null) {
            System.out.println("team with the id teamID doesnt exist");
            return;
        }

        if (team.money < player.price) {
            System.out.println("the team cant afford to buy this player");
            return;
        }

        boolean playerInTeamExist = false;
        for(PlayerTeam pt : playerTeamList) {
            if (pt.playerId == player.id && pt.teamId == team.id) {
                playerInTeamExist = true;
                break;
            }
        }
        if (playerInTeamExist) {
            System.out.println("player already has a team");
            return;
        }

        team.money -= player.price;
        playerTeamList.add(new PlayerTeam(player.id, team.id));
        System.out.println("player added to the team succesfully");
    }

    private void sellPlayer(String sellPlayer) {
        String[] arrOfStr = sellPlayer.split(" ");

        Team team = null;
        for (Team tm : teams) {
            if (tm.id == Integer.parseInt(arrOfStr[2])) {
                team = tm;
                break;
            }
        }
        if (team == null) {
            System.out.println("team doesnt exist");
            return;
        }

        boolean playerInTeamExist = false;
        int index = -1;
        for(PlayerTeam pt : playerTeamList) {
            index++;
            if (pt.playerId == Integer.parseInt(arrOfStr[1]) && pt.teamId == team.id) {
                playerInTeamExist = true;
                break;
            }
        }
        if (!playerInTeamExist) {
            System.out.println("team doesnt have this player");
            return;
        }

         Player pl  = players.stream().filter(x -> x.id == Integer.parseInt(arrOfStr[1])).findFirst().get();
        team.money += pl.price;

        playerTeamList.remove(index);
        System.out.println("player sold succesfully");
    }

    private static void message(String mess) {
        System.out.println(mess);
    }
}

class Player {
    public int id;
    public String name;
    public int price;
    public int speed;
    public int finishing;
    public int defence;

    public Player(int id, String name, int price, int speed, int finishing, int defence) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.finishing = finishing;
        this.defence = defence;
    }
}

class Team {
    public int id;
    public String name;
    public int money;
    public int win = 0;
    public int lose = 0;
    public int draw = 0;

    public Team(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "" + id + "," + name + "," + money + "," + win + "," + lose + "," + draw;
    }
}

class PlayerTeam {
    public int playerId;
    public int teamId;

    public PlayerTeam(int playerId, int teamId) {
        this.playerId = playerId;
        this.teamId = teamId;
    }
}

