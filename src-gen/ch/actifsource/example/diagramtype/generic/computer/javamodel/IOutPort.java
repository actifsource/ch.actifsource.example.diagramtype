package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOutPort extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IBasePort {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fecaea6d-9de7-11ec-b801-9d902c96d825");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInPort> selectInPort();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fecaea6d-9de7-11ec-b801-9d902c96d825,wE1cXNpx4AcPBE1zUnLZVq+NMFM=] */
