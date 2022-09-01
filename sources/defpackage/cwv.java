package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: cwv  reason: default package */
/* loaded from: classes.dex */
public final class cwv {
    public String a;
    public String b;
    private mbr c;
    private String d;
    private Uri e;
    private iil f;
    private llk g;
    private llp h;

    public final cww a() {
        mbr mbrVar;
        String str;
        Uri uri;
        iil iilVar;
        llk llkVar = this.g;
        if (llkVar != null) {
            this.h = llkVar.g();
        } else if (this.h == null) {
            this.h = llp.q();
        }
        String str2 = this.a;
        if (str2 == null || (mbrVar = this.c) == null || (str = this.d) == null || (uri = this.e) == null || (iilVar = this.f) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" imageTag");
            }
            if (this.c == null) {
                sb.append(" contentType");
            }
            if (this.d == null) {
                sb.append(" id");
            }
            if (this.e == null) {
                sb.append(" imageUri");
            }
            if (this.f == null) {
                sb.append(" networkRequestFeature");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        cww cwwVar = new cww(str2, mbrVar, str, uri, this.b, iilVar, this.h);
        if (!Uri.EMPTY.equals(cwwVar.b)) {
            if (TextUtils.isEmpty(cwwVar.a)) {
                throw new IllegalStateException("imageTag is empty");
            }
            return cwwVar;
        }
        throw new IllegalStateException("imageUri is null or empty");
    }

    public final void b(ncw ncwVar) {
        Uri uri;
        d(ncwVar.a);
        this.a = "sticker";
        int u = ndb.u(ncwVar.b);
        if (u == 0 || u != 4) {
            nco ncoVar = ncwVar.c;
            if (ncoVar != null) {
                uri = Uri.parse(ncoVar.a);
            } else {
                uri = Uri.EMPTY;
            }
            e(uri);
            f(iil.p);
            c(mbr.EXPRESSION_STICKER);
            String str = ncwVar.d;
            if (true == TextUtils.isEmpty(str)) {
                str = null;
            }
            this.b = str;
            for (ncq ncqVar : ncwVar.e) {
                for (String str2 : ncqVar.a) {
                    if (!TextUtils.isEmpty(str2)) {
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
                        this.g.h(str2);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("avatar stickers are not supported any more.");
    }

    public final void c(mbr mbrVar) {
        if (mbrVar != null) {
            this.c = mbrVar;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final void d(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void e(Uri uri) {
        if (uri != null) {
            this.e = uri;
            return;
        }
        throw new NullPointerException("Null imageUri");
    }

    public final void f(iil iilVar) {
        if (iilVar != null) {
            this.f = iilVar;
            return;
        }
        throw new NullPointerException("Null networkRequestFeature");
    }
}
