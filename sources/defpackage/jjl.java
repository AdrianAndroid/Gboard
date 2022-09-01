package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;

/* compiled from: PG */
/* renamed from: jjl  reason: default package */
/* loaded from: classes.dex */
public final class jjl implements jjk {
    private final llw a;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public jjl(boe boeVar, byte[] bArr, byte[] bArr2) {
        this.a = llw.k(boeVar.a);
    }

    final jjk a(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                throw new MalformedURLException("Could not parse URL.");
            }
            String scheme = parse.getScheme();
            if (scheme == null) {
                throw new MalformedURLException("URL contained no scheme.");
            }
            jjk jjkVar = (jjk) this.a.get(scheme);
            if (jjkVar != null) {
                return jjkVar;
            }
            jmk.c("%s: No registered downloader supports the download url scheme, scheme = %s", "MultiSchemeFileDownloader", scheme);
            nzv a = jhv.a();
            a.a = jhu.UNSUPPORTED_DOWNLOAD_URL_SCHEME;
            throw a.e();
        } catch (MalformedURLException e) {
            jmk.c("%s: The download url is malformed, url = %s", "MultiSchemeFileDownloader", str);
            nzv a2 = jhv.a();
            a2.a = jhu.MALFORMED_DOWNLOAD_URL;
            a2.c = e;
            throw a2.e();
        }
    }

    @Override // defpackage.jjk
    public final mko b(jjj jjjVar) {
        try {
            return a(jjjVar.b).b(jjjVar);
        } catch (jhv e) {
            return kcu.J(e);
        }
    }
}
