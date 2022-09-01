package defpackage;

/* compiled from: PG */
/* renamed from: okc  reason: default package */
/* loaded from: classes2.dex */
public abstract class okc extends ojz {
    public okc(ojv ojvVar) {
        super(ojvVar);
        if (ojvVar == null || ojvVar.e() == ojw.a) {
            return;
        }
        throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
    }

    @Override // defpackage.ojv
    public final ojw e() {
        return ojw.a;
    }
}
