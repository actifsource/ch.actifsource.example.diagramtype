package ch.actifsource.example.diagramtype;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.CheckForNull;
import org.eclipse.draw2d.geometry.Rectangle;
import ch.actifsource.core.INode;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.ui.diagram.aspect.IPaletteEntryAspect;
import ch.actifsource.ui.diagram.palette.IPaletteGroup;
import ch.actifsource.ui.diagram.palette.IPaletteGroup.PaletteGroupStyle;
import ch.actifsource.util.log.Logger;

public class TestPaletteEntriesAspect implements ch.actifsource.ui.diagram.aspect.IPaletteEntriesAspect {
  
  @Override
  public List<IPaletteEntryDescription> getPaletteEntries(IReadJobExecutor executor, INode diagram) {
    ArrayList<IPaletteEntryDescription> entries = new ArrayList<>();
    
    IPaletteGroup parentGroup = new IPaletteGroup.Stub("Group_A", PaletteGroupStyle.Folder, false /*initialOpen*/, null);
    IPaletteGroup group = new IPaletteGroup.Stub("SubGroup_A_B", PaletteGroupStyle.Folder, false /*initialOpen*/, parentGroup);
    
    INode type1 = diagram;
    entries.add(new IPaletteEntryDescription.Stub("EntryA", "descriptionA", type1, group, createEntryAspect("EntryA")));
    INode type2 = diagram;
    entries.add(new IPaletteEntryDescription.Stub("EntryB", "descriptionB", type2, parentGroup, createEntryAspect("EntryB")));
    INode type3 = diagram;
    entries.add(new IPaletteEntryDescription.Stub("EntryC", "descriptionB", type3, null, createEntryAspect("EntryC")));
    return entries;
  }
  
  /**
   * Returns the specific entry aspect.
   */
  private static IPaletteEntryAspect createEntryAspect(final String id) {
    return new IPaletteEntryAspect() {
      
      @Override
      public boolean canExecute(IReadJobExecutor executor, INode diagram, INode type, @CheckForNull INode parent) {
        // TODO
        return true;
      }
      
      @Override
      public INode execute(IModifiable modifiable, INode diagram, INode type, Rectangle location, @CheckForNull INode parent) {
        // TODO
        Logger.instance().logInfo("TestPaletteEntriesAspect create " + id); // Message is inside 'Error Log' view
        return null;
      }
    };
  }
  
}
