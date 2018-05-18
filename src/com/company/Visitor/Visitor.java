package com.company.Visitor;

public interface Visitor {
    int visit(Therapist therapist);
    int visit(Surgeon surgeon);
}
