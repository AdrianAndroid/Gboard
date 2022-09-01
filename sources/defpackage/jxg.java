package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jxg  reason: default package */
/* loaded from: classes.dex */
public final class jxg implements jwu {
    private final kaw c;
    private final boolean d;
    private final kau e;
    public final jls b = jls.e();
    public final AtomicBoolean a = new AtomicBoolean(false);

    public jxg(jxd jxdVar) {
        kaw kawVar = jxdVar.c;
        jdg.u(kawVar);
        this.c = kawVar;
        this.d = jxdVar.d;
        jxf jxfVar = new jxf(this);
        this.e = jxfVar;
        kawVar.i(jxfVar);
    }

    public static jxd f() {
        return new jxd();
    }

    @Override // defpackage.jwu
    public final void a(File file) {
        kaw kawVar = this.c;
        File parentFile = file.getParentFile();
        jdg.u(parentFile);
        kawVar.e(parentFile, file.getName());
    }

    @Override // defpackage.jwu
    public final boolean b(String str) {
        try {
            String scheme = Uri.parse(str).normalizeScheme().getScheme();
            if ("http".equals(scheme)) {
                return true;
            }
            return "https".equals(scheme);
        } catch (Exception e) {
            ((luc) ((luc) ((luc) jsh.a.d()).i(e)).k("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol", "canHandle", 181, "HttpDownloadProtocol.java")).w("Exception while attemption to parse URL %s", str);
            return false;
        }
    }

    @Override // defpackage.jwu
    public final boolean c() {
        return this.a.get();
    }

    @Override // defpackage.jwu
    public final jls d() {
        return this.b;
    }

    @Override // defpackage.jwu
    public final mko e(String str, String str2, File file, jtw jtwVar, mop mopVar) {
        kap kapVar;
        mld e = mld.e();
        if (jtwVar.h(this.d)) {
            kapVar = kap.WIFI_ONLY;
        } else {
            kapVar = kap.WIFI_OR_CELLULAR;
        }
        kap kapVar2 = kapVar;
        boolean h = jtwVar.h(this.d);
        jsw e2 = jsx.e();
        e2.e(h);
        e2.c(false);
        e2.d(false);
        e2.b(false);
        jsx a = e2.a();
        ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol", "download", 110, "HttpDownloadProtocol.java")).J("Requesting download of URL %s to %s (constraints: %s)", jtq.k(str, str2), file.getName(), a);
        File parentFile = file.getParentFile();
        jdg.u(parentFile);
        String name = file.getName();
        kaq a2 = this.c.a(str2, parentFile, name, new jxc(e, str2, mopVar, file, null), new jwm(parentFile, name, new jyw(mopVar, str2, null), null));
        a2.h(kapVar2);
        a2.e();
        jsr o = ((juc) mopVar.a).o();
        jtr e3 = ((juc) mopVar.a).e();
        jrh jrhVar = (jrh) o;
        String str3 = jrhVar.a;
        long length = ((File) mopVar.b).length();
        jsf.a(str3).a(jrhVar.b, "download", Long.valueOf(length));
        ((jwr) mopVar.c).i.e.a(new jyq(o, str2, e3, length, a, 1));
        return e;
    }
}
