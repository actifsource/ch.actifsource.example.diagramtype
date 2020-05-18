package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISwitch extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("544bef33-990c-11ea-8568-8df113ebd62f");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet> selectInternetA();
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet> selectInternetB();
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer> selectComputer();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,544bef33-990c-11ea-8568-8df113ebd62f,nAp5+EQFB8iaTobXn7c3FYF1jlo=] */
