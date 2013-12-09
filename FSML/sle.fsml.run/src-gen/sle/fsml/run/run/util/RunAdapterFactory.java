/**
 */
package sle.fsml.run.run.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sle.fsml.run.run.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sle.fsml.run.run.RunPackage
 * @generated
 */
public class RunAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RunPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RunPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RunSwitch<Adapter> modelSwitch =
    new RunSwitch<Adapter>()
    {
      @Override
      public Adapter caseRunfile(Runfile object)
      {
        return createRunfileAdapter();
      }
      @Override
      public Adapter caseRun(Run object)
      {
        return createRunAdapter();
      }
      @Override
      public Adapter caseMachine(Machine object)
      {
        return createMachineAdapter();
      }
      @Override
      public Adapter caseMachineReference(MachineReference object)
      {
        return createMachineReferenceAdapter();
      }
      @Override
      public Adapter caseMachnineLocation(MachnineLocation object)
      {
        return createMachnineLocationAdapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseInputReference(InputReference object)
      {
        return createInputReferenceAdapter();
      }
      @Override
      public Adapter caseInputLocation(InputLocation object)
      {
        return createInputLocationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link sle.fsml.run.run.Runfile <em>Runfile</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sle.fsml.run.run.Runfile
   * @generated
   */
  public Adapter createRunfileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sle.fsml.run.run.Run <em>Run</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sle.fsml.run.run.Run
   * @generated
   */
  public Adapter createRunAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sle.fsml.run.run.Machine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sle.fsml.run.run.Machine
   * @generated
   */
  public Adapter createMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sle.fsml.run.run.MachineReference <em>Machine Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sle.fsml.run.run.MachineReference
   * @generated
   */
  public Adapter createMachineReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sle.fsml.run.run.MachnineLocation <em>Machnine Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sle.fsml.run.run.MachnineLocation
   * @generated
   */
  public Adapter createMachnineLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sle.fsml.run.run.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sle.fsml.run.run.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sle.fsml.run.run.InputReference <em>Input Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sle.fsml.run.run.InputReference
   * @generated
   */
  public Adapter createInputReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sle.fsml.run.run.InputLocation <em>Input Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sle.fsml.run.run.InputLocation
   * @generated
   */
  public Adapter createInputLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RunAdapterFactory
