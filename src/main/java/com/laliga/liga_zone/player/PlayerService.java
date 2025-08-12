package com.laliga.liga_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromSquad(String squadName) {
        return playerRepository.findAll().stream()
                .filter(player -> squadName.equals(player.getSquad()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getName().toLowerCase().contains(searchText.toLowerCase()))  // Changed from getPlayer() to getName()
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByPosition(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPos().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByNation(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getNation().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersBySquadAndPosition(String squad, String position) {  // Changed from getPlayersByTeamAndPosition
        return playerRepository.findAll().stream()
                .filter(player -> squad.equals(player.getSquad()) && position.equals(player.getPos()))  // Changed from getTeam() to getSquad()
                .collect(Collectors.toList());
    }

    public Player addPlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayer(Player updatedPlayer) {
        Optional<Player> existingPlayer = playerRepository.findByName(updatedPlayer.getName());

        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(updatedPlayer.getName());  // Changed from setPlayer() to setName()
            playerToUpdate.setNation(updatedPlayer.getNation());
            playerToUpdate.setSquad(updatedPlayer.getSquad());  // Changed from setTeam() to setSquad()
            playerToUpdate.setPos(updatedPlayer.getPos());

            playerRepository.save(playerToUpdate);
            return playerToUpdate;
        }
        return null;
    }

    public void deletePlayer(String playerName) {
        playerRepository.deleteByName(playerName);
    }
}



