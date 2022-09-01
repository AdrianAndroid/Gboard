package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: oyb  reason: default package */
/* loaded from: classes2.dex */
final class oyb implements oyd, oye {
    private final int a;

    public oyb() {
    }

    @Override // defpackage.oyd
    public final boolean a() {
        return false;
    }

    @Override // defpackage.oyd
    public final boolean b() {
        return false;
    }

    @Override // defpackage.oyd
    public final boolean c() {
        return true;
    }

    @Override // defpackage.oye
    public final int d() {
        return 1;
    }

    @Override // defpackage.oye
    public final InputStream e(InputStream inputStream) {
        return new oyc(inputStream, this.a);
    }

    public oyb(byte[] bArr) {
        if (bArr.length != 1) {
            throw new oyl("Unsupported Delta filter properties");
        }
        this.a = (bArr[0] & 255) + 1;
    }
}
