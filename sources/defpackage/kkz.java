package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* renamed from: kkz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kkz implements klb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kkz(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    public /* synthetic */ kkz(klb klbVar, int i) {
        this.b = i;
        this.a = klbVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [klb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [klb, java.lang.Object] */
    @Override // defpackage.klb
    public final Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return this.a.a(Base64.decode((String) obj, 3));
            }
            if (i == 2) {
                return (Boolean) ((Class) this.a).cast(obj);
            }
            return (Long) ((Class) this.a).cast(obj);
        }
        return this.a.a((byte[]) obj);
    }
}
