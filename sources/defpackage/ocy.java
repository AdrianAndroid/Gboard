package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: ocy  reason: default package */
/* loaded from: classes2.dex */
public final class ocy implements oaj {
    public final ofg e;
    public boolean f;
    public int g;
    public long i;
    public ogn j;
    private final ocx k;
    public int a = -1;
    public nsj b = nsh.a;
    public final ocw c = new ocw(this);
    public final ByteBuffer d = ByteBuffer.allocate(5);
    public int h = -1;

    public ocy(ocx ocxVar, ofg ofgVar) {
        this.k = ocxVar;
        this.e = ofgVar;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        ohu ohuVar = (ohu) inputStream;
        ngz ngzVar = ohuVar.a;
        if (ngzVar != null) {
            int s = ngzVar.s();
            ohuVar.a.p(outputStream);
            ohuVar.a = null;
            return s;
        }
        ByteArrayInputStream byteArrayInputStream = ohuVar.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int a = (int) ohw.a(byteArrayInputStream, outputStream);
        ohuVar.c = null;
        return a;
    }

    public final void b(boolean z, boolean z2) {
        ogn ognVar = this.j;
        this.j = null;
        this.k.r(ognVar, z, z2, this.g);
        this.g = 0;
    }

    public final void c(ocv ocvVar, boolean z) {
        int i = 0;
        for (ogn ognVar : ocvVar.a) {
            i += ognVar.c;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.d.clear();
        this.d.put(z ? (byte) 1 : (byte) 0).putInt(i);
        ogn g = nxo.g(5);
        g.a(this.d.array(), 0, this.d.position());
        if (i == 0) {
            this.j = g;
            return;
        }
        this.k.r(g, false, false, this.g - 1);
        this.g = 1;
        List list = ocvVar.a;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            this.k.r((ogn) list.get(i2), false, false, 0);
        }
        this.j = (ogn) list.get(list.size() - 1);
        this.i = i;
    }

    public final void d(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            ogn ognVar = this.j;
            if (ognVar != null && ognVar.b == 0) {
                b(false, false);
            }
            if (this.j == null) {
                this.j = nxo.g(i2);
            }
            int min = Math.min(i2, this.j.b);
            this.j.a(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
