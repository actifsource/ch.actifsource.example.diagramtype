package ch.actifsource.example.diagramtype;

import javax.annotation.CheckForNull;

import org.eclipse.draw2d.geometry.Rectangle;

import ch.actifsource.core.INode;
import ch.actifsource.core.PackagedResource;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.example.diagramtype.generic.computer.ComputerPackage;

public class TestComputerPaletteEntryAspect implements ch.actifsource.ui.diagram.aspect.IPaletteEntryAspect {

	@Override
	public boolean canExecute(IReadJobExecutor executor, INode diagram, INode type, @CheckForNull INode parent) {
	  if (parent != null) {
	    return Select.isTypeOf(executor, parent, ComputerPackage.System);
	  }
	  return false;
	}

	@Override
	public INode execute(IModifiable modifiable, INode diagram, INode type, Rectangle location, @CheckForNull INode parent) {
		if (parent != null) {
			location.setWidth(40);
			location.setHeight(40);
			PackagedResource packagedResource = Select.asPackagedResource(modifiable, parent);
			INode newResource = Update.createAndInitializeResource(modifiable, packagedResource.getPackage(), ComputerPackage.Computer, parent, ComputerPackage.System_computer, 
			    IStatementPosition.AT_END, "ComputerXY", null);
			return newResource;
		}
		return null;
	}

}
