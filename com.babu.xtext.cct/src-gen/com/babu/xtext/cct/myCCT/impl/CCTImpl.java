/**
 */
package com.babu.xtext.cct.myCCT.impl;

import com.babu.xtext.cct.myCCT.CCT;
import com.babu.xtext.cct.myCCT.Condition;
import com.babu.xtext.cct.myCCT.File;
import com.babu.xtext.cct.myCCT.Loop;
import com.babu.xtext.cct.myCCT.MyCCTPackage;
import com.babu.xtext.cct.myCCT.Value;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>CCT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.babu.xtext.cct.myCCT.impl.CCTImpl#getFile <em>File</em>}</li>
 *   <li>{@link com.babu.xtext.cct.myCCT.impl.CCTImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link com.babu.xtext.cct.myCCT.impl.CCTImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.babu.xtext.cct.myCCT.impl.CCTImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CCTImpl extends MinimalEObjectImpl.Container implements CCT
{
  /**
   * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected File file;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected EList<Loop> loop;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected EList<Condition> condition;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<Value> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CCTImpl()
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
    return MyCCTPackage.Literals.CCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File getFile()
  {
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFile(File newFile, NotificationChain msgs)
  {
    File oldFile = file;
    file = newFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyCCTPackage.CCT__FILE, oldFile, newFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFile(File newFile)
  {
    if (newFile != file)
    {
      NotificationChain msgs = null;
      if (file != null)
        msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyCCTPackage.CCT__FILE, null, msgs);
      if (newFile != null)
        msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyCCTPackage.CCT__FILE, null, msgs);
      msgs = basicSetFile(newFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyCCTPackage.CCT__FILE, newFile, newFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Loop> getLoop()
  {
    if (loop == null)
    {
      loop = new EObjectContainmentEList<Loop>(Loop.class, this, MyCCTPackage.CCT__LOOP);
    }
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getCondition()
  {
    if (condition == null)
    {
      condition = new EObjectContainmentEList<Condition>(Condition.class, this, MyCCTPackage.CCT__CONDITION);
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getValue()
  {
    if (value == null)
    {
      value = new EObjectContainmentEList<Value>(Value.class, this, MyCCTPackage.CCT__VALUE);
    }
    return value;
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
      case MyCCTPackage.CCT__FILE:
        return basicSetFile(null, msgs);
      case MyCCTPackage.CCT__LOOP:
        return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
      case MyCCTPackage.CCT__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
      case MyCCTPackage.CCT__VALUE:
        return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
      case MyCCTPackage.CCT__FILE:
        return getFile();
      case MyCCTPackage.CCT__LOOP:
        return getLoop();
      case MyCCTPackage.CCT__CONDITION:
        return getCondition();
      case MyCCTPackage.CCT__VALUE:
        return getValue();
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
      case MyCCTPackage.CCT__FILE:
        setFile((File)newValue);
        return;
      case MyCCTPackage.CCT__LOOP:
        getLoop().clear();
        getLoop().addAll((Collection<? extends Loop>)newValue);
        return;
      case MyCCTPackage.CCT__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends Condition>)newValue);
        return;
      case MyCCTPackage.CCT__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends Value>)newValue);
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
      case MyCCTPackage.CCT__FILE:
        setFile((File)null);
        return;
      case MyCCTPackage.CCT__LOOP:
        getLoop().clear();
        return;
      case MyCCTPackage.CCT__CONDITION:
        getCondition().clear();
        return;
      case MyCCTPackage.CCT__VALUE:
        getValue().clear();
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
      case MyCCTPackage.CCT__FILE:
        return file != null;
      case MyCCTPackage.CCT__LOOP:
        return loop != null && !loop.isEmpty();
      case MyCCTPackage.CCT__CONDITION:
        return condition != null && !condition.isEmpty();
      case MyCCTPackage.CCT__VALUE:
        return value != null && !value.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CCTImpl
