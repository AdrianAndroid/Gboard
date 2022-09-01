package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: bbr  reason: default package */
/* loaded from: classes.dex */
public final class bbr implements avc {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public bbr(bbe bbeVar, axn axnVar, int i) {
        this.a = i;
        this.b = bbeVar;
        this.c = axnVar;
    }

    public bbr(bcg bcgVar, axp axpVar, int i) {
        this.a = i;
        this.b = bcgVar;
        this.c = axpVar;
    }

    @Override // defpackage.avc
    public final /* synthetic */ boolean b(Object obj, ava avaVar) {
        if (this.a == 0) {
            InputStream inputStream = (InputStream) obj;
            return true;
        }
        return "android.resource".equals(((Uri) obj).getScheme());
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [axp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [axn, java.lang.Object] */
    @Override // defpackage.avc
    public final /* synthetic */ axh a(Object obj, int i, int i2, ava avaVar) {
        bbp bbpVar;
        boolean z;
        bfz bfzVar;
        if (this.a == 0) {
            InputStream inputStream = (InputStream) obj;
            if (inputStream instanceof bbp) {
                bbpVar = (bbp) inputStream;
                z = false;
            } else {
                bbpVar = new bbp(inputStream, this.c);
                z = true;
            }
            synchronized (bfz.a) {
                bfzVar = (bfz) bfz.a.poll();
            }
            if (bfzVar == null) {
                bfzVar = new bfz();
            }
            bfzVar.b = bbpVar;
            bgg bggVar = new bgg(bfzVar);
            bbq bbqVar = new bbq(bbpVar, bfzVar);
            try {
                Object obj2 = this.b;
                axh a = ((bbe) obj2).a(new bbl(bggVar, ((bbe) obj2).g, ((bbe) obj2).f, 0), i, i2, avaVar, bbqVar);
                bfzVar.a();
                if (z) {
                    bbpVar.b();
                }
                return a;
            } catch (Throwable th) {
                bfzVar.a();
                if (z) {
                    bbpVar.b();
                }
                throw th;
            }
        }
        axh c = ((bcg) this.b).c((Uri) obj, avaVar);
        if (c == null) {
            return null;
        }
        return bbg.a(this.c, ((bce) c).c(), i, i2);
    }
}
