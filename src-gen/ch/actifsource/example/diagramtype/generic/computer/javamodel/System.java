package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class System extends DynamicResource implements ISystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem>() {
    
    @Override
    public ISystem create() {
      return new System();
    }
    
    @Override
    public ISystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new System(resourceRepository, resource);
    }
  
  };

  public System() {
    super(ISystem.TYPE_ID);
  }
  
  public System(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystem.TYPE_ID);
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
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_computer);
  }

  public System setComputer(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer> computer) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_computer, computer);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.diagram.javamodel.IDomainDiagram> selectDiagram() {
    return _getList(ch.actifsource.diagram.javamodel.IDomainDiagram.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_diagram);
  }

  public System setDiagram(java.util.List<? extends ch.actifsource.diagram.javamodel.IDomainDiagram> diagram) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_diagram, diagram);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet> selectInternet() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_internet);
  }

  public System setInternet(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet> internet) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_internet, internet);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch> selectRouter() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_router);
  }

  public System setRouter(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch> router) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_router, router);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable> selectTable() {
    return _getList(ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_table);
  }

  public System setTable(java.util.List<? extends ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable> table) {
    _setList(ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_table, table);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public System setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_computer, visitor);
    _acceptList(ch.actifsource.diagram.javamodel.IDomainDiagram.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_diagram, visitor);
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_internet, visitor);
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_router, visitor);
    _acceptList(ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_table, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem selectToMeComputer(ch.actifsource.example.diagramtype.generic.computer.javamodel.IComputer object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_computer, object.getResource());
  }
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem selectToMeInternet(ch.actifsource.example.diagramtype.generic.computer.javamodel.IInternet object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_internet, object.getResource());
  }
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem selectToMeRouter(ch.actifsource.example.diagramtype.generic.computer.javamodel.ISwitch object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_router, object.getResource());
  }
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem selectToMeTable(ch.actifsource.example.diagramtype.generic.computer.javamodel.ITable object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_table, object.getResource());
  }
  
  public static ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem selectToMeDiagram(ch.actifsource.diagram.javamodel.IDomainDiagram object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.diagramtype.generic.computer.javamodel.ISystem.class, ch.actifsource.example.diagramtype.generic.computer.ComputerPackage.System_diagram, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,544bef1f-990c-11ea-8568-8df113ebd62f,MnubxZy3e4JmtHkiVvzvgrd8dbc=] */
