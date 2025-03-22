/**
 * This model class represents Noun objects, which form the subject of a given question on a test.
 * This class is marked with the @Entity attribute, and will therefore be mirrored in the database, as the Noun TABLE
 */
package uk.ac.bangor.cs.cambria.AcademiGymraeg.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import uk.ac.bangor.cs.cambria.AcademiGymraeg.Enum.Gender;

/**
 * @author ptg22svs
 */

@Entity
public class Noun  {

	/**
	 * Id attribute. The unique identifier for each Noun object, and the primary key for the Noun TABLE in the database.
	 * The value will be autogenerated, and cannot be updated once created.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	
	/**
	 * WelshNoun attribute. The Welsh language representation of the Noun.
	 */
	@Column(nullable = false)
	private String WelshNoun;
	
	
	/**
	 * EnglishNoun attribute. The English language representation of the Noun.
	 */
	@Column(nullable = false)
	private String EnglishNoun;
	
	
	/**
	 * Gender attribute. Represents the gender classification for the Welsh language representation of the noun.
	 * Attribute is of type "Gender", which allows 3 values: Masculine, Feminine and Plural
	 */
	@Column(nullable = false)
	private Gender Gender;

	/**
	 * @return The value of "WelshNoun"
	 */
	public String getWelshNoun() {
		return WelshNoun;
	}

	/**
	 * @param welshNoun=the value to assign to WelshNoun
	 */
	public void setWelshNoun(String welshNoun) {
		WelshNoun = welshNoun;
	}

	/**
	 * @return The value of "EnglishNoun"
	 */
	public String getEnglishNoun() {
		return EnglishNoun;
	}

	/**
	 * @param englishNoun=the value to assign to EnglishNoun
	 */
	public void setEnglishNoun(String englishNoun) {
		EnglishNoun = englishNoun;
	}

	/**
	 * @return The value of "Gender"
	 */
	public Gender getGender() {
		return Gender;
	}

	/**
	 * @param gender=the value to assign to Gender
	 */
	public void setGender(Gender gender) {
		Gender = gender;
	}

	public void setId(Long nounId) {
		this.Id = nounId;
	}
	
	/**
	 * @return The value of "Id"
	 */
	public Long getId() {
		return Id;
	}
	
}
