package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: oyg  reason: default package */
/* loaded from: classes2.dex */
final class oyg implements oyd, oye {
    private int a;

    public oyg() {
    }

    @Override // defpackage.oyd
    public final boolean a() {
        return true;
    }

    @Override // defpackage.oyd
    public final boolean b() {
        return true;
    }

    @Override // defpackage.oyd
    public final boolean c() {
        return false;
    }

    @Override // defpackage.oye
    public final int d() {
        return (oyh.a(this.a) >> 10) + 104;
    }

    @Override // defpackage.oye
    public final InputStream e(InputStream inputStream) {
        return new oyh(inputStream, this.a);
    }

    public oyg(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if ((b & 255) <= 37) {
                this.a = ((b & 1) | 2) << ((b >>> 1) + 11);
                return;
            }
        }
        throw new oyl("Unsupported LZMA2 properties");
    }
}
