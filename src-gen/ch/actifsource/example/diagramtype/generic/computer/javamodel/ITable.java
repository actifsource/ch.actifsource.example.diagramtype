package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITable extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b6599f4e-990e-11ea-8568-8df113ebd62f");
  
  public java.lang.Integer selectOffset();
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch> selectSwitch();
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable> selectComputer();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b6599f4e-990e-11ea-8568-8df113ebd62f,TosjYe1veB0Fb+IWoN52EJrc9Tg=] */
