package ch.actifsource.example.diagramtype;

import ch.actifsource.core.INode;
import ch.actifsource.core.Statement;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.set.NodeSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.diagram.DiagramPackage;
import ch.actifsource.diagram.DiagramUtil;
import ch.actifsource.example.diagramtype.generic.computer.ComputerPackage;
import ch.actifsource.ui.diagram.IDomainDiagramContext;
import ch.actifsource.ui.diagram.aspect.IShapeCommandAspect;

public class ComponentShapeMoveCommandAspect implements IShapeCommandAspect {

  @Override
  public boolean canExecute(IReadJobExecutor readExecutor, IDomainDiagramContext context, INode compositionToMove) {
    return true;
  }

  /**
   * Example remove all out port relation if the composition is moved!
   */
  @Override
  public void executeCommand(IModifiable modifiable, IDomainDiagramContext context, INode movedComposition) {
    INode domainDiagram = context.getDiagramResource();
    
    // Example 1: Remove all out port relation if the composition is moved!
    for (INode basePort :Select.objectsForRelation(modifiable, ComputerPackage.Component_port, movedComposition)) {
      if (Select.isTypeOf(modifiable, basePort, ComputerPackage.OutPort)) {
        
       Statement relation = Select.statementForRelationOrNull(modifiable, ComputerPackage.OutPort_inPort, basePort);
       if (relation == null) continue;
       Update.disposeStatement(modifiable, relation);
      }
    }
    
    // Example 2: Move the port to a new position.
    for (INode basePort :Select.objectsForRelation(modifiable, ComputerPackage.Component_port, movedComposition)) {
      if (Select.isTypeOf(modifiable, basePort, ComputerPackage.OutPort)) {
        
        INode layoutInfosFromPort = DiagramUtil.selectLayoutInfosByResource(modifiable, domainDiagram, basePort).getFirstOrNull();
        if (layoutInfosFromPort == null) return;
        updateValue(modifiable, context.getPackage(), layoutInfosFromPort, LiteralUtil.create(10), DiagramPackage.XYLayoutInfo_x);
        updateValue(modifiable, context.getPackage(), layoutInfosFromPort, LiteralUtil.create(20), DiagramPackage.XYLayoutInfo_y);
      }
    }
    
    // Example 3: Clean up all involved diagrams
    NodeSet involvedDiagrams = new NodeSet();
    // TODO collect all changed diagrams.
    for (INode stateDiagram :involvedDiagrams) {
      DiagramUtil.cleanupDiagram(modifiable, stateDiagram);
    }
  }
  
  /**
   * Update property value
   */
  private static void updateValue(IModifiable modifiable, ch.actifsource.core.Package pkg, INode layoutData, INode newValue, INode attribute) {
    Statement oldValue = Select.attributeStatementOrNull(modifiable, attribute, layoutData);
    if (oldValue == null) {
      Update.createStatement(modifiable, pkg, layoutData, attribute, newValue);
    } else {
      Update.modify(modifiable, oldValue, newValue);
    }
  }
}
