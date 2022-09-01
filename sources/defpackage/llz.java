package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: llz  reason: default package */
/* loaded from: classes.dex */
final class llz implements Serializable {
    private static final long serialVersionUID = 0;
    final llw a;

    public llz(llw llwVar) {
        this.a = llwVar;
    }

    Object readResolve() {
        return this.a.keySet();
    }
}
