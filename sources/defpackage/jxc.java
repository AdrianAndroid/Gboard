package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jxc  reason: default package */
/* loaded from: classes.dex */
final class jxc implements kan {
    final /* synthetic */ mld a;
    final /* synthetic */ String b;
    final /* synthetic */ File c;
    final /* synthetic */ mop d;

    public jxc(mld mldVar, String str, mop mopVar, File file, byte[] bArr) {
        this.a = mldVar;
        this.b = str;
        this.d = mopVar;
        this.c = file;
    }

    @Override // defpackage.kan
    public final void a(File file, kam kamVar) {
        jxe jxeVar = new jxe(this.b, kamVar);
        this.d.b(this.b, this.c, jxeVar);
        this.a.n(jxeVar);
    }

    @Override // defpackage.kan
    public final void b(File file) {
        if (!file.exists()) {
            IOException iOException = new IOException("Downloaded file does not exist.");
            this.a.n(iOException);
            this.d.b(this.b, this.c, iOException);
            return;
        }
        this.a.c(jtx.a(this.b));
        mop mopVar = this.d;
        String str = this.b;
        File file2 = this.c;
        jsr o = ((juc) mopVar.a).o();
        jrh jrhVar = (jrh) o;
        String str2 = jrhVar.a;
        lug lugVar = jsh.a;
        jtq.k(str2, str);
        o.f();
        jtq.k(str2, Long.toString(((File) mopVar.b).length()));
        long length = file2.length();
        jsf.a(str2).b(jrhVar.b, "download_end", Long.valueOf(length));
        ((jwr) mopVar.c).i.e.a(new jwp(o, str, (juc) mopVar.a, length, 1));
    }
}
