package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: bab  reason: default package */
/* loaded from: classes.dex */
public final class bab implements azo {
    public static final bab a = new bab(1, null);
    private final /* synthetic */ int b;

    public bab(int i) {
        this.b = i;
    }

    @Deprecated
    public bab(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // defpackage.azo
    public final azn b(azt aztVar) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new hjn(hht.j) : new hjn(hht.i) : new hjn(hht.g) : new azd(aztVar.a(aze.class, InputStream.class), 6) : azs.a;
        }
        return new bac(aztVar.a(aze.class, InputStream.class));
    }

    @Override // defpackage.azo
    public final void c() {
    }
}
