package defpackage;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* compiled from: PG */
/* renamed from: ouc  reason: default package */
/* loaded from: classes2.dex */
final class ouc extends URLStreamHandler {
    final /* synthetic */ String a;
    final /* synthetic */ oul b;

    public ouc(oul oulVar, String str) {
        this.b = oulVar;
        this.a = str;
    }

    @Override // java.net.URLStreamHandler
    protected final int getDefaultPort() {
        if (this.a.equals("http")) {
            return 80;
        }
        if (!this.a.equals("https")) {
            throw new AssertionError();
        }
        return 443;
    }

    @Override // java.net.URLStreamHandler
    protected final URLConnection openConnection(URL url) {
        return this.b.d(url);
    }

    @Override // java.net.URLStreamHandler
    protected final URLConnection openConnection(URL url, Proxy proxy) {
        return this.b.e(url, proxy);
    }
}
