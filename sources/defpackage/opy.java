package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: opy  reason: default package */
/* loaded from: classes2.dex */
public final class opy {
    String a;
    String d;
    final List f;
    List g;
    String h;
    String b = "";
    String c = "";
    int e = -1;

    public opy() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    public static String b(String str, int i, int i2) {
        return oqs.h(opz.h(str, i, i2, false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i = this.e;
        return i != -1 ? i : opz.a(this.a);
    }

    public final opz c() {
        if (this.a != null) {
            if (this.d == null) {
                throw new IllegalStateException("host == null");
            }
            return new opz(this);
        }
        throw new IllegalStateException("scheme == null");
    }

    public final void d(String str) {
        this.g = str != null ? opz.l(opz.b(str, " \"'<>#", true, false, true, true)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01fd, code lost:
        if (r1 <= 65535) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x030c A[LOOP:2: B:33:0x0268->B:59:0x030c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.opz r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opy.e(opz, java.lang.String):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (!this.b.isEmpty() || !this.c.isEmpty()) {
            sb.append(this.b);
            if (!this.c.isEmpty()) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        if (this.e != -1 || this.a != null) {
            int a = a();
            String str3 = this.a;
            if (str3 == null || a != opz.a(str3)) {
                sb.append(':');
                sb.append(a);
            }
        }
        List list = this.f;
        int i = opz.f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) list.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            opz.p(sb, this.g);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
