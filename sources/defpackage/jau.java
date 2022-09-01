package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: jau  reason: default package */
/* loaded from: classes.dex */
public final class jau {
    int a;
    public String b;
    String c;
    String d;
    public String e;
    public final List f;
    public final List g;
    public final List h;
    public final StringBuilder i;
    private final obc j;

    public jau(byte[] bArr) {
        this();
        this.j = new obc();
        this.i = new StringBuilder();
    }

    private final int i() {
        if (this.b != null) {
            return 0;
        }
        if (this.e != null) {
            if (this.f.isEmpty() && this.c == null && this.d == null && this.g.isEmpty() && this.h.isEmpty()) {
                return 1;
            }
            throw new IllegalArgumentException("Invalid private use tag, other subtag is not empty");
        }
        throw new IllegalArgumentException("Missing subtags to form a valid language tag");
    }

    private final jav j(String str) {
        if (str.isEmpty()) {
            return jav.d;
        }
        jav javVar = new jav(this, str);
        synchronized (jav.a) {
            jav javVar2 = (jav) jav.a.put(str, javVar);
            if (javVar2 != null) {
                jav.a.put(str, javVar2);
                javVar = javVar2;
            }
        }
        return javVar;
    }

    public final jav a() {
        if (this.b == null || this.f.isEmpty() || this.b.length() == 2 || this.b.length() == 3) {
            int i = this.a;
            if (i == -1 || i == i()) {
                Collections.sort(this.h);
                String c = c();
                if (this.a == -1 && !TextUtils.isEmpty(c)) {
                    this.a = i();
                }
                return j(c);
            }
            int i2 = this.a;
            int i3 = i();
            throw new IllegalArgumentException("Language tag type is set to " + i2 + " but determined result is " + i3);
        }
        throw new IllegalArgumentException("extlang subtag only occurs when language subtag length is 2 or 3");
    }

    public final jav b(String str) {
        if (TextUtils.isEmpty(str)) {
            return jav.d;
        }
        f(str);
        return j(new String((char[]) this.j.c));
    }

    public final String c() {
        this.i.setLength(0);
        if (this.b != null) {
            StringBuilder sb = this.i;
            sb.append('-');
            sb.append(this.b);
        }
        for (String str : this.f) {
            StringBuilder sb2 = this.i;
            sb2.append('-');
            sb2.append(str);
        }
        if (this.c != null) {
            StringBuilder sb3 = this.i;
            sb3.append('-');
            sb3.append(this.c);
        }
        if (this.d != null) {
            StringBuilder sb4 = this.i;
            sb4.append('-');
            sb4.append(this.d);
        }
        for (String str2 : this.g) {
            StringBuilder sb5 = this.i;
            sb5.append('-');
            sb5.append(str2);
        }
        for (String str3 : this.h) {
            StringBuilder sb6 = this.i;
            sb6.append('-');
            sb6.append(str3);
        }
        if (this.e != null) {
            StringBuilder sb7 = this.i;
            sb7.append('-');
            sb7.append(this.e);
        }
        return this.i.length() > 0 ? this.i.substring(1) : "";
    }

    public final boolean d() {
        if (!TextUtils.isEmpty(this.e)) {
            String str = this.e;
            String substring = str.substring(0, str.lastIndexOf(45));
            this.e = substring;
            if ("x".equals(substring)) {
                this.e = null;
            }
            return true;
        } else if (!this.h.isEmpty()) {
            List list = this.h;
            list.remove(list.size() - 1);
            return true;
        } else if (!this.g.isEmpty()) {
            List list2 = this.g;
            list2.remove(list2.size() - 1);
            return true;
        } else if (!TextUtils.isEmpty(this.d)) {
            this.d = null;
            return true;
        } else if (!TextUtils.isEmpty(this.c)) {
            this.c = null;
            return true;
        } else {
            this.b = null;
            return false;
        }
    }

    public final void e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else if (!jav.z(str)) {
            throw new IllegalArgumentException("Invalid language subtag: ".concat(str));
        } else {
            str2 = jbs.c(str);
        }
        this.b = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c2, code lost:
        r13.h.add(new java.lang.String((char[]) r2.c, r6, r0 - r6));
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023a A[Catch: RuntimeException -> 0x02a6, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x02a6, blocks: (B:5:0x002a, B:8:0x003b, B:12:0x004a, B:14:0x0052, B:17:0x0061, B:19:0x0067, B:21:0x006f, B:23:0x0077, B:26:0x0088, B:28:0x008c, B:32:0x0095, B:33:0x009c, B:35:0x009d, B:37:0x00a4, B:39:0x00ac, B:41:0x00b4, B:42:0x00cd, B:44:0x00d3, B:46:0x00db, B:49:0x00f8, B:51:0x00e6, B:53:0x00e9, B:59:0x010c, B:61:0x0112, B:64:0x011d, B:68:0x015a, B:131:0x0128, B:133:0x0133, B:135:0x0140, B:137:0x014d, B:71:0x0168, B:73:0x016e, B:75:0x0176, B:77:0x0180, B:80:0x018c, B:81:0x0191, B:83:0x0197, B:86:0x01a1, B:88:0x01a9, B:91:0x01b4, B:93:0x01bb, B:98:0x01c2, B:100:0x01d3, B:101:0x01eb, B:106:0x01ec, B:107:0x0208, B:109:0x0209, B:110:0x0225, B:112:0x0226, B:113:0x0232, B:116:0x023a, B:118:0x023e, B:119:0x0254, B:120:0x0255, B:121:0x0277, B:122:0x0278, B:126:0x0289, B:127:0x029d, B:150:0x022a, B:152:0x0230, B:153:0x029e, B:154:0x02a5), top: B:4:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0278 A[Catch: RuntimeException -> 0x02a6, TryCatch #0 {RuntimeException -> 0x02a6, blocks: (B:5:0x002a, B:8:0x003b, B:12:0x004a, B:14:0x0052, B:17:0x0061, B:19:0x0067, B:21:0x006f, B:23:0x0077, B:26:0x0088, B:28:0x008c, B:32:0x0095, B:33:0x009c, B:35:0x009d, B:37:0x00a4, B:39:0x00ac, B:41:0x00b4, B:42:0x00cd, B:44:0x00d3, B:46:0x00db, B:49:0x00f8, B:51:0x00e6, B:53:0x00e9, B:59:0x010c, B:61:0x0112, B:64:0x011d, B:68:0x015a, B:131:0x0128, B:133:0x0133, B:135:0x0140, B:137:0x014d, B:71:0x0168, B:73:0x016e, B:75:0x0176, B:77:0x0180, B:80:0x018c, B:81:0x0191, B:83:0x0197, B:86:0x01a1, B:88:0x01a9, B:91:0x01b4, B:93:0x01bb, B:98:0x01c2, B:100:0x01d3, B:101:0x01eb, B:106:0x01ec, B:107:0x0208, B:109:0x0209, B:110:0x0225, B:112:0x0226, B:113:0x0232, B:116:0x023a, B:118:0x023e, B:119:0x0254, B:120:0x0255, B:121:0x0277, B:122:0x0278, B:126:0x0289, B:127:0x029d, B:150:0x022a, B:152:0x0230, B:153:0x029e, B:154:0x02a5), top: B:4:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jau.f(java.lang.String):void");
    }

    public final void g(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else if (!jav.B(str)) {
            throw new IllegalArgumentException("Invalid region subtag: ".concat(str));
        } else {
            str2 = jbs.e(str);
        }
        this.d = str2;
    }

    public final void h(String str) {
        if (str != null) {
            Parcelable.Creator creator = jav.CREATOR;
            if (str.length() != 4 || !jav.s(str)) {
                throw new IllegalArgumentException("Invalid script subtag: ".concat(str));
            }
            str = jbs.d(str);
        }
        this.c = str;
    }

    public jau(jav javVar) {
        this();
        this.j = new obc();
        this.i = new StringBuilder();
        this.a = javVar.f;
        this.b = javVar.g;
        this.c = javVar.i;
        this.d = javVar.j;
        this.e = javVar.m;
        this.f.addAll(Arrays.asList(javVar.h));
        this.g.addAll(Arrays.asList(javVar.k));
        this.h.addAll(Arrays.asList(javVar.l));
    }

    public jau() {
        this.a = -1;
        this.f = new ArrayList(3);
        this.g = new ArrayList();
        this.h = new ArrayList();
    }
}
