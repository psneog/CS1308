/**
 */
package bookOrder.impl;

import bookOrder.*;

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
public class BookOrderFactoryImpl extends EFactoryImpl implements BookOrderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookOrderFactory init() {
		try {
			BookOrderFactory theBookOrderFactory = (BookOrderFactory) EPackage.Registry.INSTANCE
					.getEFactory(BookOrderPackage.eNS_URI);
			if (theBookOrderFactory != null) {
				return theBookOrderFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BookOrderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookOrderFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BookOrderPackage.UNIVERSE:
			return createUniverse();
		case BookOrderPackage.BOOK_ORDER:
			return createBookOrder();
		case BookOrderPackage.BOOK:
			return createBook();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universe createUniverse() {
		UniverseImpl universe = new UniverseImpl();
		return universe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookOrder createBookOrder() {
		BookOrderImpl bookOrder = new BookOrderImpl();
		return bookOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookOrderPackage getBookOrderPackage() {
		return (BookOrderPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BookOrderPackage getPackage() {
		return BookOrderPackage.eINSTANCE;
	}

} //BookOrderFactoryImpl
