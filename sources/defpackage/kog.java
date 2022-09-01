package defpackage;

import java.io.File;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: kog  reason: default package */
/* loaded from: classes.dex */
public final class kog {
    public final koh a;
    public final Object b = new Object();
    public final Object c = new Object();
    public kof d;
    public kof e;

    public kog(koh kohVar) {
        this.a = kohVar;
    }

    public static final void e() {
        throw new IllegalStateException("metadataVersion == null. ExpressiveStickerClient#maybeSyncWithServer() must be invoked first.");
    }

    public final mko a(String str, Locale locale, ncx ncxVar) {
        String g = kfl.g(str, locale, ncxVar);
        synchronized (this.b) {
            if (kfl.h(this.d, g)) {
                return mio.g(this.d.a(), knm.c, mjl.a);
            }
            kof kofVar = this.d;
            if (kofVar != null) {
                kofVar.c();
            }
            this.d = new kof(this.a, str, locale, ncxVar);
            c(str);
            return mio.g(this.d.a(), knm.d, mjl.a);
        }
    }

    public final String b() {
        String str;
        synchronized (this.b) {
            kof kofVar = this.d;
            str = kofVar == null ? null : kofVar.c;
        }
        return str;
    }

    public final void c(String str) {
        ((knn) this.a).e.b = str;
    }

    public final boolean d(String str) {
        return new File(this.a.e(), kfl.f(str)).exists();
    }
}
