package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: cln  reason: default package */
/* loaded from: classes.dex */
public final class cln {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/contentcache/KeywordsRequiringContentDownload");

    public static lmz a(Context context) {
        File b = b(context);
        ieh j = ieh.j();
        try {
            FileInputStream fileInputStream = new FileInputStream(b);
            try {
                lmz p = lmz.p(((ckx) nfm.x(ckx.b, fileInputStream, nfb.b())).a);
                fileInputStream.close();
                return p;
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
            j.e(csv.CONTENT_CACHE_KEYWORDS_REQUIRING_UPDATE_FILE_MISSING, new Object[0]);
            return lrr.a;
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/contentcache/KeywordsRequiringContentDownload", "parse", '5', "KeywordsRequiringContentDownload.java")).t("Failed to load set of keywords requiring update from disk, deleting save file");
            j.e(csv.CONTENT_CACHE_KEYWORDS_REQUIRING_UPDATE_FILE_MALFORMED, new Object[0]);
            jan.b.e(b);
            return lrr.a;
        }
    }

    static File b(Context context) {
        return new File(clk.a(context), "keywords_requiring_update");
    }

    public static void c(Context context, lmz lmzVar) {
        lmz a2 = a(context);
        if (a2.containsAll(lmzVar)) {
            return;
        }
        lmzVar.size();
        e(context, lvw.k(a2, lmzVar));
    }

    public static void d(Context context, lmz lmzVar) {
        c(context, lmzVar);
        clg.f(ism.a(context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Context context, Collection collection) {
        nfh t = ckx.b.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ckx ckxVar = (ckx) t.b;
        nga ngaVar = ckxVar.a;
        if (!ngaVar.c()) {
            ckxVar.a = nfm.H(ngaVar);
        }
        ndt.cs(collection, ckxVar.a);
        if (!jan.b.l(b(context), (ckx) t.cz())) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/KeywordsRequiringContentDownload", "writeToDisk", 100, "KeywordsRequiringContentDownload.java")).t("Failed to write set of keywords requiring update to disk");
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/KeywordsRequiringContentDownload", "writeToDisk", 103, "KeywordsRequiringContentDownload.java")).u("Successfully wrote set of %d keywords requiring update to disk", collection.size());
        }
    }
}
