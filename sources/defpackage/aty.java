package defpackage;

import java.io.File;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: aty  reason: default package */
/* loaded from: classes.dex */
public final class aty implements Callable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aty(amp ampVar, int i) {
        this.b = i;
        this.a = ampVar;
    }

    public aty(auc aucVar, int i) {
        this.b = i;
        this.a = aucVar;
    }

    public aty(coc cocVar, int i) {
        this.b = i;
        this.a = cocVar;
    }

    public aty(dbs dbsVar, int i) {
        this.b = i;
        this.a = dbsVar;
    }

    public aty(dsd dsdVar, int i) {
        this.b = i;
        this.a = dsdVar;
    }

    public /* synthetic */ aty(fwr fwrVar, int i) {
        this.b = i;
        this.a = fwrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        cyd cydVar;
        int i = this.b;
        if (i == 0) {
            synchronized (this.a) {
                Object obj = this.a;
                if (((auc) obj).f != null) {
                    ((auc) obj).f();
                    if (((auc) this.a).g()) {
                        ((auc) this.a).d();
                        ((auc) this.a).h = 0;
                    }
                }
            }
            return null;
        } else if (i == 1) {
            return new ane(this.a);
        } else {
            if (i != 2) {
                if (i == 3) {
                    return ((dbs) this.a).a();
                }
                if (i == 4) {
                    return Boolean.valueOf(((dsd) this.a).d());
                }
                ((fwr) this.a).c();
                return null;
            }
            coc cocVar = (coc) this.a;
            File d = coc.d(cocVar.c, cocVar.e);
            if (d.exists() && (cydVar = (cyd) jan.b.a(d, (nhf) cyd.d.N(7))) != null) {
                return cob.a(llp.o(cydVar.a), Locale.forLanguageTag(cydVar.b), cydVar.c);
            }
            return null;
        }
    }
}
