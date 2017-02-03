/**
 */
package org.babu.xtext.training.smalljava.smalljavaDsl.impl;

import java.util.Collection;

import org.babu.xtext.training.smalljava.smalljavaDsl.Import;
import org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace;
import org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass;
import org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.NameSpaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.NameSpaceImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.NameSpaceImpl#getSmallClass <em>Small Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameSpaceImpl extends MinimalEObjectImpl.Container implements NameSpace
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getSmallClass() <em>Small Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmallClass()
   * @generated
   * @ordered
   */
  protected SmallClass smallClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameSpaceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmalljavaDslPackage.Literals.NAME_SPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmalljavaDslPackage.NAME_SPACE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, SmalljavaDslPackage.NAME_SPACE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallClass getSmallClass()
  {
    return smallClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSmallClass(SmallClass newSmallClass, NotificationChain msgs)
  {
    SmallClass oldSmallClass = smallClass;
    smallClass = newSmallClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmalljavaDslPackage.NAME_SPACE__SMALL_CLASS, oldSmallClass, newSmallClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmallClass(SmallClass newSmallClass)
  {
    if (newSmallClass != smallClass)
    {
      NotificationChain msgs = null;
      if (smallClass != null)
        msgs = ((InternalEObject)smallClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmalljavaDslPackage.NAME_SPACE__SMALL_CLASS, null, msgs);
      if (newSmallClass != null)
        msgs = ((InternalEObject)newSmallClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmalljavaDslPackage.NAME_SPACE__SMALL_CLASS, null, msgs);
      msgs = basicSetSmallClass(newSmallClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmalljavaDslPackage.NAME_SPACE__SMALL_CLASS, newSmallClass, newSmallClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmalljavaDslPackage.NAME_SPACE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SmalljavaDslPackage.NAME_SPACE__SMALL_CLASS:
        return basicSetSmallClass(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmalljavaDslPackage.NAME_SPACE__NAME:
        return getName();
      case SmalljavaDslPackage.NAME_SPACE__IMPORTS:
        return getImports();
      case SmalljavaDslPackage.NAME_SPACE__SMALL_CLASS:
        return getSmallClass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmalljavaDslPackage.NAME_SPACE__NAME:
        setName((String)newValue);
        return;
      case SmalljavaDslPackage.NAME_SPACE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case SmalljavaDslPackage.NAME_SPACE__SMALL_CLASS:
        setSmallClass((SmallClass)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmalljavaDslPackage.NAME_SPACE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmalljavaDslPackage.NAME_SPACE__IMPORTS:
        getImports().clear();
        return;
      case SmalljavaDslPackage.NAME_SPACE__SMALL_CLASS:
        setSmallClass((SmallClass)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmalljavaDslPackage.NAME_SPACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmalljavaDslPackage.NAME_SPACE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SmalljavaDslPackage.NAME_SPACE__SMALL_CLASS:
        return smallClass != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NameSpaceImpl
