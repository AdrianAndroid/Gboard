package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ocv  reason: default package */
/* loaded from: classes2.dex */
final class ocv extends OutputStream {
    public final List a = new ArrayList();
    private ogn b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        ogn ognVar = this.b;
        if (ognVar == null || ognVar.b <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        ognVar.a.N((byte) i);
        ognVar.b--;
        ognVar.c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            ogn g = nxo.g(i2);
            this.b = g;
            this.a.add(g);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.b);
            if (min == 0) {
                int i3 = this.b.c;
                ogn g2 = nxo.g(Math.max(i2, i3 + i3));
                this.b = g2;
                this.a.add(g2);
            } else {
                this.b.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
