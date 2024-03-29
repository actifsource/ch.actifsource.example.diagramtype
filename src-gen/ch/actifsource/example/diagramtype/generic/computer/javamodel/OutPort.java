package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OutPort extends DynamicResource implements IOutPort {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutPort> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutPort>() {
    
    @Override
    public IOutPort create() {
      return new OutPort();
    }
    
    @Override
    public IOutPort create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OutPort(resourceRepository, resource);
    }
  
  };

  public OutPort() {
    super(IOutPort.TYPE_ID);
  }
  
  public OutPort(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOutPort.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInPort> selectInPort() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInPort.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.OutPort_inPort);
  }

  public OutPort setInPort(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInPort> inPort) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.OutPort_inPort, inPort);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OutPort setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInPort.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.OutPort_inPort, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.diagramtype.generic.computer.javamodel.IOutPort> selectToMeInPort(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInPort object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.IOutPort.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.OutPort_inPort, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fecaea6d-9de7-11ec-b801-9d902c96d825,0iVKxrmxSqqTFgYY/TjHIXl+qF4=] */
