package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: efw  reason: default package */
/* loaded from: classes.dex */
public abstract class efw extends dyu implements htb {
    private static final llp o = llp.t(cvb.d, cvb.i, cvb.h);
    public dbr m;
    private ekn p;
    private cwx q;
    private hho r;
    final List l = new ArrayList();
    public boolean n = true;

    @Override // defpackage.dyu
    public final ekn Y() {
        if (this.p == null) {
            this.p = new ekn(this.c, an(), hqp.e(), 3);
        }
        return this.p;
    }

    @Override // defpackage.dyu
    protected final mko Z(String str) {
        if (this.q == null) {
            this.q = am(this.c);
        }
        cwx cwxVar = this.q;
        if (cwxVar == null) {
            return kcu.J(new IllegalStateException("no sticker fetcher"));
        }
        return cwxVar.n(str);
    }

    @Override // defpackage.dyu
    public final List af() {
        return ae(this.l);
    }

    @Override // defpackage.dyu
    public List ag() {
        return ae(this.l);
    }

    @Override // defpackage.dyu
    protected final boolean ai() {
        return true;
    }

    public abstract int ak();

    protected abstract csi al();

    protected abstract cwx am(Context context);

    protected abstract String an();

    protected abstract void ao(iay iayVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ap() {
        hrx.y(this.c);
    }

    @Override // defpackage.dyu, defpackage.dbn, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -30000) {
            return super.c(hfdVar);
        }
        ao(f);
        return super.c(hfdVar);
    }

    @Override // defpackage.dyu, defpackage.dbn, defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        super.dump(printer, z);
        printer.println("defaultCandidates = ".concat(String.valueOf(String.valueOf(this.l))));
    }

    @Override // defpackage.dyu, defpackage.dbn, defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        this.m = new dbr(this, context, ak());
        edk edkVar = new edk(this, context, 3);
        this.r = edkVar;
        hhq.o(edkVar, o);
    }

    @Override // defpackage.dbn, defpackage.ifw
    public void gn() {
        super.gn();
        if (this.m != null) {
            this.m = null;
        }
        hho hhoVar = this.r;
        if (hhoVar != null) {
            hhq.q(hhoVar);
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final boolean hv() {
        synchronized (this) {
        }
        return true;
    }

    @Override // defpackage.dbk, defpackage.dbn
    public final void m(hfl hflVar) {
        if (this.l.isEmpty()) {
            this.l.clear();
            lre.af(this.l, Arrays.asList(y().getResources().getStringArray(R.array.f1470_resource_name_obfuscated_res_0x7f03002e)));
        }
        super.m(hflVar);
    }

    @Override // defpackage.dyu, defpackage.dbk, defpackage.dbn
    protected final synchronized void r() {
        super.r();
        this.p = null;
        this.l.clear();
    }

    @Override // defpackage.htb
    public final boolean s(ibz ibzVar) {
        return this.n;
    }

    @Override // defpackage.htb
    public final /* synthetic */ void u(Context context, ibz ibzVar, String str, jls jlsVar) {
    }

    @Override // defpackage.htb
    public final void t(Context context, hsz hszVar, iav iavVar, ibz ibzVar, String str, jls jlsVar, hta htaVar) {
        dbr dbrVar = this.m;
        if (dbrVar == null) {
            htaVar.a(ibzVar, null, null);
            return;
        }
        this.n = true;
        dbrVar.a(context, hszVar, iavVar, ibzVar, str, jlsVar, new csj(al(), htaVar, 0));
    }
}
