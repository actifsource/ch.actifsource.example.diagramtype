package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Switch extends DynamicResource implements ISwitch {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISwitch> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISwitch>() {
    
    @Override
    public ISwitch create() {
      return new Switch();
    }
    
    @Override
    public ISwitch create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Switch(resourceRepository, resource);
    }
  
  };

  public Switch() {
    super(ISwitch.TYPE_ID);
  }
  
  public Switch(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISwitch.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer> selectComputer() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_computer);
  }

  public Switch setComputer(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer> computer) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_computer, computer);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet> selectInternetA() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_internetA);
  }

  public Switch setInternetA(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet> internetA) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_internetA, internetA);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet> selectInternetB() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_internetB);
  }

  public Switch setInternetB(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet> internetB) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_internetB, internetB);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Switch setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_computer, visitor);
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_internetA, visitor);
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_internetB, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch> selectToMeInternetA(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_internetA, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch> selectToMeInternetB(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_internetB, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch> selectToMeComputer(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Switch_computer, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,544bef33-990c-11ea-8568-8df113ebd62f,Z7bKuF4ZU1UphGHChvefU3LcZ2A=] */
