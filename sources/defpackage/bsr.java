package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: bsr  reason: default package */
/* loaded from: classes.dex */
public final class bsr implements ifw {
    public long a;
    public EditorInfo b;
    public boolean c;
    private final Context d;
    private final jcb f = new bso(this);
    private final hst g = new bsp(this);
    private final hwu h = new bsq(this, 0);
    private final ija i = ijf.c(new bqj(this, 9), new bqj(this, 9), irs.a);
    private final hso e = new hso();

    public bsr(Context context) {
        this.d = context;
    }

    public final void c(long j, boolean z) {
        hso hsoVar = this.e;
        int i = true != z ? -10026 : -10025;
        hfd b = hfd.b();
        b.j(new iay(i, null, Long.valueOf(j)));
        hsoVar.at(b);
    }

    public final void d() {
        EditorInfo editorInfo = this.b;
        if (editorInfo == null) {
            return;
        }
        long j = 49152;
        long j2 = this.a & 49152;
        Context context = this.d;
        boolean z = this.c;
        if (!lre.aG(context, editorInfo) && !lre.aH(context, editorInfo, z)) {
            j = 0;
        }
        if (true == lre.aH(context, editorInfo, z)) {
            j = 16384;
        }
        if (true == lre.aI(context, editorInfo)) {
            j = 32768;
        }
        if (j2 != 0 && j != j2) {
            c(j2, false);
        }
        this.a = (this.a & (-49153)) | j;
        e();
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    public final void e() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        c(j, true);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        mjl mjlVar = mjl.a;
        this.i.d(mjlVar);
        this.f.d(mjlVar);
        this.g.g(mjlVar);
        this.e.V().a(ice.HEADER, this.h);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.i.f();
        this.f.e();
        this.g.h();
        this.e.V().l(ice.HEADER, this.h);
    }
}
