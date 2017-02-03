/**
 */
package org.babu.xtext.training.smalljava.smalljavaDsl.impl;

import org.babu.xtext.training.smalljava.smalljavaDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmalljavaDslFactoryImpl extends EFactoryImpl implements SmalljavaDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmalljavaDslFactory init()
  {
    try
    {
      SmalljavaDslFactory theSmalljavaDslFactory = (SmalljavaDslFactory)EPackage.Registry.INSTANCE.getEFactory(SmalljavaDslPackage.eNS_URI);
      if (theSmalljavaDslFactory != null)
      {
        return theSmalljavaDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmalljavaDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmalljavaDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmalljavaDslPackage.NAME_SPACE: return createNameSpace();
      case SmalljavaDslPackage.IMPORT: return createImport();
      case SmalljavaDslPackage.SMALL_CLASS: return createSmallClass();
      case SmalljavaDslPackage.ATTRIBUTE: return createAttribute();
      case SmalljavaDslPackage.DATA_TYPE: return createDataType();
      case SmalljavaDslPackage.SMALL_CLASS_TYPE: return createsmallClassType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameSpace createNameSpace()
  {
    NameSpaceImpl nameSpace = new NameSpaceImpl();
    return nameSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallClass createSmallClass()
  {
    SmallClassImpl smallClass = new SmallClassImpl();
    return smallClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public smallClassType createsmallClassType()
  {
    smallClassTypeImpl smallClassType = new smallClassTypeImpl();
    return smallClassType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmalljavaDslPackage getSmalljavaDslPackage()
  {
    return (SmalljavaDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmalljavaDslPackage getPackage()
  {
    return SmalljavaDslPackage.eINSTANCE;
  }

} //SmalljavaDslFactoryImpl
