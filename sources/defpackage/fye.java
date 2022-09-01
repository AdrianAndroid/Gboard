package defpackage;

import android.os.RemoteException;
import java.io.IOException;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* renamed from: fye  reason: default package */
/* loaded from: classes.dex */
final class fye {
    public static final mma a = fyc.b;

    public static mma a(final gal galVar, fwe fweVar, fwo fwoVar, jot jotVar) {
        try {
            if (!galVar.e()) {
                if (galVar.d()) {
                    fwoVar.e(job.HTTP_DYNAMITE_FACTORY_NOT_ENABLED_FALLBACK_USED);
                    return a;
                }
                fwoVar.e(job.HTTP_DYNAMITE_FACTORY_NOT_ENABLED_FALLBACK_NOT_USED);
                return fyc.a;
            }
            jotVar.j(galVar.f());
            if (!galVar.g()) {
                jotVar.c(-1);
            }
            galVar.c(fweVar.av());
            return new mma() { // from class: fyd
                @Override // defpackage.mma
                public final HttpURLConnection a(String str) {
                    try {
                        return (HttpURLConnection) ftl.c(gal.this.b(str));
                    } catch (RemoteException e) {
                        throw new IOException(e);
                    }
                }
            };
        } catch (RemoteException e) {
            throw new IllegalStateException("unexpected RemoteException", e);
        }
    }
}
