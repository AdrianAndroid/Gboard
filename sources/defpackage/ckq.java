package defpackage;

import android.content.Context;
import android.util.Printer;
import java.io.File;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: ckq  reason: default package */
/* loaded from: classes.dex */
public final class ckq implements ckm, ifw {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheModule");
    public static final hhl b = hhq.f("content_cache_cached_images_ttl_hours", 336);
    public final Context c;
    public final mkr f;
    public final clb g;
    public final boe j;
    public opu k;
    private final File l;
    public final idk d = ieh.j();
    public final AtomicReference e = new AtomicReference(cll.a);
    public final AtomicLong h = new AtomicLong(0);
    public final AtomicLong i = new AtomicLong(0);
    private final ijj m = new ckp(this, 0);

    public ckq(Context context) {
        clb d = clb.d(context);
        boe boeVar = new boe((char[]) null);
        mks c = gxo.c(19);
        File b2 = clk.b(context);
        this.c = context;
        this.g = d;
        this.j = boeVar;
        this.f = c;
        this.l = b2;
    }

    @Override // defpackage.ckm
    public final llp c(String str) {
        throw null;
    }

    @Override // defpackage.ckm
    public final boolean d() {
        return e().D();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        cll cllVar = (cll) this.e.get();
        int i = cllVar.c.size;
        printer.println("keywordToImagesMapping().size() = " + i);
        int size = cllVar.b.size();
        printer.println("keywordToTimestampMapping().size() = " + size);
        long j = this.h.get();
        printer.println("hitCount = " + j);
        long j2 = this.i.get();
        printer.println("missCount = " + j2);
        lmz a2 = cln.a(this.c);
        if (!z) {
            printer.println("keywords = ".concat(lex.c(',').f(cllVar.c.u())));
            printer.println("keywordsRequiringDownload = ".concat(lex.c(',').f(a2)));
            return;
        }
        int size2 = a2.size();
        printer.println("keywordsRequiringDownload.size() = " + size2);
    }

    public final llr e() {
        return ((cll) this.e.get()).c;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ContentCacheModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ijl.b().h(this.m, clo.class, gyc.b);
        this.k = new opu(this);
        gyc.b.execute(new cbq(this, 9));
        this.f.hP(new bwt(this, this.l, 12));
        lfb e = this.g.e();
        if (e.e()) {
            this.f.hP(new bwt(this, e, 11));
        }
    }

    @Override // defpackage.ifw
    public final void gn() {
        ijl.b().d(this.m, clo.class);
        gyc.b.execute(new cbq(this, 10));
    }
}
