package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Config extends DynamicResource implements IConfig {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConfig> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConfig>() {
    
    @Override
    public IConfig create() {
      return new Config();
    }
    
    @Override
    public IConfig create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Config(resourceRepository, resource);
    }
  
  };

  public Config() {
    super(IConfig.TYPE_ID);
  }
  
  public Config(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConfig.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.lang.Boolean selectEnable() {
    return _getSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Config_enable);
  }
    
  public void setEnable(java.lang.Boolean enable) {
     _setSingleAttribute(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Config_enable, enable);
  }

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

  public Config setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Config_enable, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,78ca4308-793d-11ec-a0fd-55fdfbe7b456,gGkbabgaMO5Uafk/0y1/RU7uJMo=] */
