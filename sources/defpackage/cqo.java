package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* renamed from: cqo  reason: default package */
/* loaded from: classes.dex */
public final class cqo {
    public Uri a;
    public String b;
    public String c;
    public Uri d;
    public lfb e;
    public String f;
    private int g;
    private int h;
    private String i;
    private Uri j;
    private Uri k;
    private String l;
    private mbr m;
    private iil n;
    private int o;
    private lls p;
    private llw q;
    private llw r;
    private byte s;

    public cqo() {
    }

    public cqo(cqp cqpVar) {
        this.e = ldu.a;
        cqi cqiVar = (cqi) cqpVar;
        this.g = cqiVar.a;
        this.h = cqiVar.b;
        this.i = cqiVar.c;
        this.a = cqiVar.d;
        this.j = cqiVar.e;
        this.k = cqiVar.f;
        this.b = cqiVar.g;
        this.c = cqiVar.h;
        this.d = cqiVar.i;
        this.e = cqiVar.j;
        this.f = cqiVar.k;
        this.l = cqiVar.l;
        this.m = cqiVar.m;
        this.n = cqiVar.n;
        this.o = cqiVar.o;
        this.q = cqiVar.p;
        this.r = cqiVar.q;
        this.s = (byte) 7;
    }

    public cqo(byte[] bArr) {
        this.e = ldu.a;
    }

    public final void b(File file) {
        if (file != null) {
            if (this.p == null) {
                if (this.q == null) {
                    this.p = llw.h();
                } else {
                    lls h = llw.h();
                    this.p = h;
                    h.j(this.q);
                    this.q = null;
                }
            }
            this.p.a(jbc.f(file), file);
        }
    }

    public final void c(String str) {
        b(str != null ? new File(str).getAbsoluteFile() : null);
    }

    public final void d(int i) {
        this.o = i;
        this.s = (byte) (this.s | 4);
    }

    public final void e(mbr mbrVar) {
        if (mbrVar != null) {
            this.m = mbrVar;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final void f(int i) {
        this.h = i;
        this.s = (byte) (this.s | 2);
    }

    public final void g(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void h(Uri uri) {
        if (uri != null) {
            this.j = uri;
            return;
        }
        throw new NullPointerException("Null imageUri");
    }

    public final void i(Uri uri) {
        if (uri != null) {
            this.k = uri;
            return;
        }
        throw new NullPointerException("Null loggableImageUri");
    }

    public final void j(iil iilVar) {
        if (iilVar != null) {
            this.n = iilVar;
            return;
        }
        throw new NullPointerException("Null networkRequestFeature");
    }

    public final void k(llw llwVar) {
        if (llwVar != null) {
            this.r = llwVar;
            return;
        }
        throw new NullPointerException("Null shareableUris");
    }

    public final void l(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null tag");
    }

    public final void m(llw llwVar) {
        if (this.p == null) {
            this.q = llwVar;
            return;
        }
        throw new IllegalStateException("Cannot set localFiles after calling localFilesBuilder()");
    }

    public final void n(int i) {
        this.g = i;
        this.s = (byte) (this.s | 1);
    }

    public final void o(File file) {
        if (file == null) {
            m(lrq.b);
        } else {
            m(llw.l(jbc.f(file), file));
        }
    }

    public final cqp a() {
        Uri uri = this.k;
        if (!(uri == null ? ldu.a : lfb.g(uri)).e()) {
            Uri uri2 = this.j;
            if (uri2 == null) {
                throw new IllegalStateException("Property \"imageUri\" has not been set");
            }
            i(uri2);
        }
        String str = this.l;
        if (str == null) {
            throw new IllegalStateException("Property \"tag\" has not been set");
        }
        l(str.intern());
        lls llsVar = this.p;
        if (llsVar != null) {
            this.q = llsVar.l();
        } else if (this.q == null) {
            this.q = lrq.b;
        }
        if (this.s != 7 || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.r == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.s & 1) == 0) {
                sb.append(" width");
            }
            if ((this.s & 2) == 0) {
                sb.append(" height");
            }
            if (this.i == null) {
                sb.append(" id");
            }
            if (this.j == null) {
                sb.append(" imageUri");
            }
            if (this.k == null) {
                sb.append(" loggableImageUri");
            }
            if (this.l == null) {
                sb.append(" tag");
            }
            if (this.m == null) {
                sb.append(" contentType");
            }
            if (this.n == null) {
                sb.append(" networkRequestFeature");
            }
            if ((this.s & 4) == 0) {
                sb.append(" backgroundColor");
            }
            if (this.r == null) {
                sb.append(" shareableUris");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        cqi cqiVar = new cqi(this.g, this.h, this.i, this.a, this.j, this.k, this.b, this.c, this.d, this.e, this.f, this.l, this.m, this.n, this.o, this.q, this.r);
        if (!jam.b) {
            return cqiVar;
        }
        if (TextUtils.isEmpty(cqiVar.c)) {
            ((ltd) ((ltd) cqp.r.c()).k("com/google/android/apps/inputmethod/libs/expression/image/Image$Builder", "build", 428, "Image.java")).w("Image has empty id: %s", cqiVar);
        }
        if (cqiVar.m != mbr.UNKNOWN_CONTENT_TYPE) {
            return cqiVar;
        }
        ((ltd) ((ltd) cqp.r.d()).k("com/google/android/apps/inputmethod/libs/expression/image/Image$Builder", "build", 431, "Image.java")).w("Image has unknown content type: %s", cqiVar);
        return cqiVar;
    }
}
