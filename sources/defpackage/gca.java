package defpackage;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* renamed from: gca  reason: default package */
/* loaded from: classes.dex */
public final class gca implements joi {
    private static final lmz a = lmz.r("app");
    private final fwo b;
    private final String c;
    private final gsd d;

    public gca(fwo fwoVar, String str, gsd gsdVar, byte[] bArr) {
        this.b = fwoVar;
        this.c = str;
        this.d = gsdVar;
    }

    @Override // defpackage.joi
    public final jog a(ndd nddVar, mzg mzgVar, mfx mfxVar) {
        String str = nddVar.b;
        ndy ndyVar = nddVar.a;
        if (ndyVar == null) {
            ndyVar = ndy.c;
        }
        ndy ndyVar2 = ndyVar;
        ndy ndyVar3 = nddVar.c;
        if (ndyVar3 == null) {
            ndyVar3 = ndy.c;
        }
        nem n = ndyVar3.n();
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme == null || !a.contains(scheme) || uri.getFragment() != null || uri.getQuery() != null) {
                this.b.g(job.BACKGROUND_TRAINING_EXAMPLE_STORE_COLLECTION_URI_INVALID, this.c);
                throw new joh(String.format("URI invalid: appId=%s, collectionUri=%s", this.c, str));
            }
            String authority = uri.getAuthority();
            if (!"app".equals(scheme) || lfd.e(authority) || this.c.equals(authority)) {
                String rawPath = uri.getRawPath();
                if ("app".equals(scheme)) {
                    this.b.g(job.BACKGROUND_TRAINING_EXAMPLE_STORE_IN_APP_URI_USED, this.c);
                    if ("com.google.android.gms".equals(this.c)) {
                        String d = gcg.d(rawPath);
                        if (d != null) {
                            this.b.e(job.GMS_TRAINING_MODULE_HOSTED_EXAMPLE_STORE_URI_USED);
                            return this.d.b(rawPath, ndyVar2, n, mfxVar, d, mzgVar);
                        }
                        this.b.e(job.GMS_TRAINING_INVALID_EXAMPLE_STORE_URI);
                        throw new joh("invalid collection for GMS Core hosted example store, must match /<module name>/<collection name>: ".concat(String.valueOf(rawPath)));
                    }
                    return this.d.b(rawPath, ndyVar2, n, mfxVar, null, mzgVar);
                }
                throw new RuntimeException("Unexpected scheme: ".concat(scheme));
            }
            this.b.g(job.BACKGROUND_TRAINING_EXAMPLE_STORE_DISALLOWED_URI, this.c);
            throw new joh(String.format("collection_uri authority segment mismatches training task's app: %s vs %s", authority, this.c));
        } catch (URISyntaxException e) {
            this.b.g(job.BACKGROUND_TRAINING_EXAMPLE_STORE_COLLECTION_URI_INVALID, this.c);
            throw new joh(String.format("URI invalid: appId=%s, collectionUri=%s", this.c, str), e);
        }
    }
}
