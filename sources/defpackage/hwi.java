package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hwi  reason: default package */
/* loaded from: classes.dex */
public final class hwi extends hvk {
    public final hwj a;
    public final hwh h;
    private final int i;

    public hwi(Context context, hvj hvjVar, hvx hvxVar) {
        super(context, hvjVar, hvxVar);
        this.i = Integer.parseInt(context.getResources().getString(R.string.f159860_resource_name_obfuscated_res_0x7f14060f));
        hwh hwhVar = new hwh(context, hvjVar.c());
        this.h = hwhVar;
        this.a = new hwj(context, this, hwhVar);
    }

    @Override // defpackage.hvk
    protected final int a() {
        return this.h.C() ? R.string.f166360_resource_name_obfuscated_res_0x7f1408d2 : R.string.f166370_resource_name_obfuscated_res_0x7f1408d3;
    }

    @Override // defpackage.hvk
    protected final int b() {
        return R.string.f151740_resource_name_obfuscated_res_0x7f140234;
    }

    public final int d(String str) {
        return this.c.G(String.valueOf(str).concat(String.valueOf(this.b.getString(R.string.f162210_resource_name_obfuscated_res_0x7f1406fe))), this.i);
    }

    @Override // defpackage.hvk
    public final void e() {
        super.e();
        hvt hvtVar = this.a.d;
        hvt.a(hvtVar.c, false);
        hvt.a(hvtVar.d, false);
        this.a.e();
    }

    @Override // defpackage.hvk
    public final void f() {
        super.f();
        this.a.f();
    }

    public final void g() {
        this.a.f();
        this.f.m();
        this.e.g(a(), new Object[0]);
    }

    @Override // defpackage.hvk
    public final void h() {
        this.a.e();
    }

    public final void j() {
        this.h.s();
    }

    public final boolean k(int i) {
        return this.h.D(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hvk
    public final hun m() {
        return this.h;
    }
}
