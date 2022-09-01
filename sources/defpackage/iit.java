package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: iit  reason: default package */
/* loaded from: classes.dex */
final class iit implements opg {
    final /* synthetic */ rj a;
    final /* synthetic */ jpv b;

    public iit(rj rjVar, jpv jpvVar, byte[] bArr) {
        this.a = rjVar;
        this.b = jpvVar;
    }

    @Override // defpackage.opg
    public final void a(IOException iOException) {
        rj rjVar = this.a;
        jpv jpvVar = this.b;
        iii a = iij.a();
        a.a = iOException;
        a.e(false);
        rjVar.c(jpvVar.a(a));
    }

    @Override // defpackage.opg
    public final void b(oql oqlVar) {
        rj rjVar = this.a;
        jpv jpvVar = this.b;
        iii a = iij.a();
        a.c(oqlVar.c);
        a.e(oqlVar.d());
        opx opxVar = oqlVar.f;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int a2 = opxVar.a();
        for (int i = 0; i < a2; i++) {
            String lowerCase = opxVar.c(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(opxVar.d(i));
        }
        a.g(treeMap);
        a.d(oqlVar.i != null);
        oqn oqnVar = oqlVar.g;
        byte[] bArr = new byte[0];
        if (oqnVar != null) {
            try {
                long a3 = oqnVar.a();
                if (a3 > 2147483647L) {
                    throw new IOException("Cannot buffer entire body for content length: " + a3);
                }
                out c = oqnVar.c();
                byte[] E = c.E();
                oqs.r(c);
                if (a3 != -1) {
                    int length = E.length;
                    if (a3 != length) {
                        throw new IOException("Content-Length (" + a3 + ") and stream length (" + length + ") disagree");
                    }
                }
                bArr = E;
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) iiu.a.c()).i(e)).k("com/google/android/libraries/inputmethod/net/okhttp3/OkHttp3Client", "tryAttachBody", (char) 152, "OkHttp3Client.java")).t("Exception occurred while reading body of network response.");
                a.a = e;
            }
        }
        a.b(nem.u(bArr));
        rjVar.c(jpvVar.a(a));
    }
}
