package ch.actifsource.example.diagramtype.generic.computer.figure;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[54497a6d-990c-11ea-8568-8df113ebd62f,imports]] */

/* End Protected Region   [[54497a6d-990c-11ea-8568-8df113ebd62f,imports]] */

public class DiagramFunctions {

  /* Begin Protected Region [[54497a6d-990c-11ea-8568-8df113ebd62f]] */
  
  /* End Protected Region   [[54497a6d-990c-11ea-8568-8df113ebd62f]] */


  public static interface ITableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("544bee25-990c-11ea-8568-8df113ebd62f")
    public java.lang.String getSVGImage();

  }
  
  public static interface ITableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableFunctionsImpl implements ITableFunctionsImpl {

    public static final ITableFunctionsImpl INSTANCE = new TableFunctionsImpl();

    private TableFunctionsImpl() {}

  }
  
  public static class TableFunctions {

    private TableFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,54497a6d-990c-11ea-8568-8df113ebd62f,6abpWgsyB49/uhpGX7VtWo5X7Tw=] */
