package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: hag  reason: default package */
/* loaded from: classes.dex */
public final class hag implements ifw, hhk {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/dynamiclanguagesetter/DynamicLanguageSetterModule");
    static final hhl b = hhq.a("enable_change_language_private_command", false);
    public final hqy c;
    private final hst d = new hae(this);
    private hsh e;

    public hag(hqy hqyVar) {
        this.c = hqyVar;
    }

    private final void c() {
        hsh hshVar = this.e;
        if (hshVar != null) {
            hshVar.e();
            this.e = null;
        }
    }

    private final void d() {
        if (this.e != null) {
            return;
        }
        haf hafVar = new haf(this);
        this.e = hafVar;
        hafVar.d(mjl.a);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.d.g(mjl.a);
        hhl hhlVar = b;
        hhlVar.f(this, gyc.b);
        if (((Boolean) hhlVar.c()).booleanValue()) {
            d();
        }
    }

    @Override // defpackage.ifw
    public final void gn() {
        b.g(this);
        c();
        this.d.h();
        this.c.h();
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        if (((Boolean) b.c()).booleanValue()) {
            d();
        } else {
            c();
        }
    }
}
