/**
 */
package bookOrder.impl;

import bookOrder.BookOrder;
import bookOrder.BookOrderPackage;
import bookOrder.Universe;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bookOrder.impl.UniverseImpl#getBookorder <em>Bookorder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniverseImpl extends MinimalEObjectImpl.Container implements Universe {
	/**
	 * The cached value of the '{@link #getBookorder() <em>Bookorder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookorder()
	 * @generated
	 * @ordered
	 */
	protected EList<BookOrder> bookorder;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniverseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookOrderPackage.Literals.UNIVERSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookOrder> getBookorder() {
		if (bookorder == null) {
			bookorder = new EObjectContainmentEList<BookOrder>(BookOrder.class, this, BookOrderPackage.UNIVERSE__BOOKORDER);
		}
		return bookorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BookOrderPackage.UNIVERSE__BOOKORDER:
				return ((InternalEList<?>)getBookorder()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookOrderPackage.UNIVERSE__BOOKORDER:
				return getBookorder();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BookOrderPackage.UNIVERSE__BOOKORDER:
				getBookorder().clear();
				getBookorder().addAll((Collection<? extends BookOrder>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BookOrderPackage.UNIVERSE__BOOKORDER:
				getBookorder().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BookOrderPackage.UNIVERSE__BOOKORDER:
				return bookorder != null && !bookorder.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UniverseImpl
