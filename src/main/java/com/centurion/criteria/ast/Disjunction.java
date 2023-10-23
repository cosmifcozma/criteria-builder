package com.centurion.criteria.ast;

import com.centurion.criteria.PredicateVisitor;

public class Disjunction extends Proposition {
    @Override
    public <R> R accept(PredicateVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
