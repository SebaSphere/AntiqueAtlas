package hunternif.mc.impl.atlas.client;

import hunternif.mc.impl.atlas.AntiqueAtlasMod;
import hunternif.mc.impl.atlas.client.texture.ITexture;
import hunternif.mc.impl.atlas.client.texture.IconTexture;
import hunternif.mc.impl.atlas.client.texture.Texture;
import hunternif.mc.impl.atlas.client.texture.TileTexture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class Textures {
    private static final String MOD_PREFIX = AntiqueAtlasMod.ID + ":";
    private static final String GUI = MOD_PREFIX + "textures/gui/";
    private static final String GUI_ICONS = GUI + "icons/";
    private static final String GUI_TILES = GUI + "tiles/";
    private static final String GUI_MARKERS = GUI + "markers/";
    private static final String GUI_SCALEBAR = GUI + "scalebar/";

    public static final ITexture
            BOOK = gui("book.png", 310, 218),
            BOOK_FRAME = gui("book_frame.png", 310, 218),
            BOOK_FRAME_NARROW = gui("book_frame_narrow.png", 310, 218),
            BTN_ARROWS = gui("navigate_arrows.png", 24, 24),
            BTN_POSITION = gui("position.png", 24, 24),
            BOOKMARKS = gui("bookmarks.png", 84, 36),
            PLAYER = gui("player.png", 7, 8),
            SCROLLBAR_HOR = gui("scrollbar_hor.png", 8, 7),
            SCROLLBAR_VER = gui("scrollbar_ver.png", 7,8),
            MARKER_FRAME_ON = gui("marker_frame_on.png", 34, 34),
            MARKER_FRAME_OFF = gui("marker_frame_off.png", 34, 34),
            ERASER = gui("eraser.png", 24, 24),

            SCALEBAR_4 = scaleBar("scalebar_4.png"),
            SCALEBAR_8 = scaleBar("scalebar_8.png"),
            SCALEBAR_16 = scaleBar("scalebar_16.png"),
            SCALEBAR_32 = scaleBar("scalebar_32.png"),
            SCALEBAR_64 = scaleBar("scalebar_64.png"),
            SCALEBAR_128 = scaleBar("scalebar_128.png"),
            SCALEBAR_256 = scaleBar("scalebar_256.png"),
            SCALEBAR_512 = scaleBar("scalebar_512.png"),

            ICON_ADD_MARKER = icon("add_marker.png"),
            ICON_DELETE_MARKER = icon("del_marker.png"),
            ICON_SHOW_MARKERS = icon("show_markers.png"),
            ICON_HIDE_MARKERS = icon("hide_markers.png"),
            ICON_EXPORT = icon("export.png"),

            TILE_TEST = tile("test.png"),
            TILE_MOUNTAINS = tile("mountains.png"),
            TILE_MOUNTAINS2 = tile("mountains2.png"),
            TILE_MOUNTAINS3 = tile("mountains3.png"),
            TILE_MOUNTAINS4 = tile("mountains4.png"),
            TILE_SNOW_CAPS = tile("snow_caps.png"),
            TILE_SNOW_HILLS = tile("snow_hills.png"),
            TILE_SNOW_HILLS2 = tile("snow_hills2.png"),
            TILE_WATER = tile("water.png"),
            TILE_WATER2 = tile("water2.png"),
            TILE_ICE_BORDER = tile("ice_border.png"),
            TILE_ICE_NOBORDER = tile("ice_noborder.png"),
            TILE_FOREST = tile("forest.png"),
            TILE_FOREST2 = tile("forest2.png"),
            TILE_FOREST3 = tile("forest3.png"),
            TILE_FOREST_HILLS = tile("forest_hills.png"),
            TILE_FOREST_HILLS2 = tile("forest_hills2.png"),
            TILE_FOREST_HILLS3 = tile("forest_hills3.png"),
            TILE_FOREST_FLOWERS = tile("forest_flowers.png"),
            TILE_FOREST_FLOWERS2 = tile("forest_flowers2.png"),
            TILE_FOREST_FLOWERS3 = tile("forest_flowers3.png"),
            TILE_DENSE_FOREST = tile("dense_forest.png"),
            TILE_DENSE_FOREST2 = tile("dense_forest2.png"),
            TILE_DENSE_FOREST_HILLS = tile("dense_forest_hills.png"),
            TILE_DENSE_FOREST_HILLS2 = tile("dense_forest_hills2.png"),
            TILE_SPARSE_FOREST = tile("forest_sparse.png"),
            TILE_SPARSE_FOREST2 = tile("forest_sparse2.png"),
            TILE_SPARSE_FOREST3 = tile("forest_sparse3.png"),
            TILE_SPARSE_FOREST_HILLS = tile("forest_sparse_hills.png"),
            TILE_SPARSE_FOREST_HILLS2 = tile("forest_sparse_hills2.png"),
            TILE_SPARSE_FOREST_HILLS3 = tile("forest_sparse_hills3.png"),
            TILE_BIRCH = tile("birch.png"),
            TILE_BIRCH2 = tile("birch2.png"),
            TILE_BIRCH_HILLS = tile("birch_hills.png"),
            TILE_BIRCH_HILLS2 = tile("birch_hills2.png"),
            TILE_TALL_BIRCH = tile("tall_birch.png"),
            TILE_TALL_BIRCH2 = tile("tall_birch2.png"),
            TILE_TALL_BIRCH_HILLS = tile("tall_birch_hills.png"),
            TILE_TALL_BIRCH_HILLS2 = tile("tall_birch_hills2.png"),
            TILE_DENSE_BIRCH = tile("dense_birch.png"),
            TILE_HILLS = tile("hills.png"),
            TILE_HILLS_BUSHES = tile("hills_bushes.png"),
            TILE_HILLS_CACTI = tile("hills_cacti.png"),
            TILE_HILLS_GRASS = tile("hills_grass.png"),
            TILE_PINES = tile("pines.png"),
            TILE_PINES2 = tile("pines2.png"),
            TILE_PINES3 = tile("pines3.png"),
            TILE_PINES_HILLS = tile("pines_hills.png"),
            TILE_PINES_HILLS2 = tile("pines_hills2.png"),
            TILE_PINES_HILLS3 = tile("pines_hills3.png"),
            TILE_MEGA_SPRUCE = tile("mega_spruce.png"),
            TILE_MEGA_SPRUCE2 = tile("mega_spruce2.png"),
            TILE_MEGA_TAIGA = tile("mega_taiga.png"),
            TILE_MEGA_TAIGA2 = tile("mega_taiga2.png"),
            TILE_MEGA_SPRUCE_HILLS = tile("mega_spruce_hills.png"),
            TILE_MEGA_SPRUCE_HILLS2 = tile("mega_spruce_hills2.png"),
            TILE_MEGA_TAIGA_HILLS = tile("mega_taiga_hills.png"),
            TILE_MEGA_TAIGA_HILLS2 = tile("mega_taiga_hills2.png"),
            TILE_SAND = tile("sand.png"),
            TILE_SAND2 = tile("sand2.png"),
            TILE_SAND3 = tile("sand3.png"),
            TILE_CACTI = tile("cacti.png"),
            TILE_SAND_BUSHES = tile("sand_bushes.png"),
            TILE_SHORE = tile("shore.png"),
            TILE_SHORE2 = tile("shore2.png"),
            TILE_ROCK_SHORE = tile("rock_shore.png"),
            TILE_SHORE3 = tile("shore3.png"),
            TILE_GRASS = tile("grass.png"),
            TILE_GRASS2 = tile("grass2.png"),
            TILE_GRASS3 = tile("grass3.png"),
            TILE_GRASS4 = tile("grass4.png"),
            TILE_SUNFLOWERS = tile("sunflowers.png"),
            TILE_SUNFLOWERS2 = tile("sunflowers2.png"),
            TILE_SNOW = tile("snow.png"),
            TILE_SNOW1 = tile("snow1.png"),
            TILE_SNOW2 = tile("snow2.png"),
            TILE_SNOW3 = tile("snow3.png"),
            TILE_SNOW4 = tile("snow4.png"),
            TILE_SNOW5 = tile("snow5.png"),
            TILE_SNOW6 = tile("snow6.png"),
            TILE_SNOW_PINES = tile("snow_pines.png"),
            TILE_SNOW_PINES2 = tile("snow_pines2.png"),
            TILE_SNOW_PINES3 = tile("snow_pines3.png"),
            TILE_SNOW_PINES_HILLS = tile("snow_pines_hills.png"),
            TILE_SNOW_PINES_HILLS2 = tile("snow_pines_hills2.png"),
            TILE_SNOW_PINES_HILLS3 = tile("snow_pines_hills3.png"),
            TILE_ICE_SPIKES = tile("ice_spikes.png"),
            TILE_ICE_SPIKES2 = tile("ice_spikes2.png"),
            TILE_SNOW_MOUNTAINS = tile("snow_mountains.png"),
            TILE_SNOW_MOUNTAINS2 = tile("snow_mountains2.png"),
            TILE_SWAMP = tile("swamp.png"),
            TILE_SWAMP2 = tile("swamp2.png"),
            TILE_SWAMP3 = tile("swamp3.png"),
            TILE_SWAMP4 = tile("swamp4.png"),
            TILE_SWAMP5 = tile("swamp5.png"),
            TILE_SWAMP6 = tile("swamp6.png"),
            TILE_SWAMP_HILLS = tile("swamp_hills.png"),
            TILE_SWAMP_HILLS2 = tile("swamp_hills2.png"),
            TILE_SWAMP_HILLS3 = tile("swamp_hills3.png"),
            TILE_SWAMP_HILLS4 = tile("swamp_hills4.png"),
            TILE_SWAMP_HILLS5 = tile("swamp_hills5.png"),
            TILE_MUSHROOM = tile("mushroom.png"),
            TILE_MUSHROOM2 = tile("mushroom2.png"),
            TILE_JUNGLE = tile("jungle.png"),
            TILE_JUNGLE2 = tile("jungle2.png"),
            TILE_JUNGLE_HILLS = tile("jungle_hills.png"),
            TILE_JUNGLE_HILLS2 = tile("jungle_hills2.png"),
            TILE_JUNGLE_EDGE = tile("jungle_edge.png"),
            TILE_JUNGLE_EDGE2 = tile("jungle_edge2.png"),
            TILE_JUNGLE_EDGE3 = tile("jungle_edge3.png"),
            TILE_JUNGLE_EDGE_HILLS = tile("jungle_edge_hills.png"),
            TILE_JUNGLE_EDGE_HILLS2 = tile("jungle_edge_hills2.png"),
            TILE_JUNGLE_EDGE_HILLS3 = tile("jungle_edge_hills3.png"),
            TILE_JUNGLE_CLIFFS = tile("jungle_cliffs.png"),
            TILE_JUNGLE_CLIFFS2 = tile("jungle_cliffs2.png"),
            TILE_BUSHES_CLIFFS = tile("bushes_cliffs.png"),
            TILE_CLIFFS = tile("cliffs.png"),
            TILE_SAVANNA = tile("savanna.png"),
            TILE_SAVANNA2 = tile("savanna2.png"),
            TILE_SAVANNA3 = tile("savanna3.png"),
            TILE_SAVANNA_CLIFFS = tile("savanna_cliffs.png"),
            TILE_SAVANNA_CLIFFS2 = tile("savanna_cliffs2.png"),
            TILE_SAVANNA_CLIFFS3 = tile("savanna_cliffs3.png"),
            TILE_CLIFFS_CLOUDS = tile("cliffs_clouds.png"),
            TILE_SAVANNA_CLIFFS_CLOUDS = tile("savanna_cliffs_clouds.png"),
            TILE_SAVANNA_CLIFFS_CLOUDS2 = tile("savanna_cliffs_clouds2.png"),
            TILE_SAVANNA_CLIFFS_CLOUDS3 = tile("savanna_cliffs_clouds3.png"),
            TILE_MESA = tile("mesa.png"),
            TILE_MESA2 = tile("mesa2.png"),
            TILE_MESA3 = tile("mesa3.png"),
            TILE_MESA4 = tile("mesa4.png"),
            TILE_BRYCE = tile("bryce.png"),
            TILE_BRYCE2 = tile("bryce2.png"),
            TILE_BRYCE3 = tile("bryce3.png"),
            TILE_BRYCE4 = tile("bryce4.png"),
            TILE_PLATEAU_MESA = tile("plateau_mesa.png"),
            TILE_PLATEAU_MESA2 = tile("plateau_mesa2.png"),
            TILE_PLATEAU_MESA_LOW = tile("plateau_mesa_low.png"),
            TILE_PLATEAU_MESA_LOW2 = tile("plateau_mesa_low2.png"),
            TILE_PLATEAU_TREES = tile("plateau_trees.png"),
            TILE_PLATEAU_TREES_LOW = tile("plateau_trees_low.png"),
            TILE_PLATEAU_GRASS = tile("plateau_grass.png"),
            TILE_PLATEAU_GRASS2 = tile("plateau_grass2.png"),
            TILE_PLATEAU_GRASS3 = tile("plateau_grass3.png"),
            TILE_PLATEAU_SAVANNA = tile("plateau_savanna.png"),
            TILE_PLATEAU_SAVANNA2 = tile("plateau_savanna2.png"),
            TILE_PLATEAU_SAVANNA3 = tile("plateau_savanna3.png"),
            TILE_CAVE_WALLS = tile("cave_walls.png"),
            TILE_RAVINE = tile("ravine.png"),
            TILE_LAVA = tile("lava.png"),
            TILE_LAVA2 = tile("lava2.png"),
            TILE_LAVA_SHORE = tile("lava_shore.png"),
            TILE_LAVA_SHORE2 = tile("lava_shore2.png"),

            TILE_END_VOID = tile("end_void.png"),
            TILE_END_ISLAND = tile("end_island.png"),
            TILE_END_ISLAND2 = tile("end_island2.png"),
            TILE_END_ISLAND_PLANTS = tile("end_island_plants.png"),
            TILE_END_ISLAND_PLANTS2 = tile("end_island_plants2.png"),

            // Village:
            TILE_HOUSE = tile("house.png"),
            TILE_FENCE = tile("fence.png"),
            TILE_LIBRARY = tile("library.png"),
            TILE_SMITHY = tile("smithy.png"),
            TILE_L_HOUSE = tile("l_house.png"),
            TILE_FARMLAND_SMALL = tile("farmland_s.png"),
            TILE_FARMLAND_LARGE = tile("farmland_l.png"),
            TILE_VILLAGE_TORCH = tile("village_torch.png"),
            TILE_WELL = tile("well.png"),
            TILE_VILLAGE_PATH_X = tile("village_path_x.png"),
            TILE_VILLAGE_PATH_Z = tile("village_path_z.png"),
            TILE_HUT = tile("hut.png"),
            TILE_HOUSE_SMALL = tile("house_small.png"),
            TILE_BUTCHERS_SHOP = tile("butchers_shop.png"),
            TILE_CHURCH = tile("church.png"),

            // Nether Fortress:
            TILE_NETHER_BRIDGE = tile("nether_bridge.png"),
            TILE_NETHER_BRIDGE_X = tile("nether_bridge_x.png"),
            TILE_NETHER_BRIDGE_Z = tile("nether_bridge_z.png"),
            TILE_NETHER_BRIDGE_END_X = tile("nether_bridge_end_x.png"),
            TILE_NETHER_BRIDGE_END_Z = tile("nether_bridge_end_z.png"),
            TILE_NETHER_BRIDGE_GATE = tile("nether_bridge_gate.png"),
            TILE_NETHER_TOWER = tile("nether_tower.png"),
            TILE_NETHER_WALL = tile("nether_wall.png"),
            TILE_NETHER_HALL = tile("nether_hall.png"),
            TILE_NETHER_FORT_STAIRS = tile("nether_fort_stairs.png"),
            TILE_NETHER_THRONE = tile("nether_throne.png");

    public static final Identifier EXPORTED_BG = new Identifier(GUI + "exported_bg.png");

    // Constructor helpers:
    private static ITexture gui(String fileName, int width, int height) {
        return new Texture(new Identifier(GUI + fileName), width, height);
    }

    private static ITexture scaleBar(String fileName) {
        return new Texture(new Identifier(GUI_SCALEBAR + fileName), 20, 8);
    }

    private static ITexture tile(String fileName) {
        return new TileTexture(new Identifier(GUI_TILES + fileName));
    }

    private static ITexture icon(String fileName) {
        return new IconTexture(new Identifier(GUI_ICONS + fileName));
    }
}
