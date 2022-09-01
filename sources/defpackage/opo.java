package defpackage;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: opo  reason: default package */
/* loaded from: classes2.dex */
public final class opo {
    private static final Pattern d = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern e = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern f = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern g = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final String c;
    private final long h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private opo(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.h = j;
        this.c = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    public opo(opn opnVar) {
        Object obj = opnVar.b;
        if (obj != null) {
            Object obj2 = opnVar.c;
            if (obj2 != null) {
                Object obj3 = opnVar.d;
                if (obj3 != null) {
                    this.a = (String) obj;
                    this.b = (String) obj2;
                    this.h = 253402300799999L;
                    this.c = (String) obj3;
                    this.i = (String) opnVar.e;
                    this.j = false;
                    this.k = opnVar.a;
                    this.l = false;
                    this.m = false;
                    return;
                }
                throw new NullPointerException("builder.domain == null");
            }
            throw new NullPointerException("builder.value == null");
        }
        throw new NullPointerException("builder.name == null");
    }

    public static List a(opz opzVar, opx opxVar) {
        List e2 = opxVar.e("Set-Cookie");
        int size = e2.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            opo b = b(opzVar, (String) e2.get(i));
            if (b != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(b);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01cc, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d4, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01dc, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02ec, code lost:
        if (defpackage.oqs.x(r0) == false) goto L172;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.opo b(defpackage.opz r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opo.b(opz, java.lang.String):opo");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[LOOP:0: B:1:0x0000->B:10:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int c(java.lang.String r3, int r4, int r5, boolean r6) {
        /*
        L0:
            if (r4 >= r5) goto L3d
            char r0 = r3.charAt(r4)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto L11
            r1 = 9
            if (r0 != r1) goto L34
            r0 = 9
        L11:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L34
            r1 = 48
            if (r0 < r1) goto L1d
            r1 = 57
            if (r0 <= r1) goto L34
        L1d:
            r1 = 97
            if (r0 < r1) goto L25
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 <= r1) goto L34
        L25:
            r1 = 65
            if (r0 < r1) goto L2d
            r1 = 90
            if (r0 <= r1) goto L34
        L2d:
            r1 = 58
            if (r0 != r1) goto L32
            goto L34
        L32:
            r0 = 0
            goto L35
        L34:
            r0 = 1
        L35:
            r1 = r6 ^ 1
            if (r0 != r1) goto L3a
            return r4
        L3a:
            int r4 = r4 + 1
            goto L0
        L3d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opo.c(java.lang.String, int, int, boolean):int");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof opo)) {
            return false;
        }
        opo opoVar = (opo) obj;
        return opoVar.a.equals(this.a) && opoVar.b.equals(this.b) && opoVar.c.equals(this.c) && opoVar.i.equals(this.i) && opoVar.h == this.h && opoVar.j == this.j && opoVar.k == this.k && opoVar.l == this.l && opoVar.m == this.m;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.i.hashCode();
        long j = this.h;
        return ((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + (!this.j ? 1 : 0)) * 31) + (!this.k ? 1 : 0)) * 31) + (!this.l ? 1 : 0)) * 31) + (!this.m ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.l) {
            if (this.h == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) orp.a.get()).format(new Date(this.h)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.c);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
