package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: oxw  reason: default package */
/* loaded from: classes2.dex */
final class oxw implements oyd, oye {
    private final long a;
    private final int b;

    public oxw() {
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
        int i = oyj.a;
        return 5;
    }

    @Override // defpackage.oye
    public final InputStream e(InputStream inputStream) {
        ozh ozfVar;
        long j = this.a;
        if (j == 4) {
            ozfVar = new ozi(this.b);
        } else if (j == 5) {
            ozfVar = new ozf(this.b, 2, (char[]) null);
        } else if (j == 6) {
            ozfVar = new ozg(this.b);
        } else if (j == 7) {
            ozfVar = new ozf(this.b, 1, (byte[]) null);
        } else if (j == 8) {
            ozfVar = new ozf(this.b, 0);
        } else {
            ozfVar = j == 9 ? new ozf(this.b, 3, (short[]) null) : null;
        }
        return new oyj(inputStream, ozfVar);
    }

    public oxw(long j, byte[] bArr) {
        this.a = j;
        int length = bArr.length;
        if (length == 0) {
            this.b = 0;
        } else if (length == 4) {
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            this.b = i;
        } else {
            throw new oyl("Unsupported BCJ filter properties");
        }
    }
}
