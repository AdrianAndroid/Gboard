package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: llx  reason: default package */
/* loaded from: classes.dex */
final class llx implements Serializable {
    private static final long serialVersionUID = 0;
    final llw a;

    public llx(llw llwVar) {
        this.a = llwVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
