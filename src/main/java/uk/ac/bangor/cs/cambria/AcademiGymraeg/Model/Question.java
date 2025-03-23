package uk.ac.bangor.cs.cambria.AcademiGymraeg.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import uk.ac.bangor.cs.cambria.AcademiGymraeg.Enum.QuestionType;

/**
 * @author dwp22pzv
 */

@Entity

public class Question {

    /**
	 * Id attribute. The unique identifier for each Question object, and the primary key for the Question TABLE in the database.
	 * The value will be autogenerated, and cannot be updated once created.
	 */
	@Id
	@GeneratedValue
	@Column(nullable = false, updatable = false)
	@NotBlank
	private Long id;

    /**
	 * Question attribute. The string containing the actual question being asked.
	 */
	@Column(nullable = false)
	@NotBlank
	private String _questionString;

    /**
	 * QuestionType attribute. Represents the type of this question, either English to Welsh, Welsh to English, or Gender.
	 */
	@Column(nullable = false)
	@NotBlank
	private QuestionType _questionType;

    /**
	 * correctAnswer attribute. The string containing the correct answer to the question.
	 */
	@Column(nullable = false)
	@NotBlank
	private String _correctAnswer;

    /**
	 * givenAnswer attribute. The string containing the answer provided by the user
	 */
	private String _givenAnswer;


    public Long getId(){
        return id;
    }

    public String getQuestionString(){
        return _questionString;
    }

    public void setQuestionString(String questionString){
        _questionString = questionString;
    }

    public QuestionType getQuestionType(){
        return _questionType;
    }

    public void setQuestionType(QuestionType questionType){
        _questionType = questionType;
    }

    public String getCorrectAnswer(){
        return _correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer){
        _correctAnswer = correctAnswer;
    }

    public String getGivenAnswer(){
        return _givenAnswer;
    }

    public void setGivenAnswer(String givenAnswer){
        _givenAnswer = givenAnswer;
    }

    @Override
    public String toString(){
        return _questionString;
    }


}