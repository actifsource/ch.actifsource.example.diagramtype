package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Table extends DynamicResource implements ITable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITable>() {
    
    @Override
    public ITable create() {
      return new Table();
    }
    
    @Override
    public ITable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Table(resourceRepository, resource);
    }
  
  };

  public Table() {
    super(ITable.TYPE_ID);
  }
  
  public Table(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITable.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Integer selectOffset() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_offset);
  }
    
  public void setOffset(java.lang.Integer offset) {
     _setSingleAttribute(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_offset, offset);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable> selectComputer() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_Computer);
  }

  public Table setComputer(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable> computer) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_Computer, computer);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch> selectSwitch() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_switch);
  }

  public Table setSwitch(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch> switch_) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_switch, switch_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Table setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_offset, visitor);
    // relations
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_Computer, visitor);
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_switch, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable> selectToMeSwitch(ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_switch, object.getResource());
  }
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable selectToMeComputer(ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.Table_Computer, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b6599f4e-990e-11ea-8568-8df113ebd62f,OlIclRJtjmjcKX1dhapQ/YbirPs=] */
