package defpackage;

import android.net.Uri;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: crb  reason: default package */
/* loaded from: classes.dex */
public final class crb {
    public EditorInfo a;
    public lfb b;
    public lfb c;
    public lfb d;
    private cqp e;
    private int f;
    private boolean g;
    private mcb h;
    private lfb i;
    private lfb j;
    private lfb k;
    private byte l;

    public crb() {
    }

    public crb(byte[] bArr) {
        ldu lduVar = ldu.a;
        this.i = lduVar;
        this.j = lduVar;
        this.k = lduVar;
        this.b = lduVar;
        this.c = lduVar;
        this.d = lduVar;
    }

    public final crc a() {
        cqp cqpVar;
        EditorInfo editorInfo;
        mcb mcbVar;
        if (this.l != 3 || (cqpVar = this.e) == null || (editorInfo = this.a) == null || (mcbVar = this.h) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.e == null) {
                sb.append(" image");
            }
            if ((this.l & 1) == 0) {
                sb.append(" position");
            }
            if (this.a == null) {
                sb.append(" editorInfo");
            }
            if ((this.l & 2) == 0) {
                sb.append(" incognito");
            }
            if (this.h == null) {
                sb.append(" insertResult");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        crc crcVar = new crc(cqpVar, this.f, editorInfo, this.g, mcbVar, this.i, this.j, this.k, this.b, this.c, this.d);
        if (crcVar.c()) {
            if (crcVar.f.e()) {
                if (!crcVar.e.e()) {
                    throw new IllegalStateException("Either local file or shareable uri should be presented for successful shares");
                }
            } else {
                throw new IllegalStateException("Mime-type should be provided for successful shares");
            }
        }
        return crcVar;
    }

    public final void b(boolean z) {
        this.g = z;
        this.l = (byte) (this.l | 2);
    }

    public final void c(mcb mcbVar) {
        if (mcbVar != null) {
            this.h = mcbVar;
            return;
        }
        throw new NullPointerException("Null insertResult");
    }

    public final void d(String str) {
        this.k = lfb.g(str);
    }

    public final void e(int i) {
        this.f = i;
        this.l = (byte) (this.l | 1);
    }

    public final void f(Uri uri) {
        this.j = lfb.g(uri);
    }

    public final void g(cra craVar) {
        cqp cqpVar = craVar.a;
        if (cqpVar == null) {
            throw new NullPointerException("Null image");
        }
        this.e = cqpVar;
        e(craVar.b);
        EditorInfo editorInfo = craVar.c;
        if (editorInfo != null) {
            this.a = editorInfo;
            b(craVar.d);
            if (craVar.g.e()) {
                this.b = lfb.g((String) craVar.g.a());
            }
            if (craVar.h.e()) {
                this.c = lfb.g((String) craVar.h.a());
            }
            if (!craVar.i.e()) {
                return;
            }
            this.d = lfb.g((String) craVar.i.a());
            return;
        }
        throw new NullPointerException("Null editorInfo");
    }
}
