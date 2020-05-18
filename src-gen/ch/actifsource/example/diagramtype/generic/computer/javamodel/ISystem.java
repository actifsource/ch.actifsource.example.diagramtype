package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystem extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("544bef1f-990c-11ea-8568-8df113ebd62f");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer> selectComputer();
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet> selectInternet();
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch> selectRouter();
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable> selectTable();
  
  public java.util.List<? extends ch.actifsource.diagram.javamodel.IDomainDiagram> selectDiagram();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,544bef1f-990c-11ea-8568-8df113ebd62f,OTAllo0Mn+0XDjriU4EMyk4zo1M=] */
