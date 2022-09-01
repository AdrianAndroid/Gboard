package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ohm  reason: default package */
/* loaded from: classes2.dex */
public final class ohm implements Closeable {
    public final out a;
    public final ohi b;
    private final ota c;

    public ohm(out outVar) {
        this.a = outVar;
        ota otaVar = new ota(outVar, 1);
        this.c = otaVar;
        this.b = new ohi(otaVar);
    }

    public final List a(int i, short s, byte b, int i2) {
        ota otaVar = this.c;
        otaVar.d = i;
        otaVar.a = i;
        otaVar.e = s;
        otaVar.b = b;
        otaVar.c = i2;
        ohi ohiVar = this.b;
        while (!ohiVar.b.C()) {
            int d = ohiVar.b.d() & 255;
            if (d == 128) {
                throw new IOException("index == 0");
            }
            if ((d & 128) == 128) {
                int b2 = ohiVar.b(d, 127) - 1;
                if (ohi.g(b2)) {
                    ohiVar.a.add(ohk.b[b2]);
                } else {
                    int length = ohk.b.length;
                    int a = ohiVar.a(b2 - 61);
                    if (a >= 0) {
                        ohh[] ohhVarArr = ohiVar.e;
                        if (a <= ohhVarArr.length - 1) {
                            ohiVar.a.add(ohhVarArr[a]);
                        }
                    }
                    throw new IOException("Header index too large " + (b2 + 1));
                }
            } else if (d == 64) {
                ouu d2 = ohiVar.d();
                ohk.a(d2);
                ohiVar.f(new ohh(d2, ohiVar.d()));
            } else if ((d & 64) == 64) {
                ohiVar.f(new ohh(ohiVar.c(ohiVar.b(d, 63) - 1), ohiVar.d()));
            } else if ((d & 32) == 32) {
                int b3 = ohiVar.b(d, 31);
                ohiVar.d = b3;
                if (b3 >= 0 && b3 <= ohiVar.c) {
                    ohiVar.e();
                } else {
                    throw new IOException("Invalid dynamic table size update " + b3);
                }
            } else if (d == 16 || d == 0) {
                ouu d3 = ohiVar.d();
                ohk.a(d3);
                ohiVar.a.add(new ohh(d3, ohiVar.d()));
            } else {
                ohiVar.a.add(new ohh(ohiVar.c(ohiVar.b(d, 15) - 1), ohiVar.d()));
            }
        }
        ohi ohiVar2 = this.b;
        ArrayList arrayList = new ArrayList(ohiVar2.a);
        ohiVar2.a.clear();
        return arrayList;
    }

    public final void b() {
        this.a.f();
        this.a.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
