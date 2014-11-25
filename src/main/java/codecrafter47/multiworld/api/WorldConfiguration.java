package codecrafter47.multiworld.api;

import joebkt.Difficulty;
import joebkt.GameMode;
import lombok.Data;

/**
 * Created by florian on 23.11.14.
 */
@Data
public class WorldConfiguration {
	GenerationType generationType = GenerationType.SINGLE_BIOME;
	boolean spawnMonsters = true;
	boolean spawnAnimals = true;
	String worldGeneratorOptions = "";
	boolean loadOnStartup = true;
	boolean keepSpawnInMemory = true;
	GameMode gameMode = GameMode.SURVIVAL;
	Difficulty difficulty = Difficulty.NORMAL;
	Environment environment = Environment.OVERWORLD;
}