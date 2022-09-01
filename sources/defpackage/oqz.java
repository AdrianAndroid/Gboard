package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oqz  reason: default package */
/* loaded from: classes2.dex */
public final class oqz {
    final String a;
    final long[] b;
    final File[] c;
    final File[] d;
    boolean e;
    oqy f;
    long g;
    final /* synthetic */ orb h;

    public oqz(orb orbVar, String str) {
        this.h = orbVar;
        this.a = str;
        int i = orbVar.d;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < orbVar.d; i2++) {
            sb.append(i2);
            this.c[i2] = new File(orbVar.c, sb.toString());
            sb.append(".tmp");
            this.d[i2] = new File(orbVar.c, sb.toString());
            sb.setLength(length);
        }
    }

    public static final IOException c(String[] strArr) {
        throw new IOException("unexpected journal line: ".concat(String.valueOf(Arrays.toString(strArr))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ora a() {
        ovp ovpVar;
        if (!Thread.holdsLock(this.h)) {
            throw new AssertionError();
        }
        ovp[] ovpVarArr = new ovp[this.h.d];
        long[] jArr = (long[]) this.b.clone();
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                orb orbVar = this.h;
                if (i2 >= orbVar.d) {
                    return new ora(orbVar, this.a, this.g, ovpVarArr);
                }
                ovpVarArr[i2] = ovb.e(this.c[i2]);
                i2++;
            } catch (FileNotFoundException unused) {
                while (true) {
                    orb orbVar2 = this.h;
                    if (i < orbVar2.d && (ovpVar = ovpVarArr[i]) != null) {
                        oqs.r(ovpVar);
                        i++;
                    } else {
                        try {
                            orbVar2.k(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ous ousVar) {
        long[] jArr;
        for (long j : this.b) {
            ousVar.X(32);
            ousVar.Z(j);
        }
    }
}
