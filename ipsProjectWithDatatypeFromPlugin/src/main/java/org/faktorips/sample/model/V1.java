package org.faktorips.sample.model;

import org.faktorips.runtime.model.annotation.IpsPolicyCmptType;
import org.faktorips.runtime.model.annotation.IpsAttributes;
import org.faktorips.runtime.model.annotation.IpsExtensionProperties;
import org.faktorips.runtime.model.annotation.IpsExtensionProperty;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.AbstractModelObject;
import org.faktorips.runtime.IDeltaSupport;
import org.faktorips.runtime.ICopySupport;
import org.faktorips.runtime.IVisitorSupport;
import org.faktorips.valueset.ValueSet;
import org.faktorips.valueset.UnrestrictedValueSet;
import org.faktorips.runtime.model.annotation.IpsDefaultValue;
import org.faktorips.runtime.model.annotation.IpsAllowedValues;
import org.faktorips.runtime.model.annotation.IpsAttribute;
import org.faktorips.runtime.model.type.AttributeKind;
import org.faktorips.runtime.model.type.ValueSetKind;
import org.faktorips.runtime.model.annotation.IpsAttributeSetter;
import java.util.Map;
import org.faktorips.runtime.IRuntimeRepository;
import org.w3c.dom.Element;
import org.faktorips.runtime.IModelObjectDelta;
import org.faktorips.runtime.IModelObject;
import org.faktorips.runtime.IDeltaComputationOptions;
import org.faktorips.runtime.internal.ModelObjectDelta;
import java.util.HashMap;
import org.faktorips.runtime.IModelObjectVisitor;
import org.faktorips.runtime.MessageList;
import org.faktorips.runtime.IValidationContext;

/**
 * Implementierung von V1.
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsPolicyCmptType(name = "V1")
@IpsAttributes({ "invalidCountry" })
@IpsExtensionProperties(@IpsExtensionProperty(id = "org.faktorips.testextensions.TestExtensionForIPolicyCmptType", isNull = true))
@IpsDocumented(bundleName = "org.faktorips.sample.model.model-label-and-descriptions", defaultLocale = "de")
public class V1 extends AbstractModelObject implements IDeltaSupport, ICopySupport, IVisitorSupport {

	/**
	 * Diese Konstante enthaelt den Namen der Eigenschaft invalidCountry.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_INVALIDCOUNTRY = "invalidCountry";
	/**
	 * Gibt die maximal erlaubten Werte fuer die Eigenschaft invalidCountry zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final ValueSet<String> MAX_ALLOWED_VALUES_FOR_INVALID_COUNTRY = new UnrestrictedValueSet<>(true);
	/**
	 * Gibt den Vorgabewert des Attributs invalidCountry zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("invalidCountry")
	public static final String DEFAULT_VALUE_FOR_INVALID_COUNTRY = "AF";

	/**
	 * Membervariable fuer invalidCountry.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private String invalidCountry = DEFAULT_VALUE_FOR_INVALID_COUNTRY;

	/**
	 * Erzeugt eine neue Instanz von V1.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public V1() {
		super();
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut invalidCountry zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValues("invalidCountry")
	public ValueSet<String> getAllowedValuesForInvalidCountry() {
		return MAX_ALLOWED_VALUES_FOR_INVALID_COUNTRY;
	}

	/**
	 * Gibt den Wert des Attributs invalidCountry zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "invalidCountry", kind = AttributeKind.CHANGEABLE, valueSetKind = ValueSetKind.AllValues)
	@IpsExtensionProperties(@IpsExtensionProperty(id = "org.faktorips.testextensions.TestExtensionForIAttribute", value = "false"))
	public String getInvalidCountry() {
		return invalidCountry;
	}

	/**
	 * Setzt den Wert des Attributs invalidCountry.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("invalidCountry")
	public void setInvalidCountry(String newValue) {
		this.invalidCountry = newValue;
	}

	/**
	 * Initialisiert Attribute mit ihren Vorgabewerten.
	 *
	 * @restrainedmodifiable
	 */
	public void initialize() {
		// begin-user-code
		// end-user-code
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	protected void initPropertiesFromXml(Map<String, String> propMap, IRuntimeRepository productRepository) {
		super.initPropertiesFromXml(propMap, productRepository);
		doInitInvalidCountry(propMap);
	}

	/**
	 * @generated
	 */
	private void doInitInvalidCountry(Map<String, String> propMap) {
		if (propMap.containsKey(PROPERTY_INVALIDCOUNTRY)) {
			this.invalidCountry = propMap.get(PROPERTY_INVALIDCOUNTRY);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	protected AbstractModelObject createChildFromXml(Element childEl) {
		AbstractModelObject newChild = super.createChildFromXml(childEl);
		if (newChild != null) {
			return newChild;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	public IModelObjectDelta computeDelta(IModelObject otherObject, IDeltaComputationOptions options) {
		ModelObjectDelta delta = ModelObjectDelta.newDelta(this, otherObject, options);
		if (!V1.class.isAssignableFrom(otherObject.getClass())) {
			return delta;
		}
		V1 otherV1 = (V1) otherObject;
		delta.checkPropertyChange(V1.PROPERTY_INVALIDCOUNTRY, invalidCountry, otherV1.invalidCountry, options);
		return delta;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	public V1 newCopy() {
		Map<IModelObject, IModelObject> copyMap = new HashMap<>();
		V1 newCopy = newCopyInternal(copyMap);
		copyAssociationsInternal(newCopy, copyMap);
		return newCopy;
	}

	/**
	 * Interne Kopiermethode mit einer {@link Map} der bisher kopierten Instanzen
	 *
	 * @param copyMap die Map enthaelt die bisher kopierten Instanzen.
	 *
	 * @generated
	 */
	public V1 newCopyInternal(Map<IModelObject, IModelObject> copyMap) {
		V1 newCopy = (V1) copyMap.get(this);
		if (newCopy == null) {
			newCopy = new V1();
			copyMap.put(this, newCopy);
			copyProperties(newCopy, copyMap);
		}
		return newCopy;
	}

	/**
	 * Diese Methode setzt alle Werte in der Kopie (copy) auf die Werte aus diesem
	 * Objekt. Kopierte Assoziationen werden in {@link #newCopyInternal(Map)} zur
	 * copyMap hinzugefügt.
	 *
	 * @param copy    Das kopierte Object
	 * @param copyMap Eine Map mit kopierten assoziierten Objekten
	 *
	 * @generated
	 */
	protected void copyProperties(IModelObject copy, Map<IModelObject, IModelObject> copyMap) {
		V1 concreteCopy = (V1) copy;
		concreteCopy.invalidCountry = invalidCountry;
	}

	/**
	 * Interne Methode zum Setzen kopierter Assoziationen. Wenn das Ziel der
	 * Assoziation kopiert wurde, wird die Assoziation auf die neue Kopie gesetzt,
	 * ansonsten bleibt die Assoziation unveraendert. Die Methode ruft ausserdem
	 * {@link #copyAssociationsInternal(IModelObject, Map)} in allen durch
	 * Komposition verknuepften Instanzen auf.
	 *
	 * @param abstractCopy die Kopie dieser PolicyCmpt
	 * @param copyMap      die Map mit den kopierten Instanzen
	 *
	 * @generated
	 */
	public void copyAssociationsInternal(IModelObject abstractCopy, Map<IModelObject, IModelObject> copyMap) {
		// Keine Implementierung notwendig.
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	public boolean accept(IModelObjectVisitor visitor) {
		if (!visitor.visit(this)) {
			return false;
		}
		return true;
	}

	/**
	 * Validierung von Objekten der Klasse V1. Gibt <code>true</code> zurueck, wenn
	 * dieses Objekt mit der Validierung fortfahren soll, <code>false</code> sonst.
	 *
	 * @generated
	 */
	@Override
	public boolean validateSelf(MessageList ml, IValidationContext context) {
		if (!super.validateSelf(ml, context)) {
			return STOP_VALIDATION;
		}
		return CONTINUE_VALIDATION;
	}

	/**
	 * Validierung von abhaengigen Objekten fuer Instanzen der Klasse V1.
	 *
	 * @generated
	 */
	@Override
	public void validateDependants(MessageList ml, IValidationContext context) {
		super.validateDependants(ml, context);
	}

	/**
	 * Erzeugt einen neuen V1Builder um diesen Vertrag zu bearbeiten.
	 *
	 * @generated
	 */
	public V1Builder modify() {
		return V1Builder.from(this, null);
	}

	/**
	 * Das Runtime Repository wird benutzt um die konfigurierten Ziele von
	 * Assoziationen mit Hilfe eines bestehenden Produkts zu erstellen.
	 *
	 * @generated
	 */
	public V1Builder modify(IRuntimeRepository runtimeRepository) {
		return V1Builder.from(this, runtimeRepository);
	}

	/**
	 * Erzeugt eine neue Instanz von V1Builder von einer neuen Vertragsinstanz.
	 * Runtime Repository wird null gesetzt.
	 *
	 * @generated
	 */
	public static V1Builder builder() {
		return V1Builder.from(new V1(), null);
	}

	/**
	 * Erzeugt eine neue Instanz von V1Builder von einer neuen Vertragsinstanz.
	 * Runtime Repository wird null gesetzt. Das Runtime Repository wird gebraucht,
	 * wenn Ziele der Assoziationen durch Produkte konfiguriert werden. Diese müssen
	 * entsprechend in diesem Runtime Repository liegen.
	 *
	 * @generated
	 */
	public static V1Builder builder(IRuntimeRepository runtimeRepository) {
		return V1Builder.from(new V1(), runtimeRepository);
	}

}