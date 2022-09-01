package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cll  reason: default package */
/* loaded from: classes.dex */
public final class cll {
    static final cll a;
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/expression/contentcache/KeywordMappings");
    public final llw b;
    public final llr c;

    static {
        djc b = b();
        b.e(lkq.a);
        b.f(lrq.b);
        a = b.d();
    }

    public cll() {
    }

    public cll(llw llwVar, llr llrVar) {
        this.b = llwVar;
        this.c = llrVar;
    }

    public static cll a(File file) {
        ieh j = ieh.j();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                HashMap hashMap = new HashMap(Collections.unmodifiableMap(((cku) nfm.x(cku.d, fileInputStream, nfb.b())).b));
                fileInputStream.close();
                lmh lmhVar = new lmh();
                lls h = llw.h();
                for (Map.Entry entry : hashMap.entrySet()) {
                    llq.d((String) entry.getKey(), llp.o(lre.H(((cky) entry.getValue()).b, bou.u)), lmhVar);
                    h.a((String) entry.getKey(), Long.valueOf(((cky) entry.getValue()).c));
                }
                djc b = b();
                b.e(llq.a(lmhVar));
                b.f(h.l());
                return b.d();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            j.e(csv.CONTENT_CACHE_MAPPING_FILE_MISSING, new Object[0]);
            return a;
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) d.c()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/contentcache/KeywordMappings", "parse", 'L', "KeywordMappings.java")).t("Fail to load keyword images mapping file on disk.");
            j.e(csv.CONTENT_CACHE_MAPPING_FILE_MALFORMED, new Object[0]);
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static djc b() {
        return new djc();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cll) {
            cll cllVar = (cll) obj;
            if (this.b.equals(cllVar.b) && this.c.equals(cllVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return "KeywordMappings{keywordToTimestampMapping=" + valueOf + ", keywordToImagesMapping=" + valueOf2 + "}";
    }
}
