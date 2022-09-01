package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ofw  reason: default package */
/* loaded from: classes2.dex */
public final class ofw {
    public static final ohh a = new ohh(ohh.d, "https");
    public static final ohh b = new ohh(ohh.d, "http");
    public static final ohh c = new ohh(ohh.b, "POST");
    public static final ohh d = new ohh(oao.h.a, "application/grpc");
    public static final ohh e = new ohh("te", "trailers");

    static {
        new ohh(ohh.b, "GET");
    }

    public static List a(num numVar, String str, String str2, String str3, boolean z) {
        jdg.Q(numVar, "headers");
        jdg.Q(str2, "authority");
        numVar.d(oao.h);
        numVar.d(oao.i);
        numVar.d(oao.j);
        ArrayList arrayList = new ArrayList(nto.a(numVar) + 7);
        if (z) {
            arrayList.add(b);
        } else {
            arrayList.add(a);
        }
        arrayList.add(c);
        arrayList.add(new ohh(ohh.e, str2));
        arrayList.add(new ohh(ohh.c, str));
        arrayList.add(new ohh(oao.j.a, str3));
        arrayList.add(d);
        arrayList.add(e);
        byte[][] a2 = ofm.a(numVar);
        for (int i = 0; i < a2.length; i += 2) {
            ouu i2 = ouu.i(a2[i]);
            if (i2.b() != 0 && i2.a(0) != 58) {
                arrayList.add(new ohh(i2, ouu.i(a2[i + 1])));
            }
        }
        return arrayList;
    }
}
