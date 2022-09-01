package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: kpu  reason: default package */
/* loaded from: classes.dex */
public abstract class kpu implements kpt {
    protected Uri a(Uri uri) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Uri b(Uri uri) {
        throw null;
    }

    protected abstract kpt c();

    @Override // defpackage.kpt
    public /* synthetic */ File d(Uri uri) {
        throw null;
    }

    @Override // defpackage.kpt
    public InputStream e(Uri uri) {
        throw null;
    }

    @Override // defpackage.kpt
    public boolean g(Uri uri) {
        throw null;
    }

    @Override // defpackage.kpt
    public final void i(Uri uri) {
        c().i(b(uri));
    }

    @Override // defpackage.kpt
    public final void j(Uri uri) {
        c().j(b(uri));
    }

    @Override // defpackage.kpt
    public final void k(Uri uri) {
        c().k(b(uri));
    }

    @Override // defpackage.kpt
    public final void l(Uri uri, Uri uri2) {
        c().l(b(uri), b(uri2));
    }

    @Override // defpackage.kpt
    public final boolean m(Uri uri) {
        return c().m(b(uri));
    }

    @Override // defpackage.kpt
    public final long p(Uri uri) {
        return c().p(b(uri));
    }

    @Override // defpackage.kpt
    public final OutputStream q(Uri uri) {
        return c().q(b(uri));
    }

    @Override // defpackage.kpt
    public final OutputStream r(Uri uri) {
        return c().r(b(uri));
    }

    @Override // defpackage.kpt
    public final Iterable s(Uri uri) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : c().s(b(uri))) {
            arrayList.add(a(uri2));
        }
        return arrayList;
    }
}
