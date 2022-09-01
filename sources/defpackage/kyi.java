package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: kyi  reason: default package */
/* loaded from: classes.dex */
public final class kyi {
    public int a;
    public boolean b;
    public final Object c;

    public kyi(int i, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = new WeakReference(opuVar);
        this.a = i;
    }

    public kyi(ktx ktxVar) {
        this.b = false;
        this.a = 0;
        this.c = ktxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(opu opuVar) {
        return opuVar != null && ((WeakReference) this.c).get() == opuVar;
    }
}
