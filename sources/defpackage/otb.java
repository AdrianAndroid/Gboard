package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: otb  reason: default package */
/* loaded from: classes2.dex */
public final class otb implements Closeable {
    static final Logger a = Logger.getLogger(osi.class.getName());
    public final out b;
    final osf c;
    private final ota d;

    public otb(out outVar) {
        this.b = outVar;
        ota otaVar = new ota(outVar, 0);
        this.d = otaVar;
        this.c = new osf(otaVar);
    }

    static int a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw osi.a("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(out outVar) {
        return (outVar.d() & 255) | ((outVar.d() & 255) << 16) | ((outVar.d() & 255) << 8);
    }

    private final List d(int i, short s, byte b, int i2) {
        ota otaVar = this.d;
        otaVar.d = i;
        otaVar.a = i;
        otaVar.e = s;
        otaVar.b = b;
        otaVar.c = i2;
        osf osfVar = this.c;
        while (!osfVar.b.C()) {
            int d = osfVar.b.d() & 255;
            if (d == 128) {
                throw new IOException("index == 0");
            }
            if ((d & 128) == 128) {
                int b2 = osfVar.b(d, 127) - 1;
                if (osf.h(b2)) {
                    osfVar.a.add(osh.a[b2]);
                } else {
                    int length = osh.a.length;
                    int a2 = osfVar.a(b2 - 61);
                    if (a2 >= 0) {
                        ose[] oseVarArr = osfVar.d;
                        if (a2 < oseVarArr.length) {
                            osfVar.a.add(oseVarArr[a2]);
                        }
                    }
                    throw new IOException("Header index too large " + (b2 + 1));
                }
            } else if (d == 64) {
                ouu d2 = osfVar.d();
                osh.a(d2);
                osfVar.g(new ose(d2, osfVar.d()));
            } else if ((d & 64) == 64) {
                osfVar.g(new ose(osfVar.c(osfVar.b(d, 63) - 1), osfVar.d()));
            } else if ((d & 32) == 32) {
                int b3 = osfVar.b(d, 31);
                osfVar.c = b3;
                if (b3 < 0 || b3 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + b3);
                }
                int i3 = osfVar.g;
                if (b3 < i3) {
                    if (b3 == 0) {
                        osfVar.e();
                    } else {
                        osfVar.f(i3 - b3);
                    }
                }
            } else if (d == 16 || d == 0) {
                ouu d3 = osfVar.d();
                osh.a(d3);
                osfVar.a.add(new ose(d3, osfVar.d()));
            } else {
                osfVar.a.add(new ose(osfVar.c(osfVar.b(d, 15) - 1), osfVar.d()));
            }
        }
        osf osfVar2 = this.c;
        ArrayList arrayList = new ArrayList(osfVar2.a);
        osfVar2.a.clear();
        return arrayList;
    }

    private final void e() {
        this.b.f();
        this.b.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:333:0x04ed, code lost:
        if (r4 == 0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x04ef, code lost:
        r2.f();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(boolean r18, defpackage.osy r19) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otb.c(boolean, osy):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
