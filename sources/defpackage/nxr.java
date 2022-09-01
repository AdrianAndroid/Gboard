package defpackage;

/* compiled from: PG */
/* renamed from: nxr  reason: default package */
/* loaded from: classes2.dex */
public abstract class nxr extends nug {
    public abstract nug a();

    @Override // defpackage.nug
    public final nuf c() {
        throw null;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("delegate", a());
        return S.toString();
    }
}
