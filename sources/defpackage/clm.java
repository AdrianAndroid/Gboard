package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: clm  reason: default package */
/* loaded from: classes.dex */
public final class clm {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/expression/contentcache/KeywordSets");
    public final lmz a;
    public final lmz b;

    public clm(lmz lmzVar, lmz lmzVar2) {
        if (lmzVar != null) {
            this.a = lmzVar;
            if (lmzVar2 != null) {
                this.b = lmzVar2;
                return;
            }
            throw new NullPointerException("Null allowlistKeywords");
        }
        throw new NullPointerException("Null primaryKeywords");
    }

    public static clm a(cla claVar) {
        ieh j = ieh.j();
        lmx g = lmz.g();
        lmx g2 = lmz.g();
        lsz it = claVar.a.iterator();
        while (it.hasNext()) {
            try {
                FileInputStream fileInputStream = new FileInputStream((File) it.next());
                try {
                    ckw ckwVar = (ckw) nfm.x(ckw.b, fileInputStream, nfb.b());
                    fileInputStream.close();
                    for (ckv ckvVar : ckwVar.a) {
                        g.d(ckvVar.a);
                        if (ckvVar.b) {
                            g2.d(ckvVar.a);
                        }
                    }
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
                    break;
                }
            } catch (FileNotFoundException e) {
                ((ltd) ((ltd) ((ltd) c.c()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/contentcache/KeywordSets", "from", '(', "KeywordSets.java")).t("Could not find metadata file");
                j.e(csv.CONTENT_CACHE_KEYWORD_METADATA_FILE_MISSING, new Object[0]);
            } catch (IOException e2) {
                ((ltd) ((ltd) ((ltd) c.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/contentcache/KeywordSets", "from", ',', "KeywordSets.java")).t("Could not parse metadata file");
                j.e(csv.CONTENT_CACHE_KEYWORD_METADATA_FILE_MALFORMED, new Object[0]);
            }
        }
        return new clm(g2.g(), g.g());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clm) {
            clm clmVar = (clm) obj;
            if (this.a.equals(clmVar.a) && this.b.equals(clmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "KeywordSets{primaryKeywords=" + obj + ", allowlistKeywords=" + obj2 + "}";
    }

    public clm() {
    }
}
