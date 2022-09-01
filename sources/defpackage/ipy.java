package defpackage;

/* compiled from: PG */
/* renamed from: ipy  reason: default package */
/* loaded from: classes.dex */
public enum ipy {
    EQUAL("="),
    UNEQUAL("!="),
    GREATER(">"),
    GREATER_OR_EQUAL(">="),
    LESS("<"),
    LESS_OR_EQUAL("<="),
    IN("IN"),
    BETWEEN("BETWEEN"),
    LIKE("LIKE"),
    GLOB("GLOB"),
    FIND_IN_SET,
    DELTA_MOD_BETWEEN;
    
    public final String m;

    ipy() {
        this.m = "";
    }

    ipy(String str) {
        this.m = str;
    }
}
