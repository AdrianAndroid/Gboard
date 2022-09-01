package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: ari  reason: default package */
/* loaded from: classes.dex */
public final class ari {
    private static final azp b = azp.k("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static final azp a = azp.k("id", "layers", "w", "h", "p", "u");
    private static final azp c = azp.k("list");
    private static final azp d = azp.k("cm", "tm", "dr");

    public static amp a(arw arwVar) {
        HashMap hashMap;
        ArrayList arrayList;
        qw qwVar;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        HashMap hashMap2;
        ArrayList arrayList2;
        float a2 = ash.a();
        qs qsVar = new qs();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        qw qwVar2 = new qw();
        amp ampVar = new amp();
        arwVar.i();
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (arwVar.o()) {
            float f6 = f5;
            int i6 = 1;
            switch (arwVar.r(b)) {
                case 0:
                    i4 = arwVar.b();
                    f5 = f6;
                case 1:
                    i5 = arwVar.b();
                    f5 = f6;
                case 2:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f3 = (float) arwVar.a();
                    f5 = f6;
                    hashMap5 = hashMap2;
                    arrayList4 = arrayList2;
                case 3:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f4 = ((float) arwVar.a()) - 0.01f;
                    f5 = f6;
                    hashMap5 = hashMap2;
                    arrayList4 = arrayList2;
                case 4:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f5 = (float) arwVar.a();
                    hashMap5 = hashMap2;
                    arrayList4 = arrayList2;
                case 5:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    qwVar = qwVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    String[] split = arwVar.g().split("\\.");
                    if (!ash.k(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                        ampVar.d("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    qwVar2 = qwVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 6:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    qwVar = qwVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    arwVar.h();
                    int i7 = 0;
                    while (arwVar.o()) {
                        aqi b2 = arh.b(arwVar, ampVar);
                        if (b2.t == 3) {
                            i7++;
                        }
                        arrayList3.add(b2);
                        qsVar.j(b2.d, b2);
                        if (i7 > 4) {
                            asa.a("You have " + i7 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    arwVar.j();
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    qwVar2 = qwVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 7:
                    arwVar.h();
                    while (arwVar.o()) {
                        ArrayList arrayList5 = new ArrayList();
                        qs qsVar2 = new qs();
                        arwVar.i();
                        ArrayList arrayList6 = arrayList4;
                        qw qwVar3 = qwVar2;
                        float f7 = f4;
                        String str = null;
                        String str2 = null;
                        int i8 = 0;
                        HashMap hashMap6 = hashMap5;
                        int i9 = 0;
                        while (arwVar.o()) {
                            float f8 = f3;
                            int r = arwVar.r(a);
                            if (r != 0) {
                                int i10 = i5;
                                if (r != 1) {
                                    if (r == 2) {
                                        i8 = arwVar.b();
                                    } else if (r == 3) {
                                        i9 = arwVar.b();
                                    } else if (r != 4) {
                                        if (r == 5) {
                                            arwVar.g();
                                        } else {
                                            arwVar.m();
                                            arwVar.n();
                                        }
                                        i3 = i4;
                                    } else {
                                        str = arwVar.g();
                                    }
                                    f3 = f8;
                                    i5 = i10;
                                } else {
                                    arwVar.h();
                                    while (arwVar.o()) {
                                        aqi b3 = arh.b(arwVar, ampVar);
                                        qsVar2.j(b3.d, b3);
                                        arrayList5.add(b3);
                                        i4 = i4;
                                    }
                                    i3 = i4;
                                    arwVar.j();
                                }
                                f3 = f8;
                                i5 = i10;
                                i4 = i3;
                            } else {
                                str2 = arwVar.g();
                                f3 = f8;
                            }
                        }
                        float f9 = f3;
                        int i11 = i4;
                        int i12 = i5;
                        arwVar.k();
                        if (str != null) {
                            amz amzVar = new amz(i8, i9, str2, str);
                            hashMap4.put(amzVar.c, amzVar);
                        } else {
                            hashMap3.put(str2, arrayList5);
                        }
                        hashMap5 = hashMap6;
                        arrayList4 = arrayList6;
                        qwVar2 = qwVar3;
                        f4 = f7;
                        f3 = f9;
                        i5 = i12;
                        i4 = i11;
                    }
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    qwVar = qwVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    arwVar.j();
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    qwVar2 = qwVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 8:
                    arwVar.i();
                    while (arwVar.o()) {
                        if (arwVar.r(c) == 0) {
                            arwVar.h();
                            while (arwVar.o()) {
                                fws a3 = ara.a(arwVar);
                                hashMap5.put(a3.c, a3);
                            }
                            arwVar.j();
                        } else {
                            arwVar.m();
                            arwVar.n();
                        }
                    }
                    arwVar.k();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    qwVar = qwVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    qwVar2 = qwVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 9:
                    arwVar.h();
                    while (arwVar.o()) {
                        aoy a4 = aqz.a(arwVar, ampVar);
                        qwVar2.h(a4.hashCode(), a4);
                    }
                    arwVar.j();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    qwVar = qwVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    qwVar2 = qwVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 10:
                    arwVar.h();
                    while (arwVar.o()) {
                        arwVar.i();
                        while (arwVar.o()) {
                            int r2 = arwVar.r(d);
                            if (r2 == 0) {
                                arwVar.g();
                            } else if (r2 == i6) {
                                arwVar.a();
                            } else if (r2 == 2) {
                                arwVar.a();
                            } else {
                                arwVar.m();
                                arwVar.n();
                            }
                            i6 = 1;
                        }
                        arwVar.k();
                        arrayList4.add(new wr());
                        i6 = 1;
                    }
                    arwVar.j();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    qwVar = qwVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    qwVar2 = qwVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                default:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    qwVar = qwVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    arwVar.m();
                    arwVar.n();
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    qwVar2 = qwVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
            }
        }
        ampVar.g = new Rect(0, 0, (int) (i4 * a2), (int) (i5 * a2));
        ampVar.h = f3;
        ampVar.i = f4;
        ampVar.j = f5;
        ampVar.f = arrayList3;
        ampVar.e = qsVar;
        ampVar.a = hashMap3;
        ampVar.b = hashMap4;
        ampVar.d = qwVar2;
        ampVar.c = hashMap5;
        return ampVar;
    }
}
