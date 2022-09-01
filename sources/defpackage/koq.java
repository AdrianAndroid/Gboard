package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: koq  reason: default package */
/* loaded from: classes.dex */
public final class koq extends kpu {
    private final Context a;
    private String d;
    private final Object c = new Object();
    private final kpt b = new kou(null);

    public koq(kdg kdgVar, byte[] bArr, byte[] bArr2) {
        this.a = (Context) kdgVar.a;
    }

    public static kdg h(Context context) {
        return new kdg(context);
    }

    private final boolean n(Uri uri) {
        return !TextUtils.isEmpty(uri.getAuthority()) && !this.a.getPackageName().equals(uri.getAuthority());
    }

    private static final void o() {
        throw new kow("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.kpu
    protected final Uri a(Uri uri) {
        try {
            kor a = kos.a(this.a);
            a.b(uri.getPath());
            return a.a();
        } catch (IllegalArgumentException e) {
            throw new koy(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kpu
    public final Uri b(Uri uri) {
        if (n(uri)) {
            throw new koy("Operation across authorities is not allowed.");
        }
        File d = d(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
        llk e = llp.e();
        path.path(d.getAbsolutePath());
        return kqn.f(path, e);
    }

    @Override // defpackage.kpu
    protected final kpt c() {
        return this.b;
    }

    @Override // defpackage.kpu, defpackage.kpt
    public final File d(Uri uri) {
        String str;
        if (!n(uri)) {
            File h = kqn.h(uri, this.a);
            if (!gkm.d(this.a)) {
                synchronized (this.c) {
                    if (this.d == null) {
                        this.d = kki.d(this.a).getAbsolutePath();
                    }
                    str = this.d;
                }
                if (!h.getAbsolutePath().startsWith(str)) {
                    throw new kow("Cannot access credential-protected data from direct boot");
                }
            }
            return h;
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    @Override // defpackage.kpu, defpackage.kpt
    public final InputStream e(Uri uri) {
        if (!n(uri)) {
            return this.b.e(b(uri));
        }
        o();
        throw null;
    }

    @Override // defpackage.kpt
    public final String f() {
        return "android";
    }

    @Override // defpackage.kpu, defpackage.kpt
    public final boolean g(Uri uri) {
        if (!n(uri)) {
            return this.b.g(b(uri));
        }
        o();
        throw null;
    }
}
