/*
 * generated by Xtext 2.24.0
 */
package uk.kcl.ac.inf.jsonlang.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.Array;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.JSONLanguagePackage;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.Statement;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.jSONLanguage;
import uk.kcl.ac.inf.jsonlang.services.JSONLanguageGrammarAccess;

@SuppressWarnings("all")
public class JSONLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JSONLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JSONLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JSONLanguagePackage.ARRAY:
				sequence_Array(context, (Array) semanticObject); 
				return; 
			case JSONLanguagePackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case JSONLanguagePackage.JSON_LANGUAGE:
				sequence_jSONLanguage(context, (jSONLanguage) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Value returns Array
	 *     Array returns Array
	 *
	 * Constraint:
	 *     (value+=Value value+=Value*)
	 */
	protected void sequence_Array(ISerializationContext context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Statement
	 *
	 * Constraint:
	 *     (key=STRING value=Value)
	 */
	protected void sequence_Statement(ISerializationContext context, Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JSONLanguagePackage.Literals.STATEMENT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JSONLanguagePackage.Literals.STATEMENT__KEY));
			if (transientValues.isValueTransient(semanticObject, JSONLanguagePackage.Literals.STATEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JSONLanguagePackage.Literals.STATEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStatementAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getStatementAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     jSONLanguage returns jSONLanguage
	 *     Value returns jSONLanguage
	 *
	 * Constraint:
	 *     (statement+=Statement statement+=Statement*)
	 */
	protected void sequence_jSONLanguage(ISerializationContext context, jSONLanguage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
