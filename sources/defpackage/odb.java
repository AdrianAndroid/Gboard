package defpackage;

/* compiled from: PG */
/* renamed from: odb  reason: default package */
/* loaded from: classes2.dex */
public final class odb extends nua {
    private final ntw a;

    public odb(ntw ntwVar) {
        jdg.Q(ntwVar, "result");
        this.a = ntwVar;
    }

    @Override // defpackage.nua
    public final ntw a() {
        return this.a;
    }

    public final String toString() {
        lfa R = jdg.R(odb.class);
        R.b("result", this.a);
        return R.toString();
    }
}
