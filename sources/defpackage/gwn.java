package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* renamed from: gwn  reason: default package */
/* loaded from: classes.dex */
public final class gwn extends LruCache {
    final /* synthetic */ orh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwn(orh orhVar, int i, byte[] bArr) {
        super(i);
        this.a = orhVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        if (this.a.d != null) {
            ibm ibmVar = (ibm) obj2;
            ltg ltgVar = ibu.a;
            return 1;
        }
        return 1;
    }
}
