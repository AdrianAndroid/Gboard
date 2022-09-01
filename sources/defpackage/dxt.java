package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmmgesture.HmmGestureDecoder;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dxt  reason: default package */
/* loaded from: classes.dex */
public final class dxt extends dkk {
    private boolean g;
    private final dxs h;

    public dxt(Context context, hlu hluVar, ino inoVar, dxs dxsVar) {
        super(context, hluVar, inoVar);
        this.h = dxsVar;
    }

    @Override // defpackage.dkk
    protected final HmmGestureDecoder a() {
        dxv h = dxv.h(this.d);
        dxs dxsVar = this.h;
        return h.c((String) (this.g ? dxsVar.a : dxsVar.b));
    }

    @Override // defpackage.dkk
    public final void c() {
        this.g = this.e.aj(R.string.f160480_resource_name_obfuscated_res_0x7f14064d);
        super.c();
    }
}
