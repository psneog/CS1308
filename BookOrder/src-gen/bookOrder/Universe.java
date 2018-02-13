/**
 */
package bookOrder;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bookOrder.Universe#getNeweclass2 <em>Neweclass2</em>}</li>
 * </ul>
 *
 * @see bookOrder.BookOrderPackage#getUniverse()
 * @model
 * @generated
 */
public interface Universe extends EObject {
	/**
	 * Returns the value of the '<em><b>Neweclass2</b></em>' containment reference list.
	 * The list contents are of type {@link bookOrder.BookOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neweclass2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neweclass2</em>' containment reference list.
	 * @see bookOrder.BookOrderPackage#getUniverse_Neweclass2()
	 * @model containment="true"
	 * @generated
	 */
	EList<BookOrder> getNeweclass2();

} // Universe
