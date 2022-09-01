package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: PG */
/* renamed from: ouy  reason: default package */
/* loaded from: classes2.dex */
public final class ouy implements ovp {
    private byte a;
    private final ovj b;
    private final Inflater c;
    private final ouz d;
    private final CRC32 e = new CRC32();

    public ouy(ovp ovpVar) {
        oll.e(ovpVar, "source");
        ovj ovjVar = new ovj(ovpVar);
        this.b = ovjVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new ouz(ovjVar, inflater);
    }

    private final void c(our ourVar, long j, long j2) {
        int i;
        ovk ovkVar = ourVar.a;
        oll.b(ovkVar);
        while (true) {
            long j3 = ovkVar.c - ovkVar.b;
            if (j >= j3) {
                j -= j3;
                ovkVar = ovkVar.f;
                oll.b(ovkVar);
            }
        }
        while (j2 > 0) {
            int min = (int) Math.min(ovkVar.c - i, j2);
            this.e.update(ovkVar.a, (int) (ovkVar.b + j), min);
            j2 -= min;
            ovkVar = ovkVar.f;
            oll.b(ovkVar);
            j = 0;
        }
    }

    private static final void d(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        oll.d(format, "format(this, *args)");
        throw new IOException(format);
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return this.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
        if (r0 == 2) goto L45;
     */
    @Override // defpackage.ovp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.our r20, long r21) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouy.b(our, long):long");
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
