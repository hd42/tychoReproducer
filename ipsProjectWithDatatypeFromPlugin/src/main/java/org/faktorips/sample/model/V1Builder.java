package org.faktorips.sample.model;

import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Diese Klasse stellt Methoden bereit, mit denen eine Instanz von V1 erstellt
 * und bearbeitet werden kann.
 *
 * @generated
 */
public class V1Builder {
	/**
	 * @generated
	 */
	private final V1 v1;

	/**
	 * @generated
	 */
	private IRuntimeRepository runtimeRepository;

	/**
	 * Erzeugt eine neue Instanz von V1Builder mit einem Runtime Repository. Dieser
	 * Konstruktor ist nur für den internen Gebrauch!
	 *
	 * @generated
	 */
	@IpsGenerated
	protected V1Builder(V1 policy, IRuntimeRepository runtimeRepository) {
		this.v1 = policy;
		this.runtimeRepository = runtimeRepository;
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	public V1Builder setRepository(IRuntimeRepository runtimeRepository) {
		this.runtimeRepository = runtimeRepository;
		return this;
	}

	/**
	 * Setzt den Wert des Attributs invalidCountry.
	 * 
	 * @generated
	 */
	@IpsGenerated
	public V1Builder invalidCountry(String newInvalidCountry) {
		v1.setInvalidCountry(newInvalidCountry);
		return this;
	}

	/**
	 * Gibt die Instanz von V1 zurück, die von diesem Builder gebaut wird.
	 *
	 * @generated
	 */
	@IpsGenerated
	public V1 getResult() {
		return v1;
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	public IRuntimeRepository getRepository() {
		return runtimeRepository;
	}

	/**
	 *
	 *
	 * @generated
	 */
	@IpsGenerated
	public static Class<?> getPolicyClass() {
		return V1.class;
	}

	/**
	 * Erzeugt einen neuen V1Builder mit einer Instanz von V1.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static V1Builder from(V1 policy) {
		return new V1Builder(policy, null);
	}

	/**
	 * Erzeugt einen neuen V1Builder mit einer Instanz von V1 und einem Runtime
	 * Repository.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static V1Builder from(V1 policy, IRuntimeRepository runtimeRepository) {
		return new V1Builder(policy, runtimeRepository);
	}

}
