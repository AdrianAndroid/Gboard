package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* renamed from: cxb  reason: default package */
/* loaded from: classes.dex */
public final class cxb {
    public String a;
    public int b;
    private String c;
    private Uri d;
    private String e;
    private iil f;
    private llk g;
    private llp h;
    private String i;

    private static void i(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalStateException(str2);
    }

    public final cxc a() {
        int i;
        Uri uri;
        String str;
        iil iilVar;
        String str2;
        Uri uri2 = Uri.EMPTY;
        Uri uri3 = this.d;
        if (uri3 == null) {
            throw new IllegalStateException("Property \"imageUri\" has not been set");
        }
        if (uri2.equals(uri3)) {
            llp g = b().g();
            if (!g.isEmpty()) {
                f(((cww) g.get(0)).b);
            }
        }
        llk llkVar = this.g;
        if (llkVar != null) {
            this.h = llkVar.g();
        } else if (this.h == null) {
            this.h = llp.q();
        }
        String str3 = this.c;
        if (str3 == null || (i = this.b) == 0 || (uri = this.d) == null || (str = this.e) == null || (iilVar = this.f) == null || (str2 = this.i) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" id");
            }
            if (this.b == 0) {
                sb.append(" tab");
            }
            if (this.d == null) {
                sb.append(" imageUri");
            }
            if (this.e == null) {
                sb.append(" author");
            }
            if (this.f == null) {
                sb.append(" networkRequestFeature");
            }
            if (this.i == null) {
                sb.append(" categoryName");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        cxc cxcVar = new cxc(str3, i, uri, str, this.a, iilVar, this.h, str2);
        i(cxcVar.b, "id is empty");
        if (!Uri.EMPTY.equals(cxcVar.c)) {
            i(cxcVar.h, "categoryName is empty");
            if (cxcVar.g.isEmpty()) {
                throw new IllegalStateException("stickers is empty");
            }
            return cxcVar;
        }
        throw new IllegalStateException("imageUri is null or empty");
    }

    public final llk b() {
        if (this.g == null) {
            if (this.h == null) {
                this.g = llp.e();
            } else {
                llk e = llp.e();
                this.g = e;
                e.j(this.h);
                this.h = null;
            }
        }
        return this.g;
    }

    public final void c(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null author");
    }

    public final void d(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null categoryName");
    }

    public final void e(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void f(Uri uri) {
        if (uri != null) {
            this.d = uri;
            return;
        }
        throw new NullPointerException("Null imageUri");
    }

    public final void g(iil iilVar) {
        if (iilVar != null) {
            this.f = iilVar;
            return;
        }
        throw new NullPointerException("Null networkRequestFeature");
    }

    public final void h(List list) {
        if (this.g != null) {
            throw new IllegalStateException("Cannot set stickers after calling stickersBuilder()");
        }
        this.h = llp.o(list);
    }
}
