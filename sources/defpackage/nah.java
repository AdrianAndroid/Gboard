package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nah  reason: default package */
/* loaded from: classes2.dex */
public enum nah implements nbd {
    CONCATENATE(1, "||"),
    MULTIPLY(2, "*"),
    DIVIDE(2, "/"),
    MODULO(2, "%"),
    ADD(3, "+"),
    SUBTRACT(3, "-"),
    BIT_LEFT_SHIFT(4, "<<"),
    BIT_RIGHT_SHIFT(4, ">>"),
    BITWISE_AND(4, "&"),
    BITWISE_OR(4, "|"),
    LESS_THAN(5, "<"),
    LESS_THAN_OR_EQUALS(5, "<="),
    GREATER_THAN(5, ">"),
    GREATER_THAN_OR_EQUALS(5, ">="),
    EQUALS(6, "==", "="),
    NOT_EQUALS(6, "!=", "<>"),
    IS_NOT(6, "IS NOT"),
    IS(6, "IS"),
    IN(6, "IN"),
    NOT_IN(6, "NOT IN"),
    LIKE(6, "LIKE"),
    NOT_LIKE(6, "NOT LIKE"),
    GLOB(6, "GLOB"),
    NOT_GLOB(6, "NOT GLOB"),
    REGEXP(6, "REGEXP"),
    NOT_REGEXP(6, "NOT REGEXP"),
    MATCH(6, "MATCH"),
    NOT_MATCH(6, "NOT MATCH"),
    AND(7, "AND"),
    OR(8, "OR");
    
    public final int E;
    private final llp G;

    nah(int i, String... strArr) {
        this.E = i;
        llp p = llp.p(strArr);
        oll.d(p, "copyOf(tokens)");
        this.G = p;
    }

    @Override // defpackage.nbd
    public final /* synthetic */ List a() {
        return this.G;
    }
}
