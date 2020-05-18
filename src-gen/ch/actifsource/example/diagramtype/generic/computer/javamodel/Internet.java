package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Internet extends DynamicResource implements IInternet {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInternet> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInternet>() {
    
    @Override
    public IInternet create() {
      return new Internet();
    }
    
    @Override
    public IInternet create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Internet(resourceRepository, resource);
    }
  
  };

  public Internet() {
    super(IInternet.TYPE_ID);
  }
  
  public Internet(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInternet.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Internet setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer> selectXom() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Internet_xom);
  }

  public Internet setXom(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer> xom) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Internet_xom, xom);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer> selectXom2() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Internet_xom2);
  }

  public Internet setXom2(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer> xom2) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Internet_xom2, xom2);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Internet_xom, visitor);
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Internet_xom2, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet selectToMeXom(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Internet_xom, object.getResource());
  }
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet selectToMeXom2(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Internet_xom2, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,544bee3b-990c-11ea-8568-8df113ebd62f,74JBQXWFk77qgY4AMc5dOLak9pE=] */
