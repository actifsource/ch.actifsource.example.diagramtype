package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComponent extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4459d714-9de6-11ec-b801-9d902c96d825");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent> selectSubComponenet();
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IBasePort> selectPort();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4459d714-9de6-11ec-b801-9d902c96d825,+0s4TxocdJcteY98CB13K35676M=] */
