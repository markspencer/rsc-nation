package org.rscnation.msc.gs.persistence.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import net.jcip.annotations.ThreadSafe;

import org.rscnation.msc.gs.model.InvItem;
import org.rscnation.msc.gs.model.Point;
import org.rscnation.msc.gs.model.Shop;
import org.rscnation.msc.gs.model.TelePoint;
import org.rscnation.msc.gs.model.definition.entity.GameObjectDef;
import org.rscnation.msc.gs.model.definition.entity.GameObjectLoc;
import org.rscnation.msc.gs.model.definition.entity.ItemDef;
import org.rscnation.msc.gs.model.definition.entity.ItemLoc;
import org.rscnation.msc.gs.model.definition.entity.NPCDef;
import org.rscnation.msc.gs.model.definition.entity.NPCLoc;
import org.rscnation.msc.gs.model.definition.extra.CerterDef;
import org.rscnation.msc.gs.model.definition.extra.DoorDef;
import org.rscnation.msc.gs.model.definition.extra.TileDef;
import org.rscnation.msc.gs.model.definition.skill.AgilityCourseDef;
import org.rscnation.msc.gs.model.definition.skill.AgilityDef;
import org.rscnation.msc.gs.model.definition.skill.FiremakingDef;
import org.rscnation.msc.gs.model.definition.skill.ItemArrowHeadDef;
import org.rscnation.msc.gs.model.definition.skill.ItemBowStringDef;
import org.rscnation.msc.gs.model.definition.skill.ItemCookingDef;
import org.rscnation.msc.gs.model.definition.skill.ItemCraftingDef;
import org.rscnation.msc.gs.model.definition.skill.ItemDartTipDef;
import org.rscnation.msc.gs.model.definition.skill.ItemGemDef;
import org.rscnation.msc.gs.model.definition.skill.ItemHerbDef;
import org.rscnation.msc.gs.model.definition.skill.ItemHerbSecondDef;
import org.rscnation.msc.gs.model.definition.skill.ItemLogCutDef;
import org.rscnation.msc.gs.model.definition.skill.ItemSmeltingDef;
import org.rscnation.msc.gs.model.definition.skill.ItemSmithingDef;
import org.rscnation.msc.gs.model.definition.skill.ItemUnIdentHerbDef;
import org.rscnation.msc.gs.model.definition.skill.ItemWieldableDef;
import org.rscnation.msc.gs.model.definition.skill.ObjectFishingDef;
import org.rscnation.msc.gs.model.definition.skill.ObjectMiningDef;
import org.rscnation.msc.gs.model.definition.skill.ObjectWoodcuttingDef;
import org.rscnation.msc.gs.model.definition.skill.PrayerDef;
import org.rscnation.msc.gs.model.definition.skill.SpellDef;
import org.rscnation.msc.gs.npchandler.NpcHandlerDef;
import org.rscnation.msc.gs.persistence.DataStore;
import org.rscnation.msc.gs.persistence.impl.bun.CodecLookupService;
import org.rscnation.msc.gs.persistence.impl.bun.FileLookupService;
import org.rscnation.msc.gs.persistence.impl.bun.IO;
import org.rscnation.msc.gs.phandler.PacketHandlerDef;

@ThreadSafe
public class BinaryUsingNIO implements DataStore {
	
	protected BinaryUsingNIO() throws Exception {
		throw new Exception("Not yet implemented!");
	}

	@Override
	public PacketHandlerDef[] loadPacketHandlerDefs() throws Exception {
		String cls = PacketHandlerDef.class.getName();
		File f = FileLookupService.lookup(cls);
		return (PacketHandlerDef[]) CodecLookupService.lookup(cls).decode(IO.read(f));
	}

	@Override
	public void savePacketHandlerDefs(PacketHandlerDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PacketHandlerDef[] loadLSPacketHandlerDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveLSPacketHandlerDefs(PacketHandlerDef[] defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NpcHandlerDef[] loadNpcHandlers() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveNpcHandlers(NpcHandlerDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Point, TelePoint> loadTelePoints() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveTelePoints(Map<Point, TelePoint> points) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Shop> loadShops() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveShops(List<Shop> shops) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, CerterDef> loadCerterDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCerterDefs(Map<Integer, CerterDef> certers)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<GameObjectLoc> loadGameObjectLocs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGameObjectLocs(List<GameObjectLoc> locs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ItemLoc> loadItemLocs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemLocs(List<ItemLoc> locs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NPCLoc> loadNPCLocs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveNPCLocs(List<NPCLoc> locs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TileDef[] loadTileDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveTileDefs(TileDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GameObjectDef[] loadGameObjectDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGameObjectDefs(GameObjectDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DoorDef[] loadDoorDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveDoorDefs(DoorDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemDef[] loadItemDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemDefs(ItemDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PrayerDef[] loadPrayerDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePrayerDefs(PrayerDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SpellDef[] loadSpellDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSpellDefs(SpellDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NPCDef[] loadNPCDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveNPCDefs(NPCDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemCraftingDef[] loadItemCraftingDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemCraftingDefs(ItemCraftingDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemHerbSecondDef[] loadItemHerbSeconds() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemHerbSeconds(ItemHerbSecondDef[] seconds) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemDartTipDef> loadItemDartTipDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemDartTipDefs(Map<Integer, ItemDartTipDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemGemDef> loadGemDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGemDefs(Map<Integer, ItemGemDef> defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemLogCutDef> loadItemLogCutDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemLogCutDefs(Map<Integer, ItemLogCutDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemBowStringDef> loadItemBowStringDefs()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemBowStringDefs(Map<Integer, ItemBowStringDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemArrowHeadDef> loadItemArrowHeadDefs()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemArrowHeadDefs(Map<Integer, ItemArrowHeadDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, FiremakingDef> loadFiremakingDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveFiremakingDefs(Map<Integer, FiremakingDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, int[]> loadItemAffectedTypes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemAffectedTypes(Map<Integer, int[]> types)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemWieldableDef> loadItemWieldableDefs()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemWieldableDefs(Map<Integer, ItemWieldableDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemUnIdentHerbDef> loadItemUnIdentHerbDefs()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemUnIdentHerbDefs(Map<Integer, ItemUnIdentHerbDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemHerbDef> loadItemHerbDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemHerbDefs(Map<Integer, ItemHerbDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, Integer> loadItemEdibleHeals() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemEdibleHeals(Map<Integer, Integer> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemCookingDef> loadItemCookingDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemCookingDefs(Map<Integer, ItemCookingDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemSmeltingDef> loadItemSmeltingDefs()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemSmeltingDefs(Map<Integer, ItemSmeltingDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemSmithingDef[] loadItemSmithingDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveItemSmithingDefs(ItemSmithingDef[] defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ObjectMiningDef> loadObjectMiningDefs()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveObjectMiningDefs(Map<Integer, ObjectMiningDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ObjectWoodcuttingDef> loadObjectWoodcuttingDefs()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveObjectWoodcuttingDefs(
			Map<Integer, ObjectWoodcuttingDef> defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ObjectFishingDef[]> loadObjectFishDefs()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveObjectFishingDefs(Map<Integer, ObjectFishingDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, Integer> loadSpellAgressiveLevel() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSpellAgressiveLevel(Map<Integer, Integer> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, AgilityDef> loadAgilityDefs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAgilityDefs(Map<Integer, AgilityDef> defs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, AgilityCourseDef> loadAgilityCourseDefs()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAgilityCourseDef(Map<Integer, AgilityCourseDef> defs)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<InvItem>[] loadKeyChestLoots() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveKeyChestLoots(List<InvItem>[] loots) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, ItemDartTipDef> loadDartTips() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
