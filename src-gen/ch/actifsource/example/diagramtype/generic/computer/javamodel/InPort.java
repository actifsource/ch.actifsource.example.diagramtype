package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InPort extends DynamicResource implements IInPort {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInPort> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInPort>() {
    
    @Override
    public IInPort create() {
      return new InPort();
    }
    
    @Override
    public IInPort create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InPort(resourceRepository, resource);
    }
  
  };

  public InPort() {
    super(IInPort.TYPE_ID);
  }
  
  public InPort(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInPort.TYPE_ID);
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

  public InPort setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f080ed00-9de7-11ec-b801-9d902c96d825,YlWVGeujBRUflB7Khj6es4c00ek=] */
