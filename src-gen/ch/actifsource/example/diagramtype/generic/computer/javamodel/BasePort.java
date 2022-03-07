package ch.actifsource.example.diagramtype.generic.computer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BasePort extends DynamicResource implements IBasePort {

  // abstract implementation, only used for static method calls
  private BasePort() {
    super(IBasePort.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f776d980-9de7-11ec-b801-9d902c96d825,+lALA89LZyfhncUbEAgu3Ge53mE=] */
