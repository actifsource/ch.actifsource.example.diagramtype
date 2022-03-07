package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Component extends DynamicResource implements IComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponent>() {
    
    @Override
    public IComponent create() {
      return new Component();
    }
    
    @Override
    public IComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Component(resourceRepository, resource);
    }
  
  };

  public Component() {
    super(IComponent.TYPE_ID);
  }
  
  public Component(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponent.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IBasePort> selectPort() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IBasePort.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Component_port);
  }

  public Component setPort(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IBasePort> port) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Component_port, port);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent> selectSubComponenet() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Component_subComponenet);
  }

  public Component setSubComponenet(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent> subComponenet) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Component_subComponenet, subComponenet);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Component setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IBasePort.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Component_port, visitor);
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Component_subComponenet, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent selectToMeSubComponenet(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Component_subComponenet, object.getResource());
  }
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent selectToMePort(ch.actifsource.example.diagramtype.generic.computer.javamodel.IBasePort object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.IComponent.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Component_port, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4459d714-9de6-11ec-b801-9d902c96d825,wAXYqNkyWWuPe5X4T/6UCxERTes=] */
