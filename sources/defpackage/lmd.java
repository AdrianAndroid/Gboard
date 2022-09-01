package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lmd  reason: default package */
/* loaded from: classes.dex */
final class lmd implements Serializable {
    private static final long serialVersionUID = 0;
    final llw a;

    public lmd(llw llwVar) {
        this.a = llwVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}
