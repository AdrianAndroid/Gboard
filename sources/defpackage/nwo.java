package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.ListView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: nwo  reason: default package */
/* loaded from: classes2.dex */
public final class nwo {
    public final int a;
    public final Object b;
    public final Object c;

    public nwo(Context context, deb debVar, int i, int i2, int i3) {
        this.b = context;
        this.c = new def(context, debVar, i3, i);
        this.a = i2;
    }

    public nwo(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.c = colorStateList;
        this.b = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }

    public nwo(foq foqVar, int i, fnz fnzVar) {
        this.c = foqVar;
        this.a = i;
        this.b = fnzVar;
    }

    public nwo(String str, int i, String str2) {
        this.b = str;
        this.a = i;
        this.c = str2;
    }

    public nwo(lm lmVar, gm gmVar, int i) {
        this.b = lmVar;
        this.c = gmVar;
        this.a = i;
    }

    public final dee a(int i) {
        dee deeVar = new dee((Context) this.b, i, this.a, (def) this.c);
        deeVar.setOrientation(1);
        return deeVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final String b(String str, String str2) {
        ?? r0 = this.b;
        int size = r0.size();
        int i = 0;
        while (i < size) {
            bme bmeVar = (bme) r0.get(i);
            i++;
            if (bmeVar.a.equalsIgnoreCase(str)) {
                return bmeVar.b;
            }
        }
        return str2;
    }

    public final boolean c() {
        if (b("Location", null) != null) {
            int i = this.a;
            return i == 302 || i == 301 || i == 307 || i == 308;
        }
        return false;
    }

    public final ListView d() {
        return ((lg) this.b).e;
    }

    public nwo(int i, String str, List list, List list2) {
        this.a = i;
        this.c = str;
        this.b = llp.o(list);
        if (list2 != null) {
            llp.o(list2);
        } else {
            llp.q();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public nwo(int r7, java.lang.String r8, java.util.Map r9) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L11:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            if (r2 == 0) goto L11
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            bme r4 = new bme
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r4.<init>(r5, r3)
            r0.add(r4)
            goto L2d
        L48:
            r9 = 0
            r6.<init>(r7, r8, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwo.<init>(int, java.lang.String, java.util.Map):void");
    }

    public nwo(int i, oqv oqvVar, byte[] bArr) {
        this.a = i;
        this.b = oqvVar;
        this.c = new ConcurrentHashMap(8);
    }
}
