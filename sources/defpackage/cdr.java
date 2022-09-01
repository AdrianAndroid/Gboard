package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cdr  reason: default package */
/* loaded from: classes.dex */
public final class cdr implements AutoCloseable, hho {
    private static volatile cdr g;
    public final bze b;
    public final idk c;
    public mko d;
    private final Executor h;
    private byy i = bze.a;
    private static final lug e = lug.i("LangIdModelDownloader");
    private static final hhl[] f = {cas.b, cas.e};
    static final hhl a = hhq.a("allow_metered_network_to_download_langid_model", false);

    private cdr(Context context) {
        bze a2 = bzd.a(context);
        mks a3 = gxo.a(10);
        ieh j = ieh.j();
        this.b = a2;
        this.h = a3;
        this.c = j;
        bzt a4 = bzu.a("langid");
        a4.e = 100;
        a4.f = 100;
        a2.i(a4.a());
    }

    public static int c() {
        return ((Long) cas.e.c()).intValue();
    }

    public static cdr d(Context context) {
        cdr cdrVar = g;
        if (cdrVar == null) {
            synchronized (cdr.class) {
                cdrVar = g;
                if (cdrVar == null) {
                    cdrVar = new cdr(context);
                    hhq.p(cdrVar, f);
                    g = cdrVar;
                }
            }
        }
        return cdrVar;
    }

    private static File g(String str, byy byyVar) {
        for (String str2 : byyVar.h()) {
            if (str.equals(byyVar.e(str2).n().b("label", null))) {
                return byyVar.f(str2);
            }
        }
        return null;
    }

    public final int b() {
        if (this.i.i() || this.i.d() == null) {
            return -1;
        }
        return this.i.d().a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.i.close();
        this.i = bze.a;
    }

    public final mko e() {
        bze bzeVar = this.b;
        int c = c();
        jsu j = jsv.j();
        j.a = (String) cas.b.c();
        j.d(true != ((Boolean) a.c()).booleanValue() ? 1 : 2);
        mko e2 = bzeVar.e("langid", c, j.a());
        this.c.e(cap.LANG_ID_MODEL_DOWNLOADED, Integer.valueOf(c()));
        return mio.h(mio.h(e2, new bzf(this, 4), this.h), new bzf(this, 5), this.h);
    }

    public final File f(String str, boolean z) {
        if (this.i.i() || b() != c()) {
            mch mchVar = mch.UNKNOWN;
            try {
                byy byyVar = (byy) this.b.b("langid").get();
                if (byyVar.i()) {
                    byyVar.close();
                    mch mchVar2 = mch.PACKSET_EMPTY;
                    if (z) {
                        mko mkoVar = this.d;
                        if (mkoVar != null && !mkoVar.isDone()) {
                            mchVar2 = mch.PACKSET_EMPTY_WITH_SYNCING;
                        }
                        mchVar2 = this.d == null ? mch.PACKSET_EMPTY_WITH_INIT_NULL : mch.PACKSET_EMPTY_WITH_INIT_DONE;
                        this.d = e();
                    }
                    this.c.e(cap.LANG_ID_FAILED_TO_GET_MODEL_PATH, mchVar2);
                    return null;
                }
                this.i = byyVar;
                return g(str, byyVar);
            } catch (InterruptedException | ExecutionException e2) {
                ((luc) ((luc) ((luc) e.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierSuperpacksManager", "getFile", (char) 185, "LanguageIdentifierSuperpacksManager.java")).t("getModelPath(): Failed to get lang id model path.");
                this.c.e(cap.LANG_ID_FAILED_TO_GET_MODEL_PATH, mch.GET_PACK_WITH_EXCEPTION);
                return null;
            }
        }
        return g(str, this.i);
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        this.h.execute(new cdq(this));
    }
}
