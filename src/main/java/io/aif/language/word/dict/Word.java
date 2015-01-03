package io.aif.language.word.dict;


import io.aif.language.word.IWord;

import java.util.Set;

class Word implements IWord {

    private final Set<String> tokens;

    private final String rootToken;

    private final Long count;

    Word(final String rootToken, final Set<String> tokens, final Long count) {
        this.tokens = tokens;
        this.rootToken = rootToken;
        this.count = count;
    }

    @Override
    public String getRootToken() {
        return rootToken;
    }

    @Override
    public Set<String> getAllTokens() {
        return tokens;
    }

    @Override
    public Long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("RootToken: [%s] tokens: [%s]",rootToken ,tokens);
    }

}