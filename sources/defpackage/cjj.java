package defpackage;

import android.content.Context;
import android.util.Printer;
import j$.util.Objects;
import j$.util.function.Supplier;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: cjj  reason: default package */
/* loaded from: classes.dex */
public final class cjj extends cie implements byd {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ExpressionCandidateSupplierModuleImpl");
    private final Context c;
    private final cik d;
    private final oiy e;
    private final oiy f;
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();
    private final AtomicInteger i = new AtomicInteger();
    private hiz j;

    public cjj(Context context, hso hsoVar, idk idkVar, final cjy cjyVar, final ckk ckkVar, cik cikVar, oiy oiyVar, oiy oiyVar2, final oiy oiyVar3) {
        super(context, hsoVar, idkVar, new Supplier() { // from class: cji
            @Override // j$.util.function.Supplier
            public final Object get() {
                oiy oiyVar4 = oiy.this;
                ckk ckkVar2 = ckkVar;
                cjy cjyVar2 = cjyVar;
                if (((cix) oiyVar4).b().booleanValue()) {
                    return llp.s(ckkVar2, cjyVar2);
                }
                return llp.s(cjyVar2, ckkVar2);
            }
        }, bou.r);
        this.c = context;
        this.d = cikVar;
        this.e = oiyVar;
        this.f = oiyVar2;
    }

    @Override // defpackage.byd
    public final void b() {
        hiz hizVar;
        this.i.incrementAndGet();
        hji.h(this.j);
        this.j = null;
        if (!((Boolean) cit.C.c()).booleanValue() || !((cix) this.f).b().booleanValue()) {
            return;
        }
        bxr a2 = ((civ) this.e).a().a(hqp.d());
        if (!a2.b() || a2.g.isEmpty()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ExpressionCandidateSupplierModuleImpl", "onModelsDownloaded", 140, "ExpressionCandidateSupplierModuleImpl.java")).t("Model file is invalid or not available");
            this.h.incrementAndGet();
            return;
        }
        this.g.incrementAndGet();
        cik cikVar = this.d;
        File file = new File(a2.g);
        if (cikVar.a.get()) {
            hizVar = hiz.m(new IllegalStateException("Cache is closed"));
        } else {
            idn a3 = cikVar.c.a(cjk.b);
            hiz v = cikVar.e.b().h(bzg.e, mjl.a).s(new cij(file, 0), cikVar.b).v(new bzf(cikVar, 18), cikVar.b);
            Objects.requireNonNull(a3);
            v.d(new cbq(a3, 8), mjl.a);
            hizVar = v;
        }
        hizVar.I(Level.INFO, "Successfully cached %s Bitmoji T2E queries", bou.q);
        hizVar.H(Level.WARNING, "Failed to cache Bitmoji T2E queries", new Object[0]);
        this.j = hizVar;
    }

    @Override // defpackage.cie, defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        super.dump(printer, z);
        int i = this.i.get();
        printer.println("onModelsDownloaded = " + i);
        cuz cuzVar = cuz.a;
        boolean H = jam.H(this.c);
        printer.println("bitmojiInstalled = " + H);
        boolean b = cuz.a.b(this.c);
        printer.println("bitmojiUpdateRequired = " + b);
        hiz hizVar = this.j;
        if (hizVar != null) {
            int g = hji.g(hizVar.c);
            StringBuilder sb = new StringBuilder("bitmojiCurrentTask = ");
            sb.append(g - 1);
            printer.println(sb.toString());
        }
        int i2 = this.g.get();
        printer.println("bitmojiTasksStarted = " + i2);
        int i3 = this.h.get();
        printer.println("bitmojiTasksSkipped = " + i3);
        this.d.dump(printer, z);
    }

    @Override // defpackage.cie, defpackage.gzv
    public final String getDumpableTag() {
        return "ExpressionCandidateSupplierModuleImpl";
    }

    @Override // defpackage.cie, defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        ((civ) this.e).a().n(this);
        b();
        if (!((Boolean) czu.f.c()).booleanValue()) {
            czt.b(this.c).d(true);
        }
    }

    @Override // defpackage.cie, defpackage.ifw
    public final void gn() {
        super.gn();
        hji.h(this.j);
        this.j = null;
        this.d.close();
        ((civ) this.e).a().p(this);
        czt b = czt.b(this.c);
        hiz hizVar = b.f;
        if (hizVar != null) {
            hji.h(hizVar);
            b.f = null;
        }
    }
}
