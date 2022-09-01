package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: boz  reason: default package */
/* loaded from: classes.dex */
public final class boz extends jfe {
    public final Handler a = new Handler(Looper.getMainLooper());
    private final String d;
    private volatile boolean e;
    private final irm f;
    private final boe g;

    public boz(Context context, boe boeVar) {
        super(R.string.f167000_resource_name_obfuscated_res_0x7f140917);
        boy boyVar = new boy(this);
        this.f = boyVar;
        this.d = context.getResources().getString(R.string.f167000_resource_name_obfuscated_res_0x7f140917);
        this.g = boeVar;
        boyVar.g(mjl.a);
    }

    @Override // defpackage.jfp
    public final jfn a() {
        return new jfi(this.d, this.e);
    }

    @Override // defpackage.jfe, defpackage.jfp
    public final void b(jfo jfoVar) {
        this.c = jfoVar;
        c();
    }

    @Override // defpackage.jfp
    public final boolean c() {
        boolean b = this.g.b("my-Qaag", true);
        if (b != this.e) {
            this.e = b;
            return true;
        }
        return false;
    }
}
