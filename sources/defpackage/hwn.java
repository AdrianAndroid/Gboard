package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hwn  reason: default package */
/* loaded from: classes.dex */
public final class hwn extends hvk {
    public final hun a;

    public hwn(Context context, hvj hvjVar, hvx hvxVar) {
        super(context, hvjVar, hvxVar);
        hun hwmVar;
        if (gzq.d(context, true)) {
            hwmVar = new hvy(context, hvjVar.c());
        } else {
            hwmVar = new hwm(context, hvjVar.c());
        }
        this.a = hwmVar;
    }

    @Override // defpackage.hvk
    protected final int a() {
        return R.string.f166380_resource_name_obfuscated_res_0x7f1408d4;
    }

    @Override // defpackage.hvk
    protected final int b() {
        return R.string.f151750_resource_name_obfuscated_res_0x7f140235;
    }

    public final void d() {
        this.a.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hvk
    public final hun m() {
        return this.a;
    }
}
