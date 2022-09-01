package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: obg  reason: default package */
/* loaded from: classes2.dex */
public final class obg {
    private static final Logger a = Logger.getLogger(obg.class.getName());

    private obg() {
    }

    public static Object a(String str) {
        mov movVar = new mov(new StringReader(str));
        try {
            return b(movVar);
        } finally {
            try {
                movVar.close();
            } catch (IOException e) {
                a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e);
            }
        }
    }

    private static Object b(mov movVar) {
        double parseDouble;
        jdg.G(movVar.n(), "unexpected end of JSON");
        int p = movVar.p() - 1;
        boolean z = true;
        if (p == 0) {
            movVar.j();
            ArrayList arrayList = new ArrayList();
            while (movVar.n()) {
                arrayList.add(b(movVar));
            }
            if (movVar.p() != 2) {
                z = false;
            }
            jdg.G(z, "Bad token: ".concat(movVar.d()));
            movVar.l();
            return Collections.unmodifiableList(arrayList);
        } else if (p == 2) {
            movVar.k();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (movVar.n()) {
                linkedHashMap.put(movVar.f(), b(movVar));
            }
            if (movVar.p() != 4) {
                z = false;
            }
            jdg.G(z, "Bad token: ".concat(movVar.d()));
            movVar.m();
            return Collections.unmodifiableMap(linkedHashMap);
        } else if (p == 5) {
            return movVar.h();
        } else {
            if (p != 6) {
                if (p == 7) {
                    return Boolean.valueOf(movVar.o());
                }
                if (p == 8) {
                    int i = movVar.d;
                    if (i == 0) {
                        i = movVar.a();
                    }
                    if (i == 7) {
                        movVar.d = 0;
                        int[] iArr = movVar.i;
                        int i2 = movVar.h - 1;
                        iArr[i2] = iArr[i2] + 1;
                        return null;
                    }
                    throw new IllegalStateException("Expected null but was " + ((Object) msc.h(movVar.p())) + movVar.e());
                }
                throw new IllegalStateException("Bad token: ".concat(movVar.d()));
            }
            int i3 = movVar.d;
            if (i3 == 0) {
                i3 = movVar.a();
            }
            if (i3 == 15) {
                movVar.d = 0;
                int[] iArr2 = movVar.i;
                int i4 = movVar.h - 1;
                iArr2[i4] = iArr2[i4] + 1;
                parseDouble = movVar.e;
            } else {
                if (i3 == 16) {
                    char[] cArr = movVar.b;
                    int i5 = movVar.c;
                    int i6 = movVar.f;
                    movVar.g = new String(cArr, i5, i6);
                    movVar.c = i5 + i6;
                } else if (i3 == 8 || i3 == 9) {
                    movVar.g = movVar.g(i3 == 8 ? '\'' : '\"');
                } else if (i3 == 10) {
                    movVar.g = movVar.i();
                } else if (i3 != 11) {
                    throw new IllegalStateException("Expected a double but was " + ((Object) msc.h(movVar.p())) + movVar.e());
                }
                movVar.d = 11;
                parseDouble = Double.parseDouble(movVar.g);
                if (movVar.a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                    movVar.g = null;
                    movVar.d = 0;
                    int[] iArr3 = movVar.i;
                    int i7 = movVar.h - 1;
                    iArr3[i7] = iArr3[i7] + 1;
                } else {
                    throw new mow("JSON forbids NaN and infinities: " + parseDouble + movVar.e());
                }
            }
            return Double.valueOf(parseDouble);
        }
    }
}
