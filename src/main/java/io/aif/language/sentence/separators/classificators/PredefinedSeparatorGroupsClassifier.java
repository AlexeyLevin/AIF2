package io.aif.language.sentence.separators.classificators;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class PredefinedSeparatorGroupsClassifier implements ISeparatorGroupsClassifier {

  private static final char DOT_CHARACTER = '.';

  @Override
  public Map<Group, Set<Character>> classify(List<String> tokens, List<Set<Character>> separatorsGroups) {
    final Set<Character> group1 = new HashSet<>();
    final Set<Character> group2 = new HashSet<>();

    separatorsGroups.forEach(separators -> {
      if (separators.contains(DOT_CHARACTER)) {
        group1.addAll(separators);
      } else {
        group2.addAll(separators);
      }
    });
    final Map<Group, Set<Character>> result = new HashMap<>();
    result.put(Group.GROUP_1, group1);
    result.put(Group.GROUP_2, group2);
    return result;
  }
}
