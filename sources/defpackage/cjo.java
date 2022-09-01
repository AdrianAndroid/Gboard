package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cjo  reason: default package */
/* loaded from: classes.dex */
public abstract class cjo implements cja {
    public static String o(mse mseVar) {
        return (mseVar.b & 64) != 0 ? mseVar.o : mseVar.d;
    }

    public static kqg p() {
        kqg kqgVar = new kqg((byte[]) null);
        kqgVar.m(false);
        return kqgVar;
    }

    @Override // defpackage.cci
    public final /* synthetic */ int a() {
        return ccg.a(this);
    }

    @Override // defpackage.cci
    public abstract mse b();

    public abstract ats c();

    public abstract cqp d();

    public abstract lfb e();

    public abstract lfb f();

    public abstract Object g();

    @Override // defpackage.cja
    public abstract boolean h();

    public String i() {
        throw null;
    }

    public abstract kqg j();

    @Override // defpackage.cja
    public final /* synthetic */ int k() {
        return 1;
    }

    @Override // defpackage.cja
    public final hln l(Context context, hlk hlkVar, int i, int i2, boolean z) {
        hlkVar.c();
        hlkVar.e = hlm.EXPRESSION;
        hlkVar.s = 7;
        hlkVar.j = this;
        hlkVar.k = c();
        hlkVar.c = context.getString(R.string.f154050_resource_name_obfuscated_res_0x7f14033a, n());
        hlkVar.f = false;
        hlkVar.h = i;
        hlkVar.i = i2;
        return hlkVar.a();
    }

    @Override // defpackage.cja
    public final int m() {
        return 1;
    }

    public final String n() {
        String n = d().n();
        return TextUtils.isEmpty(n) ? i() : n;
    }
}
