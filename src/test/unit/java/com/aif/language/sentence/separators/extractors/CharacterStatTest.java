package com.aif.language.sentence.separators.extractors;

import com.aif.language.sentence.separators.extractors.StatSentenceSeparatorExtractor;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CharacterStatTest {

    @Test(groups = "unit-tests")
    public void testGetCharacter() throws Exception {
        // input arguments
        final Double inputProbability = 0.08;
        final Character inputCharacter = 'c';

        // mocks

        // expected results
        final Character expectedResult = inputCharacter;

        // creating test instance
        final StatSentenceSeparatorExtractor.CharacterStat characterStat = new StatSentenceSeparatorExtractor.CharacterStat(inputCharacter, inputProbability);

        // execution test
        final Character actualResult = characterStat.getCharacter();

        // result assert
        assertEquals(actualResult, expectedResult);

        // mocks verify
    }

    @Test(groups = "unit-tests")
    public void testGetProbabilityThatEndCharacter() throws Exception {
        // input arguments
        final Double inputProbability = 0.08;
        final Character inputCharacter = 'c';

        // mocks

        // expected results
        final Double expectedResult = inputProbability;

        // creating test instance
        final StatSentenceSeparatorExtractor.CharacterStat characterStat = new StatSentenceSeparatorExtractor.CharacterStat(inputCharacter, inputProbability);

        // execution test
        final Double actualResult = characterStat.getProbabilityThatEndCharacter();

        // result assert
        assertEquals(actualResult, expectedResult);

        // mocks verify
    }

    @Test(groups = "unit-tests")
    public void testCompareTo() throws Exception {
        // input arguments
        final Double inputProbability1 = 0.08;
        final Double inputProbability2 = 1.;
        final Character inputCharacter = 'c';

        // mocks

        // expected results
        final Integer expectedResult = 1;

        // creating test instance
        final StatSentenceSeparatorExtractor.CharacterStat characterStat1 = new StatSentenceSeparatorExtractor.CharacterStat(inputCharacter, inputProbability1);
        final StatSentenceSeparatorExtractor.CharacterStat characterStat2 = new StatSentenceSeparatorExtractor.CharacterStat(inputCharacter, inputProbability2);

        // execution test
        final Integer actualResult = characterStat1.compareTo(characterStat2);

        // result assert
        assertEquals(actualResult, expectedResult);

        // mocks verify
    }

}