package io.aif.language.word.comparator;

import java.util.Collection;

import io.aif.language.token.comparator.ITokenComparator;

class MeshComparator implements IGroupComparator {

  private final ITokenComparator tokenComparator;

  MeshComparator(ITokenComparator tokenComparator) {
    this.tokenComparator = tokenComparator;
  }

  @Override
  public double compare(final Collection<String> o1, final Collection<String> o2) {
    final Double sum = o1
        .parallelStream()
        .mapToDouble(t1 -> o2
            .stream()
            .mapToDouble(t2 -> tokenComparator.compare(t1.toLowerCase(), t2.toLowerCase()))
            .sum()
        )
        .sum();

    return sum / (o1.size() * o2.size());
  }

}
