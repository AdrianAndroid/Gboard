package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jxd  reason: default package */
/* loaded from: classes.dex */
public final class jxd {
    public Context a;
    public Executor b;
    public kaw c;
    public boolean d = true;
    private final String e = "superpacks";

    public final jxg a() {
        mhd mhdVar = new mhd((byte[]) null);
        mhdVar.a = 3;
        mhdVar.b = this.e;
        if (this.c == null) {
            kay kayVar = new kay(jxi.a());
            Context context = this.a;
            jdg.u(context);
            Executor executor = this.b;
            jdg.u(executor);
            this.c = new kaw(kayVar, context, executor, mhdVar, null);
        }
        return new jxg(this);
    }
}
